public class Main {

    public static void main(String[] args) {

        starSortAsc(5);
        System.out.println("-------");
        starSortDesc(5);
    }

    public static void starSortAsc(int rowLength) {  //O(n)
        String starNumber = "";
        for (int i = 0; i < rowLength; i++) {
            starNumber += "*";
            System.out.print(starNumber);
            System.out.println();
        }
    }

    public static void starSortDesc(int rowLength) { //0(n2)
        for (int i = 0; i < rowLength; i++) {
            for (int j = i; j < rowLength; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
