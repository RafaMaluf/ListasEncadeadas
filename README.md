# TDE1 – Pilha, Fila e Merge
- Node: estrutura de nó que guarda um valor inteiro e a referência para o próximo.
- Pilha com lista encadeada: estrutura FILO com métodos insere, remove e imprime.
- Fila com lista encadeada: igual Pilha mas FIFO ao inves de FILO, ou seja, remove sempre o primeiro valor, ao inves do ultimo.
- Merge: recebe duas filas ordenadas e gera uma terceira fila também ordenada.
- MergeVetor: faz o mesmo que merge, mas usando vetores.
- Main: executa todos os testes.

## Como executar
Basta rodar o arquivo Main. Ele mostra:
1) Pilha funcionando
2) Fila funcionando
3.1) Merge entre duas filas (lista encadeada)
3.2) Merge entre dois vetores

## Exemplos utilizados
- Pilha: insere 1, 3, 5, 7; remove duas vezes; imprime o estado.
- Fila: insere 2, 4, 6, 8; remove duas vezes; imprime o estado.
- Merge (lista): A = [1,3,5,7,9], B = [2,4,6,8] → C = [1,2,3,4,5,6,7,8,9].
- Merge (vetores): vetA = {1,3,5,7,9}, vetB = {2,4,6,8} → vetC = {1,2,3,4,5,6,7,8,9}.


## Extras
Se quiser fazer mais testes. Use os metodos de pilha e fila pra inserir e remover itens. 
Pros merge, altere o vetA ou vetB (lista A e lista B tambem) pra ver o C ser re-ordenado.
