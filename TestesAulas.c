#include <stdio.h>
#include <stdlib.h>

int main(){
    int * pi; // ponteiro de inteiros
    float * pf; // ponteiro de float
    char * pc; // ponteiro de char
    int * vetor; // ponteiro de inteiros

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

    // Para fazer um vetor de tamanho muito grande, por exemplo 1 milhão, precisamos usar o MALLOC pois ele vai usar a parte
    // de alocação dinamica da memoria RAM, diferente de simplesmente declarar INT VETOR[1000000], que iria dar erro
    // por tentar alocar na parte de variaveis estaticas, onde não há espaço suficiente
    // malloc de vetor de 1 milhão de posições:
    v = (int *) malloc(1000000 * sizeof(int));

    return 0;
}
