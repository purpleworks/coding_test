#include <stdio.h>

int main(){
	int input;
	float result;
	for (;;){
		printf("input : ");
		scanf_s("%d", &input);

		if (input >= 0 && input <= 20)
			result = input*0.9;
		else if (input>20 && input <= 40)
			result = input*0.8;
		else if (input>40)
			result = input*0.75;
		else
			break;

		printf("output : $%.2f\n",result);
	}
	return 0;
}