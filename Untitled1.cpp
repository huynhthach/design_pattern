#include<stdio.h>
#include<conio.h>

char move[10] = {'0','1','2','3','4','5','6','7','8','9'};

void board(){
	printf("Player 1(x)-Player 2(0)	\n");
	printf("   %c   |   %c   |   %c   \n",move[1],move[2],move[3]);
	printf("_______|_______|_______\n");
	printf("       |       |       \n");
	printf("   %c   |   %c   |   %c   \n",move[4],move[5],move[6]);
	printf("_______|_______|_______\n");
	printf("       |       |       \n");
	printf("   %c   |   %c   |   %c   \n",move[7],move[8],move[9]);
}

int iswin(){
	if(move[1]==move[2] && move[2]==move[3])
		return 1;
	else if(move[4]==move[5] && move[5]==move[6])
		return 1;
	else if(move[7]==move[8] && move[8]==move[9])
		return 1;
	else if(move[1]==move[4] && move[4]==move[7])
		return 1;
	else if(move[2]==move[5] && move[5]==move[8])
		return 1;
	else if(move[3]==move[6] && move[6]==move[9])
		return 1;
	else if(move[1]==move[5] && move[5]==move[9])
		return 1;
	else if(move[3]==move[5] && move[5]==move[7])
		return 1;
	else if(move[1]!= '1' && move[2]!= '2'&& move[3]!= '3'&& move[4]!= '4'&& move[5]!= '5'&& move[6]!= '6'&& move[7]!= '7'&& move[8]!= '8'&& move[9]!= '9')
		return 0;
	else 
		return -1;
}

int main(){
	int player = 1;
	int choice,i;
	char mark;
	do{
		board();
		if(player%2!=0)
			player =1;
		else 
			player =2;
			
		if(player ==1)
			mark = 'X';
		else 
			mark = 'O';
		printf("Player %d,enter a number: ");
		scanf("%d",&choice);
		
		if(choice == 1 && move[1] == '1')
			move[1] = mark;
		else if(choice == 2 && move[2] == '2')
			move[2] = mark;
		else if(choice == 3 && move[3] == '3')
			move[3] = mark;
		else if(choice == 4 && move[4] == '4')
			move[4] = mark;
		else if(choice == 5 && move[5] == '5')
			move[5] = mark;
		else if(choice == 6 && move[6] == '6')
			move[6] = mark;
		else if(choice == 7 && move[7] == '7')
			move[7] = mark;
		else if(choice == 8 && move[8] == '8')
			move[8] = mark;
		else if(choice == 9 && move[9] == '9')
			move[9] = mark;
		else{
			printf("invalid move");
			player--;
			getch();
		}
	player++;
	i=iswin();
	}while(i==-1);
	if(i == 1){
		player--;
		printf("player %d win",player);
	}else{
		printf("game draw");
	}
	
}
