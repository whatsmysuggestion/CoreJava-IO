import java.io.*;
 import java.util.*;
public class ReadWriteLineFile {

	public static void main(String[] args)throws Exception {
		 
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String lineContent=new String();
		String data=new String();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to search");
		data=sc.next();
		int c=0;
		
	/*	FileWriter fw=new FileWriter("E:\\dummy\\demo3.txt");
		BufferedWriter bw=new BufferedWriter(fw);*/
		
		while((lineContent=br.readLine())!=null)
		{
			/*bw.write(lineContent);
			System.out.println(lineContent);
			bw.newLine();*/
			if(lineContent.contains(data))
				c++;
			
		}
	/*	bw.close();*/
		br.close();
		
		System.out.println(c+" Times String appeared in File");
	}
}
