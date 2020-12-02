
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class GamblingSimulation {
    public static final int STAKE=100;
    public static final int BET=1;
    ArrayList<Integer> list=new ArrayList<Integer>();


    public static void main(String[] args) {
        System.out.println("welcome to gambling game");
        GamblingSimulation gamblingSimulation=new GamblingSimulation();
        gamblingSimulation.totalWinOrLoss();
        gamblingSimulation.luckiestUnluckyiest();
    }
    public boolean winLoose() {
        double randomCheck=Math.floor(Math.random() * 10) % 2;
        if((int)randomCheck==1) {
            //System.out.println("win");
            return true;
        }
        else {
            //System.out.println("Loose");
            return false;
        }
    }
    public int gamble(){
        int tempMoney=STAKE;
        while (tempMoney > 50 && tempMoney < 150) {
            if (winLoose()) {
                tempMoney=tempMoney+BET;
                //System.out.println("Money after gamble"+tempMoney);
            } else {
                tempMoney=tempMoney-BET;
                //System.out.println("Money after gamble"+tempMoney);
            }
        }
        int money=tempMoney-STAKE;
        //System.out.println(money);
        if(money<0){
            System.out.println("Resigned for a day with loss of:"+money);
        }else{
            System.out.println("Resigned for a day with gain of:"+money);
        }
        return money;
    }

    public void totalWinOrLoss() {
        int totalamount=0;
        for(int i=0;i<20;i++) {
            System.out.println("for day"+(i+1));
            list.add(gamble());
            System.out.println(list);
            totalamount+=gamble();
        }
        System.out.println(totalamount);
        if(totalamount<0) {
            System.out.println("totalLoss"+totalamount);
        }
        else {
            System.out.println("totalgain"+totalamount);
        }
    }
    public void luckiestUnluckyiest(){
        LinkedList<Integer> luckuUnlucky=new LinkedList<Integer>();
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(i==0) {
                luckuUnlucky.add(list.get(i));
            }
            else{
                if(list.get(i)==list.get(i-1)){
                    sum=list.get(i)+luckuUnlucky.get(i-1);
                    luckuUnlucky.add(sum);
                }
                else{
                    luckuUnlucky.add(list.get(i));
                }
            }
        }
        System.out.println(luckuUnlucky);
        int luckyday= Collections.max(luckuUnlucky);
        int indexlucky=luckuUnlucky.indexOf(luckyday);
        int unluckyday=Collections.min(luckuUnlucky);
        int indexunlucky=luckuUnlucky.indexOf(unluckyday);
        System.out.println("luckyiest day is:"+(indexlucky+1));
        System.out.println("Unluckyiest day is:"+(indexunlucky+1));
    }
}


