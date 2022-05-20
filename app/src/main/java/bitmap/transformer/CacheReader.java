package bitmap.transformer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CacheReader {
    private Scanner mIn;
    public CacheReader(String s) throws FileNotFoundException
    {
        this.mIn = new Scanner(new File(s));

    }
    public void readCache()
    {
        if(!mIn.hasNext()) System.out.println("nothing in cache");

        while(mIn.hasNext())
        {
            System.out.println(mIn.next());
        }
    }
}
