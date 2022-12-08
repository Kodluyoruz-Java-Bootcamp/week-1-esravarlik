import java.util.ArrayList;

public class MyList {

    private ArrayList<String> values;

    private int capacity;

    //Default capacity to 5
    public MyList() {
        this(5);
    }

    public MyList(int capacity) {
        values = new ArrayList<String>();
        this.capacity = capacity;
    }

    public void add(String value) {

        // Only add items that start with the letter 'C'
        if (value.startsWith("C")) {
            values.add(value);
        }

        // Increase the capacity by 7 if the list is full
        if (values.size() == capacity) {
            capacity += 7;
        }

    }

    // Print the entire list to the screen
    public void print() {
        for (String value : values) {
            System.out.println(value);
        }
    }

}
