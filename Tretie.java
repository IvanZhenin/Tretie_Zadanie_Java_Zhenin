import java.util.Scanner; 
public class New
{
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
        
		// Ввод месяца
       		System.out.print("Введите номер месяца: ");
        	int month = scanner.nextInt();
        
		// Ввод дня
        	System.out.print("Введите номер дня: ");
        	int day = scanner.nextInt();
        
        	int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // количество дней в каждом месяце
        
        	int ordinalDay = 0;
        
		// Вычисление порядкового номера
        	for (int i = 0; i < month - 1; i++)
		{
            	  ordinalDay += daysInMonth[i];
        	}
        	ordinalDay += day;
        
		// Вывод
        	System.out.println("Порядковый номер дня в году: " + ordinalDay);
	}
}