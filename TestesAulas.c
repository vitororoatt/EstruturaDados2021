#include <stdio.h>
#include <stdlib.h>

int main(){
    int * pi; // ponteiro de inteiros
    float * pf; // ponteiro de float
    char * pc; // ponteiro de char
    int * vetor; // ponteiro de inteiros

    pi = malloc(4); // Alocando um espa�o (regi�o de aloca��o dinamica) para armazenar um inteiro e devolvendo o endere�o para PI
    pi = malloc(sizeof(int)); // Alocando um espa�o (regi�o de aloca��o dinamica) para armazenar um inteiro e devolvendo o endere�o para PI
    // Importante usar o segundo exemplo caso n�o saiba o tamanho de um inteiro no seu compilador, que pode ser 2, 4 ou 8 bits

    printf("Para onde PI esta apontando (endereco): %p", pi); // %p � usado para conteirospi = (int *) malloc(sizeof(int));

    // tamb�m � necess�rio fazer o casting para converter o MALLOC papa o tipo do ponteiro,
    // uma vez que ele s� retorna ponteiro tipo VOID* (generico).
    // para fazer o casting, no caso do inteiro:
    pi = (int *) malloc(sizeof(int));
    pf = (float *) malloc(sizeof(float));
    pc = (char *) malloc(sizeof(char));

    // Para fazer um vetor de tamanho muito grande, por exemplo 1 milh�o, precisamos usar o MALLOC pois ele vai usar a parte
    // de aloca��o dinamica da memoria RAM, diferente de simplesmente declarar INT VETOR[1000000], que iria dar erro
    // por tentar alocar na parte de variaveis estaticas, onde n�o h� espa�o suficiente
    // malloc de vetor de 1 milh�o de posi��es:
    v = (int *) malloc(1000000 * sizeof(int));

    return 0;
}
