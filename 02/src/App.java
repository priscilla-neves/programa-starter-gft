import java.util.Scanner;
public class App {
    public static void main(String[] argss){
        System.out.println("Digite a quantidade de números: ");
        Scanner n = new Scanner(System.in);
        Scanner entradas = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        int numeroInt = n.nextInt();

        for(int i = 1; i <= numeroInt; i++){
            System.out.println("Digite o " + i + "º número");
            num = entradas.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            if(num % 2 == 1){
                contImpar++;
            }
    
        }
        
        System.out.println("Foram um total de: " + contPar + " números pares \n");
        System.out.println("E " + contImpar + " números ímpares");
    }
}