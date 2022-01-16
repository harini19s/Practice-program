package assessment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Read_write 
{
	
	public static void main (String[] args) throws IOException
	{
		
		@SuppressWarnings("Unused")
		
		FileWriter file = new FileWriter("C:\\Users\\Dell\\Documents\\harini.txt");
		BufferedWriter Bw= new BufferedWriter(file);
		Bw.write("this is harini ");
		@SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(new FileReader ("C:\\Users\\Dell\\Documents\\harini.txt"));
		Bw.newLine();
		Bw.close();
		Br.read();
		file.close();
	}

}