import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter
{
    private File inputFile;
    
    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }
    
    public int countLines()
    {
        int count = 0;
        
        /*** complete this method ***/
        
        return count;
    }

    public int countWords()
    {
        int count = 0;
        
        /*** complete this method ***/
        
        return count;
    }

    public int countChars()
    {
        int count = 0;
        try 
        {
        	LineNumberReader reader = new LineNumberReader(new FileReader(inputFile));
        	Scanner in = new Scanner(this.inputFile);
        	while (in.()) != null;
        	{
        		
        	}
        	
        }
        
        return count;
    }
}