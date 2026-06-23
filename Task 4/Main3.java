import java.util.*;

interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}

class BasicPrinter implements Printer{
  public void printDocument()
  {
    System.out.println("Printing");
  }
}

class MultifunctionCopier implements Printer,Scanner,FaxMachine{
  public void printDocument()
  {
    System.out.println("Printing");
  }

  public void scanDocument()
  {
    System.out.println("Scanning");
  }

  public void faxDocument()
  {
    System.out.println("Faxing");
  }
}

public class Main3 {
    public static void main(String[] args) {

      Printer p = new BasicPrinter();
      p.printDocument();

      MultifunctionCopier m = new MultifunctionCopier();

      m.printDocument();
      m.scanDocument();
      m.faxDocument();
    }
}
