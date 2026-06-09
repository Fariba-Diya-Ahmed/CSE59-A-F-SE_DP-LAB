class Sensor{
    
    String name;
    int batteryLevel;
    
    //constructor calling
    Sensor(String name)
    {
        this.name = name;
        this.batteryLevel = 0;
    }
    
    //method 
    void charge(){
        
        batteryLevel = 100;
        System.out.println("Sensor fully charged!");
       
    }
}
public class Main {
    public static void main(String[] args) {
        
        Sensor s = new Sensor("Sensor");
        s.charge();
        System.out.println("Battery level: "+ s.batteryLevel);
    }
}
