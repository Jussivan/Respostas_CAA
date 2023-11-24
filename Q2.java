for ( m =n; m>=2; m--){
int x = v[1];
for (j=1; j < m; ++j) v[j] = v[j+1];
v[m] =x;
}

/*O código dado não realiza a ordenação crescente do vetor,
tendo em vista que ele apenas remove o maior elemento do heap (em v[1]) e o coloca no final do vetor,
porém esse processo isolado não conduz a uma ordenação completa dos elementos,
para ordenar efetivamente um vetor em ordem crescente utilizando um heap,
é necessário aplicar um algoritmo de ordenação como o heapsort,
que organiza os elementos de maneira abrangente e eficiente,
ao contrário do código fornecido, que não realiza uma ordenação completa.*/