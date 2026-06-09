class Printer{
    
    //method 1
    void printData(String text){
        
        System.out.println("Printing text: "+text);
       
    }
    //method 2
    void printData(int num){
        
        System.out.println("Printing number: "+num);
       
    }
}
public class Main {
    public static void main(String[] args) {
        
        Printer p = new Printer();
        
        p.printData("Hello World");
        p.printData(42);
    }
}
