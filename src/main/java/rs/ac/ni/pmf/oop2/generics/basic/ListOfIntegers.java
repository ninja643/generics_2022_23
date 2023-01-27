package rs.ac.ni.pmf.oop2.generics.basic;

public class ListOfIntegers
{
    private final int[] values;
    private int currentSize;

    public ListOfIntegers(int maxSize)
    {
        values = new int[maxSize];
        currentSize = 0;
    }

    public int size()
    {
        return currentSize;
    }

    public int get(int index)
    {
        if (index < 0 || index >= currentSize)
        {
            throw new IndexOutOfBoundsException();
        }

        return values[index];
    }

    public boolean add(int value)
    {
        if (currentSize < values.length)
        {
            values[currentSize++] = value;
            return true;
        }

        return false;
    }
}
