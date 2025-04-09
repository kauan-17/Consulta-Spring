# 🏥 Sistema de Consultas Médicas

Este é um projeto **backend** desenvolvido em **Java com Spring Boot**, que oferece uma **API RESTful** para o gerenciamento de consultas médicas. O sistema permite o controle de pacientes, secretárias, dentistas, consultas e agendas.

## 🚀 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Web (API REST)  
- Spring Data JPA  
- Hibernate  
- PostgreSQL  
- Swagger/OpenAPI  
- Maven

## 🧩 Arquitetura REST

O sistema foi estruturado como uma **API REST**, com endpoints para:

- `GET`, `POST`, `PUT`, `DELETE` de:
  - Pacientes
  - Secretárias
  - Consultas
  - Agendas

As requisições são mapeadas nos controllers com `@RestController`, utilizando os verbos HTTP apropriados para cada operação.

## 🗂️ Entidades do Sistema

- **Paciente**
  - `id`, `nome`, `cpf`, `usuario`, `senha`

- **Secretária**
  - `id`, `nome`, `cpf`, `rg`

- **Consulta**
  - `id`, `data`, `nomeDentista`, `paciente`, `secretaria`, `agenda`

- **Agenda**
  - `id`, `dataAgendada`

## 📚 Funcionalidades da API

- **Pacientes:** cadastrar, listar, atualizar e excluir
- **Secretárias:** cadastrar, listar, atualizar e excluir
- **Consultas:** agendar, listar, editar e remover
- **Agendas:** registrar e gerenciar datas de agendamentos

## 🔧 Configuração do Banco de Dados

Banco: **PostgreSQL**  
Nome do banco: `consultas_db`

Configuração no `application.properties`:


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
