package foreach.sportcode.pl;

public class ForEach 
{
	public  static void main(String[] args)
	{
	int table[] = new int[10] ;
	
	for(int number = 0 ; number<10 ; number++)
	{
		table[number] = number+2 ; 
	}
	for(int number2 : table) //Dla ka�dej liczby ca�kowitej wykona si� ta instrukcja
	{
		System.out.println(number2);
	}
	}
}

