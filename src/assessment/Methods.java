package assessment;

public class Methods {


		
		public int area(int a,int b){
		
			int add;
			add=a+b;
			return add;
		
		}
		public int area(int r){
			int cir;
			int pi=(int) 3.14;
			cir=pi*r*r;
			return cir;
		}
		public int area(long h,double b){
			int rec;
			rec=(int) (h*b);
			return rec;
		}

		public static void main(String[] args) {
			
			Methods m=new Methods();
			int s1 =m.area(3,4);
			int s2 =m.area(7);
			int s3 =m.area(12L,11.5);
			System.out.println("Addition: "+s1);
			System.out.println("Area of circle: "+s2);
			System.out.println("Area of rectangle: "+s3);

		}

	}