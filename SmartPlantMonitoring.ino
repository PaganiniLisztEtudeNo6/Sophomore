
#define BLYNK_PRINT Serial   
#define BLYNK_TEMPLATE_ID "TMPLoG8Z1TS3"
#define BLYNK_TEMPLATE_NAME "Project 1"
#include <SPI.h>
#include <ESP8266WiFi.h>
#include <BlynkSimpleEsp8266.h>
#include <SimpleTimer.h>
#include <DHT.h>
#define BLYNK_PRINT Serial
#include <OneWire.h>
#include <DallasTemperature.h>
#define ONE_WIRE_BUS D2
OneWire oneWire(ONE_WIRE_BUS);
DallasTemperature sensors(&oneWire);

char auth[] ="PEf4KORNmaM-iqur0AS4DWqZpi8ZOq6v";               //Authentication code sent by Blynk
char ssid[] = "shophe";                       //WiFi SSID
char pass[] = "00000000";                       //WiFi Password

#define sensorPin D3

int RELAYPIN = D5;
int sensorState = 0;
int lastState = 0;
#define DHTPIN D4    
#define DHTTYPE DHT11     
DHT dht(DHTPIN, DHTTYPE);
SimpleTimer timer;

void sendSensor()
{
  float h = dht.readHumidity();
  float t = dht.readTemperature();

  if (isnan(h) || isnan(t)) {
    Serial.println("Failed to read from DHT sensor!");
    return;
  }
 
  Blynk.virtualWrite(V5, h);  //V5 is for Humidity
  Blynk.virtualWrite(V6, t);  //V6 is for Temperature
}

void setup()
{
  Serial.begin(9600);
  Blynk.begin(auth, ssid, pass);
  pinMode(sensorPin, INPUT);
  dht.begin();
  pinMode(RELAYPIN, OUTPUT);

  timer.setInterval(1000L, sendSensor);
  Serial.begin(115200);
  Blynk.begin(auth, ssid, pass);
  sensors.begin();
}

int sensor=0;

void sendTemps()
{
  sensor=analogRead(A0);
  sensors.requestTemperatures();
  float temp = sensors.getTempCByIndex(0); 
  Serial.println(temp);
  Serial.println(sensor);
  Blynk.virtualWrite(V1, temp);
  Blynk.virtualWrite(V2,sensor);
  delay(500);
}

BLYNK_WRITE(V0) {
  int btn = param.asInt();
  Serial.println(btn);
  if (btn == 0) {//lol mean 555
    // on
    digitalWrite(RELAYPIN, 1);
  } else {
    // off  
    digitalWrite(RELAYPIN, 0);
  }
}

int c = 1;

void loop()//if u hungry just eat
{

  Blynk.run(); 

}
