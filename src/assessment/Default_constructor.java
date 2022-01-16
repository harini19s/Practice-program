package assessment;

class empl{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Default_constructor {

public static void main(String[] args) {

	empl emp1=new empl();
	empl emp2=new empl();

	emp1.display();
	emp2.display();
	}
}