#include <Wire.h>
#include <PID_v1.h>
#define    LIDARLite_ADDRESS   0x62          // Default I2C Address of LIDAR-Lite.
#define    RegisterMeasure     0x00          // Register to write to initiate ranging.
#define    MeasureValue        0x04          // Value to initiate ranging.
#define    RegisterHighLowB    0x8f          // Register to get both High and Low bytes in 1 call.
#include <Servo.h>
 
Servo wheels; // servo for turning the wheels
Servo esc; // not actually a servo, but controlled like one!
bool startup = true; // used to ensure startup only happens once
int startupDelay = 1000; // time to pause at each calibration step
double maxSpeedOffset = 45; // maximum speed magnitude, in servo 'degrees'
double maxWheelOffset = 85; // maximum wheel turn magnitude, in servo 'degrees'

int l_0,Fl_0 ;
int l_1;
int dist,Firstdist;
double setPt, Input, Output;
int Kp = 2;     // initial 2
int Ki = 0.05;  // initial 0.05
int Kd = 0.5;   // initial 0.5

int inchesLast = 0;

PID PIDleft(&Input, &Output, &setPt, Kp, Ki, Kd, DIRECT);

void setup() {
  Serial.begin(9600); //Opens serial connection at 9600bps.
  wheels.attach(8); // initialize wheel servo to Digital IO Pin #8
  esc.attach(9); // initialize ESC to Digital IO Pin #9
  /*  If you're re-uploading code via USB while leaving the ESC powered on, 
   *  you don't need to re-calibrate each time, and you can comment this part out.
   */
  calibrateESC();
  esc.write(80);
    
  Wire.begin(); // Opens & joins the irc bus as master

  //initialize linked variables
  Wire.beginTransmission((int)LIDARLite_ADDRESS); // transmit to LIDAR-Lite
  Wire.write((int)RegisterMeasure); // sets register pointer to  (0x00)
  Wire.write((int)MeasureValue); // sets register pointer to  (0x00)
  Wire.endTransmission(); // stop transmitting
  delay(20); // Wait 20ms for transmit

  Wire.beginTransmission((int)LIDARLite_ADDRESS); // transmit to LIDAR-Lite
  Wire.write((int)RegisterHighLowB); // sets register pointer to (0x8f)
  Wire.endTransmission(); // stop transmitting

  delay(20); // Wait 20ms for transmit

  Wire.requestFrom((int)LIDARLite_ADDRESS, 2); // request 2 bytes from LIDAR-Lite

  if (2 <= Wire.available()) // if two bytes were received
  {
    Firstdist = Wire.read(); // receive high byte (overwrites previous reading)
    Firstdist = Firstdist << 8; // shift high byte to be high 8 bits
    Firstdist |= Wire.read(); // receive low byte as lower 8 bits
  }    
     
  setPt = Firstdist;
  Serial.println("First Distance"); 
  Serial.print(Firstdist);
  PIDleft.SetOutputLimits(-50, 50);

  //turn on PID loop
  PIDleft.SetMode(AUTOMATIC);

}

/* Calibrate the ESC by sending a high signal, then a low, then middle.*/
void calibrateESC(){
    esc.write(180); // full backwards
    delay(startupDelay);
    esc.write(0); // full forwards
    delay(startupDelay);
    esc.write(90); // neutral
    delay(startupDelay);
    esc.write(90); // reset the ESC to neutral (non-moving) value
}

void loop() {

  int sensor, inches, x;
  
  // read the analog output of the EZ1 from analog input 0
  sensor = analogRead(0);
  
  // convert the sensor reading to inches
  inches = sensor / 2; //512 = 254 inches, 
  if (inches <= 15 and inchesLast <= 15) esc.write(90);
  else esc.write(75);
  inchesLast = inches;
  
  // print out the decimal result
  //Serial.print("EZ1: ");
  //Serial.println(inches,DEC);

      Wire.beginTransmission((int)LIDARLite_ADDRESS); // transmit to LIDAR-Lite
      Wire.write((int)RegisterMeasure); // sets register pointer to  (0x00)
      Wire.write((int)MeasureValue); // sets register pointer to  (0x00)
      Wire.endTransmission(); // stop transmitting
      delay(20); // Wait 20ms for transmit

      Wire.beginTransmission((int)LIDARLite_ADDRESS); // transmit to LIDAR-Lite
      Wire.write((int)RegisterHighLowB); // sets register pointer to (0x8f)
      Wire.endTransmission(); // stop transmitting

      delay(20); // Wait 20ms for transmit

      Wire.requestFrom((int)LIDARLite_ADDRESS, 2); // request 2 bytes from LIDAR-Lite

      if (2 <= Wire.available()) // if two bytes were received
      {
        dist = Wire.read(); // receive high byte (overwrites previous reading)
        dist = dist << 8; // shift high byte to be high 8 bits
        dist |= Wire.read(); // receive low byte as lower 8 bits
      }
      
          if (dist < 0 || dist > 400) {
            dist = l_0;
          }
          dist = 0.7 * dist + 0.3 * l_0;
          l_0 = dist;
          
    Input = dist;

    // use PID loop
    PIDleft.Compute();
    wheels.write(130 + Output);

    // Print Distance
    
        Serial.print("Dist0: ");
        Serial.println(dist);
        //Serial.print(", PID0: ");
        //Serial.println(Output);
    
    delay(20);
  }
