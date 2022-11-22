import java.util.Scanner;
public class RunAnimal {

   public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Choose an Animal. Press B for Bird, C for Cat, or D for Dog: ");
	String input = sc.nextLine();
	
	Bird b = new Bird();
	Cat c = new Cat();
	Dog d = new Dog();
	
	if(input.equalsIgnoreCase("B")){
		b.eat();
		b.sleep();
		b.makeSound();
	}
	else if(input.equalsIgnoreCase("C")){
		c.eat();
		c.sleep();
		c.makeSound();
	}
	else if(input.equalsIgnoreCase("D")){
		d.eat();
		d.sleep();
		d.makeSound();
	}
	else{
		System.out.print("Invalid Input!");
	}





 }
    
    
}