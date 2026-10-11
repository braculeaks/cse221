# Task
Given an integer N, find the sum of all integers from 1 to N.

# Input
First line contains the number of tests. The description of each test follows.
Each test is described by one line containing one integer N.

# Output
For each test in the given order, print the answer you are asked to find in
this task. Separate the answers by any whitespace character.

# Example-1 (batch-1)
## Input (stdin)
```
5
2
5
10
12
100
```
## Output (stdout)
```
3
15
55
78
5050
```

# Forbidden words
```
sort
open
file
creat(
fstream
define
pragma
thread
process
system(
exec(
```

# Scoring distribution
```
Batch   Score   Tests   Constraints
1       0.2     5       1<=N<=100
2       0.2     10      1<=N<=1000
3       0.2     100     1<=N<=10000
4       0.2     1000    1<=N<=100000
5       0.2     10000   1<=N<=1000000
------------------------
5       1       Total
```

# Time limit
1s (cpp) or 1.5s (java) or 3s (py) per batch.

# Hints
- Use fast input/output methods.
- 0.2 score for passing only sample batches.
- Expected solution is O(1) per test.