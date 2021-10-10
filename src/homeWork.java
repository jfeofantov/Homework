

public class homeWork {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();

}
public static void printThreeWords(){
    System.out.println("orange");
    System.out.println("banana");
    System.out.println("apple");
}
public static void checkSumSign(){
        int a = 10;
        int b = 35;

        int sum = a + b ;

        if (sum >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else if (sum < 0 )
        {
            System.out.println("Сумма отрицательная");
    }
}
public static void printColor(){
        int value = -105; // поменяй число на другое
        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100 )
        {
            System.out.println("Желтый");
        }
        else if (100< value )
        {
            System.out.println("Зеленый");
        }

}
public static void compareNumbers(){
        int a = 6;
        int b = 5;

        if(a >= b)
        {
            System.out.println(" a >= b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }


}
}
