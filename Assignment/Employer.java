import java.util.Scanner;

	class Employee {
		int id;
		String name;
		int salary;
		int bonus;
		float rating;
	
		Employee(int id, String name, int salary, int bonus){
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.bonus = bonus;
			this.rating = 1;
		}
		Employee(int id, String name){
			this.id = id;
			this.name = name;
			this.salary = 10000;
			this.bonus = 0;
			this.rating = 1;
		}
		void update(int bonus, float rating) {
			System.out.println("Salary before updating is " + this.salary);
			this.salary = salary - (int)(this.bonus*this.rating);
			this.bonus = bonus;
			this.rating = rating;
			this.salary = salary + (int)(bonus*rating);
			System.out.println("New Salary is " + this.salary);
		}
		void update(int bonus) {
			System.out.println("Salary before updating is " + this.salary);
			this.salary = salary - (int)(this.bonus*this.rating);
			this.bonus = bonus;
			this.salary = salary + (int)(bonus*rating);
			System.out.println("New Salary is " + this.salary);
		}
		void update(float rating) {
			System.out.println("Salary before updating is " + this.salary);
			this.salary = salary - (int)(this.bonus*this.rating);
			this.rating = rating;
			this.salary = salary + (int)(bonus*rating);
			System.out.println("New Salary is " + this.salary);
		}
		
		
	}
	
public class Employer{
	static int displayMenu(Scanner sc) {
       		System.out.println("\nWelcome to the Employee Management System");
        	System.out.println("Press 1 to Update Bonus");
        	System.out.println("Press 2 to update rating");
        	System.out.println("Press 3 to update both bonus and rating");
        	System.out.println("Press 4 to exit");
        	return sc.nextInt();
    	}
	
	 public static void main(String[] args) {
	 	Employee dataBase[] = new Employee[10];
	 	//to take the record of 10 employees
	 	dataBase[0] = new Employee(1, "Vaibhav ", 15000, 500);
	 	dataBase[1] = new Employee(2, "Raj     ", 11000, 800);
	 	dataBase[2] = new Employee(3, "Arin    ", 15000, 600);
	 	dataBase[3] = new Employee(4, "Kunal   ", 17000, 300);
	 	dataBase[4] = new Employee(5, "Aditya  ");
	 	dataBase[5] = new Employee(6, "Vansh   ", 16000, 900);
	 	dataBase[6] = new Employee(7, "Omkar   ");
	 	dataBase[7] = new Employee(8, "Sahil   ", 20000, 500);
	 	dataBase[8] = new Employee(9, "Abhay   ");
	 	dataBase[9] = new Employee(10,"Himanshu", 21000, 300);
	 	
	 	Scanner sc = new Scanner(System.in);
		int n = displayMenu(sc);
	 
	 	//print the dataBase
	 	System.out.println("ID Name Salary Bonus Rating");
	 	for(int i = 0; i < 10; i++){
	 		System.out.println(dataBase[i].id + " " + dataBase[i].name + " " + dataBase[i].salary + " " + dataBase[i].bonus + " " + dataBase[i].rating);
		 }
		while (n != 4) {
	 		System.out.println("Enter employee ID : ");
		 	int id = sc.nextInt();
		 	int index = id-1;
		 	System.out.println("Employee name : " + dataBase[index].name);
			System.out.println();

		 	if(n == 1){
		 		System.out.println("Enter new Bonus : ");
		 		int newBonus = sc.nextInt();
		 		dataBase[index].update(newBonus);
		 	}else if(n == 2){
		 		System.out.println("Enter new Rating : ");
		 		float newRating = sc.nextFloat();
		 		dataBase[index].update(newRating);
		 	}else {
		 		System.out.println("Enter new Bonus : ");
		 		int newBonus = sc.nextInt();
		 		System.out.println("Enter new Rating : ");
		 		float newRating = sc.nextFloat();
		 		dataBase[index].update(newBonus,newRating);
		 	}
		 	n = displayMenu(sc);
		}
		sc.close();
        	System.out.println("Thank you!");	
	}
	 
}
