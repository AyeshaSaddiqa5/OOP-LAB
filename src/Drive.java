public class Drive {
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(20,50, 2, 5);
        Rectangle rect2 = new Rectangle(30,2,1,3);
       // Rectangle minirect=rect2.Minirect(rect1,rect2);

        System.out.println(rect1.calculatearea());
        System.out.println(rect1.calculateperimeter());
        System.out.println(rect1.Minirect(rect1, rect2));

if(rect1.overlaping(rect2)){
    System.out.println("rectangle overlap");
}
else{
    System.out.println("rectangles not overlap");
}
    }
}
