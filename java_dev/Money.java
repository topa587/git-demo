import java.util.Scanner;
;
public class Money {
    public static void main(String[] args) {
        Scanner mc=new Scanner(System.in);
        System.out.print("Put Value: ");
        int money = mc.nextInt();
        System.out.println("Your Money is : "+money);
        System.out.println("Your Money Cheanged: ");
        if(money >= 1000){
            int bank = money/1000;
            System.out.println("Money Type 1,000 = "+bank);
            money = money%1000;
        }
        if(money >= 500){
            int bank = money/500;
            System.out.println("Money Type 500 = "+bank);
            money = money%500;
        }
        if(money >= 100){
            int bank = money/100;
            System.out.println("Money Type 100 = "+bank);
            money = money%100;
        }
        if(money >= 50){
            int bank = money/50;
            System.out.println("Money Type 50 = "+bank);
            money = money%50;
        }
        if(money >= 20){
            int bank = money/20;
            System.out.println("Money Type 20 = "+bank);
            money = money%20;
        }
        if(money >= 10){
            int coin = money/10;
            System.out.println("<Money Type 10 = "+coin);
            money = money%10;
        }
        if(money >= 5){
            int coin =money/5;
            System.out.println("Money Type 5 = "+coin);
            money = money%5;
        }
        if(money >= 1){
            int coin = money/1;
            System.out.println("Money Type 1 = "+coin);
        }
    }
}
