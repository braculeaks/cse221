#include<bits/extc++.h>
using namespace std;
int main() {
    // write code in Solution.cpp
    exit(0); // exits the program immediately, nothing below executes

    // fastIO example below
    ios::sync_with_stdio(false), cin.tie(nullptr);
    long long t, n, m, a[8], b[8], c[8];

    cin >> t; // input a single integer in one line
    // input a pair of integers in one line
    cin >> n >> m;
    // input n integers in one line
    for (int i = 0; i < n; ++i) cin >> a[i];
    // input m pairs of integers in m lines
    for (int i = 0; i < m; ++i) cin >> b[i] >> c[i];

    cout << t << "\n"; // output a single integer in one line
    // output a pair of integers in one line
    cout << n << " " << m << "\n";
    // output n integers in one line
    for (int i = 0; i < n; ++i) cout << (i ? " " : "") << a[i];
    cout << "\n";
    // output m pairs of integers in m lines
    for (int i = 0; i < m; ++i) cout << b[i] << " " << c[i] << "\n";
    // force output all items in the buffer up to now together
    cout.flush(); // flush only once at the end of the program

    /* input = output
2
3 4
5 6 7
8 9
1 2
3 4
5 6

    */
}