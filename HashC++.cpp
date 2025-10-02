#include <functional>
#include <string>

std::size_t hash = std::hash<std::string>{}("hello");
