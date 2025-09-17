#include <stack>
#include <string>

std::stack<std::string> plateStack;
plateStack.push("x");
plateStack.push("y");
plateStack.push("z");
std::string topPlate = plateStack.top();
plateStack.pop();
