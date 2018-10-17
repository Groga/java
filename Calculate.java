public class Calculate{



	public static void main(String[] args){

		System.out.println("Консольный калькулятор ....");
		int frist = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = frist + second;
		System.out.println("Сумма = " + summ);
		int subtraction = frist - second;
		System.out.println("Вычитание = " + subtraction);
		int multiplication = frist * second;
		System.out.println("Умножение = " + multiplication);
		int division = frist / second;
		System.out.println("Деление = " + division);
		double power = Math.pow(frist, second);
		System.out.println("Возведение в степень = " + power);
	}

}
