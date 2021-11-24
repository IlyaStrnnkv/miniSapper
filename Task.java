package javarush;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		
		System.out.println(Task.miniSapper());
	}
	public static String miniSapper() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 0 до 2");
		int a = scanner.nextInt();
		if(a < 0) {                                // Валидация вводимых значений
			return "Вы ввели число вне диапазона";
		} if(a > 2) {
			return "Вы ввели число вне диапазона";
		}
		
		System.out.println("Введите число от 0 до 2");
		int b = scanner.nextInt();
		if(b < 0) {									//Валидация вводимых значений
			return "Вы ввели число вне диапазона";
		}
		if(b > 2) {
			return "Вы ввели число вне диапазона";
		}
		
		double x = Math.random() * 2;
		int x1 = (int)Math.round(x);
		
		double y = Math.random() * 2;
		int y1 = (int)Math.round(y);
		
		System.out.println(x1 + " " + y1);
		
		if(a == x1) {
			if(b == y1) {
				return "Мина была взорвана";
			}
		}
		return "Вы не наступили на мину";
	}
}
