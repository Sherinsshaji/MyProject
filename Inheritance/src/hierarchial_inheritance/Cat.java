package hierarchial_inheritance;

public class Cat extends Animal {
	public void catCategory()
	{
		System.out.println("Cat is the Second Animal Category");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj1=new Cat();
		obj1.catCategory();
		obj1.animalCategory();
		

	}

}
