import java.util.Scanner;
public class New
{
	public static void main (String args[])
	{
		Scanner Scan = new Scanner(System.in, "Cp866");
		// Объявление переменных
		int numOne = 5;
        	int numTwo = 10;
        	int numTree = 7;
        	int numFour = 8;
        
        	int smallest = numOne;
        
		// Поиск наименьшего через условие
        	if (numTwo < smallest) 
		{
            	  smallest = numTwo;
       	 	}
        	if (numTree < smallest) 
		{
            	  smallest = numTree;
        	}
        	if (numFour < smallest) 
		{
            	  smallest = numFour;
        	}

        	// Вывод итогового числа
        	System.out.println("Наименьшее число: " + smallest);
	}
}