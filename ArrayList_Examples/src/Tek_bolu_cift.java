import java.util.ArrayList;


public class Tek_bolu_cift {


	public static void main(String[] args) 
	{

		ArrayList<Integer> hesap =new ArrayList<Integer>();

		for (int i = 0; i < 100; i++)
			hesap.add(i);
		
		
        System.out.println("Sonuc="+Hesaplar(hesap));


	}
	public static double Hesaplar( ArrayList<Integer>hesap)
	{
		double çifttop=0;
		double tektop=0;
		for (int i = 0; i < 100; i++)
		{
		if (hesap.get(i)%2==0) 
			çifttop=çifttop+hesap.get(i);
		
		else if (hesap.get(i)%2==1)
			tektop=tektop+hesap.get(i);
				
		}
		return çifttop/tektop;
	}

}
