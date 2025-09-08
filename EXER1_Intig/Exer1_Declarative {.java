public class Exer1_Declarative {
    public static void main(String[] args) {
        // Declarative: directly state the goal
        int sum = IntStream.rangeClosed(1, 10)
                           .filter(i -> i % 2 == 0)
                           .sum();

        System.out.println("Sum of even numbers from 1 to 10 (Declarative): " + sum);
    }
}