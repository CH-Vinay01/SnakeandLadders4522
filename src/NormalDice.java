import java.util.Random;

public class NormalDice implements Dice{
    private int value;


    public int get(){
        Random ran = new Random();
        int val = ran.nextInt(6) + 1;
        return val;
    }

    @Override
    public void setValue() {
        this.value += roll();
    }

    public int roll(){
        int a = get();
        if(a == 6){
            a+=get();
            if(a == 12){
                a+=get();
                if(a == 18){
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
