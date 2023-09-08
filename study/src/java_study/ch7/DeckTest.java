package java_study.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);

    }
}

class Deck{
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    Deck(){
        int i=0;
        for(int k=Card.KIND_MAX; k>0; k--)
            for(int n=0; n<Card.NUM_MAX; n++)
                cardArr[i++]= new Card(k,n+1);
    }

    Card pick(int index){ // 지정된 위치에 있는 카드를 하나 꺼내서 반환
        return cardArr[index];
    }

    Card pick(){ // 임의의 카드를 꺼내서 반환
        int index= (int)(Math.random()*CARD_NUM);
        return pick(index);
    }

    void shuffle(){
        for(int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card tmp = cardArr[i];
            cardArr[i]=cardArr[r];
            cardArr[r]= tmp;
        }
    }

}

class Card{

    // ---- cv ----
    static final int KIND_MAX = 4; // 카드 무늬 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    // ---- iv ----
    int kind;
    int number;

    Card(){ // 생성자
        this(SPADE,1);
    }
    Card(int kind,int number){
        this.kind = kind;
        this.number = number;
    }
    public String toString(){
        String[] kinds={"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers ="0123456789XJQK"; // 숫자 10은 X로 표현.
        return "kind : "+kinds[this.kind]+", number : "+numbers.charAt(this.number);
    }

}