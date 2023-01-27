package rs.ac.ni.pmf.oop2.generics.basic;

public class NonGenericDemo
{
    public static void main(String[] args)
    {
        ListOfObjects listOfIntegers = new ListOfObjects(4);
        listOfIntegers.add(5);
        listOfIntegers.add("xyz");
        listOfIntegers.add(new ListOfStrings(4));

        int sum = 0;
        for (int i = 0; i < listOfIntegers.size(); i++)
        {
            Integer el = (Integer) listOfIntegers.get(i);
            sum += el;
        }

        System.out.println(sum);

        for (int i = 0; i < listOfIntegers.size(); i++)
        {
            System.out.println(listOfIntegers.get(i));
        }

        ListOfObjects listOfStrings = new ListOfObjects(4);
        listOfStrings.add("abc");

        for (int i = 0; i < listOfStrings.size(); i++)
        {
            System.out.println(listOfStrings.get(i));
        }
    }
}
