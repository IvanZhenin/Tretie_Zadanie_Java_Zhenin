import java.util.Scanner;
public class New
{
	public static void main (String args[])
	{
		Scanner Scan = new Scanner(System.in, "Cp866");
		// Ввод символа
		char symbol = Scan.next().charAt(0); 
		
		// Определение символа при помощи условных операторов и вывод
       		if (Character.isLetter(symbol) && symbol >= 'а' && symbol <= 'я' || symbol >= 'А' && symbol <= 'Я') 
		{
           	  System.out.println("Символ является русской буквой.");
       		} 
		else 
		{
           	  System.out.println("Символ не является русской буквой.");
        	}
	}
}