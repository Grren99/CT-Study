#include <iostream>
#include<string>

using namespace std;

class CCar;

class CController {
private:
	int price;
public:
	CController(int p) :price(p) {}
	void TurnOn(CCar& C1);
	void TurnOff(CCar& C1);
	void speedChange(CCar& C1, int v);
};

class CCar {
private:
	bool onoff;
	int price;
	int speed;
public:
	CCar(int p):onoff(false),price(p),speed(0){}
	void Print() {
		cout << "속도 : " << speed << endl;
	}
	friend class CController;
};

void CController::TurnOn(CCar& C1) {
	C1.onoff = true;
}
void CController::TurnOff(CCar& C1) {
	C1.onoff = false;
}
void CController::speedChange(CCar& C1,int v) {
	C1.speed += v;
}

int main(void) {
	CCar Car(100);
	CController Con(10);

	Con.TurnOn(Car);
	Con.speedChange(Car, 5);
	Car.Print();
	Con.TurnOff(Car);

	return 0;
}
