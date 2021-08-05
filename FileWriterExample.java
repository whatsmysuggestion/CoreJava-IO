import java.io.*;
public class FileWriterExample {
	public static void main(String[] args) throws Exception {			
		
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		BufferedReader br=new BufferedReader(fr);		
		
		
		String lineData=new String();		
		
		FileWriter fw=new FileWriter("E:\\dummy\\sajib1.txt");
		BufferedWriter bw=new BufferedWriter(fw);		
		
		while((lineData=br.readLine())!=null)
		{
			bw.write(lineData);
			bw.newLine();
		}		
		bw.close();		 
	}
}
