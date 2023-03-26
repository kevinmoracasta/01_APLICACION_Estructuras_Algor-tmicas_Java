import java.util.Scanner;
public class reto_7 {
    public static void main(String[] args) {
        int contador=0,telefono,numdoc;
        String nombre, apellido, edad, doc,correo;
        Scanner lec = new Scanner(System.in);
        do{
            System.out.println("Digite su nombre: ");
            nombre = lec.next();
            System.out.println("Digite su apellido: ");
            apellido = lec.next();
            System.out.println("Digite su edad: ");
            edad = lec.next();
            System.out.println("Digite su tipo de documento: \nCC \nTI \nP \nRC\n");
            doc = lec.next();
            System.out.println("Digite su numero de documento:");
            numdoc = lec.nextInt();
            System.out.println("Digite su numero de telefono:");
            telefono = lec.nextInt();
            System.out.println("Digite su correo:");
            correo = lec.next();

            System.out.println("Listo tus datos registrados son \n");

            System.out.println("NOMBRE: "+nombre+"\nAPELLIDO: " +apellido+"\nEDAD: "+edad+"\nDOCUMENTO: " +doc +"."+ numdoc+ "\nTELEFONO: "+telefono+"\nCORREO: "+correo);
            
    
            System.out.println("¿Deseas enviar otro formulario? (1.Si 2.No)");
            contador = lec.nextInt();
        }
        while(contador==1);
        lec.close();
    }
}