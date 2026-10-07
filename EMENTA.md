
### Ementa - Orientação a Objetos com Java

#### Módulo 1: Fundamentos da JVM e Gerenciamento de Memória (Concluído — Aulas 2, 3, 11, 13)

Código: `src/modulo1_fundamentos/`

* Diferença conceitual entre interpretação (estilo Python) e o modelo híbrido do Java (Compilador `javac` gerando Bytecode `.class` para a JVM).
* Sintaxe básica, controle de fluxo e tipagem estática.
* Tipos Primitivos vs. Tipos de Referência (ponteiros na memória Heap vs. alocação na Stack).
* Declaração e manipulação estática de Arrays.

#### Módulo 2: Modelagem de Estado e Encapsulamento (Concluído — Aulas 5, 7, 8, 11, 13)

Código: `src/modulo2_encapsulamento/`

* Classes (como moldes estruturais) e Objetos (como instâncias alocadas).
* Construtores (padrão e sobrecarregados) e a mecânica de inicialização de estado.
* Uso do ponteiro `this` para autorreferência e resolução de sombreamento (*shadowing*).
* Encapsulamento: Modificadores `public` e `private`, proteção da integridade dos dados, e implementação de *getters* e *setters*.

#### Módulo 3: Estrutura, Relacionamentos e Modularidade (Concluído — Aulas 8, 9, 14)

Código: `src/modulo3_relacionamentos/`

* Organização física do projeto (Packages) e resolução de dependências por meio de `import`.
* Modificador `protected` e o controle de visibilidade entre diferentes pacotes.
* Relacionamentos entre instâncias: Agregação e Composição (análise da Relação "todo-parte").
* Classes Aninhadas (Inner Classes) e as regras de visibilidade e declaração por arquivo `.java`.

#### Módulo 4: Herança, Comportamento e Polimorfismo (Em fechamento — Aulas 16, 18–21)

Código: `src/modulo4_heranca_polimorfismo/` (`heranca/` e `estatico/`)

* Hierarquia genérica versus especializada (relação "É-UM") utilizando `ContaBancaria` e `ContaEspecial`.
* O modificador `static`: Diferenciação entre o contexto da Classe e o contexto da Instância.
* Polimorfismo e a prática da Sobrescrita de métodos (anotação `@Override` e a adaptação do método `sacar`).
* A função `super()` e o reaproveitamento da lógica da superclasse.

#### Módulo 5: Contratos e Abstração (Pendente — Aulas 22–23)

Código: `src/modulo5_abstracao/`

* Classes Abstratas: Modelagem de restrições de instanciação para conceitos genéricos.
* Interfaces: Definição de contratos de comportamento (transição do *duck typing* do Python para a rigidez do Java).

#### Módulo 6: Ecossistema de Dados, Segurança e Persistência (Pendente — Aulas 24–27)

Código: `src/modulo6_dados_excecoes_io/`

* Java Collections Framework: Substituição de Arrays nativos por estruturas dinâmicas como `List`, `Set` e `Map`.
* Tratamento de Exceções: Hierarquia de erros, blocos `try/catch/finally` e propagação com `throws`.
* Persistência de Dados e I/O: Leitura e escrita de arquivos de texto puro (`.txt`) e gerenciamento de recursos.

#### Módulo 7: Engenharia e Qualidade de Software (Pendente — UML incorporada aos Módulos 4–6; Aulas 28–29)

Código: `src/modulo7_testes/`

* Noções de UML: Diagramação estrutural básica, introduzida gradualmente a cada conceito novo e consolidada na modelagem do projeto.
* Testes de Unidade: JUnit 5 habilitado pelo suporte nativo do VS Code (sem ferramenta de build) e validação automatizada do comportamento das classes.
* *(Opcional)* Gerenciamento de Dependências: demonstração do Maven e do `pom.xml`, sem exigência prática.

#### Módulo 8: Projeto Prático Aplicado (Apresentado na Aula 21; desenvolvido em paralelo aos Módulos 5–7; Aulas 28, 30–31)

* Apresentação dos Requisitos: Escolha de um dos 3 modelos de projeto (sistemas baseados em terminal/CLI com persistência em TXT).
* Modelagem Arquitetural: Desenho de classes em UML e definição dos testes para o projeto.
* Desenvolvimento Iterativo: cada módulo termina com uma tarefa extra-classe aplicando o conteúdo ao projeto.
* Revisão de Código e Mostra Pedagógica Final.

O cronograma aula a aula está em [Registros de Aulas](REGISTROS_AULAS.md#cronograma-replanejado-a-partir-de-07102026).

### Referências

**Materiais e Notas de Aula:**
* TELES, Thales H. S. Notas de Aula da disciplina de Linguagem de Programação II (Prof. Kláudio Medeiros). Universidade Estadual da Paraíba (UEPB).

**Bibliografia Base:**
* DEITEL, H. M., *Java – Como Programar*. Prentice Hall do Brasil, 2007.
* ECKEL, B., *Thinking in Java*, 4th ed. Prentice Hall, 2006.

**Bibliografia Complementar:**
* HORSTMANN, C., *Big Java*. Bookman, 2004. (Também da ementa da UEPB, destaca-se por ser extremamente didático, com muitos exemplos práticos que conectam a lógica da programação a cenários do mundo real).
