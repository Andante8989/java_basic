package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		
		c1.name = "고양이";
		c1.age = 3;
		c1.color = "검은색";
	    c1.gender = "암";
	    
	    c1.getInfo();
	    c1.howl();
		
		

	}

}
