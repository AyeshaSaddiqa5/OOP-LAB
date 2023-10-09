public class Result {
    private User user;
    private int totalQuestions;
    private int passingScore;
    public Result(User user,int totalQuestions,int passingScore) {
        this.user = user;
        this.totalQuestions=totalQuestions;
        this.passingScore=passingScore;
    }

    public void displayResult() {
        System.out.println();
        System.out.println(".....Result Details of Quiz.....");
        System.out.println();
        System.out.println("Hello, "+user.getName()+ "!");
        QuizDateTime date=new QuizDateTime();
        System.out.println("Quiz attempted on "+date.getCurrentDateTime());
        System.out.println("Your score: "+user.getScore()+" out of "+totalQuestions);

        if (user.getScore()>=passingScore) {
            System.out.println("Status: Congrats, you have passed!");
        }
        else {
            System.out.println("Status: You did not pass.");
        }
    }
}
