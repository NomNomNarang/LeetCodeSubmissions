class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(digits.length == 1) {
            if(digits[0] == 9) {
                arr.add(1);
                arr.add(0);
            }
            else {
                arr.add(digits[0] + 1);
            }
            int[] result = new int[arr.size()];
            for(int i = 0; i < arr.size(); i++) {
                result[i] = arr.get(i);
            }
            return result;
        }

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        if(digits[0] == 0) {
            arr.add(1);
        }
        for(int i = 0; i < digits.length; i++) {
            arr.add(digits[i]);
        }

        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}