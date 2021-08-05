import java.io.*;
 
public class SwappingExample {

	public static void main(String[] args) throws Exception  {
		FileReader fr=new FileReader("D:\\Mohammed\\a.txt");
		BufferedReader br=new BufferedReader(fr);		
		
		
		String lineData=new String();		
		
		FileWriter fw=new FileWriter("D:\\Mohammed\\temp.txt");
		BufferedWriter bw=new BufferedWriter(fw);		
		
		while((lineData=br.readLine())!=null)
		{
			bw.write(lineData);
			bw.newLine();
		}		
		bw.close();	


		FileReader fr1=new FileReader("D:\\Mohammed\\b.txt");
		BufferedReader br1=new BufferedReader(fr1);		
		
		
		String lineData1=new String();		
		
		FileWriter fw1=new FileWriter("D:\\Mohammed\\a.txt");
		BufferedWriter bw1=new BufferedWriter(fw1);		
		
		while((lineData1=br1.readLine())!=null)
		{
			bw1.write(lineData1);
			bw1.newLine();
		}		
		bw1.close();	
		
		
		FileReader fr2=new FileReader("D:\\Mohammed\\temp.txt");
		BufferedReader br2=new BufferedReader(fr2);		
		
		
		String lineData2=new String();		
		
		FileWriter fw2=new FileWriter("D:\\Mohammed\\b.txt");
		BufferedWriter bw2=new BufferedWriter(fw2);		
		
		while((lineData2=br2.readLine())!=null)
		{
			bw2.write(lineData2);
			bw2.newLine();
		}		
		bw2.close();	
		
		File ff=new File("D:\\Mohammed\\temp.txt");
		ff.delete();
		
		
	}

}
