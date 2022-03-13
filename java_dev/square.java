import java.util.Scanner;

public class square {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Put Number: ");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
          if(i == 1 || i == x){
            for(int y =1 ;y <=x;y++){
              System.out.print("#");
            }
          }
          else if(i > 1 && i <= x-1){
            for(int z=1; z<=x;z++){
              if(z==1 || z==x){
                System.out.print("#");
              }
              else if(z > 1 && z <x){
                System.out.print(" ");
              }
            }
          }
          System.out.println("");
        }
    
    }
    
}
