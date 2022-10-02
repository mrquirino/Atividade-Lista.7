import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);

        System.out.println("Digite a media do lado do quadrado: ");
        double lado = e.nextDouble();
        e.close();

        double area = lado * lado;
        double dobroarea = area * 2;
        
        System.out.println("O dobro da area do quadrado e: " + dobroarea);
    }
}
