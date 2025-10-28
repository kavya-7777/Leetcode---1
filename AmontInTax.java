//2303. Calculate Amount Paid in Taxes

class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        int prevUpper = 0;
        for(int[] bracket : brackets){
            int upper = bracket[0];
            int percent = bracket[1];
            int taxableAmount = Math.min(upper, income) - prevUpper;
            if(taxableAmount <= 0) break;
            tax += taxableAmount * (percent / 100.0);
            prevUpper = upper;
            if(income <= upper) break;
        }
        return tax;
    }
}