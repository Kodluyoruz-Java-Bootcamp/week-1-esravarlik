import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------");

        //ArrayList;
        System.out.println("*ArrayList*");
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(1, 30);
        System.out.println("ArrayList: " + arrayList);

        arrayList.set(2, 40);
        System.out.println("Modifies ArrayList: " + arrayList);

        int indexAccessArrayList = arrayList.get(0);
        System.out.println("Accessed Element: " + indexAccessArrayList);

        int removeArrayList = arrayList.remove(1);
        System.out.println("Removed Element: " + removeArrayList);

        int arrayListSize = arrayList.size();
        System.out.println("Size of Array: " + arrayListSize);

        boolean arrayListContains = arrayList.contains(40);
        System.out.println("Does arraylist contain 40 ?: " + arrayListContains);

        boolean arraylistIsEmpty = arrayList.isEmpty();
        System.out.println("Is it empty: " + arraylistIsEmpty);


        System.out.println("--------------------------------");


        //LinkedList
        System.out.println("*LinkedList*");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Esra");
        linkedList.add("Alp");
        linkedList.add("Ummuhan");
        System.out.println("LinkedList: " + linkedList);

        String indexAccessLinkedList = linkedList.get(0);
        System.out.println("Accessed Element: " + indexAccessLinkedList);

        int index = linkedList.indexOf("Alp");
        System.out.println("Position of 'Alp' is: " + index);

        String removeLinkedList = linkedList.remove(2);
        System.out.println("Removed Element: " + removeLinkedList);


        System.out.println("--------------------------------");


        //Vector
        System.out.println("*Vector*");
        Vector<Double> vector = new Vector<>();
        vector.add(50.5);
        vector.add(40.6);
        vector.add(90.1);
        System.out.println("Vector: " + vector);

        int indexAccessVector = vector.lastIndexOf(40.6);
        System.out.println("Last index of: " + indexAccessVector);

        double removeVector = vector.remove(1);
        System.out.println("Removed Element: " + removeVector);

        System.out.println("Length of list: " + vector.size());

        System.out.println("--------------------------------");

        //Stack
        System.out.println("*Stack*");
        Stack<Integer> stack = new Stack<>();
        stack.push(50);
        stack.push(90);
        stack.push(150);
        System.out.println("Stack: " + stack);

        Integer removeElement = stack.pop();
        System.out.println("Removed Element: " + removeElement);

        Integer accessElement = stack.peek();
        System.out.println("Element at top: " + accessElement);

        int stackPosition = stack.search(90);
        System.out.println("Position of 90: " + stackPosition);

        System.out.println("Is it empty: " + stack.empty());


        System.out.println("--------------------------------");

        //HashSet
        System.out.println("*HashSet*");
        Set<Integer> hashSet = new HashSet<>(8, 10);
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(300);

        System.out.println("HashSet: " + hashSet);
        System.out.println("Does hashset contain 900 ?: " + hashSet.contains(900));
        System.out.println("Removed Element: " + hashSet.remove(200));
        System.out.println("Hash Code: " + hashSet.hashCode());


        System.out.println("--------------------------------");


        //TreeSet
        System.out.println("*TreeSet*");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Horse");
        treeSet.add("Bee");
        treeSet.add("Butterfly");
        treeSet.add("Wolf");
        System.out.println("Set using TreeSet: " + treeSet);
        System.out.println("Does arraylist contain 'Butterfly' ?: " + treeSet.contains("Butterfly"));
        System.out.println("Removed Element: " + treeSet.remove("Bee"));
        treeSet.clear();
        System.out.println("Is it empty: " + treeSet.isEmpty());


        System.out.println("--------------------------------");


        //LinkedHashSet
        System.out.println("*LinkedHashSet*");
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8, 5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("LinkedHashSet: " + numbers);


        System.out.println("--------------------------------");


        //HashMap
        System.out.println("*HashMap*");
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        System.out.println("Map: " + hashMap);

        System.out.println("Keys: " + hashMap.keySet());

        System.out.println("Values: " + hashMap.values());

        System.out.println("Entries: " + hashMap.entrySet());

        int value = hashMap.remove("Two");
        System.out.println("Removed Value: " + value);


        System.out.println("--------------------------------");


        //TreeMap
        System.out.println("*TreeMap*");
        SortedMap<String, Integer> values = new TreeMap<>();

        values.put("A", 1);
        values.put("B", 2);
        values.put("C", 3);
        values.put("D", 4);
        System.out.println("Map using TreeMap: " + values);

        int removedValue = values.remove("A");
        System.out.println("Removed Value: " + removedValue);

        System.out.println("From Key: " + values.tailMap("D"));
        System.out.println("Head Key: " + values.headMap("A"));


        System.out.println("--------------------------------");


        //LinkedHashMap
        System.out.println("*LinkedHashMap*");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();

        linkedHashMap.put("one", "oneone");
        linkedHashMap.put("two", "twotwo");
        linkedHashMap.put("four", "fourfour");

        System.out.println("Mappings of LinkedHashMap : " + linkedHashMap);

        System.out.println("Getting value for key 'one': " + linkedHashMap.get("one"));

        System.out.println("Size of the map: " + linkedHashMap.size());

        System.out.println("Is map empty?: " + linkedHashMap.isEmpty());

        System.out.println("Contains key 'two'? " + linkedHashMap.containsKey("two"));

        System.out.println("Delete element 'one': " + linkedHashMap.remove("one"));


        System.out.println("--------------------------------");


        //WeakHashMap
        System.out.println("*WeakHashMap*");
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();

        String one = "One";
        Integer oneValue = 1;
        weakHashMap.put(one, oneValue);

        String two = "Two";
        Integer twoValue = 2;
        weakHashMap.put(two, twoValue);

        System.out.println("WeakHashMap: " + weakHashMap);

        System.out.println("Key/Value mappings: " + weakHashMap.entrySet());

        System.out.println("Keys: " + weakHashMap.keySet());

        System.out.println("Values: " + weakHashMap.values());


        System.out.println("--------------------------------");

        //Queue -> LinkedList
        System.out.println("*LinkedList*");
        Queue<Integer> queueLinkedList = new LinkedList<>();

        queueLinkedList.offer(1);
        queueLinkedList.offer(2);
        queueLinkedList.offer(3);
        queueLinkedList.offer(4);
        System.out.println("Queue: " + queueLinkedList);


        int accessedNumber = queueLinkedList.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = queueLinkedList.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + queueLinkedList);


        System.out.println("--------------------------------");

        //PriorityQueue
        System.out.println("*PriorityQueue*");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(4);
        System.out.println("Queue: " + priorityQueue);

        int accessedQueue = priorityQueue.peek();
        System.out.println("Accessed Element: " + accessedQueue);

        int removedQueue = priorityQueue.poll();
        System.out.println("Removed Element: " + removedQueue);

        System.out.println("Updated Queue: " + priorityQueue);


        System.out.println("--------------------------------");


        //ArrayDeque
        System.out.println("*ArrayDeque*");
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(1);
        arrayDeque.offerLast(2);
        arrayDeque.offerFirst(3);
        System.out.println("Deque: " + arrayDeque);

        int firstElement = arrayDeque.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = arrayDeque.peekLast();
        System.out.println("Last Element: " + lastElement);

        int removedNumber1 = arrayDeque.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = arrayDeque.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + arrayDeque);


        System.out.println("--------------------------------");

    }
}