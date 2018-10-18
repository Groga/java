/**
Класс реализует калькулятор
*/
public class Calculator{

	/**
	Результат вычисления
	*/

	private int result;

	/**
	Суммируем аргументы param params аргументы суммирования
	*/

	public void add(int ... params){
		for(Integer param : params){
			this.result +=param;
		}	
	}

	/**
	Получить результат вычисления
	*/
	public int getResult(){
	return this.result; 
	}

	/**		
	Очистить результат вычистения
	*/

	public void cleanResult(){
		this.result = 0;
	}
}
