#include<iostream>>
#include<queue>

using namespace std;

int N, M;
int days = -1;
int flag = false;
int box[1001][1001];
int visited[1001][1001];
int dx[] = { 1,0,-1,0 };
int dy[] = { 0,1,0,-1 };
queue<pair<int, int>> q;

int main() {
	cin >> N >> M;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cin >> box[i][j];
			visited[i][j] = -1;

			if (box[i][j] == 1) {
				q.push({ i,j });
				visited[i][j]++;
			}
		}
	}

	while (!q.empty()) {
		int a = q.front().first;
		int b = q.front().second;
		q.pop();
		for (int i = 0; i < 4; i++) {
			int da = a + dx[i];
			int db = b + dy[i];
			if (da >= 0 && db >= 0 && N > da && M > db && visited[da][db] == -1 && box[da][db] == 0) {
				q.push({ da,db });
				visited[da][db] = visited[a][b] + 1;
			}
		}
	}

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (days <= visited[i][j]) {
				days = visited[i][j];
			}
			if (box[i][j] == 0 && visited[i][j] == -1) {
				days = -1;
				flag = true;
				break;
			}
		}
		if (flag) {
			break;
		}
	}
	cout << days;
}