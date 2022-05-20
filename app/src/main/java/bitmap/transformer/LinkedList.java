package bitmap.transformer;

public class LinkedList {
    public LinkedList()
    {
        this.data = null;
        this.next = null;
    }
    public LinkedList(String hist)
    {
        this.data = hist;
        this.next = null;
    }
    private String data;
    private LinkedList next;
    public void setData(String hist)
    {
        data = hist;
    }
    public String getData()
    {
        return data;
    }

    public LinkedList getNext() {
        return next;
    }
    public void setNext(LinkedList temp)
    {
        this.next = temp;
    }
}
