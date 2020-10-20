

public class Gamblingsimulation {
    public static final int STAKE=100;
    public static final int BET=1;

    public static void main(String[] args) {
        System.out.println("welcome to gambling game");
        Gamblingsimulation gamblingsimulation=new Gamblingsimulation();
        gamblingsimulation.winLoose();
    }
    public void winLoose(){
        double randomCheck=Math.floor(Math.random() * 10) % 2;
        if((int)randomCheck==1){
            System.out.println("gambler win ");
        } else{
            System.out.println("gambler loose ");
        }
    }
}
