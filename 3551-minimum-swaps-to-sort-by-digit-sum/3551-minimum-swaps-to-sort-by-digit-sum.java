class Solution {
    public int minSwaps(int[] nums) {
        int arr [] [] = new int[nums.length][2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int n = nums[i];
            map.put(nums[i], i);
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n = n / 10;
            }
            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }
        Arrays.sort(arr, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        boolean vis [] = new boolean[arr.length];
        int swaps = 0;
        for (int i=0; i<arr.length; i++) {
            if (vis[i] || map.get(arr[i][0]) == i) {
                continue;
            }
            int j = i;
            int cycle = 0;
            while (!vis[j]) {
                vis[j] = true;
                j = map.get(arr[j][0]);
                cycle++;
            }
            swaps += cycle - 1;
        }
        return swaps;
    }
}