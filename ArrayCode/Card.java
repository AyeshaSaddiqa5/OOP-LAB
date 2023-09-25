public class Card {
   final String rank;
   final String suit;
    Card(String rank,String suit){
        this.rank=rank;
        this.suit=suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",rank,suit);
    }

    @Override
    public boolean equals(Object obj) {
        Card temp=(Card)obj;
        return this.rank.equals(temp.rank)&&this.suit.equals(temp.suit);
    }
}
