class Solution {
    public boolean checkGoodInteger(int n) {
        Integer squareSum = 0;
        Integer sumOfDigits = 0;

        while (n != 0) {
            int digit = n % 10;
            squareSum += digit * digit;
            sumOfDigits += digit;
            n /= 10;
        }
        return squareSum - sumOfDigits >=50;
    }
}