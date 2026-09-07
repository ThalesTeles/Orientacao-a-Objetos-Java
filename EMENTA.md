
### Ementa - Orientação a Objetos com Java

#### Módulo 1: Fundamentos da JVM e Gerenciamento de Memória (Concluído)

* Diferença conceitual entre interpretação (estilo Python) e o modelo híbrido do Java (Compilador `javac` gerando Bytecode `.class` para a JVM).
* Sintaxe básica, controle de fluxo e tipagem estática.
* Tipos Primitivos vs. Tipos de Referência (ponteiros na memória Heap vs. alocação na Stack).
* Declaração e manipulação estática de Arrays.

#### Módulo 2: Modelagem de Estado e Encapsulamento (Concluído)

* Classes (como moldes estruturais) e Objetos (como instâncias alocadas).
* Construtores (padrão e sobrecarregados) e a mecânica de inicialização de estado.
* Uso do ponteiro `this` para autorreferência e resolução de sombreamento (*shadowing*).
* Encapsulamento: Modificadores `public` e `private`, proteção da integridade dos dados, e implementação de *getters* e *setters*.

#### Módulo 3: Estrutura, Relacionamentos e Modularidade (Concluído)

* Organização física do projeto (Packages) e resolução de dependências por meio de `import`.
* Modificador `protected` e o controle de visibilidade entre diferentes pacotes.
* Relacionamentos entre instâncias: Agregação e Composição (análise da Relação "todo-parte").
* Classes Aninhadas (Inner Classes) e as regras de visibilidade e declaração por arquivo `.java`.

#### Módulo 4: Herança, Comportamento e Polimorfismo (Em Andamento)

* Hierarquia genérica versus especializada (relação "É-UM") utilizando `ContaBancaria` e `ContaEspecial`.
* O modificador `static`: Diferenciação entre o contexto da Classe e o contexto da Instância.
* Polimorfismo e a prática da Sobrescrita de métodos (anotação `@Override` e a adaptação do método `sacar`).
* A função `super()` e o reaproveitamento da lógica da superclasse.

#### Módulo 5: Contratos e Abstração (Pendente)

* Classes Abstratas: Modelagem de restrições de instanciação para conceitos genéricos.
* Interfaces: Definição de contratos de comportamento (transição do *duck typing* do Python para a rigidez do Java).

#### Módulo 6: Ecossistema de Dados, Segurança e Persistência (Pendente)

* Java Collections Framework: Substituição de Arrays nativos por estruturas dinâmicas como `List`, `Set` e `Map`.
* Tratamento de Exceções: Hierarquia de erros, blocos `try/catch/finally` e propagação com `throws`.
* Persistência de Dados e I/O: Leitura e escrita de arquivos de texto puro (`.txt`) e gerenciamento de recursos.

#### Módulo 7: Engenharia e Qualidade de Software (Pendente)

* Noções de UML: Diagramação estrutural básica para planejamento de sistemas.
* Testes de Unidade: Validação automatizada de comportamento das classes.

#### Módulo 8: Projeto Prático Aplicado (Pendente)

* Apresentação dos Requisitos: Escolha de um dos 3 modelos de projeto (sistemas baseados em terminal/CLI com persistência em TXT).
* Modelagem Arquitetural: Desenho de classes em UML e definição dos testes para o projeto.
* Desenvolvimento Iterativo: Construção e acompanhamento (atividades extra-classe).
* Revisão de Código e Mostra Pedagógica Final.

### Referências

**Materiais e Notas de Aula:**
* TELES, Thales H. S. Notas de Aula da disciplina de Linguagem de Programação II (Prof. Kláudio Medeiros). Universidade Estadual da Paraíba (UEPB).

**Bibliografia Base:**
* DEITEL, H. M., *Java – Como Programar*. Prentice Hall do Brasil, 2007.
* ECKEL, B., *Thinking in Java*, 4th ed. Prentice Hall, 2006.

**Bibliografia Complementar:**
* HORSTMANN, C., *Big Java*. Bookman, 2004. (Também da ementa da UEPB, destaca-se por ser extremamente didático, com muitos exemplos práticos que conectam a lógica da programação a cenários do mundo real).
