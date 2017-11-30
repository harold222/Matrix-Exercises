import random

print("Exercise")
n=int(input("Enter m that will be the size of the matrix:"))
filas =n #assignation n
columnas =n

matriz = [] #I define the list
for i in range(filas):
    matriz.append([0]*columnas) #Multiply the quantity to have the array of the desired size n x n

for f in range(filas):
    for c in range(columnas):
        matriz[f][c] = random.randint(1,40) #I generate random numbers between 1 to 40

print(" ")
print("The matrix original is: ")

for i in range(filas):
    for j in range(columnas):#print the matrix
        print(matriz[i][j],end=" ")
    print("")

"""forming the rhombus"""
print(" ")
print("the matrix rhombus shaped: ")

for i in range(filas): #I go through the rows and columns of the matrix
    for j in range(columnas):
        if(i+j+1 >=(n//2) and i+(n//2)>=j and j+(n//2)>=i and i+j<=(n//2)+n-1): #whole division
            matriz[i][j] = matriz[i][j] #LEFT THE GENERATED NUMBER RANDOMLY
        else:
            matriz[i][j] = " " #replacement to differentiate the outside of the rhombus


for i in range(filas):
    for j in range(columnas):
        print(matriz[i][j],end=" ") #print the matrix
    print("")