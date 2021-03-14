#include <iostream>

//A program created to output the fibonacci sequence written at CoderDojo
int x = 0;
int y = 1;
int z;

int main() {
    std::cout << "0" << std::endl;
    std::cout << "1" << std::endl;
    for(int i = 0; i <= 10; i++) {
        z = x + y;
        std::cout << z << std::endl;
        x = y;
        y = z;
    }
}
