package rs.ac.ni.pmf.oop2.generics.basic;

public class ListOfObjects
{
    private final Object[] values;
    private int currentSize;

    public ListOfObjects(int maxSize)
    {
        values = new Object[maxSize];
        currentSize = 0;
    }

    public int size()
    {
        return currentSize;
    }

    public Object get(int index)
    {
        if (index < 0 || index >= currentSize)
        {
            throw new IndexOutOfBoundsException();
        }

        return values[index];
    }

    public boolean add(Object value)
    {
        if (currentSize < values.length)
        {
            values[currentSize++] = value;
            return true;
        }

        return false;
    }
}
