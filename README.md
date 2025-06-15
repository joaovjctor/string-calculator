# 🧮 String Calculator em Java usando TDD

Este repositório apresenta uma implementação do desafio **String Calculator Kata**, desenvolvido com **Java** e testes escritos em **JUnit 5** utilizando a abordagem de **TDD (Test-Driven Development)**.

O projeto faz parte do estágio supervisionado pelo programa **LabTech (UDF)**, orientado pelo professor **Danrley Pereira**, com foco em práticas de **Software Craftsmanship**, como TDD, SOLID e Pair Programming.

---

## 📌 Descrição do Desafio

A proposta do String Calculator é simples, mas evolutiva: implementar uma função `add(String numbers)` capaz de somar números passados em uma `String` conforme as regras abaixo.

### ✅ Regras Implementadas

| Etapa | Regra                                                                 | Exemplo de Entrada           | Saída Esperada |
|-------|------------------------------------------------------------------------|-------------------------------|----------------|
| 1     | Uma string vazia retorna `0`                                           | `""`                          | `0`            |
| 2     | Um único número retorna seu valor                                      | `"1"`                         | `1`            |
| 3     | Dois números separados por vírgula são somados                         | `"1,2"`                       | `3`            |
| 4     | Múltiplos números separados por vírgula ou `\n` são somados            | `"1\n2,3"`                    | `6`            |
| 5     | Delimitadores customizados são suportados                              | `"//;\n1;2"`                  | `3`            |
| 6     | Números negativos lançam uma exceção                                   | `"-1,2"`                      | Erro           |
| 7     | Números maiores que 1000 são ignorados                                 | `"2,1001"`                    | `2`            |

---

## 💡 Principais Conceitos Aplicados

- **TDD (Test-Driven Development)**: todos os comportamentos foram construídos a partir de testes escritos antes da implementação.
- **Refatoração incremental**: o código foi refatorado continuamente após os testes passarem.
- **Exceções e Validação**: tratamento explícito para cenários inválidos (números negativos).
- **Parsers com Regex**: manipulação e divisão de strings com delimitadores simples e customizados.

---

## 🧪 Como Rodar os Testes

### 1. ✅ Pré-requisitos

- **Java 11+**
- **Maven** ou qualquer build system com suporte a JUnit 5
- IDE compatível (IntelliJ IDEA, Eclipse etc.)

### 2. ▶️ Rodando os testes
Via IDE, clique com o botão direito nos arquivos de teste e escolha “Run Tests”.

### 3. 🧪 Testes Criados

- testEmptyStringReturnsZero() – verifica retorno 0 para string vazia.

- testSingleNumber() – verifica retorno de um único número.

- testTwoNumbers() – soma de dois números simples.

- testMultipleNumbers() – soma de lista maior de números.

- testNewlineAsDelimiter() – mistura vírgula e quebra de linha.

- testCustomDelimiter() – delimitador definido pelo usuário.

- testNegativeNumberThrowsException() – lança exceção para valores negativos.

- testIgnoreNumbersAbove1000() – ignora números maiores que 1000.

---
Desenvolvido por João Victor durante o estágio supervisionado do programa LabTech – UDF.