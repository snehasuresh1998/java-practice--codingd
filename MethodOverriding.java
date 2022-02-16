class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is running");
	}
}
class MethodOverriding
{
	public static void main(String[] args)
	{
		Bike b=new Honda();
		Honda h=new Honda();
		Bike s=new Bike();
		b.run();
		h.run();
		s.run();
	}
}