class Employe
{
	private int id;
	private String name;
	private int salary;
	private Date dob;


	Employe()
	{
		id = 101;
		name = "Dhiraj";
		salary = 20000;

	}

	
	Employe(int d,String n,int s,int dt,int m,int y)
	{
		id = d;
		name = n;
		salary = s;

		dob = new Date(dt,m,y);


	}


	public String toString()
	{
		String str = "ids: " + id + " name :" + name + " Salary :" + salary + " dob: " + dob;
		return str;
	}


}