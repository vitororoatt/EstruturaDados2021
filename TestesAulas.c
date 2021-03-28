#include <stdio.h>
#include <stdlib.h>

int main(){
    int * pi; // ponteiro de inteiros
    float * pf; // ponteiro de float
    char * pc; // ponteiro de char

    pi = malloc(4); // Alocando um espaço (região de alocação dinamica) para armazenar um inteiro e devolvendo o endereço para PI
    pi = malloc(sizeof(int)); // Alocando um espaço (região de alocação dinamica) para armazenar um inteiro e devolvendo o endereço para PI
    // Importante usar o segundo exemplo caso não saiba o tamanho de um inteiro no seu compilador, que pode ser 2, 4 ou 8 bits

    printf("Para onde PI esta apontando (endereco): %p", pi); // %p é usado para conteirospi = (int *) malloc(sizeof(int));

    // também é necessário fazer o casting para converter o MALLOC papa o tipo do ponteiro,
    // uma vez que ele só retorna ponteiro tipo VOID* (generico).
    // para fazer o casting, no caso do inteiro:
    pi = (int *) malloc(sizeof(int));
    pf = (float *) malloc(sizeof(float));
    pc = (char *) malloc(sizeof(char));

    return 0;
}
