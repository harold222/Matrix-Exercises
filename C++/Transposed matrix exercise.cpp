#include<iostream> //para leer
#include<cmath>
#include<stdlib.h>//libreria para el random
#include<time.h>

using namespace std;//siempre importante en todos los programas de c++

int main(){
	int m;
	srand(time(NULL));
	string numeros;
	cout << "Bienvenido" << endl;
	cout << "Ejercisio numero 4 de matrices" << endl;
	cout << "Ingrese n que sera el tamaño de la matriz" <<endl;
	cin >> m;
	int matriz[m][m];
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			matriz[i][j] = 1+rand()%(100);//genera numeros aleatorios entre -50 y 100 para obtener numeros negativos y positvos
		}
	}
	cout<<" "<< endl;
	cout<< "los numeros en la matriz son"<<endl;
	cout<<" "<< endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){
			cout<< matriz[i][j]<<" ";//imprimo los numeros de la matriz sin salto de linea
		}
		cout<<""<< endl;
	}
	
	cout<<" "<<endl;
	cout<<"la matriz ordenada de menor a mayor es"<<endl;
	cout<<" "<<endl;
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){//necesarios 4 for para ordenar los numors
			for(int x =0; x<m; x++){
				for(int y=0; y<m;y++){
					if(matriz[i][j] < matriz[x][y]){//compara las diferentes posiciones de los iteradores si son menores
						int t = matriz[i][j];//guardo en la variable los numeros generados
						matriz[i][j] = matriz[x][y];//voy guardando los datos de matriz e matriz
						matriz[x][y] = t;//paso de la variable el numero ordenado a la matriz para lugo volver al iterador
					}
				}
		
			}
		}	
	}
	
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){//imprimo la matriz de menor a mayor 
			cout<< matriz[i][j]<<" ";
		}
		cout<<""<< endl;
	}
	
	cout<<" "<< endl;
	cout<< "la transpuesta de la matriz es"<<endl;
	cout<<" "<< endl;
	
	for(int i =0; i<m; i++){
		for(int j=0;j<i;j++){//para esto dejo i que servira para las filas de j y valla corriendo de manera desendente
			int t = matriz[i][j];
			matriz[i][j] = matriz[j][i];
			matriz[j][i] = t;
		}	
	}
	
	for(int i =0; i<m; i++){
		for(int j=0;j<m;j++){//imprimo la matriz
			cout<< matriz[i][j]<<" ";
		}
		cout<<""<< endl;
	}
		
return 0;	
}
