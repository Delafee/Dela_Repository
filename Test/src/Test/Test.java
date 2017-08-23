package Test;

public class Test 
{
	public static void main(String[] args)
	{
		zi z = new zi();
		z.show();
		z.show2();
		//System.out.println(z.num+"..."+z.num);
	}
}

class Fu
{
	int num=4;
}

class zi extends Fu
{
	int num=5;
	void show()
	{
		System.out.println(super.num);
	}
	
	void show2()
	{
		System.out.println(this.num);
	}
}
