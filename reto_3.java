import java.util.Random;
import java.util.Scanner;

public class reto_3 {
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
            System.out.print("edad incorrecta\n");
            
        }else if (edad>=100) {
            System.out.print("usted ya no deberia de estar jugando este juego\n");
            
        }

        System.out.print("Selecione: \n 1_cara\n 2_sello\n");
        int seleccion= lec.nextInt();

        if (seleccion==1) {
            System.out.println("La maquina escogio sello");
            
        }else if (seleccion==2) {
            System.out.println("La maquina escogio cara ");
            
        }else {
            System.out.println("Intente de nuevo");
        }

int resultado = random.nextInt(numero_maximo + numero_minimo) +1 ;
		


        if (seleccion==resultado) {
            System.out.println("Felicidades "+nombre+" la moneda callo en "+seleccion+" asi que ganaste tu");
            
        }
        else {
            System.out.println("la moneda callo en "+resultado+" asi que gano la maquina");
        }

        lec.close();

    }
}
