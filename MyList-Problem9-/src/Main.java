public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.add("Esra");  //String won't be appended because it doesn't start with 'C'
        myList.add("Alp");   //String won't be appended because it doesn't start with 'C'

        myList.add("Cem");  //MyList element
        myList.add("Can");  //MyList element
        myList.add("Canan");  //MyList element

        myList.print();
    }
}