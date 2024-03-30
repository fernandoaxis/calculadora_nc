package nc;
import nc_dominio.Operadores;
import java.util.Scanner;
public class calculadora_nc {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a parte real do primeiro número complexo:");
        double real1 = scanner.nextDouble();
        
        System.out.println("Digite a parte imaginária do primeiro número complexo:");
        double imaginario1 = scanner.nextDouble();
        
        System.out.println("Digite a parte real do segundo número complexo:");
        double real2 = scanner.nextDouble();
        
        System.out.println("Digite a parte imaginária do segundo número complexo:");
        double imaginario2 = scanner.nextDouble();
        
        Operadores op1 = new Operadores(real1, imaginario1);
        Operadores op2 = new Operadores(real2, imaginario2);
        
        Operadores soma = op1.add(op2);
        Operadores sub = op1.subtrair(op2);
        Operadores mult = op1.multiplicar(op2);
        Operadores div = op1.divide(op2);
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divide: " + div);
        
        scanner.close();

	}
}
