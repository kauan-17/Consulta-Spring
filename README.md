# 🦷 Sistema de Gerenciamento de Consultas Médicas

Este é um sistema simples de gerenciamento de consultas médicas, desenvolvido em **Java** com **Spring Boot** e **Hibernate**, utilizando **PostgreSQL** como banco de dados. O objetivo é permitir o controle de pacientes, secretárias, consultas e agenda.

---

## 🚀 Funcionalidades

- 📋 Cadastro, listagem, atualização e exclusão de:
  - Pacientes
  - Secretárias
  - Consultas
  - Agendas
- 🔍 Busca de dados relacionados (ex: listar todas as consultas de um paciente)
- 🧠 Relacionamentos com JPA entre entidades (Ex: Consulta ↔ Agenda)
- 🧪 Testes de requisições via Swagger UI

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Hibernate / JPA
- PostgreSQL
- Maven
- Swagger (OpenAPI)

---

## 🏗️ Estrutura do Projeto

```bash
src/
├── controller/       # Controllers REST
├── model/            # Entidades JPA
├── repository/       # Interfaces de acesso ao banco (JPA Repositories)
├── service/          # Regras de negócio (opcional)
└── DemoApplication.java
