#include <iostream>
#include<string>
using namespace std;

int main() {
	int N;
	cin >> N;
	int result[10] = { 0,0,0,0,0,0,0,0,0,0 };


	for (int i = 1; i <= N; i++) {
		//입력받은 페이지 문자열로 전환
		string s1 = to_string(i);
		for (int j = 0; j < s1.length(); j++) {
			//문자열 길이만큼 비교
			string sub = s1.substr(j, j + 1);
			
			int k = stoi(sub);

			result[k]++;
		}
	}

	for (int i = 0; i < 10; i++) {
		cout << result[i] << " ";

	}

	return 0;
}
