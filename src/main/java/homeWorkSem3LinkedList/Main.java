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

        System.out.println("---Размер---");
        for (String value : linkedList) {
            System.out.println(value);
        }

        System.out.println("\n---Удалить элемент(enter index)---");
        System.out.println(linkedList.remove(5));

        System.out.println("\n---Заменить элемент (enter index)--");
        linkedList.set("Hello World!", 4);

        System.out.println("\n---Показать список с изменениями---");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("\n---Удалить список---");
        linkedList.clear();
        System.out.printf("list size: %d\n", linkedList.size());
    }
}