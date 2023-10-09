public class User{
  final private String name;
   private int score;
   User(String name){
       this.name=name;
       score=0;
   }
   public String getName(){
       return name;
   }
   public void calculateScore(){
       score++;
   }
   public int getScore(){
       return score;
   }

}

