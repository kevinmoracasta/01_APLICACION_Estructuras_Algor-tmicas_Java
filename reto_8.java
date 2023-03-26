import java.util.*;
public class reto_8 {
    public static void main(String[] args) {
        
        Scanner lec = new Scanner(System.in);

        int  vic2=0, vidas1=3, vidas2=3,continuar=0, vic1=0;

        String nombre, contrincante;

        System.out.println("Digite su nombre:\n");
        nombre = lec.next();

        System.out.println("Digite el nombre del contricante:\n");
        contrincante = lec.next();

        do
        {int dadonom=(int)(Math.random() * 6) + 1, dadocont=(int)(Math.random() * 6) + 1;
            System.out.println("tiren los dados\n");
            System.out.println( nombre+" sacaste "+dadonom+"\n");
            System.out.println(contrincante+ " sacaste " +dadocont+"\n");
            
        if(dadonom>dadocont)
        {
        System.out.println(nombre + " ganaste ya que sacaste " + dadonom+ " asi que " + contrincante + " pierdiste una vida\n");
        vidas2--;
        vic1++;
        }
        else if(dadocont>dadonom)
        {
        System.out.println(contrincante + " ganaste ya que sacaste " + dadonom + " asi que"+  nombre +  " pierdiset una vida\n");
        vidas1--;
        vic2++;
        }
        else if (dadocont==dadonom) {
                        
        System.out.println("es empate asi que no pierden ninguna vida\n");

        }
                   
            
        System.out.println("¿Desean seguir jugano? 1.Si 2.No");
        continuar = lec.nextInt();
        }
        while(continuar==1 && vidas1>0 && vidas2>0);

        System.out.println("El juego a finalizado\n");

        System.out.println(nombre + " ganó " + vic1 + " y al final te quedaron " + vidas1 + " vidas");

        System.out.println(contrincante + " ganó " + vic2 + " y al final te quedaron " + vidas2 + " vidas");

        lec.close();
    }
}

