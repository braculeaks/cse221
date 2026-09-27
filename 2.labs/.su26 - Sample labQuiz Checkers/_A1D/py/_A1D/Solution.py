import sys

## write code in Solution.py
sys.exit(0)  ## exits the program immediately, nothing below executes

## fastIO example below
readline, write = sys.stdin.readline, sys.stdout.write

t = int(readline())  ## input a single integer in one line
## input a pair of integers in one line
n, m = map(int, readline().split())
## input n integers in one line
a = list(map(int, readline().split()))
## input m pairs of integers in m lines
b, c = [0] * m, [0] * m
for i in range(m):
    b[i], c[i] = map(int, readline().split())

write(str(t) + "\n")  ## output a single integer in one line
## output a pair of integers in one line
write(str(n) + " " + str(m) + "\n")
## output n integers in one line
write(" ".join(map(str, a)) + "\n")
## output m pairs of integers in m lines
for i in range(m):
    write(str(b[i]) + " " + str(c[i]) + "\n")
## force output all items in the buffer up to now together
sys.stdout.flush()  ## flush only once at the end of the program

""" input = output
2
3 4
5 6 7
8 9
1 2
3 4
5 6

"""
