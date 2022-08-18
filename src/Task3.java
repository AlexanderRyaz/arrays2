public class Task3 {
    public static void main(String[] args) {
        int[]arr = ArraysCalc.generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int res = sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + res + " рублей");
    }
}
