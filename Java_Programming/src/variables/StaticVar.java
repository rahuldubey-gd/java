package variables;

class StaticVar
{

static String name= "ABC";

	public static void main(String args[])
	{
		System.out.println(name);	
		InstanceVar i_obj =new InstanceVar();
		InstanceVar i_obj1 =new InstanceVar();

		i_obj.a =30;
		System.out.println(i_obj.a);
		System.out.println(i_obj1.a);
	}

}