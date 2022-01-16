package assessment;
public class Strings {

	public static void main(String[] args) {
		String a = "harini";
		StringBuffer buf = new StringBuffer(a);
		buf.append(" sundar");
		String result = buf.toString();
		System.out.println("String Buffer: "+result);
		String str=" s";
		StringBuilder sbl = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(str);
        System.out.println("StringBuilder contents: " + sbl+sb2);
	}

}
 