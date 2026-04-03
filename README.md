# 🧮 Trabalho de Back-End

Este projeto faz parte do Trabalho 02 da disciplina de Back-End.  
A **Primeira Questão** consiste em criar um serviço REST capaz de validar um CPF enviado pelo usuário.
A **Segunda Questão** consiste em criar um serviço REST capaz de calcular o Índice de massa corporal de uma pessoa.

---

## 🚀 Tecnologias utilizadas
- Java 17+
- Spring Boot
- Postman (para testes)
- Maven

---

## 📁 Estrutura do projeto

- `Trabalho02Application.java` → Classe principal do Spring Boot
- `CpfController.java` → Controller responsável por validar o CPF
- `imcController.java` → Controller responsável por calcular o IMC
- `imcRequest.java` → Classe que representa os dados enviados pelo usuário (peso e altura) para o cálculo do IMC

---

## 📌 Endpoint da Primeira Questão

### **POST /primeiraquestao/cpf**

Este endpoint recebe um CPF no corpo da requisição e retorna se ele é válido ou inválido.

---

## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/primeiraquestao/cpf
4. Vá em **Body → raw → JSON**.
5. Envie o CPF como **string**:
```
json
"12345678909"
```
6. Clique em Send.

## 📌 Endpoint da Segunda Questão

### **POST /segundaquestao/imc**

Este endpoint recebe dois dados, o peso e a altura, e retornam o cálculo do IMC.

---

## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/segundaquestao/imc
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
```
{
    "peso": 80,
    "altura": 1.8
}
```
6. Clique em Send.
