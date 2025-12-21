
class Solution {
    private static void backtrack(int [] nums, boolean[] isConsidered, ArrayList<Integer> ans, List<List<Integer>> res) {
        // Base case: If the current list is full, add a copy to our results
        if (ans.size() == nums.length) {
            // We must create a new list because 'ans' is a reference that keeps changing
            res.add(new ArrayList<>(ans)); 
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Only process this number if it hasn't been used in the current path
            if (!isConsidered[i]) {
                
                // Choose: Mark the number as used and add it to our path
                ans.add(nums[i]);
                isConsidered[i] = true;

                // Explore: Recurse to fill the next position
                backtrack(nums, isConsidered, ans, res);

                // Backtrack: Remove the number and mark it as unused for other branches
                ans.remove(ans.size() - 1);
                isConsidered[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isConsidered = new boolean[nums.length];

        backtrack(nums, isConsidered, new ArrayList<>(), res);
        return res;
    }
}
