#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<string> книги;
    
    книги.push("Математика");
    книги.push("История");
    книги.push("География");
    
    cout << "Верхняя книга: " << книги.top() << endl;
    
    cout << "Взял книгу: " << книги.top() << endl;
    книги.pop();
    
    cout << "Теперь верхняя: " << книги.top() << endl;
    
    return 0;
}
