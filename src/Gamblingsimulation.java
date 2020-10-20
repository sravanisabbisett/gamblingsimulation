

public class Gamblingsimulation {
    public static final int STAKE=100;
    public static final int BET=1;
    int temp=STAKE;

    public static void main(String[] args) {
        System.out.println("welcome to gambling game");
        Gamblingsimulation gamblingsimulation=new Gamblingsimulation();
        gamblingsimulation.winLoose();
    }
    public void winLoose(){
        while (true) {
            double randomCheck=Math.floor(Math.random() * 10) % 2;
            if ((int) randomCheck == 1) {
                temp++;
            } else {
                temp--;
            }
            if(temp==50||temp==150){
                System.out.println(temp);
                break;
            }
        }
    }
}
