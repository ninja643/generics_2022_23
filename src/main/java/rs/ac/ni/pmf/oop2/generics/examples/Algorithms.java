package rs.ac.ni.pmf.oop2.generics.examples;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Algorithms
{
    public static <T> long countWithCondition(Collection<T> collection, Predicate<T> condition)
    {
        return collection.stream()
                         .filter(condition)
                         .count();
        /*long count = 0;

        for (T element : collection)
        {
            if (condition.test(element))
            {
                count++;
            }
        }

        return count;*/
    }

    public static <T> void swap(T[] array, int i, int j)
    {
        if (i == j)
        {
            return;
        }

        if (i < 0 || i >= array.length || j < 0 || j >= array.length)
        {
            throw new IndexOutOfBoundsException("Bounds are not correct");
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> T maxInBounds(List<T> list, int begin, int end)
    {
        T maxElement = list.get(begin);
        for (int i = begin + 1; i < end; i++)
        {
            T currentElement = list.get(i);
            if (maxElement.compareTo(currentElement) < 0)
            {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static <T> T maxInBounds(List<T> list, int begin, int end, Comparator<T> comparator)
    {
        return list.stream()
                   .skip(begin)
                   .limit(end - begin)
                   .max(comparator)
                   .orElseThrow(() -> new IllegalArgumentException("There are no elements in range"));
//        T maxElement = list.get(begin);
//        for (int i = begin + 1; i < end; i++)
//        {
//            T currentElement = list.get(i);
//            if (comparator.compare(maxElement, currentElement) < 0)
//            {
//                maxElement = currentElement;
//            }
//        }
//
//        return maxElement;
    }
}
