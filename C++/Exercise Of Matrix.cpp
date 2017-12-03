
#include<iostream> 
#include<cmath>
#include<stdlib.h> //Writing and random libraries
#include<time.h>
using namespace std;

int main(){
	int m;
	srand(time(NULL));
	cout <<"Exercise of matrix" << endl;
	cout <<"Enter n that will be the size of the matrix:" <<endl;
	cin >> m;
	int matrix[m][m];

	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			matrix[i][j] = -50+rand()%(100); //generates random numbers between -50 and 100 to obtain negative and positive numbers
		}
	}
	cout<<"\nThe random numbers are the following:"<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			cout<< matrix[i][j]<<" ";
		}
	}
	int pares=0;
	int impares = 0;
	int positivos = 0;
	int negativos =0;
	cout<<"\nThe set of Pares is: "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			if(matrix[i][j] %2==0){
				cout<<matrix[i][j]<<" ";
				pares = pares +1;
			}
		}
	}
	cout<<"\nThe set of odd is"<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			 if(matrix[i][j] %2!=0){
				impares = impares +1;
				cout<<matrix[i][j]<<" ";
			}
		}
	}
	cout<<"\nThe set of positives is"<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			if(matrix[i][j] >= 0){
				positivos = positivos +1;
				cout<<matrix[i][j]<<" ";
			}
		}
	}
	cout<<"\nThe set of negatives is"<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
    		if(matrix[i][j] < 0){
				negativos = negativos +1;
				cout<<matrix[i][j]<<" ";
			}
		}
	}

	cout <<"\nthe number of pairs is "<<pares<<endl;
	cout <<"the amount of odd is "<<impares<<endl;
	cout <<"the amount of positives is "<<positivos<<endl;
	cout <<"the amount of negatives is "<<negativos<<endl;
	return 0;
}
	
