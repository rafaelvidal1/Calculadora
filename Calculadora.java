package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static void menu(){
        
        System.out.println("\tEscolha a operação que deseja realizar");
        System.out.println("0. Soma");
        System.out.println("1. Subtração");
        System.out.println("2. Multiplicação");
        System.out.println("3. Divisão");
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float num1,num2,result=0;
        int opcao;
        
        System.out.println("Digite o primeiro número: ");
        num1=entrada.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        num2=entrada.nextFloat();
        
        menu();
        opcao=entrada.nextInt();
        do{
            switch (opcao){
                case 0:
                    result=num1+num2;
                    break;
                case 1:
                    result=num1-num2;
                    break;
                case 2:
                    result=num1*num2;
                    break;
                case 3:
                    result=num1/num2;
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        }while(opcao!=0 && opcao!=1 && opcao!=2 && opcao!=3);
        
        System.out.printf("\tResultado: %.2f\n",result);
        
    }
    
}
