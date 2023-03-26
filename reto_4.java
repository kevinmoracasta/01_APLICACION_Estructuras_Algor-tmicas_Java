import java.util.Random;
import java.util.Scanner;

public class reto_4 {
    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in); 
		int numero_minimo = 1;
		int numero_maximo = 2;

		Random random = new Random();

        System.out.print("Digite su nombre:\n");
        String nombre = lec.nextLine();

        System.out.print("Digite su edad:\n");
        int edad =lec.nextInt();

        if (edad<=0) {
            System.out.print("Edad incorrecta:\n");
            
        }else if (edad>=100) {
            System.out.print("Usted ya no deberia de estar jugando este juego:\n");
            
        }

        System.out.print("Selecione: \n 1_piedra\n 2_papel\n 3_tijera\n");
        int seleccion= lec.nextInt();

        int resultado_2 = random.nextInt(numero_maximo + numero_minimo )+ numero_minimo ;
		

        System.out.println("La maquina escogio\n "+resultado_2);
        



        if (seleccion==resultado_2) {
            System.out.println("Es empate");    
        }
        
        else if (seleccion==1 && resultado_2==3) {
            System.out.println("Gano "+nombre);
        }
        
        else if (seleccion==2 && resultado_2==1) {
            System.out.println("Gano "+nombre);
        }
        
        else if (seleccion==3 && resultado_2==2) {
            System.out.println("Gano "+nombre);
        }
        
        else{
            System.out.println("Perdiste");
        }

        

        lec.close();

    }
}