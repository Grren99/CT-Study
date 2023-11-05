#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve(void)
{
	int n;
	cin >> n;

	vector<int> buildings;
	for (int i = 0; i < n; i++)
	{
		int temp;
		cin >> temp;

		buildings.push_back(temp);
	}

	vector<int> count(n);
	for (int i = 0; i < n; i++)
	{
		double maxGradient = -1000000000;

		for (int j = i + 1; j < n; j++)
		{
			int h = buildings[j] - buildings[i];
			int w = j - i;
			double g = h * 1.0 / w;

			if (g <= maxGradient)
				continue;

			maxGradient = g;
			count[i]++; count[j]++;
		}
	}

	cout << *max_element(count.begin(), count.end());
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	solve();
}
