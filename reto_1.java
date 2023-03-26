import java.util.Scanner;

public class reto_1 {  

        public static void main(String[] args) {

             Scanner lec=new Scanner(System.in);

    double temp_f = 350 ; 
    double temp_c ; 
    double temp_k ; 
    temp_c = temp_f -32/1.8 + 7 ; 
    temp_k = temp_f +273.15 + 7 ; 

    System.out.println("Si esta en celcius es: \n " +temp_c+"°c\n Y si la pasamos a kelvin es:\n "+temp_k+"°k" );

    lec.close();
        }
       
}