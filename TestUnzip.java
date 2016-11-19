public class TestUnzip
{
	public static void main(String args[])
	{
		try
		{
			UnzipUtility uz=new UnzipUtility();
			uz.unzip("attachments.zip","unzipFolder");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}