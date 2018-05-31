#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void FindRandomNum(int randomNum);

int main(){
	int randomNum = 0;
	srand((unsigned int)time(NULL));
	randomNum = rand() % 1000;
	printf("·£´ý¼ýÀÚ : %d\n",randomNum);
	FindRandomNum(randomNum);
	return 0;
}

void FindRandomNum(int randomNum){
	int input;
	scanf_s("%d", &input);

	if (input>randomNum){
		printf("high\n");
		FindRandomNum(randomNum);
	}
	else if (input<randomNum){
		printf("low\n");
		FindRandomNum(randomNum);
	}
	else
		printf("correct!\n");
}