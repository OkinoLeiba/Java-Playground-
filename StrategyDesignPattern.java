package java_playground;

import java.util.ArrayList;


public abstract class CycleDataMain {

    public int cycleID;
    public int cycleDate; 
    public int cycleHeartRate; 
    public float geoStart;  
    public float geoPause;
    public float geoStop; 
    public float geoDirection; 
    public int elevation;
    public long cycleStartTime = 0;
    public long cycleEndTime  = 0;
    public boolean cyclePauseIndicator;
    public boolean cycleStopIndicator ;;
    public long cyclePause  = 0;

    // may be needed later to hold data to pass on to database
    ArrayList<Object> cycleDataArray = new ArrayList<Object>(13);

    // main entry point to program: user initiates invokes functions to capture data - mobile os
    private void startCaptureData(user_init){
        CaptureData captureData;
    
        captureData.createCycleData(cycleID, cycleDate, cycleHeartRate);
        captureData.createGeoData(geoStart, geoPause, geoStop, geoDirection);
        captureData.createTimeData(cycleStartTime, cycleEndTime, cyclePauseIndicator, cycleStopIndicator, cyclePause);
    }

    public void setData(){}
    public float fetchCurrentGeoData(){}
    public void pushData(){}


    abstract void setDataInterface();
}