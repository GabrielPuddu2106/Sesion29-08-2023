import java.utitl.Scanner;

public class CondicionalSwitch{

    public static void main(String[] args){
        //Condicional switch-Condicional multiple
        Scanner lector = new Scanner (System.in);
        int valorA , valorB , resultado;
        float cociente;
        System.out.println("Menu de opciones");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        byte opc = lector.nextByte();
        switch (opc) {
            case 1:
                 System.out.println("1) Sumar");
                 System.out.println("a: ");
                 valorA= lector.nextInt();
                 System.out.println("b: ");
                 valorB= lector.nextInt();
                 resultado = valorA + valorB;
                 System.out.println("El resultado es:"+resultado);
                 
                 break;
        
            case 2:
                 System.out.println("2) Resta");
                 System.out.println("a: ");
                 valorA= lector.nextInt();
                 System.out.println("b: ");
                 valorB= lector.nextInt();
                 resultado = valorA - valorB;
                 System.out.println("El resultado es:"+resultado);
             
                 break;

            case 3:
                 System.out.println("3) Multiplicacion ");
                 System.out.println("a: ");
                 valorA= lector.nextInt();
                 System.out.println("b: ");
                 valorB= lector.nextInt();
                 resultado = valorA * valorB;
                 System.out.println("El resultado es:"+resultado);
                break;

            case 4:
                 System.out.println("4) Division");
                 System.out.println("a: ");
                 valorA= lector.nextInt();
                 System.out.println("b: ");
                 valorB= lector.nextInt();
                 if(valorB) {
                     System.out.println("El divisor no puede ser 0");
                 }else {
                    cociente = valorA / valorB;
                 }
                 System.out.println("El resultado es:"+cociente);
                break;

            case 5:
                 System.out.println("Saliendo de la App");
            
                break;

            default:
                 System.out.println("Opcion incorrecta/No valida");
                 System.out.println("Saliendo de la app");
               

            }
            lector.close();
    }
}