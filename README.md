# Calculadora de Custos – API (Java / Spring Boot)

API desenvolvida para calcular custos reais de **funcionários próprios** e **armazenagem/estoque próprio**.  
O objetivo é permitir que gestores visualizem custos ocultos e comparem com alternativas de terceirização (ex.: Grupo Gestock).

---

## Funcionalidades

### Calculadora de Funcionário
Retorna:

- Custo mensal total do funcionário  
- Custo por hora  
- Percentual real acima do salário  
- Quebra de custos:
  - Salário
  - Benefícios
  - Encargos
  - Custos indiretos

### Calculadora de Estoque
Retorna:

- Custo mensal total de armazenagem  
- Custo por peça/pallet  
- Quebra:
  - Estrutura física
  - Mão de obra
  - Equipamentos e sistemas
  - Energia
  - Capital empatado
  - Perdas/avarias

---

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Spring Web**
- API estilo REST

---

## Como Rodar Localmente

### 1. Clone o repositório:

```bash
git clone https://github.com/BernardoZacharias/calculadora-custos.git
```

### 2. Entre no diretório:

```bash
cd calculadora-custos
```

### 3. Execute a aplicação:

#### 🔸 No Windows:
```bash
mvnw.cmd spring-boot:run
```

#### 🔸 No Linux/Mac:
```bash
./mvnw spring-boot:run
```

### 4. A API será iniciada em:

```
http://localhost:8080
```

---

# Endpoints da API

## 1️**POST /api/calculadora/funcionario**

### Request Body (exemplo):

```json
{
  "salarioBruto": 2500,
  "vrDia": 25,
  "diasTrabalhoMes": 22,
  "vtMensal": 350,
  "outrosBeneficiosMensais": 150,
  "horasPorDia": 8,
  "diasPorSemana": 5,
  "regime": "CLT_EMPRESA_PADRAO",
  "outrosCustosIndiretos": 100
}
```

### Response (exemplo):

```json
{
  "beneficios": 1050,
  "custoMensal": 5650,
  "custoPorHora": 31.38,
  "custosIndiretos": 100,
  "encargos": 2000,
  "percentualAcimaSalario": 125.99,
  "salario": 2500
}
```

---

## 2️**POST /api/calculadora/estoque**

### Request Body (exemplo):

```json
{
  "areaTotalM2": 500,
  "custoAreaMensal": 20000,
  "quantidadePecas": 1000,
  "custoPessoalMensal": 15000,
  "custoEquipamentosMensal": 3000,
  "custoEnergiaMensal": 2500,
  "custoSistemasMensal": 1200,
  "valorMedioPeca": 200,
  "taxaCustoCapital": 0.01,
  "percentualPerdas": 0.02
}
```

### Response (exemplo):

```json
{
  "custoTotalPorPeca": 53.4,
  "custoEstrutura": 20,
  "custoPessoal": 15,
  "custoOutros": 6.7,
  "custoCapital": 2,
  "custoPerdas": 4.7,
  "custoTotalMensal": 53400
}
```

---

# Testes no Postman

Cole os JSONs acima no **Body → Raw → JSON** e envie para:

```
http://localhost:8080/api/calculadora/funcionario
http://localhost:8080/api/calculadora/estoque
```

---

# Estrutura do Projeto

```
src/
 └── main/
     └── java/com/gestock/calculadora_custos
         ├── controller
         ├── dto
         ├── service
         └── CalculadoraCustosApplication.java
```

---

# Contribuição

Sinta-se à vontade para abrir **issues** ou enviar **pull requests**.

---

# Licença

Projeto de uso interno.  
Uso comercial deve ser autorizado pelo autor.

---

# Autor

**Bernardo Zacharias**  
📧 bernardozacha@gmail.com  
🔗 GitHub: https://github.com/BernardoZacharias
