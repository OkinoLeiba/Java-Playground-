package java_playground;

import java.lang.Object.*;
import java.io.ObjectInput; //cleanup maybe
import java.util.LinkedList;

import javax.xml.crypto.Data; //cleanup maybe

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime; 



public class CaptureData {
    private SensorManager sensorManager;
    private Sensor sensor;
    private TriggerEventListener triggerEventListener;

    // data structure should have global scope and object elements linked 
    LinkedList<Object> linkedData = new LinkedList<Object>();
    public void createCycleData(int cycleID, int cycleDate, int cycleHeartRate) {
        LinkedList<Object> arrayData = new LinkedList<Object>();
        //LinkedList<Integer> linkedData = new LinkedList<Integer>();

        cycleID =+ 1;
        cycleDate = LocalDate.now();
        

        //TODO: try to work this problem or use less effiecent method
        arrayData.addFirst(new Object(cycleID, cycleDate, cycleHeartRate)); 
        arrayData.addFirst(cycleID);
        linkedData.addLast(cycleDate);
        linkedData.addLast(cycleHeartRate);

    }

    public  void createGeoData(float geoStart, float geoPause, float geoStop, float geoDirection) {
        LinkedList<Data> arrayData = new LinkedList<Data>();
        LinkedList<Float> linkedData = new LinkedList<Float>();

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_SIGNIFICANT_MOTION);
        
        //TODO: possible issue to address
        arrayData.addLast(new Data(geoStart, geoPause, geoStop, geoDirection));
        linkedData.addLast(geoStart);
       
        if Sensor.TYPE_SIGNIFICANT_MOTION == 17
        triggerEventListener = new TriggerEventListener() {
        @Override
        public void onTrigger(TriggerEvent event) {
        // Do work
        }
};



        linkedData.addLast(geoPause);
        linkedData.addLast(geoStop);
        linkedData.addLast(geoDirection);
    }
   
    public void createTimeData(long cycleStartTime, long cycleEndTime, boolean cyclePauseIndicator, boolean cycleStopIndicator, long cyclePause) {
        LinkedList<ObjectInput> arrayData = new LinkedList<ObjectInput>();
        LinkedList<Long> linkedData = new LinkedList<Long>();
        LinkedList<Boolean> boolLinkedData = new LinkedList<Boolean>();
        
        cycleStartTime = LocalTime.now();

        arrayData.addLast(new ObjectInput(cycleStartTime, cycleEndTime, cyclePauseIndicator, cycleStopIndicator, cyclePause)); 
        linkedData.addLast(cycleStartTime);
        linkedData.addLast(cycleEndTime);
        boolLinkedData.addLast(cycleStopIndicator);
        linkedData.addLast(cyclePause);
        boolLinkedData.addLast(cyclePauseIndicator);
        
        
    }
  
    sensorManager.requestTriggerSensor(triggerEventListener, mSensor);

    CaptureDataInterface captureDataInterface;
	
	public void setDataInterface(CaptureDataInterface captureDataInterface) {
		this.captureDataInterface = captureDataInterface;
	}
	public void setDate() {
		captureDataInterface.setData();
	}
   
}
