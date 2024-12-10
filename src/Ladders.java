public class Ladders implements SnakesAndLadders{
    @Override
    public int jump(int n) {
        if(n==4){
            return 25;
        }else if(n==13){
            return 46;
        }else if(n==33){
            return 49;
        }else if(n==42){
            return 63;
        }else if(n==50){
            return 69;
        }else if(n==62){
            return 81;
        }else if(n==74){
            return 92;
        }else{
            return n;
        }
    }
    public String isWhat(int n){
        if(n==27 || n==40 || n==43 || n==54 || n==66 || n==76 || n==89 || n==99){
            return "snake";
        } else if (n==4 || n==13 || n==33 || n==42 || n==50 || n==62 || n==74) {
            return "ladder";
        }else{
            return "plain";
        }
    }
}
