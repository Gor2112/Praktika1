#include <vector>
#include <string>

std::vector<std::string> vec;
vec.push_back("a");
vec.push_back("b");
vec.push_back("c");
std::string first = vec[0];
vec.pop_back();
