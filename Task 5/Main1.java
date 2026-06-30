interface printer {
    void printDocument();
}

interface scanner {
    void scanDocument();
}

interface faxMachine {
    void faxDocument();
}

class multiFunctionCopier implements printer,scanner,faxMachine{
    public void printDocument(){
        System.out.println("Printing");
    }

    public void scanDocument(){
        System.out.println("Scanning");
    }

    public void faxDocument(){
        System.out.println("Faxing");
    }
}

class basicPrinter implements printer{
    public void printDocument(){
        System.out.println("Printing");
    }
}

public class Main1{
    public static void main(String[] args) {
        multiFunctionCopier c = new multiFunctionCopier();

        c.printDocument();
        c.scanDocument();
        c.faxDocument();

        basicPrinter p = new basicPrinter();

        p.printDocument();
    }
}
