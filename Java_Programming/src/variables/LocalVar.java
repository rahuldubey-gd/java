package variables;

class LocalVar
{

	void add(int a)
	{
		System.out.println(a);
	}

	public static void main(String args[])
	{
		//int a=10;	
		//System.out.println(a);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(" "+i);
		}
		
		//System.out.println(i); Invalid
		
		LocalVar ob = new LocalVar();
		ob.add(10);
		//System.out.println(a);
	
	}

}