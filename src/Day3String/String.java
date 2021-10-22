package Day3String;

public class String {
	public static void main(String[] args)
	{
		StringBuilder sbr1=new StringBuilder("Hello");
		StringBuilder sbr2=new StringBuilder("Hello");
		
		System.out.println();
		System.out.println(sbr1==sbr2);
		System.out.println(sbr1.equals(sbr2));
	}

}
