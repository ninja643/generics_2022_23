package rs.ac.ni.pmf.oop2.generics.examples;

import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmsDemo
{
    public static void main1(String[] args)
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        long count = Algorithms.countWithCondition(numbers, value -> value % 2 == 1);

        Set<String> words = Set.of("ABC", "DEF", "TRALALA", "XYZT");
        long countWords = Algorithms.countWithCondition(words, value -> value.length() < 4);

        System.out.println(count);
        System.out.println(countWords);
    }

    public static void main2(String[] args)
    {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(joinArray(a));

        Algorithms.swap(a, 1, 3);

        System.out.println(joinArray(a));
    }

    private static String joinArray(Integer[] a)
    {
        return Arrays.stream(a)
              .map(String::valueOf)
              .collect(Collectors.joining(", "));
    }


    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        Collections.shuffle(numbers);
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        Integer max = Algorithms.maxInBounds(numbers, 1, 4);
        System.out.println(max);

        List<Student> students = List.of(new Student(1, "Mika"),
                                         new Student(2, "Pera"),
                                         new Student(3, "Laza"));

        Student studentWithMaxInd = Algorithms.maxInBounds(students, 0, 3, Comparator.comparingInt(Student::getId));

        System.out.println(studentWithMaxInd);
    }
}
