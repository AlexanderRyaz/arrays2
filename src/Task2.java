public class Task2
{
    public static void main(String[] args) {
     int[]arr = ArraysCalc.generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей" + ". " +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }
}
