package rs.ac.ni.pmf.oop2.generics.basic;

public class ListOfStrings
{
    private final String[] values;
    private int currentSize;

    public ListOfStrings(int maxSize)
    {
        values = new String[maxSize];
        currentSize = 0;
    }

    public int size()
    {
        return currentSize;
    }

    public String get(int index)
    {
        if (index < 0 || index >= currentSize)
        {
            throw new IndexOutOfBoundsException();
        }

        return values[index];
    }

    public boolean add(String value)
    {
        if (currentSize < values.length)
        {
            values[currentSize++] = value;
            return true;
        }

        return false;
    }
}
