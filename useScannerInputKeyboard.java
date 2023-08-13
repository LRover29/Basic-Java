public class Comp {

    public static void main(String[] args){
        Scanner inputKB = new Scanner(System.in);
//        String userInput = inputKB.nextLine();
//        System.out.println("You typed: " +userInput);
        System.out.println("Please enter your age");
        int age = inputKB.nextInt();
        System.out.println("Your age:" +age);
        String inputAge = inputKB.next();
        int age2 = Integer.parseInt(inputAge);
        System.out.println("Your age2:" +age2);
    }
}