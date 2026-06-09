class NumberChecker{
    void check(int num){
        boolean result = (num%2==0) && (num>10);
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        
        NumberChecker checker = new NumberChecker();
        
        checker.check(14);
    }
}
