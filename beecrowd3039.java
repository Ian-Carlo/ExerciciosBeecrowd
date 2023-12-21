import java.io.IOException;
 import java.util.Scanner;
/**
 * - Ian Carlo de Lima Pedroso
 * - 11/08/2023 18:20:25
 *      
 *    
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int car = 00;
        int bon = 00;
        for(int c =0; c < n; c++){
           
            String line = sc.nextLine();
            String list[] = line.split(" ");
            
            if(list[1].equals("F")){
            	
                bon++;
            }
            else{
                car++;
            }
            
            
        }
        System.out.println(car + " carrinhos");
        System.out.println(bon + " bonecas");

    }
 
}
