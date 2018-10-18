import java.util.Scanner;


public class InteractRuner{

	public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	
	try{

		Calculator calc = new Calculator();
		String exit ="no";
		while (!exit.equals("yes")){
		
			System.out.println("Введите число №1 : ");
			String frist = reader.next();
			System.out.println("Введите число №2 : ");
			String second = reader.next();
			calc.add(Integer.valueOf(frist), Integer.valueOf(second));
			System.out.println("Результат : " + calc.getResult());
			calc.cleanResult();
			System.out.println("Выход : yes/no ");
			exit = reader.next();

					}
		}finally{
			reader.close();
			}
		

	

	}

}
