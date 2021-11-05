public class HomeWork2 {
    public static void main(String[] args){
    checkTwoNumbers();
    checkPositiveNumber();
    checkNegativeNumber();
    printSomething();
        }



    public static void checkTwoNumbers(){
        int number1 = 10;
        int number2 = 2;
        int sum = number1 + number2;
     System.out.println( " True");
 }
 public static void checkPositiveNumber(){
        int number = 16;
        if (number>=0){
            System.out.println(" Положительное число");
        } else if (number<0){
            System.out.println(" Отрицательное число");
        }
 }
 public static void checkNegativeNumber(){
        int numb = -150;
        if (numb < 0){
            System.out.println("True");
        } else System.out.println("False");
 }

    public static void printSomething() {
    String s = " Java is cool";
        for (int n = 0; n < 9; n++) System.out.println(s);
 }


  }



