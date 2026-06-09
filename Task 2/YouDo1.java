class ContestStats{
    int[] scores = {85,90,95};
    
    void printFirstScore(){
        System.out.println("First Score: "+ scores[0]);
    }
}
class Main {
    public static void main(String[] args) {
        
        ContestStats contest = new ContestStats();
        
        contest.printFirstScore();
    }
}
