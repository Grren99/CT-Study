#include <iostream>
#include<string>

//char 형태로 배열을 선언하면 배열의 각 index마다 한 글자가 저장됨
//예를 들어 name에 "hello"를 저장하면 name[0] = h, name[1] = e 
//배열에 입력하는 것이기 때문에 const를 이용해 char을 상수화 하여 주소 사용

using namespace std;

class CStudent {
private:
	char name[20];
	int number, age;
public:
	CStudent(const char *n = "noname", int num = 0, int  a = 0) {
		strcpy_s(name, n);
		number = num;
		age = a;
	}
	void SetName(const char* n) {
		strcpy_s(name, n);
	}
	void SetNumber(int num) {
		number = num;
	}
	void SetAge(int a) {
		age = a;
	}
	void Print() {
		cout << "이름 : " << name << endl;
		cout << "학번 : " << number << endl;
		cout << "나이 : " << age << endl;
	}

};
int main(void) {
	CStudent St1("홍길동", 1111111, 25);
	CStudent St2;

	St1.Print();
	St2.Print();

	St2.SetName("이순신");
	St2.SetNumber(22222222);
	St2.SetAge(30);

	St2.Print();

	return 0;
}
