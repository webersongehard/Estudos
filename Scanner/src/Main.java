import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome ? ");
		String nome = scanner.nextLine();
		System.out.println("Qual é a sua idade? ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Qual sua comida favorita");
		String comida = scanner.nextLine();
		
		System.out.println("Ola! "+nome);
		System.out.println("Você tem "+idade+" anos de idade");
		System.out.println("Sua comida favorita é "+comida);
	}

}
