# O Exemplo tem algo diferente?
No exemplo do sourcemaking foi feito uma estrutura onde ao criar um objeto Observer ele já adiciona a Arraylist de Observers do Subject.

# Artigo - Event Agreggator
Sobre o artigo do Martin Fowler, eu compreendi que o Event Aggregator funciona com o uma especie de Fachada na interação entre os objetos do tipo Observer.
Este sistema permite que sejam tratados os diferentes eventos que sejam necessarios para os objetos, porem mantendo a responsabilidade no Event Aggregator.
Ele vem a simplificar o uso do Observer, no quesito desempenho.