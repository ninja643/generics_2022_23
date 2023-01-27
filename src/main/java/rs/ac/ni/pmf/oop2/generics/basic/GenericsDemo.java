package rs.ac.ni.pmf.oop2.generics.basic;

public class GenericsDemo
{
    public static void main(String[] args)
    {
        OrderedPair<Integer, Box<Double>> p1 = new OrderedPair<>(1, new Box<>(10.0));
//        OrderedPair<Number, Box<Double>> p2 = p1;
        Box<Integer> box = new Box<>(10);
//        Box<Number> x = box;

        Integer[] a = {1, 2, 4, 5, 6, 7, 8, 9};
        int cnt = Util.countGreaterThan(a, 4);
        System.out.println(cnt);

        Box<Integer>[] boxes = new Box[3];
        boxes[0] = new Box<>(10);
        boxes[1] = new Box<>(20);
        boxes[2] = new Box<>(30);

        System.out.println(Util.countGreaterThan(boxes, new Box<>(21)));
    }

    public static void main4(String[] args)
    {
        Box<Integer> intBox = new Box<>(10);
        Box<Double> doubleBox = new Box<>(20.0);

        intBox.addValue(doubleBox);
    }

    public static void main3(String[] args)
    {
        Pair<Integer, String> p1 = new OrderedPair<>(1, "X");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "Y");

        System.out.println(Util.<Integer, String>equalPairs(p1, p2));

        System.out.println(Util.<Double>getClassOfParameter(10.0));
    }

    public static void main2(String[] args)
    {
        OrderedPair<Integer, Integer> integerPair = new OrderedPair<>();
        integerPair.setKey(1);
        integerPair.setValue(200);

        System.out.println(integerPair);

        OrderedPair<Integer, String> pair = new OrderedPair<>();
        pair.setKey(2);
        pair.setValue("ABC");

        System.out.println(pair);

        OrderedPair<Integer, Double> genericPair = new IntegerDoublePair();
        IntegerDoublePair integerDoublePair = new IntegerDoublePair();

//        OrderedPair rawPair = new OrderedPair();
//        Box<String> box = createBox();
//
//        box.setData("56");
//        System.out.println(box.getData() + 4);
    }

    private static Box createBox()
    {
        return new Box<Integer>();
    }

    public static void main1(String[] args)
    {
        Box<Integer> integerBox = new Box<>();

        integerBox.setData(20);

        System.out.println(integerBox.getData() + 5);

//        Box<String> stringBox = new Box<>();
//
//        stringBox.setData("20");
//
//        System.out.println(stringBox.getData() + 5);

    }
}
