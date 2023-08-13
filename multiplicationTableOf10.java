public class Main {
    public static void main(String[] args) {
        //write your code here
         for (int i = 1; i <= 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= 10; j++) {
                sb.append(i * j + " ");
            }
            System.out.println(sb.toString());
        }
    }
}