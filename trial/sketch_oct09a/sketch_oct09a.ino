
#include <SoftwareSerial.h>
SoftwareSerial XBee(2, 3);
String str;
int userIp;
int led1,led2,led3,led4; 
int state1,state2,state3,state4;
void setup() {
  // initialize digital pin 13 as an output.
  Serial.begin(9600); 
  XBee.begin(9600);
  pinMode(5, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
}

// the loop function runs over and over again forever
void loop() {

// Serial.println("Enter 1 for On and 0 for OFF");
    if (XBee.available())
    {
      int tmp = 0;
      //tmp =XBee.read();
      while (tmp != 48 && tmp != 49){
        tmp =XBee.read();
        led1 = tmp;
      }
      tmp = 0;
      while (tmp != 48 && tmp != 49){
        tmp =XBee.read();
        led2 = tmp;
      }
      tmp = 0;
      while (tmp != 48 && tmp != 49){
        tmp =XBee.read();
        led3 = tmp;
      }
      tmp = 0;
      while (tmp != 48 && tmp != 49){
        tmp =XBee.read();
        led4 = tmp;
      }
    //int trash=XBee.read(); 
    //while(!XBee.available()){
     /* led2 = XBee.read();
      led3 = XBee.read();
      led4 = XBee.read();
     int trash = XBee.read();
    //}
  //str=XBee.read();
  */
    
  Serial.print(led1);
  Serial.print(led2);
  Serial.print(led3);
  Serial.print(led4);
  Serial.println("**");
/*  led1=str[0];
  led2=str[1];
  led3=str[2];
  led4=str[3];
  */

 if(led1==49)
 {
  digitalWrite(4, HIGH);   // turn the LED on (HIGH is the voltage level)
    state1=digitalRead(4);
 Serial.println(state1);
 XBee.write(state1);
  }
 else if(led1==48)
 {
  digitalWrite(4, LOW);    // turn the LED off by making the voltage LOW
               // wait for a second
}
 if(led2==49)
 {
  digitalWrite(5, HIGH);   // turn the LED on (HIGH is the voltage level)
   }
 else if(led2==48)
 {
  digitalWrite(5, LOW);    // turn the LED off by making the voltage LOW
               // wait for a second
}
 if(led3==49)
 {
  digitalWrite(6, HIGH);   // turn the LED on (HIGH is the voltage level)
   }
 else if(led3==48)
 {
  digitalWrite(6, LOW);    // turn the LED off by making the voltage LOW
               // wait for a second
}
 if(led4==49)
 {
  digitalWrite(7, HIGH);   // turn the LED on (HIGH is the voltage level)
                // wait for a second
 }
 else if(led4==48)
 {
  digitalWrite(7, LOW);    // turn the LED off by making the voltage LOW
               // wait for a second
}


delay(1000);
  }
 /*  state1=digitalRead(4);
 Serial.println(state1);
 XBee.write(state1);
 state2=digitalRead(5);
 Serial.println(state2);
 state3=digitalRead(6);
 Serial.println(state3);
 state4=digitalRead(7);
 Serial.println(state4);*/
}

