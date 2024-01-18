public class HillelHomework10Program {
    public static void main(String[] args) {
        final int numberOfShuttles = 100;
        int count = 0;
        int currentNumber = 0;

        while (count < numberOfShuttles) {
            String s = String.valueOf(++currentNumber);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println("Space shuttle №" + currentNumber);
            count++;
        }
    }
}
