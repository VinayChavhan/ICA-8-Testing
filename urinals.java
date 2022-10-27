import java.io.*;

public class urinals {


    public boolean goodString(String str)
    {
        int n = str.length();
        char[] array = str.toCharArray();
        for(int i=1; i<n; i++)
        {
            if(array[i] == '1' && array[i-1] == '1')
                return false;
        }
        return true;
    }
    public boolean countUrinals(String urinals) {
        int n = urinals.length();
        if(n > 20 || n < 1)
            return false;
        return true;
    }
    public static void main(String args[]) {
        try {
            DataInputStream input = new DataInputStream(new FileInputStream(
                    "urinal.dat"));
            File outFile = new File("rule.txt");
            int i = 0;
            while(outFile.exists())
            {
                i++;
                outFile = new File("rule"+i+".txt");
            }
            FileWriter fw=new FileWriter(i == 0 ? "rule.txt" : "rule"+i+".txt",true);
            while (input.available() > 0) {
                String x = input.readLine();
                urinals myobj = new urinals();
                if(myobj.countUrinals(x)) {
                    System.out.println("The input length is correct");
                    if(myobj.goodString(x)) {
                        System.out.println(x);
                    }
                    else {
                        fw.write("-1");
                    }
                }
                else
                    throw new Exception("The Urinals should be greater than 1 and less than 20");
            }
            input.close();
            fw.close();
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
