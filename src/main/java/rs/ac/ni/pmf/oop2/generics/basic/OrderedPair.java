package rs.ac.ni.pmf.oop2.generics.basic;

public class OrderedPair<K, V> implements Pair<K, V>
{
    private K key;
    private V value;

    public OrderedPair()
    {

    }

    public OrderedPair(K key, V value)
    {
        setKey(key);
        setValue(value);
    }

    @Override
    public K getKey()
    {
        return key;
    }

    @Override
    public V getValue()
    {
        return value;
    }

    @Override
    public void setKey(K key)
    {
        this.key = key;
    }

    @Override
    public void setValue(V value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "(" + key + " , " + value + ")";
    }
}
