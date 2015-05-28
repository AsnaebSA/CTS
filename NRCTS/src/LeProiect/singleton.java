package LeProiect;


public class singleton {
	private static singleton instance = new singleton();
	private singleton(){}
	public static singleton getCerere()
	{
		return instance;
	}
	public void showMessage(){
		System.out.println("reusit");
	}
}


