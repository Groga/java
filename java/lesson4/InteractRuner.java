package java.lesson4;
import java.util.Scanner;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InteractRuner{

	public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	
	
		int choice =0;
		Calculator calc = new Calculator();
		String exit ="no";
		 while(!exit.equals("yes")){
			 // введенное число записывается в строчном формате
                System.out.println("Введите первое число : ");
                String first = reader.next();
                /**выбор мат действия
                 * осталось разобраться с choice = Integer.parseInt(br.readLine()) или как по другому перевести значение в числовой формат
                */
                while (choice==0){
                    System.out.println("Выберите вид операции :");
                    System.out.println("1. Сумма (+)");
                    System.out.println("2. Вычитание (-)");
                    System.out.println("3. Умножение (*)");
                    System.out.println("4. Деление (/)");
                    choice = Integer.parseInt(br.readLine());
                    if(choice != 1&& choice !=2&& choice !=3&& choice !=4){
                        choice =0;
                    }
                }
                System.out.println("Enter second arg:");
                String second = reader.next();
                /*
                * Выбор функции в зависимости от выбора
                * */
                if(choice==1){
                	// помимо тут преабразунм стороку в число
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));

                }
                else if(choice ==2){
                    calc.sub(Integer.valueOf(first), Integer.valueOf(second));
                }
                else if(choice ==3){
                    calc.mult(Integer.valueOf(first), Integer.valueOf(second));

                }
                else if(choice ==4){
                    calc.div(Integer.valueOf(first), Integer.valueOf(second));

                }
                /*
                * Обнулить выбор мат действия, или не будет работать выбор
                * */
                choice = 0;
                System.out.println("Result: " + calc.getResult());
                /*
                * Очистить или сохранить результат
                * @ choiceEnd Храние выбора
                * */
                int choiceEnd =0;
                calc.cleanResult();
                System.out.println("Exit: yes/no?");
                exit = reader.next();

			}
		

	

	}

}
