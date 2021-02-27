package DataAccessLayer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataAccess 
{
    //Write the data from Wedding and birthday parties to a Text file
    public void WriteFile(String writeto) throws IOException
    {
        FileWriter fw = new FileWriter("UserChosing.txt");
        fw.write(writeto);
        fw.close();
        return;        
    }

    //Read the data from Wedding and birthday parties from Text file
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
