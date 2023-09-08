package com.mobile.utilities;

public enum Device {

    /*
    {
  "appium:udid": "emulator-5554",
  "appium:version": "11",
  "appium:deviceName": "Pixel 2",
  "appiumm:realDevice": "false",
  "platformName": "Android"
}
     */

    PIXEL2( "emulator-5554",
            "11",
            "Pixel 2",
            "Android"
    ),
    SAMSUNG_A53("RKCV40MN6Z",
            "13",
            "My Phone",
            "Android");
   public String udid;
   public String version;
   public String deviceName;
   public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
