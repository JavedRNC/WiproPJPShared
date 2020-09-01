abstract class GeneralBank
{
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 4;
	}
	
	double getFixedDepositInterestRate()
	{
		return 8.5;
	}
}

class KotMBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 6;
	}
	
	double getFixedDepositInterestRate()
	{
		return 9;
	}
}

class HOA1
{
	public static void main(String[] args)
	{
		ICICIBank i = new ICICIBank();
		System.out.println(i.getSavingsInterestRate());
		System.out.println(i.getFixedDepositInterestRate());
		System.out.println();
		KotMBank k = new KotMBank();
		System.out.println(k.getSavingsInterestRate());
		System.out.println(k.getFixedDepositInterestRate());
		System.out.println();
		GeneralBank g = new KotMBank();
		System.out.println(g.getSavingsInterestRate());
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println();
		g = new ICICIBank();
		System.out.println(g.getSavingsInterestRate());
		System.out.println(g.getFixedDepositInterestRate());
	}
}