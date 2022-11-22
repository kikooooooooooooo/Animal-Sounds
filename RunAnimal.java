import java.util.Scanner;
public class RunAnimal {
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	Dog dog = new Dog();
	Bird bird =new Bird();	
	Cat cat = new Cat();
		
	System.out.print("Choose an Animal. Press B for Bird, Press C for Cat, or Press D for Dog: ");
	String Press = sc.nextLine();
	
	if (Press.equalsIgnoreCase("B"))
  	 {
   	bird.eat();
   	bird.sleep();
   	bird.makeSound();
  	}
  	else if (Press.equalsIgnoreCase("C"))
  	 {
   	cat.eat();
   	cat.sleep();
   	cat.makeSound();
  	}
  	else if(Press.equalsIgnoreCase("D"))
  	 {
   	dog.eat();
   	dog.sleep();
   	dog.makeSound();
  	} 

 
	}  
}