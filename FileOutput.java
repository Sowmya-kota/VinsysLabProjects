import java.io.*;
public class FileOutput 
{
	public static void main(String args[])
	{
		//creating a file
		File file=new File(args[0]);
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s;
			System.out.println("Enter file tect");
			System.out.println("[Type ctrl-d to stop]");
			//read each input line
			while((s=in.readLine())!= null)
			{
				out.println(s);
			}
			in.close();
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
