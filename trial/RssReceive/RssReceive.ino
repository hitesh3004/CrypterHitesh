#include <XBee.h>
#include<SoftwareSerial.h>

XBee xbee = XBee();
SoftwareSerial serial1(2,3);

Rx16Response rx16 = Rx16Response();

void setup()
{
    serial1.begin(9600);
    Serial.begin(9600);
    xbee.setSerial(serial1);
}

void loop()
{
    /*xbee.readPacket(100);
    if (xbee.getResponse().isAvailable())
    {
        if (xbee.getResponse().getApiId() == RX_16_RESPONSE)
        {
            xbee.getResponse().getRx16Response(rx16);
            Serial.print( rx16.getRssi() );
        }
    }
    else Serial.print("Nothing\n");*/
    if (serial1.available()) Serial.println(serial1.read());
}
