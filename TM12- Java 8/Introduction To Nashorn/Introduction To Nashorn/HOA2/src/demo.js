function isPrimeNumber(num)
{	
	var isPrime = true;
	for(var i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			isPrime = false;
			
			break;
		}
	}
	
	return isPrime;
}

isPrimeNumber(23);