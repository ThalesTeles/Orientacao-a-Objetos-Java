# Plano de Aula — Orientação a Objetos com Java (TC44E)

Prof. Thales Teles

Tópico, itens da [Ementa](EMENTA.md) e conteúdo de cada encontro do semestre, dos já realizados aos planejados. A numeração é a do portal. Não aparecem aqui as aulas em que não houve encontro (Aulas 1, 4, 6, 10, 12, 15, 17 e 24). O conteúdo da Aula 3 (29/04, Arrays) aparece junto com o da Aula 2. As datas estão no portal da PROFiA, para os encontros realizados, e no [Cronograma de Aulas](CRONOGRAMA-AULAS.md), para os planejados.

Encontros regulares duram 1h30 e reposições, 1h. As aulas seguem ciclos de objetivo, tentativa individual, resolução em live coding e o porquê da resolução.

| Aula | Situação | Duração | Módulo | Tópico |
|------|----------|---------|--------|--------|
| 2 | Realizada | 1h30 | 1 | Introdução ao Java e arrays |
| 5 | Realizada | 1h30 | 1/2 | Introdução à Orientação a Objetos |
| 7 | Realizada | 1h30 | 2 | Construtores e modificadores `public` e `private` |
| 8 | Realizada | 1h30 | 2/3 | Escopo, construtores parametrizados e pacotes |
| 9 | Realizada | 1h30 | 2/3 | Sobrecarga de construtores e modificador `protected` |
| 13 | Realizada | 1h30 | 1/2 | Revisão geral de Java após o recesso |
| 15 | Realizada | 1h30 | 1/2 | Getters, setters, `this` e processo de compilação |
| 16 | Realizada | 1h30 | 3 | Agregação, composição, classes aninhadas e Git |
| 18 | Realizada | 1h30 | 4 | Herança e `super()` |
| 20 | Realizada | 1h30 | 4 | Sobrescrita com `@Override` e polimorfismo |
| 21 | Realizada | 1h30 | 4 | Exercícios de herança, polimorfismo e despacho dinâmico |
| 22 | Realizada | 1h30 | 4 | Despacho polimórfico, `super` e introdução ao `static` |
| 23 | Realizada | 1h30 | 4 | Membros de instância e membros de classe (`static`) |
| 24 | Realizada | 1h30 | 4/5 | `static`, `final`, blocos estáticos e introdução às classes abstratas |
| 25 | Realizada | 1h30 | 5 | Classes abstratas e métodos abstratos |
| 27 | Planejada | 1h30 | 5 | Interfaces: contratos de comportamento |
| 28 | Planejada | 1h | 5/7 | Classe abstrata × interface e notação UML |
| 29 | Planejada | 1h | 8 | Projeto prático: modelos, requisitos e escopo |
| 30 | Planejada | 1h30 | 6 | Collections I: `List` e `ArrayList` |
| 31 | Planejada | 1h | 6 | Collections II: `Map` e `Set` |
| 32 | Planejada | 1h | 7/8 | Projeto prático: diagrama de classes e estrutura do código |
| 33 | Planejada | 1h30 | 6 | Tratamento de exceções I: hierarquia e `try/catch/finally` |
| 34 | Planejada | 1h | 6 | Tratamento de exceções II: `throw`, `throws` e exceções personalizadas |
| 35 | Planejada | 1h | 6 | Persistência I: escrita em arquivos `.txt` |
| 36 | Planejada | 1h30 | 6 | Persistência II: leitura e reconstrução dos objetos |
| 37 | Planejada | 1h30 | 7 | Testes de unidade com JUnit |
| 38 | Planejada | 1h30 | 8 | Projeto prático: integração, code review e ensaio |
| 39 | Planejada | 1h30 | 8 | Mostra pedagógica final |

---

# Encontros realizados

