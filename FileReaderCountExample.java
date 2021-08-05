import java.io.*;
public class FileReaderCountExample {
	public static void main(String[] args) throws Exception {

		int c,count=0;
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		
		while((c=fr.read())!=-1)
		{
		if((char)c=='l')
			count++;
		}
		
		fr.close();
		
		System.out.println("L appeared in file for "+count+" Times");
		}
}
