import java.util.Scanner;

public class AutoMobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		AutoMobile a = null;
		Bike bike = null;
		System.out.println("-------------------Main Menu-----------------");
		System.out.println("1:Car\n2:Bike");
		System.out.println("Enter Your Choice.");
		int ch = sc.nextInt();
		if(ch==1)
		{
			System.out.println("-------------------Car Menu-------------");
			System.out.println("1:Maruti\n2:Toyota");
			System.out.println("Enter Your Choice.");
			int ch1 = sc.nextInt();
			if(ch1==1)
			{
				a = new Maruti();
				display("Maruti", a);
			}
			else if(ch1 == 2)
			{
				a =new Toyota();
				display("Toyota", a);
			}
		}
		else if(ch==2)
		{
			System.out.println("-------------------Bike Menu-------------");
			System.out.println("1:Hero Honda\n2:Tvs");
			System.out.println("Enter Your Choice.");
			int ch2 = sc.nextInt();
			if(ch2==1)
			{
				bike = new HeroHonda();
				display("Hero Honda",bike);
			}
			else if(ch2 == 2)
			{
				return;
			}

		}

	}

	public static void display(String str,AutoMobile a)
	{
		System.out.println("---------------------------------------------------------");
		System.out.println(str+" Model :"+a.getModel());
		System.out.println(str+" Color :"+a.getColor());
		System.out.println(str+" Price :"+a.getPrice());
		if(a instanceof Bike) {
			Bike b = (Bike) a;
			System.out.println(str+" CC :"+b.getcc());
		}
	}
}