## Aula 2 — Introdução ao Java e Arrays
* Módulo 1. Ementa: diferença entre a interpretação (estilo Python) e o modelo híbrido do Java (`javac`, bytecode e JVM); sintaxe básica, controle de fluxo e tipagem estática; declaração e manipulação estática de arrays.
* Conteúdo: Introdução teórica ao pensamento computacional e ao Java e configuração inicial do ambiente. Estruturas de repetição e manipulação estática de arrays. Materiais: [Aula 1](https://drive.google.com/file/d/1M_pDLBDsZYp4hg284KRo6df3Vm9_xXK6/view) e [Aula 2](https://drive.google.com/file/d/1v8X3z4Yyk4OrlFwJCX-iyy8wleI6of_B/view).

## Aula 5 — Introdução à Orientação a Objetos
* Módulos 1 e 2. Ementa: sintaxe básica e tipagem estática (revisão); classes como moldes estruturais e objetos como instâncias alocadas.
* Conteúdo: Revisão de lógica estruturada e tipos de dados. Conceitos teóricos da POO: classes, objetos, atributos, métodos, construtores e os pilares (abstração, encapsulamento, herança e polimorfismo).

## Aula 7 — Construtores e Modificadores `public` e `private`
* Módulo 2. Ementa: classes e objetos; construtores e a mecânica de inicialização de estado; encapsulamento com `public` e `private`.
* Conteúdo: Classe versus objeto e inicialização de estado por construtores. Abstração, encapsulamento e controle de visibilidade com `public` e `private`.

## Aula 8 — Escopo, Construtores Parametrizados e Pacotes
* Módulos 2 e 3. Ementa: construtores parametrizados; encapsulamento; organização física do projeto em packages e resolução de dependências com `import`.
* Conteúdo: Escopo de variáveis, construtores parametrizados e revisão de encapsulamento. Modelagem de classes e organização do projeto em pacotes.

## Aula 9 — Sobrecarga de Construtores e Modificador `protected`
* Módulos 2 e 3. Ementa: construtores sobrecarregados; modificador `protected` e controle de visibilidade entre pacotes.
* Conteúdo: Sobrecarga de construtores. Análise prática do `protected` e das permissões de acesso entre classes do mesmo pacote e de pacotes distintos.

## Aula 11 — Revisão Geral de Java após o Recesso
* Módulos 1 e 2. Ementa: sintaxe e arrays; tipos primitivos × tipos de referência (Stack e Heap); `this` e encapsulamento.
* Conteúdo: Revisão de sintaxe básica, arrays e modelagem de classes. Encapsulamento, uso de `this` e distinção entre tipos primitivos e tipos de referência na memória.

## Aula 13 — Getters, Setters, `this` e Processo de Compilação
* Módulos 1 e 2. Ementa: modelo híbrido do Java (`.java` → `.class` → JVM); `this` e resolução de sombreamento (*shadowing*); getters e setters.
* Conteúdo: Getters e setters, `this` e resolução de *shadowing*. Ciclo de vida do código Java (compilação de `.java` para `.class` e execução na JVM) e rastreamento do fluxo de controle a partir do `main`.

## Aula 14 — Agregação, Composição, Classes Aninhadas e Git
* Módulo 3. Ementa: agregação e composição (relação "todo-parte"); classes aninhadas e as regras de visibilidade e declaração por arquivo `.java`.
* Conteúdo: Agregação versus composição com `Carro` "tem um" `Motor`. Inner classes e regras de visibilidade por arquivo. Fora da ementa, como ferramenta de apoio: fundamentos de Git e GitHub (clone, commit e push).

## Aula 16 — Herança e `super()`
* Módulo 4. Ementa: hierarquia genérica × especializada (relação "é-um") com `ContaBancaria` e `ContaEspecial`; `super()` e o reaproveitamento da lógica da superclasse.
* Conteúdo: `extends`, herança de atributos e métodos e reaproveitamento de construtores com `super()`.

## Aula 18 — Sobrescrita com `@Override` e Polimorfismo
* Módulo 4. Ementa: polimorfismo e sobrescrita de métodos com `@Override`.
* Conteúdo: `@Override` e seu papel de delegar ao compilador a validação da assinatura. Polimorfismo no sistema `ContaBancaria`: subclasses referenciadas pelo tipo da superclasse respondendo de forma diferente à mesma chamada. Branches e fork no GitHub e ajustes no ambiente (Java Language Server do VS Code).

## Aula 19 — Exercícios de Herança, Polimorfismo e Despacho Dinâmico
* Módulo 4. Ementa: polimorfismo e a adaptação do método `sacar` com sobrescrita.
* Conteúdo: Correção do ambiente de desenvolvimento e padronização da estrutura de pastas. Sobrescrita de `sacar()` em `ContaEspecial` considerando saldo mais limite. Despacho dinâmico: a JVM escolhe a implementação pelo tipo real do objeto, não pelo tipo da variável.

## Aula 20 — Despacho Polimórfico, `super` e Introdução ao `static`
* Módulo 4. Ementa: `super` e o reaproveitamento da lógica da superclasse; o modificador `static` (visão geral).
* Conteúdo: Exercícios de fixação com rastreamento manual de chamadas polimórficas pela hierarquia e uso de `super` para reaproveitar o comportamento da superclasse. Visão geral do `static` em atributos e métodos compartilhados pela classe.

## Aula 21 — Membros de Instância e Membros de Classe (`static`)
* Módulo 4. Ementa: o modificador `static` e a diferença entre o contexto da classe e o contexto da instância.
* Conteúdo: `static` em atributos e métodos: o que pertence ao objeto e o que pertence à classe. Testes de acesso a membros `static` por meio de um objeto: compila, pois o Java resolve pelo tipo da variável, mas o uso correto é pelo nome da classe.

## Aula 22 — `static`, `final`, Blocos Estáticos e Introdução às Classes Abstratas
* Módulos 4 e 5. Ementa: `static` (fechamento); classes abstratas (fundamentação). O `final` complementa o `static` e não consta da ementa.
* Conteúdo: Número da conta gerado automaticamente por um contador `static` em `ContaBancaria`. `final` e sua relação com os modificadores de acesso: um atributo `final` pode ser `public` sem getter sem comprometer a integridade. Bloco de inicialização `static`, executado uma vez no carregamento da classe. Fundamentação teórica das classes abstratas.

## Aula 23 — Classes Abstratas e Métodos Abstratos
* Módulo 5. Ementa: classes abstratas e a restrição de instanciação para conceitos genéricos; interfaces (apresentação inicial).
* Conteúdo: `abstract` impede instanciar `ContaBancaria`, usada só pelas filhas. Métodos abstratos como contrato que obriga a filha concreta a implementá-los. Hierarquia `Animal` com `emitirSom()` sobrescrito em `Cachorro`, `Gato` e `Papagaio`, construtores com `super`, e polimorfismo ao percorrer vetor e lista de `Animal`, com a limitação de métodos exclusivos da filha (`caminhar()`). Apresentação superficial das interfaces.

---

# Encontros planejados

O sistema `ContaBancaria` continua como fio condutor dos Módulos 5 e 6 (abstrata → interface → coleção de contas → exceção de saldo → persistência em `.txt`), e cada conteúdo novo termina com uma tarefa extra-classe aplicada ao projeto prático.

## Aula 25 — Interfaces: Contratos de Comportamento
* Duração: 1h30
* Módulo 5. Ementa: interfaces como contratos de comportamento (transição do *duck typing* do Python para a rigidez do Java).
* Conteúdo: Retomada da apresentação superficial da Aula 23. Contraste com o *duck typing* do Python: em Java, "se anda como pato" precisa estar escrito num contrato. Declaração de interface e `implements`, com a interface `Tributavel` (`calcularTributos()`) implementada por `ContaCorrente` e por uma classe fora da hierarquia (`SeguroDeVida`), mostrando que interface não é herança. Interface como tipo: um método que recebe `Tributavel` e soma os tributos de objetos sem relação de parentesco. Uma classe estende uma única classe, mas implementa várias interfaces. Constantes em interface são implicitamente `public static final`, ligando com a Aula 22.
* Extra-classe: criar uma segunda interface para o sistema de contas (ex.: `Rentavel`) e fazer uma classe implementar duas interfaces.

## Aula 26 — Classe Abstrata × Interface e Notação UML
* Duração: 1h
* Módulos 5 e 7. Ementa: classes abstratas e interfaces (critério de escolha); noções de UML.
* Conteúdo: Critério de escolha: classe abstrata quando há relação "é-um" com estado e código compartilhados; interface quando há uma capacidade ("pode-fazer") que classes sem parentesco oferecem. Noção de métodos `default` em interfaces (Java 8). Uma interface do próprio JDK: `Comparable<ContaBancaria>` e `compareTo()`, preparando a ordenação de listas da Aula 28. Notação UML no quadro: classe e método abstratos em itálico, `<<interface>>`, seta de herança e seta tracejada de realização. A aluna desenha o diagrama da hierarquia `ContaBancaria` com `Tributavel`.

## Aula 27 — Projeto Prático: Modelos, Requisitos e Escopo
* Duração: 1h
* Módulo 8. Ementa: apresentação dos requisitos e escolha de um dos 3 modelos de projeto (sistemas de terminal/CLI com persistência em `.txt`).
* Conteúdo: Apresentação dos 3 modelos de projeto prático. Checklist dos conceitos exigidos no projeto: herança, classe abstrata, interface, coleções, exceções, persistência e testes. Esqueleto de um sistema CLI: laço do menu com `Scanner` e `switch`, separação entre classes de modelo e a classe principal (como no projeto `gerenciamento-estoque`). Levantamento das entidades (substantivos) e ações (verbos) do modelo escolhido.
* Extra-classe: escolher o modelo de projeto e listar entidades, atributos e ações do sistema.

## Aula 28 — Collections I: `List` e `ArrayList`
* Duração: 1h30
* Módulo 6. Ementa: Java Collections Framework, substituição de arrays nativos por estruturas dinâmicas (`List`).
* Conteúdo: Limitação dos arrays de tamanho fixo (o `Produto[3]` do `gerenciamento-estoque` e o vetor de `Animal`). `ArrayList<ContaBancaria>` comparado à `list` do Python: `add`, `get`, `set`, `remove`, `size`, `contains` e for-each. Genéricos (`<T>`) no nível de uso e por que tipos primitivos precisam de *wrappers* (`Integer`, `Double`) dentro de coleções. Declarar pela interface (`List<...> contas = new ArrayList<>()`), ligando com a Aula 25. Polimorfismo dentro da coleção: percorrer contas de tipos diferentes chamando `sacar()`. Ordenação com `Collections.sort` usando o `Comparable` da Aula 26. Armadilha de remover elementos dentro do for-each.

## Aula 29 — Collections II: `Map` e `Set`
* Duração: 1h
* Módulo 6. Ementa: Java Collections Framework (`Map` e `Set`).
* Conteúdo: `HashMap<Integer, ContaBancaria>` comparado ao `dict` do Python: busca de conta por número com `put`, `get`, `containsKey`, `remove` e percurso com `entrySet()`. `Set` (`HashSet`) para eliminar duplicatas. Critério de escolha entre `List`, `Map` e `Set` conforme a operação mais frequente (percorrer em ordem, buscar por chave, garantir unicidade).
* Extra-classe: substituir os arrays do projeto pela coleção mais adequada.

## Aula 30 — Projeto Prático: Diagrama de Classes e Estrutura do Código
* Duração: 1h
* Módulos 7 e 8. Ementa: noções de UML (diagramação estrutural); modelagem arquitetural do projeto em UML.
* Conteúdo: Consolidação da notação UML vista ao longo dos módulos: classe, atributos, métodos, visibilidade (`+ - #`), herança, realização de interface, agregação e composição, e multiplicidade. A aluna apresenta e ajusta o diagrama de classes do próprio projeto. Organização em pacotes, criação das classes de modelo (com a classe abstrata e a interface do projeto) e da coleção principal.
* Extra-classe: implementar as classes de modelo conforme o diagrama.

## Aula 31 — Tratamento de Exceções I: Hierarquia e `try/catch/finally`
* Duração: 1h30
* Módulo 6. Ementa: hierarquia de erros e blocos `try/catch/finally`.
* Conteúdo: Ler um *stack trace* a partir de erros provocados de propósito (`NullPointerException`, `ArrayIndexOutOfBoundsException`, `NumberFormatException` ao converter uma entrada do menu com `Integer.parseInt`). Hierarquia `Throwable` → `Error` / `Exception` → `RuntimeException`. Exceções verificadas × não verificadas: o que o compilador obriga a tratar e o que não obriga. `try/catch/finally`, múltiplos `catch` e a ordem do mais específico para o mais genérico. Aplicação: menu do sistema que não encerra com uma entrada inválida.

## Aula 32 — Tratamento de Exceções II: `throw`, `throws` e Exceções Personalizadas
* Duração: 1h
* Módulo 6. Ementa: propagação com `throws`.
* Conteúdo: Lançar exceções com `throw` e declarar a propagação com `throws`. Criar `SaldoInsuficienteException` (verificada, estendendo `Exception`) e substituir o `return false` + `println` de `sacar()` por uma exceção: a regra de negócio passa a ser impossível de ignorar. Propagação até o menu, onde a mensagem é exibida ao usuário. `IllegalArgumentException` para valores inválidos em depósito.
* Extra-classe: aplicar ao menos uma exceção personalizada no projeto.

## Aula 33 — Persistência I: Escrita em Arquivos `.txt`
* Duração: 1h
* Módulo 6. Ementa: escrita de arquivos de texto puro (`.txt`) e gerenciamento de recursos.
* Conteúdo: Por que persistir: os objetos somem quando o programa termina. Formato do arquivo `contas.txt`: uma conta por linha, campos separados por `;`, com o tipo da conta no primeiro campo. Escrita com `BufferedWriter` e `FileWriter` e a `IOException` verificada, ligando com a aula anterior. *try-with-resources* como evolução do `finally`: o recurso implementa a interface `AutoCloseable` e é fechado automaticamente, retomando a discussão do `scanner.close()` do Módulo 1.

## Aula 34 — Persistência II: Leitura e Reconstrução dos Objetos
* Duração: 1h30
* Módulo 6. Ementa: leitura de arquivos de texto puro (`.txt`).
* Conteúdo: Leitura com `BufferedReader` e `readLine()` em laço até `null`. `String.split(";")` e conversão de tipos com `Integer.parseInt` e `Double.parseDouble`. Reconstrução dos objetos conforme o tipo gravado no primeiro campo (`ContaCorrente` ou `ContaEspecial`), devolvendo uma `List<ContaBancaria>`: polimorfismo e classe abstrata trabalhando juntos. Arquivo inexistente na primeira execução (lista vazia) e linha malformada (`NumberFormatException`). Integração no sistema: carregar ao iniciar e salvar ao sair.
* Extra-classe: implementar salvar e carregar no projeto.

## Aula 35 — Testes de Unidade com JUnit
* Duração: 1h30
* Módulo 7. Ementa: testes de unidade com JUnit 5 pelo suporte nativo do VS Code; Maven e `pom.xml` (opcional).
* Conteúdo: Por que testar automaticamente em vez de "rodar o `main` e olhar". Habilitar o JUnit 5 pelo VS Code (Testing → *Enable Java Tests*, sem Maven). Estrutura de um teste: `@Test`, `@BeforeEach` e o padrão preparar, executar e verificar. Testes para as contas: `assertEquals` (com tolerância para `double`) no saldo após depósito e saque, e `assertThrows` para `SaldoInsuficienteException`. Escrita dos primeiros testes do projeto.
* Opcional (se sobrar tempo ou em material de apoio): o que é o Maven e o `pom.xml`, apenas como demonstração.
* Extra-classe: testar as principais regras de negócio do projeto.

## Aula 36 — Projeto Prático: Integração, Code Review e Ensaio
* Duração: 1h30
* Módulo 8. Ementa: desenvolvimento iterativo e revisão de código.
* Conteúdo: Revisão conjunta do código do projeto conforme o checklist da Aula 27 (herança, classe abstrata, interface, coleções, exceções, persistência e testes). Refatorações pontuais: nomes, responsabilidades das classes e mensagens do menu. Preparação da demonstração para a Mostra: um roteiro curto, voltado a pais e visitantes, que mostra o sistema funcionando e explica em linguagem simples o que ele faz.

## Aula 37 — Mostra Pedagógica Final
* Duração: 1h30
* Módulo 8. Ementa: Mostra pedagógica final.
* Conteúdo: Demonstração da versão final do projeto na feira da Mostra pedagógica, para pais e visitantes, e conversa sobre os conceitos de POO consolidados ao longo do semestre.
