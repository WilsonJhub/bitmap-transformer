package bitmap.transformer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CacheWriter extends PrintWriter {

    public CacheWriter(String writeMe) throws FileNotFoundException {
        super(writeMe);
    }
    public void writeCache(LinkedList list)
    {
        if(list == null) return;
        while(list != null)
        {
            println(list.getData());
        }
        close();
        return ;
    }
}
