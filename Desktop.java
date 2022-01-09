package Week3.Day2;

public class Desktop implements Hardware, Software{

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software resources");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware resources");
	}
	
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.hardwareResources();
		desk.softwareResources();
	}

}
