void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);}

void loop() {
  // put your main code here, to run repeatedly:
 int sensor_1, inches_1, sensor_2, inches_2, x;
sensor_1 = analogRead(0);
 inches_1 = 7+(sensor_1 / 2);
 Serial.println(inches_1);
 delay(500);

 
}
