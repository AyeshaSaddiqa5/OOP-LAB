import java.util.Scanner;
    class Quiz {
    private User user;
    private Question[] questions;
    private int passingScore;

    public Quiz(Question[] questions,User user, int passingScore) {
        this.user=user;
        this.questions=questions;
        this.passingScore=passingScore;
    }
        public void quizStart() {
            Scanner scanner=new Scanner(System.in);

            for (Question question : questions) {
                System.out.println(question.getQuestionText());
                String[] options=question.getOptions();
                for (String option : options) {
                    System.out.println(option);
                }
                System.out.print("Choose Option or type 'Q' to quit the quiz: ");
                String userInput = scanner.nextLine().toUpperCase();

                if (userInput.equals("Q")) {
                    break;
                }

                char userAnswer=userInput.charAt(0);

                if (userAnswer==question.getCorrectAnswer()) {
                    System.out.println("Correct Answer");
                    user.calculateScore();
                } else {
                    System.out.println("Incorrect. The correct answer is " + question.getCorrectAnswer());
                }
            }
       // scanner.close();
        /*Result result=new Result(user,questions.length,passingScore);
        result.displayResult();*/
    }
}