package DataAccessLayer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataAccess 
{
    public void WriteFile(String writeto) throws IOException
    {
        FileWriter fw = new FileWriter("UserChosing.txt");
        fw.write(writeto);
        fw.close();
        return;        
    }

    public void ReadFile(String ReadFrom) throws IOException
    {
        FileReader fr = new FileReader("UserChosing.txt");
        int i;
        while ((i = fr.read()) != -1)
        {
            System.out.print((char) i);
        }
        fr.close();
    }
}
