package utp.mayorde3numeros;
import java.util.Scanner;
public class mayorde3numeros {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int numero1,numero2,numero3;
        System.out.println("Ingrese el primer numero");
        numero1= obj.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2= obj.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3= obj.nextInt();
        
        if(numero1==numero2 && numero2==numero3){
            System.out.println("Los tres numeros ingresados son iguales por lo tanto no existe un mayor");
        }else if(numero1>numero2 && numero1>numero3){
            System.out.println("El numero mayor es: "+numero1);
        }else if(numero2>numero1 && numero2>numero3){
            System.out.println("El numero mayor es: "+numero2);
        }else{
            System.out.println("El numero mayor es: "+numero3);
        }
    }
    
}
