package java.lesson4;
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

	  /*
    * Вычитание
    * Дважды приплюсовать первое значение, чтоб не изменить результат
    * */
    public void sub(int ... params) {
       this.result+=params[0]*2;
        for (Integer param : params){
            this.result-=param;
        }


    }

    /*
    * Умножение
    * */
    public void mult(int ... params) {
        this.result=1;
        for (Integer param : params){
            this.result *= param;
        }
    }

    /*
    * Деление
    * */
    public void div(int ... params) {

        for (Integer param : params){
            this.result /= param;
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
