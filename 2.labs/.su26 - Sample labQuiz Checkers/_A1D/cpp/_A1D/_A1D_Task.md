# Task
Given a list of integers, find if they are sorted in non-decreasing order.

# Input
First line contains the number of tests. The description of each test follows.
Each test is described by two lines. First line contains N, the number of
integers in the list. Second line contains the integers A[i] of the list.

# Output
For each test in the given order, print a string "YES" or "NO" in one line.

# Example-1 (batch-1)
## Input (stdin)
```
3
4
1 2 3 3
4
1 5 2 6
1
5
```
## Output (stdout)
```
YES
NO
YES
```

# Forbidden words
```
sort
open
file
creat(
fstream
thread
process
system(
exec(
```

# Scoring distribution
```
Batch   Score   Tests   Constraints
1       0.2     3       1<=N<=4, 1<=A[i]<=10
2       0.2     10      1<=N<=10, 1<=A[i]<=1000
3       0.2     20      1<=N<=100, 1<=A[i]<=10000
4       0.2     50      1<=N<=1000, 1<=A[i]<=100000
5       0.2     100     1<=N<=10000, 1<=A[i]<=1000000
------------------------
5       1       Total
```

# Time limit
1s (cpp) or 1.5s (java) or 3s (py) per batch.

# Hints
- Use fast input/output methods.
- 0.2 score for passing only sample batches.
- Correct and fast O(N*log(N)) or better solution for full score.