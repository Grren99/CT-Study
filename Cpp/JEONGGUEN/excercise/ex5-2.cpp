//main 함수가 작동할 수 있도록 CPoint 클래스를 작성하라

#include <iostream>
#include<string>

using namespace std;

class CPoint {
private:
	int x, y;
public:
	CPoint(int a = 0, int b = 0) :x(a), y(b) {}
	void Print() {
		cout << x << ',' << y << endl;
	}
	void SetXY(int a, int b) {
		x = a;
		y = b;
	}
	int GetSumX(CPoint *arr, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += arr[i].x;
		}
		return res;
	}
	int GetSumY(CPoint* arr, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += arr[i].y;
		}
		return res;
	}
};

int main(void) {
	int i;
	CPoint ary[5] = { CPoint(1,2),CPoint(3,4),CPoint(5,6) };
	CPoint sum;

	sum.SetXY(sum.GetSumX(ary, 5), sum.GetSumY(ary, 5));
	sum.Print();

	return 0;
}
