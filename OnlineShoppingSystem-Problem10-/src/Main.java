import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Cem", "Dirman", 26);
        Customer customer2 = new Customer(2, "Leonard", "Washington", 40);
        Customer customer3 = new Customer(3, "Cem", "Donaldson", 29);
        Customer customer4 = new Customer(4, "Charlie", "Morrison", 45);
        Customer customer5 = new Customer(5, "Mitchell", "Jones", 20);


        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        Product product1 = new Product(1, "Bear plush", "Toy", 50.0, 100);
        Product product2 = new Product(2, "Sofa", "Furniture", 2550.0, 10);
        Product product3 = new Product(3, "Table", "Furniture", 1150.0, 15);
        Product product4 = new Product(4, "Chair", "Furniture", 300.0, 120);
        Product product5 = new Product(5, "Giraffe plush", "Toy", 150.0, 100);
        Product product6 = new Product(6, "Carpet", "Furniture", 900.0, 100);
        Product product7 = new Product(7, "Wall paint", "Home material", 2000.0, 50);

        Order order1 = new Order();
        order1.getProducts().add(product1);
        order1.getProducts().add(product2);
        order1.getProducts().add(product4);

        customer1.getOrders().add(order1);


        Order order2 = new Order();
        order2.getProducts().add(product5);
        order2.getProducts().add(product7);
        order2.getProducts().add(product6);
        order2.getProducts().add(product3);

        customer3.getOrders().add(order2);

        order1.getInvoice().addProduct(product1);
        order1.getInvoice().addProduct(product2);
        order1.getInvoice().addProduct(product4);

        order2.getInvoice().addProduct(product5);
        order2.getInvoice().addProduct(product7);
        order2.getInvoice().addProduct(product6);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);


        //The number of customers
        System.out.println("Number of all customers in the system: " + customerList.stream().count());

        System.out.println("----------------------------------------");

        //Invoice list over 1500 TL
        System.out.println("Invoice list over 1500 TL: ");
        orderList.stream()
                .map(amount -> amount.getInvoice().getTotalAmount())
                .filter(amount -> amount > 1500)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        //Name and age limit lists
        List<Customer> cemFirstnameCustomers = customerList.stream()
                .filter(customer -> customer.getFirstName().equals("Cem"))
                .collect(Collectors.toList());

        //Calculating the number of products purchased by customers whose name is Cem,
        int numProducts = cemFirstnameCustomers.stream()
                .mapToInt(customer -> customer.getOrders().stream()
                        .mapToInt(order -> order.getProducts().size()).sum())
                .sum();

        System.out.println("Number of products purchased by customers whose name is Cem: " + numProducts);

        System.out.println("----------------------------------------");

        List<Customer> ageLimit = cemFirstnameCustomers.stream()
                .filter(customer -> customer.getAge() > 25)
                .filter(customer -> customer.getAge() < 30).collect(Collectors.toList());


        Double totalAmount = ageLimit.stream()
                .mapToDouble(customer -> customer.getOrders().stream()
                        .mapToDouble(order -> order.getInvoice().getTotalAmount()).sum())
                .sum();
        System.out.println("Her name is Cem and the total shopping" +
                " amount of customers younger than 30 and older than 25: " + totalAmount);

        System.out.println("----------------------------------------");

    }
}