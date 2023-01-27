package rs.ac.ni.pmf.oop2.generics.basic;

public class Util
{
    public static <K, V> boolean equalPairs(Pair<K, V> p1, Pair<K, V> p2)
    {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <T> String getClassOfParameter(T value)
    {
        return value.getClass().getName();
    }

    public static <T extends Comparable<T>/* & TypeA & TypeB*/> int countGreaterThan(T[] array, T elem)
    {
        int count = 0;
        for (T e : array)
        {
//            e.printA();
//            e.printB();
//            System.out.println(e.doubleValue());
            if (e.compareTo(elem) > 0)
            {
                count++;
            }
        }

        return count;
    }
}
