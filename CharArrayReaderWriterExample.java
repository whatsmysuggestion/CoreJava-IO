import java.io.*;
public class CharArrayReaderWriterExample {

	public static void main(String[] args) throws Exception{
		char ch[]={'A','B','C','D','E','F'};
		int c;
		CharArrayReader car=new CharArrayReader(ch);
		CharArrayWriter caw=new CharArrayWriter();
		 	
		while((c=car.read())!=-1)
		{
			
			caw.write(c);
		}
		System.out.println(caw);
		
	}

}
