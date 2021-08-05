import java.io.*;
public class StreamTokenizerExample {
	public static void main(String[] args) throws Exception 
	{	
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		int line=0,words=0;
		
		StreamTokenizer st=new StreamTokenizer(fr);		
		
		st.eolIsSignificant(true);

		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			switch(st.ttype)
			{
			case StreamTokenizer.TT_EOL: line++;
			break;
			
			case StreamTokenizer.TT_WORD:words++;
			break;
			}			
		}
		System.out.println("No Of Lines is"+line+" Words are"+words);
		fr.close();		
	}
}
