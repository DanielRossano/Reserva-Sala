# Sistema de Controle de Salas - Microserviços

Sistema distribuído para controle e reserva de salas desenvolvido com arquitetura de microserviços usando Spring Boot, Docker e RabbitMQ.

## Como Executar

```bash
# Clone o repositório
git clone https://github.com/DanielRossano/Reserva-Sala.git
cd controle-sala

# Execute o ambiente completo
docker-compose up --build

# Ou execute em background
docker-compose up --build -d
```

## Pré-requisitos

- Docker
- Docker Compose
- Git

## Acessos do Sistema

### Interfaces Web
- **API Gateway (Nginx)**: http://localhost:8080
- **Adminer (DB Admin)**: http://localhost:8081
  - **Usuário**: admin | **Senha**: 123
- **RabbitMQ Management**: http://localhost:15672
  - **Usuário**: admin | **Senha**: admin123

### APIs Diretas dos Microserviços
- **ms-usuario**: http://localhost:9001/usuarios
- **ms-sala**: http://localhost:9002/salas  
- **ms-reserva**: http://localhost:9003/reservas

### APIs via Gateway (Nginx)
- **Usuários**: http://localhost:8080/api/usuarios
- **Salas**: http://localhost:8080/api/salas
- **Reservas**: http://localhost:8080/api/reservas

## 📖 Swagger - Documentação Interativa da API

### 🎯 **Como usar o Swagger "Try it out"**

1. **Acesse o Swagger UI** de qualquer microserviço (URLs abaixo)
2. **Selecione um endpoint** clicando sobre ele
3. **Clique em "Try it out"** (botão azul no canto superior direito)
4. **Preencha os parâmetros** necessários nos campos que aparecerão
5. **Clique em "Execute"** para testar a API em tempo real
6. **Veja a resposta** com código HTTP, dados retornados e tempo de execução

### 🔗 URLs do Swagger UI (com Try it out habilitado)
- **ms-usuario**: http://localhost:9001/swagger-ui.html
  - Gerenciamento de usuários e validação de CPF
- **ms-sala**: http://localhost:9002/swagger-ui.html
  - Gerenciamento de salas e disponibilidade
- **ms-reserva**: http://localhost:9003/swagger-ui.html
  - Sistema de reservas e agendamentos

### 📄 Documentação OpenAPI JSON
- **ms-usuario**: http://localhost:9001/api-docs
- **ms-sala**: http://localhost:9002/api-docs  
- **ms-reserva**: http://localhost:9003/api-docs

###  Recursos Habilitados no Swagger
- **Try it out** - Teste as APIs diretamente no navegador
- **Filtros de endpoints** - Busque rapidamente por operações
- **Ordenação automática** - Endpoints e tags organizados alfabeticamente
- **Tempo de resposta** - Visualize a duração das requisições
- **Expansão de modelos** - Veja detalhes dos objetos JSON
- **Múltiplos servidores** - Teste via gateway ou diretamente

## Bancos de Dados

- **MySQL Usuario**: localhost:3306 
- **MySQL Sala**: localhost:3307 
- **MySQL Reserva**: localhost:3308 

## Arquitetura

- **ms-usuario**: Gerenciamento de usuários e validação de CPF
- **ms-sala**: Gerenciamento de salas e disponibilidade
- **ms-reserva**: Sistema de reservas e agendamentos
- **nginx**: Gateway e proxy reverso
- **rabbitmq**: Mensageria assíncrona entre microserviços
- **mysql**: Banco de dados para cada microserviço
