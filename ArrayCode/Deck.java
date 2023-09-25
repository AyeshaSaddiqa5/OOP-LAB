import java.util.Random;

public class Deck {
    static Card[] cards =new Card[52];
    String suit[]={"Ace","Diamond","Spades","Clubs"};
    String rank[]={"A","1","2","3","4","5","6","7","8","9","10","j","k"};


        Deck() {
     int counter=0;
     for(int i=0;i<4;i++)
         for(int j=0;j<13;j++)
             cards[counter++]=new Card(rank[j], suit[i]);
    }


    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            str.append(cards[i] + "\n");
        }
        return str.toString();
    }
    public static void shuffle(){
        Random random=new Random();
        for(int i=0;i<6000;i++){
            int randomIndex=random.nextInt(52);
            Card temp=cards[randomIndex];
            cards[randomIndex]=cards[0];
            cards[0]=temp;
        }
    }

    }