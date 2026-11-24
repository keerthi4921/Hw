interface SmartDevice{
    abstract void connectWifi();
    default void deviceStatus(){
        System.out.println("Smart device is ready");
    }
}
class SmartTV implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart TV connected to WiFi");
    }
}
class SmartWatch implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart Watch connected to WiFi");
    }
}

public class Watch {
    public static void main(String[] args){
        SmartTV s1=new SmartTV();
        SmartWatch s2=new SmartWatch();
        s1.connectWifi() ;
        s2.connectWifi() ;
        s1.connectWifi();
        s2.deviceStatus();
        


    }
    
}
