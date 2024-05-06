package single_inheritance;

public class Dog extends Animal {
	public void bark()
	{
		System.out.println("Dog is Barking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1=new Dog();
		obj1.bark();
		obj1.eat();

	}

}
