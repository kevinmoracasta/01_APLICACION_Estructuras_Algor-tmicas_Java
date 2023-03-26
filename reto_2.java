import java.util.Scanner;

/**
 * reto_2
 */
public class reto_2 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
            System.out.print("Digite nombre del doctor con el que agendo la cita:\n ");
String doctor=lec.nextLine();

System.out.print("Digite nombre del bebe\n");
String nombre=lec.nextLine(); 

System.out.print("Digite la vacuna que le corresponde a el bebe:\n");
String vacuna=lec.nextLine(); 

System.out.print("Digite la eps del bebe:\n ");
String eps =lec.nextLine(); 

System.out.print("Digite el peso del bebe:\n" );
int peso=lec.nextInt(); 

System.out.print("Digite meses del bebe:\n" );
int meses =lec.nextInt(); 

var dosis_1=peso+15; 

var dosis_2=meses+15; 

var total =dosis_1 / dosis_2; 

var dosis_final = total*10 ;

System.out.print(" El bebe "+nombre+ " con la EPS "+eps+" fue atendido por el doctor " +doctor+ " y necesita una dosis de vacuna de " +vacuna+ " y con una dosis de "  +dosis_final); 

lec.close();
    }
}

