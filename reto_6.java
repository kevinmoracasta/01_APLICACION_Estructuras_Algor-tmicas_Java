import java.util.Scanner;
public class reto_6 {
    public static void main(String[] args) {
        int i=1,cont=1,conti=0;
        String  palab;
        Scanner lec = new Scanner(System.in);

        
        System.out.println("Con cuantas palabras desea jugar:\n");
        cont = lec.nextInt();
        while(i<=cont){

            do{
            System.out.println("Listo las palabras con las que vas a jugar van a ser:\n 1.perro\n2.gato\n3.loro\n4.aguila\n5.vaca\n6.caballo\n7.burro\n8.pez\n10.ballena ");
  
            System.out.println("Que palabra deseas adivinar");
            palab = lec.next();
    
    
            if(palab.equalsIgnoreCase("perro"))
            {
                System.out.println("Felicidades ganaste la palabra era perro");
                i=cont+1;
            }
                else
                {
                    System.out.println("Lo sentimos perdiste");
                }i++;

                
                System.out.println("¿Deseas jugar nuevamente? 1.Si 2.No");
                conti = lec.nextInt();
                if(conti==1)
                {
                
                }
                else if (conti==2);
            }
                while (conti==1); 
            
                lec.close();
            }
        }

    }
        




