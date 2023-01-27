package rs.ac.ni.pmf.oop2.generics.basic;

public class Box<T extends Number> implements Comparable<Box<T>>
{
    private T data;

    public Box()
    {

    }

    public Box(T value)
    {
        this.data = value;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public <U extends Number> void addValue(Box<U> otherBox)
    {
        System.out.println(this.getData().doubleValue() + otherBox.getData().doubleValue());
    }

    @Override
    public int compareTo(Box<T> other)
    {
        return Double.compare(this.data.doubleValue(), other.data.doubleValue());
    }
}
