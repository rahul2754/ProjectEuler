/*
Problem Statement:

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?

Extended Problem Statement:
What is the Nth prime number?
*/

#include <iostream>
using namespace std;

bool is_prime(int num){
	bool prime = true;
	for (int i=2; i<num; i++){
		if (num % i == 0)
			prime = false;
			break;
	}

	if (prime)
		return true;
	else
		return false;
}

int main(){
	int n, current_number, counter(0);

	cin >> n;

	while (counter <= n){
		if (is_prime(n) == true)
			counter++;
		current_number++;
	}

	cout << current_number;

	return 0;
}