import java.util.Scanner;

public class App {

public static void main(String[] args) {
   
    double fahr, celsius ;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual a temperatura em Fahrenheit ");
    fahr = teclado.nextDouble();
    
    celsius = 5 * ((fahr-32)/9);
    System.out.format("A temperatura em Celsius é %.2f ºC" , celsius);
    
    teclado.close();
    }
  
   
}


