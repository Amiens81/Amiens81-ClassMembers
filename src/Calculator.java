public class Calculator {
	int a;
	int b;

	public int sum(int a, int b){
		this.a = a;
		this.b = b;
		return a + b;
	}
	public int difference(int a, int b){
		this.a = a;
		this.b = b;
		return a - b;
	}
	public void multiplication(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Произведение чисел = " + a * b);
	}
	public void division(int a, int b){
		this.a = a;
		this.b = b;
		if(b != 0) {
			System.out.println("Частное числа = " + a / b);
		}
		else{
			System.out.println("Частное числа при делении на 0 не существует. На ноль делить нельзя!");
		}
	}
}
