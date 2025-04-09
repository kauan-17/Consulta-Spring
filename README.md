# 🏥 Sistema de Consultas Médicas

Este é um projeto backend desenvolvido em **Java com Spring Boot** para o gerenciamento de consultas médicas. O sistema controla pacientes, secretárias, dentistas, consultas e agendas.

## 🚀 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- PostgreSQL  
- Swagger/OpenAPI  
- Maven

## 🗂️ Entidades do Sistema

- **Paciente**
  - `id` (Long)
  - `nome` (String)
  - `cpf` (String)
  - `usuario` (String)
  - `senha` (String)

- **Secretária**
  - `id` (Long)
  - `nome` (String)
  - `cpf` (String)
  - `rg` (int)

- **Consulta**
  - `id` (Long)
  - `data` (String ou Date)
  - `nomeDentista` (String)
  - `paciente` (Relacionamento)
  - `secretaria` (Relacionamento)
  - `agenda` (Relacionamento)

- **Agenda**
  - `id` (Long)
  - `dataAgendada` (LocalDate)

## 📚 Funcionalidades Implementadas

- Cadastro, listagem, atualização e exclusão de:
  - Pacientes
  - Secretárias
  - Consultas
  - Agendas

- Integração entre entidades via relacionamentos JPA

- Documentação da API gerada automaticamente via Swagger

## 🔧 Configuração do Banco de Dados

Banco: **PostgreSQL**  
Nome do banco: `consultas_db`

As configurações estão no arquivo `application.properties`:

📁 Estrutura de Diretórios
bash
Copiar
Editar
src/
├── main/
│   ├── java/
│   │   └── consulta/com/example/demo/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
