/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @param {number} k1
 * @param {number} k2
 * @return {number}
 */
var minSumSquareDiff = function(nums1, nums2, k1, k2) {
    let k = k1 + k2;
    let max = 0;
    let sum = 0;

    const diffs = new Array(nums1.length);
    for (let i = 0; i < nums1.length; i++) {
        diffs[i] = Math.abs(nums1[i] - nums2[i]);
        max = Math.max(max, diffs[i]);
        sum += diffs[i];
    }

    if (sum <= k) {
        return 0;
    }

    const freq = new Array(max + 1).fill(0);
    for (let x of diffs) {
        freq[x]++;
    }

    for (let i = max; i > 0 && k > 0; i--) {
        let take = Math.min(k, freq[i]);
        freq[i] -= take;
        freq[i - 1] += take;
        k -= take;
    }

    let res = 0;
    for (let i = 0; i <= max; i++) {
        if (freq[i] > 0) {
            res += freq[i] * i * i;
        }
    }

    return res;
};