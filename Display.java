abstract class TV{
    
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends TV{
    
    @Override
    void turnOn(){
        
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff(){
        
        System.out.println("TV is turned OFF.");
    }