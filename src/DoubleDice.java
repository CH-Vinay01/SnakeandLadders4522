import java.util.Random;

public class DoubleDice implements Dice{
    private int value;


    public int get() {
        Random ran = new Random();
        value = ran.nextInt(12) + 1;
        return value+=roll();
    }

    @Override
    public void setValue() {
        this.value += roll();
    }

    public int roll(){
        int a = get();
        if(a == 12){
            a+=get();
            if(a == 24){
                a+=get();
                if(a == 36){
                    a=0;
                }
            }
        }
        return a;
    }
    @Override
    public int getValue() {
        return value;
    }
}
