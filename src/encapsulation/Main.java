package encapsulation;

/*Encapsulation is defined as the wrapping up of data under a single unit. 
It is the mechanism that binds together code and the data it manipulates. 
Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield. 
*/

public class Main {

	public static void main(String[] args) {
		EncapsulationExample encapsulation = new EncapsulationExample();
		encapsulation.setAge(10);
		encapsulation.setName("Aviet");
		encapsulation.setRollNo(10);
		
		// Displaying values of the variables
        System.out.println("Student name: " + encapsulation.getName());
        System.out.println("Student age: " + encapsulation.getAge());
        System.out.println("Student roll no: " + encapsulation.getRollNo());

	}

}
