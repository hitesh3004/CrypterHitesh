
#include <Wire.h>
#include <LIDARLite.h>

// Create a new LIDARLite instance
LIDARLite myLidarLite;

void setup() {
  Serial.begin(115200);

  //  First we want to set the aquisition count to 1/3 the default (works great for stronger singles)
  //  can be a little noisier (this is the "1"). Then we set the "true" to enable 400kHz i2c
  //  communication speed.

  myLidarLite.begin(1,true);
}

void loop() {

  //  Next we need to take 1 reading with preamp stabilization and reference pulse (these default to true)
  Serial.println(myLidarLite.distance());

  // Next lets take 99 reading without preamp stabilization and reference pulse (these read about 0.5-0.75ms faster than with)
  for(int i = 0; i < 99; i++){
    Serial.println(myLidarLite.distance(false,false));
  }
}
