import java.io.*;
public class ByteArrayInputOutputStrea {

	public static void main(String[] args)throws Exception {
		 byte ba[]={97,98,99,100,101,102};
	 
		 ByteArrayInputStream bis=new ByteArrayInputStream(ba);
		 int c;
		
		 ByteArrayOutputStream bos=new ByteArrayOutputStream();

		 while((c=bis.read())!=-1)
		 {
			 bos.write(c);
		 }
		 System.out.println(bos);
	}

}
