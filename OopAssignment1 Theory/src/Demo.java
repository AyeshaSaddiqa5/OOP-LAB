import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        Question[] questions = new Question[5];

        questions[0] = new Question("What is the capital of France?", new String[]{"A) Paris  B) London  C) Rome D) Madrid"},'A');
        questions[1] = new Question("What is the capital of US?",new String[]{"A) Malta  B) London  C) New York D) Madrid"}, 'C');
        questions[2] = new Question("What is the capital of Saudi Arabia?", new String[]{"A) Tokyo  B) Jaddha  C) Rome D) Abu Dhabi"}, 'B');
        questions[3] = new Question("What is the capital of Pakistan?", new String[]{"A) Japan  B) London  C) Palestine D) Islamabad"}, 'D');
        questions[4] = new Question("What is the capital of Turkey?", new String[]{"A) Italy  B) London  C) Cordova D) Istanbul"}, 'D');

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

       int passingScore=questions.length/2;

        Quiz quiz = new Quiz(questions, user, passingScore);
        quiz.quizStart();
        Result result=new Result(user,questions.length,passingScore);
        result.displayResult();
      //  QuizDateTime quizDateTime=new QuizDateTime();
       // System.out.println("Date and Time of completing Quiz: " + quizDateTime.getCurrentDateTime());
    }
}


