package Week3.Day2;

public class College extends University{
	
	public void ug()
	{
		System.out.println("UG courses");
	};

	public static void main(String[] args) {
		College cg = new College();
		//cg.pg();
		cg.ug();
	}
}
