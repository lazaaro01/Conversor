import java.util.Scanner;

public class OQC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("***** Conversão de bases *****");
        System.out.println("1 -----> Hexadecimal para binário");
        System.out.println("2 -----> Decimal para Octal");
        System.out.println("3 -----> Subtracao de binarios");
        System.out.println("4 ----> Divisão de binarios");
        System.out.print("Escolha umas dessas opções para fazer a conversão ou operação:");

        int opcao = leia.nextInt();
        leia.nextLine();

        switch (opcao) {
           case 1:
                System.out.println("Digite um número hexadecimal:");
                 String hexaParaDecimal = leia.nextLine();
                 int decimal = Integer.parseInt(hexaParaDecimal, 16);
                 String binario = Integer.toBinaryString(decimal);
                System.out.println("O número em binário e: "+binario);
                break;
            case 2:
                System.out.println("Digite um número Decimal:");
                int deciParaOctal = leia.nextInt();
                System.out.println("O número em Otacl é: " +Integer.toOctalString(deciParaOctal));
                break;
            case 3:
                System.out.println("Digite o primeiro número binário: ");
                String n1 = leia.next();
                System.out.println("Digite o segundo número binário");
                String n2 = leia.next();
                System.out.println("O resultado da subtração e: " +binarioSub(n1,n2));
                break;
            case 4:
                System.out.println("Digite o dividendo binário: ");
                int dividendo = leia.nextInt();
                System.out.println("Digite o divisor binário: ");
                int divisor = leia.nextInt();
                System.out.println("O resutado da divisão e: " +Integer.toBinaryString(dividendo) +Integer.toBinaryString(divisor));
                break;
            default:
                System.out.println("Opação inválida!!");
        }
        leia.close();
    }
    public static String binarioSub(String n1, String n2) {
        int decimal11 = Integer.parseInt(n1,2);
        int decimal12 = Integer.parseInt(n2, 2);
        int res = decimal11 - decimal12;
        return Integer.toBinaryString(res);
    }
     public static String binarioDiv(String dividendo, String divisor) {
        int quociente = Integer.parseInt(dividendo, 2) / Integer.parseInt(divisor, 2);
        int resto = Integer.parseInt(dividendo,2) % Integer.parseInt(divisor,2);

        return "Quociente: " +Integer.toBinaryString(quociente) + ", resto: " +Integer.toBinaryString(resto);
     }
}
