package polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		Parent a;

		a = new Child();
		a.print();

		a = new Child();
		a.print();

	}

}
