package variables;


class InstanceVar
{

int a = 20;

public static void main(String a[])
{

	
	InstanceVar i1 = new InstanceVar();
	i1.a = 20;
	InstanceVar i2 = new InstanceVar();
	i2.a = 30;	
	System.out.println(i1.a);
 
	System.out.println(i2.a);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println(StaticVar.name);
	
}
}