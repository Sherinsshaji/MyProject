package hierarchial_inheritance;

public class DogCategory extends Animal {
public void dog()
{
	System.out.println("Dog is the First Animal Category");
}
public static void main(String[] args)
{
	DogCategory obj=new DogCategory();
	
	obj.animalCategory();
	obj.dog();
}
}
