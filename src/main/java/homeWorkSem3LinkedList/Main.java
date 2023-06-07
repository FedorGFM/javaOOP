package homeWorkSem3LinkedList;

public class Main {

    public static void main(String[] args) {

        AnalogiesLinkedList<String> linkedList = new AnalogiesLinkedList<>();
        linkedList.add("str1");
        linkedList.add("str2");
        linkedList.add("str3");
        linkedList.add("str4");
        linkedList.add("str5");
        linkedList.add("str6");

        System.out.printf("list size: %d\n", linkedList.size());

        System.out.println("------");
        for (String value : linkedList) {
            System.out.println(value);
        }

        System.out.println("---delite-index-(enter index)---");
        System.out.println(linkedList.remove(5));

        System.out.println("---set-element-index-1--");
        linkedList.set("new value", 1);

        System.out.println("---get-elements-by-index---");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("---clear---");
        linkedList.clear();
        System.out.printf("list size: %d\n", linkedList.size());
    }
}