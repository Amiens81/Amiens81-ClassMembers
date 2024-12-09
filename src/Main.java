import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{   //Первый вариант посредством Scanner
		System.out.println("Первый вариант посредством Scanner");
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ведите первое число!");
		int a = sc.nextInt();
		System.out.println("Введите второе число!");
		int b = sc.nextInt();
		System.out.println("Сумма чисел = " + calculator.sum(a,b));
		System.out.println("Разность чисел = " + calculator.difference(a,b));
		calculator.multiplication(a,b);
		calculator.division(a,b);
		//Второй вариант
		System.out.println("Второй вариант без Scanner");
		System.out.println("Сумма чисел = " + calculator.sum(5,6));
		System.out.println("Разность чисел = " + calculator.difference(17,8));
		calculator.multiplication(5,7);
		calculator.division(14,7);
	}
}