

class GamblingSimulation {
    public static final int STAKE=100;
    public static final int BET=1;
    int tempMoney=STAKE;

    public static void main(String[] args) {
        System.out.println("welcome to gambling game");
        GamblingSimulation gamblingSimulation=new GamblingSimulation();
        gamblingSimulation.totalWinOrLoss();
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
    public int gamble(){
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
        System.out.println("Resigned for a day"+tempMoney);
        return (tempMoney-STAKE);
    }

    public void totalWinOrLoss() {
        int totalamount=0;
        for(int i=1;i<=20;i++) {
            totalamount+=gamble();
        }
        if(totalamount<0) {
            System.out.println("totalLoss"+totalamount);
        }
        else {
            System.out.println("totalgain"+totalamount);
        }
    }
}


