import java.io.*;

public class urinals {


    public boolean goodString(String str)
    {
        return false;
    }
    public void countUrinals(String urinals) throws Exception {
        int n = urinals.length();
        if(n > 20 || n < 1)
            throw new Exception("The Urinals should be greater than 1 and less than 20");
    }
    public static void main(String args[]) {
        try {
            DataInputStream input = new DataInputStream(new FileInputStream(
                    "urinal.dat"));

            while (input.available() > 0) {
                String x = input.readLine();
                urinals myobj = new urinals();
                myobj.countUrinals(x);
                if(myobj.goodString(x))
                {

                }
                else {
                    
                }
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
