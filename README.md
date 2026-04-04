# 🧮 Trabalho de Back-End
---
#### Este projeto faz parte do Trabalho 02 da disciplina de Back-End.    
- A **Primeira Questão** consiste em criar um serviço REST capaz de validar um CPF enviado pelo usuário.  
- A **Segunda Questão** consiste em criar um serviço REST capaz de calcular o Índice de massa corporal de uma pessoa.  
- A **Terceita Questão** calcula a distância entre dois pontos em um plano cartesiano utilizando o serviço REST.  
- A **Quarta Questão** consiste em criar um serviço REST que recebe os três lados de um triângulo e retorna o seu perímetro.   
- A **Quinta Questão** Recebe os valores dos lados de um triângulo e retorna qual o tipo do triângulo (Escaleno, Isósceles, Equilátero).  
- A **Sexta Questão** é mais complicada, ela retorna o valor de um carro de acordo com itens específicos como se o carro é importado ou se possui ar-condicionado por exemplo, sendo um serviço REST, como o foco desse trabalho em específico.  
- A **Sétima Questão** possui um serviço REST que envolve um armazenamento na memória do próprio computador, com um sistema CRUD.

---

## 🚀 Tecnologias utilizadas
- Java 17+
- Spring Boot
- Postman (para testes)
- Maven

---

## 📁 Estrutura do projeto

- `Trabalho02Application.java` → Classe principal do Spring Boot.
- `CpfController.java` → Controller responsável por validar o CPF.
- `imcController.java` → Controller responsável por calcular o IMC.
- `imcRequest.java` → Classe que representa os dados enviados pelo usuário (peso e altura) para o cálculo do IMC.
- `CartesianController.java` → Controller responsável por calcular a distância entre dois pontos.
- `CartesianRequest.java` → Classe que representa os pontos no plano cartesiano.
- `PerimeterController` → Controller responsável por calcular o perímetro do triângulo.
- `PerimeterRequest` → Classe que agrupa os valores dos lados para enviar para o PerimeterController. 
- `TriangleController` → Controller que classifica o tipo do triângulo de acordo com os valores dados de seus lados.
- `TriangleRequest` → Classe que recebe os valores dos lados do triângulo e retorna o seu "tipo" (Escaleno, Isósceles, Equilátero).
- `CarController` → Controller responsável por calcular o valor do carro de acordo com itens e características do carro.
- `CarRequest` → Classe que organiza os atributos de carro para o controller CarController.
- `Funcionario` → Classe com todos os atributos de Funcionário, importante para calcular valor do salário.
- `FuncionarioList` → Classe simples para retornar uma lista com todos os funcionários.
- `FuncionarioController` → Controller que executa funções como adicionar, verificar e deletar um funcionário, além de calcular o salário de um funcionário de acordo com os benefécios.


---

## 📌 Endpoint da Primeira Questão

### **POST /primeiraquestao/cpf**

Este endpoint recebe um CPF no corpo da requisição e retorna se ele é válido ou inválido.


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

---

## 📌 Endpoint da Segunda Questão

### **POST /segundaquestao/imc**

Este endpoint recebe dois dados, o peso e a altura, e retornam o cálculo do IMC.


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

---

## 📌 Endpoint da Terceira Questão

### **POST /terceiraquestao/cartesian**

Este endpoint recebe quatro dados, sendo eles coordenadas para localizar e calcular a distância dos pontos no plano cartesiano.  
Usamos a Fórmula:   
$$\text{distância = }\sqrt{(x_2-x_1)^2 + (y_2-y_1)^2}$$


## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/terceiraquestao/cartesian
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
```
{
    "x1": 1,
    "y1": 3,
    "x2": 7,
    "y2": 2
}
```
6. Clique em Send.

---

## 📌 Endpoint da Quarta Questão

### **POST /quartaquestao/perimeter**

Este endpoint recebe três dados, sendo eles referentes aos lados do triângulo.  
Com isso é calculado o perímetro de um triângulo com uma soma simples dos três lados.


## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/quartaquestao/perimeter
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
```
{
    "lado1":  5,
    "lado2": 7,
    "lado3": 6
}
```
6. Clique em Send.

---

## 📌 Endpoint da Quinta Questão

### **POST /quintaquestao/triangle**

Este endpoint recebe três dados, sendo eles referentes aos lados do triângulo.  
Com isso é calculado o tipo do triângulo com uma comparação de igualdades.


## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/quintaquestao/triangle
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
```
{
    "lado1":  5,
    "lado2": 7,
    "lado3": 6
}
```
6. Clique em Send.

---

## 📌 Endpoint da Sexta Questão

### **POST /sextaquestao/car**

Este endpoint recebe diversos dados, sendo eles referentes as características do carro.  
Com isso é calculado o valor do carro de acordo com os acessórios.



## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/sextaquestao/car
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
```
{
  "precoBase": 50000,
  "motor": 1.0,
  "importado": true,
  "ar": true,
  "cambioAutomatico": false,
  "alarme": true,
  "pinturaEspecial": false,
  "tetoSolar": false,
  "kitMultimidia": true
}
```
6. Clique em Send.

---

## 📌 Endpoints da Sétima Questão

### **POST /setimaquestao/funcionarios**

Este endpoint recebe diversos dados, algumas características de um funcionário, e **cadastra**.

```
{
  "id": 1,
  "nome": "Daves",
  "salarioBruto": 300000,
  "valeTransporte": true,
  "trabalhaNoite": true,
  "quantidadeFilhos": 1
}
```

### **GET /setimaquestao/funcionarios**

Este endpoint apenas verifica a lista de funcionários, é retornado então uma lista em json com os funcionários. 

### **GET /setimaquestao/total-pago**

Assim como o endpoint acima, por se tratar de uma requisição do método GET, apenas é requisitado e retornado o valor total que a Empresa paga em salários.

### **GET /setimaquestao/funcionarios/1**

Esse endpoint também se trata de uma verificação, na qual é passada o índice do funáriorio e é retornada apenas esse funcionário em específico.

### **DELETE /setimaquestao/funcionarios/1**

Para finalizar o CRUD, esse endpoint deleta o funcionário especifico passado o índice na url.

## 📥 Como enviar a requisição no Postman

1. Abra o **Postman Desktop** (não funciona no Postman Web para localhost).
2. Selecione o método **POST**.
3. Use a URL: http://localhost:8080/setimaquestao/funcionarios
4. Vá em **Body → raw → JSON**.
5. Envie os dados como **string**:
6. Clique em Send.

---
