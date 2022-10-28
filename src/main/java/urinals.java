
import java.io.*;

public class urinals {


    public int checkUrinals(char[] strArray)
    {
        int count = 0;
        int n = strArray.length-1;
        if(strArray[0] == '0' && strArray[1] == '0')
        {
            count++;
            strArray[0] = 1;
        }
        for(int i=1; i<n;i++)
        {
            if(strArray[i] == '0' && strArray[i-1] == '0' && strArray[i+1] == '0')
            {
                strArray[i] = '1';
                count++;
                i++;
            }
        }
        if(strArray[n] == '0' && strArray[n-1] == '0')
        {
            count++;
            strArray[n] = 1;
        }
        return count;
    }
    public boolean goodString(char[] strArray)
    {
        for(int i=1; i<strArray.length; i++)
        {
            if((strArray[i] == '1' && strArray[i-1] == '1') || (strArray[i] != '1' && strArray[i] != '0'))
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
                String str = input.readLine();
                urinals myobj = new urinals();
                if(myobj.countUrinals(str)) {
                    System.out.println("The input string "+ str + " length is correct ");
                    char[] strArray = str.toCharArray();
                    if(myobj.goodString(strArray)) {
                        System.out.println("The input string is good : "+ str);
                        int result = myobj.checkUrinals(strArray);
                        fw.write(Integer.toString(result));
                    }
                    else {
                        System.out.println("The input string is bad : "+ str);
                        fw.write("-1");
                    }
                    fw.write('\n');
                }
                else {
                    System.out.println("The input string " + str + " length is incorrect, We will not process it");
                    System.out.println("The Urinals should be greater than 1 and less than 20");
                }
                System.out.println();
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