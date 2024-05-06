package multi_inheritance;

public class DogBreed extends Dog {
	public void pomerenian()
	{
		System.out.println("DogBreed is the second child class of Animal Parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogBreed obj1=new DogBreed();
		obj1.pomerenian();
		obj1.dogCategory();
		obj1.category();

	}

}
