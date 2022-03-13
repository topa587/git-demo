import java.util.Scanner;
class ModNo{
    public static void main(String[] args) {
        Scanner keybroad=new Scanner(System.in);
        System.out.print("Number: ");
        int number=keybroad.nextInt();

        if(number%2 == 0 ){
            System.out.println(number+ " is even number");
        }
        else {
            System.out.println(number+" is odd number");
        }
    }
}

