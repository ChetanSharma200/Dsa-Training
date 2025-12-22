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
- Move toward slightly harder array problems involving constraints or optimizations.
