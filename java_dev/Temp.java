import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.print("Put 'f' for F -> C And Put 'c' for C -> F: ");
        String y = temp.nextLine();
        switch(y){
            case "f":
                System.out.print("Temp(farenheit): ");
                float x = temp.nextInt();
                float tempC = (x-32)/1.8f;
                System.out.println("farenheit to celsius = " + tempC +" C");
                break;
            case "c":
                System.out.print("Temp(Celsius): ");
                float z = temp.nextFloat();
                float tempF = (z*9/5)+32;
                System.out.print("celsius to farenheit = "+tempF+" F");
                break;
        }
        }
    }
