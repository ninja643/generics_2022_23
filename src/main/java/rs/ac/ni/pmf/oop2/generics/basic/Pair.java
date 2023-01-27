package rs.ac.ni.pmf.oop2.generics.basic;

public interface Pair<K, V>
{
    K getKey();
    V getValue();

    void setKey(K key);
    void setValue(V value);
}
