//main함수가 실행 될 수 있도록 CPoint클래스 구현

#include <iostream>
#include<string>

using namespace std;

class CPoint {
private:
	int x, y;
public:
	void Print() {
		cout << x << "," << y << endl;
	}
	CPoint &SetX(int a) {
		x = a;
		return *this;
	}
	CPoint &SetY(int b) {
		y = b;
		return *this;
	}
};
//this 포인터를 이용해 주소를 리턴하는데 &를 통해 주소를 갖는 객체로 바꿔줌

int main(void) {
	CPoint P1;

	P1.SetX(3).SetY(4);
	P1.Print();

	P1.SetY(6).SetX(5);
	P1.Print();

	return 0;
}
