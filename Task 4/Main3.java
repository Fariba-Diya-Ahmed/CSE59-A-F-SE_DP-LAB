interface Printer {

    void printDocument();

}

interface Scanner {

    void scanDocument();

}

interface FaxMachine {

    void faxDocument();

}
class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}
public class Main3 {

    public static void main(String[] args) {

        Printer p = new BasicPrinter();
        p.printDocument();

        MultiFunctionCopier mfc = new MultiFunctionCopier();

        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
