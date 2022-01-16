package assessment;

 class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameteraized{
public static void main(String[] args) {

	Std std1=new Std(2,"pavi");
	Std std2=new Std(1,"harini");
	std1.display();
	std2.display();
		}
}                                                                                                                                                                                                                                                                                                                                                                