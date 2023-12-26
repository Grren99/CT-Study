//3행 2열의 객체 배열을 생성 후 사용자로 부터 값을 입력받아 출력하는 코드 작성

#include <iostream>
#include<string>

using namespace std;

class CPoint {
private:
	int x, y;
public:
	void setxy(int a, int b) {
		x = a;
		y = b;
	}
	void print() {
		cout << x << "," << y<<'\t';
	}
};

int main(void) {
	CPoint ary[3][2];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			int a, b;
			cin >> a >> b;
			ary[i][j].setxy(a, b);
		}
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			ary[i][j].print();
		}
		cout << endl;
	}

	return 0;
}
