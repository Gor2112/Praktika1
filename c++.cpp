#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Мой список
    vector<int> числа;
    числа.push_back(10);
    числа.push_back(20);
    числа.push_back(30);
    
    cout << "Мой список: ";
    for (int i = 0; i < числа.size(); i++) {
        cout << числа[i] << " ";
    }
    cout << endl;
    
    // Добавляю число
    числа.push_back(40);
    cout << "Добавил 40: ";
    for (int i = 0; i < числа.size(); i++) {
        cout << числа[i] << " ";
    }
    
    return 0;
}
