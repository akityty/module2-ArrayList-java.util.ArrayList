public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(0,2);
        list.add(1,6);
        list.add(2,5);
        list.add(1,100);
        list.add(99);
        System.out.println(list.remove(0));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.contains(99));
        System.out.println(list.indexOf(100));

        System.out.println(list.size());
        System.out.println(list.clone());
        list.clear();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));



    }
}
