# Orientação a Objetos com Java (TC44E)

Este repositório armazena os códigos-fonte, exemplos práticos e exercícios desenvolvidos durante os encontros da disciplina TC44E na escola de programação PROFiA.

Embora o curso esteja registrado institucionalmente como "Estrutura de Dados", o currículo foi integralmente adaptado para focar na transição de paradigma e no aprofundamento em Programação Orientada a Objetos (POO) utilizando a linguagem Java. As aulas possuem duração de 1h30 e ocorrem semanalmente às quartas-feiras.

## Documentação do Curso

Para acompanhamento do progresso, cronograma e diretrizes teóricas, consulte os documentos oficiais do repositório:

* **[Ementa](/EMENTA.md):** Contém a divisão em módulos, desde os fundamentos da JVM até a construção do projeto final.
* **[Registros de Aulas](/REGISTROS_AULAS.md):** Histórico de cada encontro e cronograma replanejado das próximas aulas.

## Estrutura do Repositório

O projeto é um diretório Java não gerenciado (sem Maven/Gradle), focado na compreensão pura da linguagem. O código está organizado **por módulo e conteúdo** dentro de `src/`, seguindo a [Ementa](/EMENTA.md). Cada pasta de módulo é também um pacote Java:

```
src/
├── modulo1_fundamentos/
│   ├── sintaxe/              SintaxeBasica: tipos, Scanner, if/switch, laços
│   └── arrays_e_metodos/     EscopoArraysMetodos: escopo, arrays, métodos, recursão
├── modulo2_encapsulamento/
│   └── personagem/           Personagem: construtor, this, private, getters/setters
├── modulo3_relacionamentos/
│   └── agregacao/            Carro "tem um" Motor: agregação e delegação
└── modulo4_heranca_polimorfismo/
    ├── heranca/              AppHeranca, AppPolimorfismo
    │   └── conta/            ContaBancaria, ContaEspecial (extends, super, @Override)
    └── estatico/             ContaBancaria e AppStatic: atributos e métodos static
```

Os módulos seguintes entram com as próximas aulas: `modulo5_abstracao/`, `modulo6_dados_excecoes_io/` e `modulo7_testes/`.

| Módulo | Pasta | Aulas |
|--------|-------|-------|
| 1. Fundamentos da JVM e Memória | `modulo1_fundamentos/` | 2, 3, 11, 13 |
| 2. Estado e Encapsulamento | `modulo2_encapsulamento/` | 5, 7, 8, 11, 13 |
| 3. Relacionamentos e Modularidade | `modulo3_relacionamentos/` | 8, 9, 14 |
| 4. Herança e Polimorfismo | `modulo4_heranca_polimorfismo/` | 16, 18–21 |
| 5. Contratos e Abstração | `modulo5_abstracao/` | 22–23 |
| 6. Dados, Exceções e Persistência | `modulo6_dados_excecoes_io/` | 24–27 |
| 7. Engenharia e Qualidade | `modulo7_testes/` | 28–29 |

## Objetivo Final

A disciplina culminará na construção de um projeto prático estruturado 100% em Java. O sistema exigirá a aplicação rigorosa de classes abstratas, interfaces, tratamento de exceções e persistência de dados em arquivos de texto, garantindo a consolidação arquitetural da Orientação a Objetos sem a abstração de frameworks externos.

## Referências Bibliográficas Base

O conteúdo teórico e as decisões de design de software deste curso baseiam-se na ementa acadêmica tradicional de Linguagem de Programação II:

* DEITEL, H. M., *Java – Como Programar*. Prentice Hall do Brasil, 2007.
* ECKEL, B., *Thinking in Java*, 4th ed. Prentice Hall, 2006.
