
#include<iostream> //para leer
#include<cmath>
#include<stdlib.h>//libreria para el random
#include<time.h>


using namespace std;//siempre importante en todos los programas de c++

int main(){
	int m;
	srand(time(NULL));//inicializamos los numeros aleatorios
	cout << "Bienvenido" << endl;
	cout << "Ejercisio numero 3 de matrices" << endl;
	cout << "Ingrese n que sera el tamaño de la matriz" <<endl;
	cin >> m;
	int matriz[m][m];

	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			matriz[i][j] = -50+rand()%(100);//genera numeros aleatorios entre -50 y 100 para obtener numeros negativos y positvos
		}
	}
	cout<<"\n"<< endl;
	cout<<"Los numeros aleatorios son los siguientes :"<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			cout<< matriz[i][j]<<" ";
		}
	}
	int pares=0;
	int impares = 0;
	int positivos = 0;
	int negativos =0;
	cout << "\n"<<endl;

	cout<<"El conjunto de Pares es: "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			if(matriz[i][j] %2==0){
				cout<<matriz[i][j]<<" ";
				pares = pares +1;
			}
		}
	}
	cout<<"\n" <<endl;
	cout<<"El conjunto de impares es: "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			 if(matriz[i][j] %2!=0){
				impares = impares +1;
				cout<<matriz[i][j]<<" ";
			}
		}
	}
	
	cout<<"\n" <<endl;
	cout<<"El conjunto de postivos es: "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			if(matriz[i][j] >= 0){
				positivos = positivos +1;
				cout<<matriz[i][j]<<" ";
			}
		}
	}
	
	cout<<"\n" <<endl;
	cout<<"El conjunto negativos es: "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
    		if(matriz[i][j] < 0){
				negativos = negativos +1;
				cout<<matriz[i][j]<<" ";
			}
		}
	}

	cout <<"\n"<< endl;
	cout <<"la cantidad de pares es "<<pares<<endl;
	cout <<"la cantidad de impares es "<<impares<<endl;
	cout <<"la cantidad de positivos es "<<positivos<<endl;
	cout <<"la cantidad de negativos es "<<negativos<<endl;
	return 0;
}
	
