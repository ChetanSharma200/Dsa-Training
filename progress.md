# 📈 Progress Log – DSA Training

This file records **weekly reflections** on my DSA practice.
The focus is on **thinking quality, mistakes, and improvement**, not raw problem count.

---

## Day 1 (Start Date: 2025-01-20)

### Problem Solved
- Permutations — Backtracking  
  Platform: LeetCode 46

### What I Learned
- Understood the basic backtracking pattern:
  - Choose
  - Explore (recursive call)
  - Unchoose (backtrack)
- Clear visualization of recursion tree helped avoid confusion

### Mistakes / Observations
- Initially confused about when to backtrack (remove element)
- Had to consciously ensure list state is restored after recursion

### Corrections Applied
- Always undo the choice after the recursive call
- Dry-ran the recursion tree for small input before coding

### Next Steps
- Solve **Subsets** to reinforce backtracking fundamentals
- Focus on writing base cases before recursive logic

## Day 2 (2025-01-21)

### Problems Solved
Category: Arrays → Prefix Sum + Hashing

- Subarray Sum Equals K  
  Platform: LeetCode  
  Core Idea: Prefix Sum + Frequency Map

- Continuous Subarray Sum  
  Platform: LeetCode  
  Core Idea: Prefix Sum % K → First Index

- Contiguous Array  
  Platform: LeetCode  
  Core Idea: Binary (0/1) transformed to (+1 / -1), balance sum tracking

- Subarray Sums Divisible by K  
  Platform: LeetCode  
  Core Idea: Safe modulo handling + remainder frequency

- Count Nice Subarrays  
  Platform: LeetCode  
  Core Idea: Odd/Even mapped to (1/0), prefix sum frequency

### What I Learned
- Multiple array problems reduce to the **same prefix-sum pattern** with different transformations.
- HashMaps are used either to store **frequency** or **first occurrence**, depending on the problem.
- Modulo-based prefix sums require careful handling of negative values.

### Mistakes / Observations
- Initially treated these as separate problems instead of variations of one core idea.
- Needed to consciously remember when to store index vs frequency in the map.

### Corrections Applied
- Identified the invariant first (sum, balance, remainder).
- Chose the HashMap strategy based on what needed to be retrieved later.

### Next Steps
- Revise prefix sum patterns once more without looking at code.

## Day 3 (2025-01-22)

### Problem Solved
Category: Arrays → Prefix Sum

- Count Number of Vowels in a Range  
  Platform: LeetCode  
  Core Idea: Prefix Sum for range queries

### What I Learned
- Prefix sums are effective for answering multiple range queries in O(1) time after preprocessing.
- Precomputing cumulative counts simplifies repeated queries.

### Mistakes / Observations
- Initially thought a loop per query was acceptable before realizing the constraint impact.
- Had to be careful with index boundaries while building the prefix array.

### Corrections Applied
- Built a prefix array where each index stores vowel count up to that position.
- Used prefix[right] − prefix[left−1] logic for queries.

### Next Steps
- Practice more range-query problems.
- Revise prefix sum edge cases involving boundaries.

- Move toward slightly harder array problems involving constraints or optimizations.

## Day 4 (2025-01-23)

### Problems Solved

Category: Backtracking
- N-Queens  
  Platform: LeetCode  
  Core Idea: Backtracking with constraint checking (columns, diagonals)

Category: Arrays → Prefix Sum
- Find the Middle Index in Array (LeetCode 1991)  
  Core Idea: Prefix Sum comparison (left sum vs right sum)

- Find Pivot Index  
  Platform: LeetCode  
  Core Idea: Prefix Sum / Running Sum optimization

### What I Learned
- Backtracking problems require early pruning to avoid exponential blow-up.
- Maintaining separate structures for column and diagonal constraints simplifies N-Queens.
- Prefix sums can be reduced to a single running sum for pivot-style problems.

### Mistakes / Observations
- Initially underestimated diagonal indexing in N-Queens.
- For pivot index problems, recalculating sums repeatedly is inefficient and unnecessary.

### Corrections Applied
- Used sets/arrays to track occupied columns and diagonals in N-Queens.
- Switched from nested loops to prefix/running sum logic for array problems.

### Next Steps
- Revisit N-Queens to optimize space (bitmasking).
- Solve more pivot-style problems to solidify prefix-sum intuition.
