

public class GamblingSimulation {
    public static final int STAKE=100;
    public static final int BET=1;
    int tempMoney=STAKE;

    public static void main(String[] args) {
        System.out.println("welcome to gambling game");
        GamblingSimulation gamblingSimulation=new GamblingSimulation();
        gamblingSimulation.gamble();
    }
    public boolean winLoose() {
        double randomCheck=Math.floor(Math.random() * 10) % 2;
        if((int)randomCheck==1) {
            System.out.println("win");
            return true;
        }
        else {
            System.out.println("Loose");
            return false;
        }
    }
    public void gamble(){
        int tempMoney=STAKE;
        while (tempMoney > 50 && tempMoney < 150) {
            if (winLoose()) {
                tempMoney=tempMoney+BET;
                System.out.println("Money after gamble"+tempMoney);
            } else {
                tempMoney=tempMoney-BET;
                System.out.println("Money after gamble"+tempMoney);
            }
        }
        System.out.println("Resigned for day"+tempMoney);
    }
}


