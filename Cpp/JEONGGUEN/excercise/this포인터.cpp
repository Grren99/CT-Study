//move 함수와 Print함수는 this포인터 변수에 객체의 주소를 저장하여 들고옴
//move(CPoint *this, int a, int b)의 형태로 python의 self느낌
#include <iostream>
#include<string>

using namespace std;

class CPoint {
private:
	int x, y;
public:
	CPoint(int a, int b) {
		x = a;
		y = b;
	}
	void Move(int a, int b) {
		x += a;
		y += b;
	}
	void Print() {
		cout << x << "," << y << endl;
	}
};

int main(void) {
	CPoint P1(1, 2);
	CPoint P2(3, 4);
	P1.Move(1, 1);
	P2.Move(2, 2);

	P1.Print();
	P2.Print();

	return 0;
}
