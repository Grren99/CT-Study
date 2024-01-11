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
	CPoint** ptr;
	ptr = new CPoint * [3];

	for (int i = 0; i < 3; i++) {
		ptr[i] = new CPoint[2];
	}

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			int a, b;
			a = rand();
			b = rand();
			ptr[i][j].SetXY(a, b);
			ptr[i][j].Print();
		}
	}
	for (int i = 0; i < 3; i++) {
		delete[] ptr[i];
	}
	delete[] ptr;



	return 0;
}
