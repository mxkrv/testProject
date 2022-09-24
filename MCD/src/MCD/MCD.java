package MCD;
import java.lang.Math;
/**
Aquesta classe calcula el màxim comú divisor de dos numeros
positius més grans que zero amb l'algorisme d'Euclides.

Es calcula de la forma següent per
*/

/**shared in git*/

public class MCD {
	/**
	* Constructor de la classe.
	*/
	public MCD()
	{
	}

	/**
	Mètode que calcula el màxim comú divisor
	@param a primer número
	@param b segon número
	@return retorna el MCD d'a i b
	*/

	public static int calculaMCD(int a, int b)
	{
		int c;
		do
		{
			System.out.println(a+" "+b);
			c=Math.abs(a-b);
			if (a<b)
			{
				c=b-a;
				b=c;
			}
			else
			{
				c=a-b;
				a=c;
			}
		}while (a!=b);
		System.out.println(a+" "+b);
		return a;
	}

	/**
	Mètode main.
	*/
	public static void main(java.lang.String[] args)
	{
	   java.util.Vector v;
	   if(args.length<2)
	   {
	      System.out.println("Calen dos numeros positius d'entrada");
	   }
	   else
	   {
	      int a = new Integer(args[0]).intValue();
	      int b = new Integer(args[1]).intValue();
	      if ((a<=0)||(b<=0))
	      	System.out.println("Els numeros han de ser positius mes grans que zero");
	      else
	      {
			  int res=calculaMCD(a,b);
			  if (res>1)
			  	System.out.println("El maxim comu divisor de "+a+" i "+b+" es "+res);
			  else
			  	System.out.println(a+" i "+b+" son primers entre si");
		  }
		}
	}
}
