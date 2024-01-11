#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
const long long INF = 0x3f3f3f3f;

int n;
vector<pair<long, long>> p;
int main() {
	cin >> n;
	long long s, e;
	for (int i = 0; i < n; i++) {
		cin >> s >> e;
		p.emplace_back(s, e);
	}
	sort(p.begin(), p.end());
	long long ans = 0;
	s = -INF, e = -INF;
	for (int i = 0; i < p.size(); i++) {
		auto cur = p[i];
		long long ns = cur.first, ne = cur.second;
		if (s <= ns && ne <= e) {
			continue;
		}
		ans += ne - ns;
		if (ns < e) {	
			ans -= (e - ns);
		}
		s = ns;
		e = ne;
	}
	cout << ans;
	return 0;
}
