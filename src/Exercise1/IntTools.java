package Exercise1;

public class IntTools {
    private int number;
    public IntTools(int number){
        this.number = number;
    }

    public int digitSum(){
        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }
    public int lastDigit() {
        return Math.abs(number) % 10;
    }
    public int digitAt(int position) throws IllegalArgumentException {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative.");
        }

        int tempNumber = Math.abs(number);
        int count = 0;

        while (tempNumber > 0) {
            if (count == position) {
                return tempNumber % 10;
            }

            tempNumber /= 10;
            count++;
        }
        throw new IllegalArgumentException("Position " + position + " is invalid for the given number.");
    }
}
