# Microserviço de Usuários (ms-usuario)

Microserviço responsável pelo gerenciamento de usuários no sistema de controle de salas.

## Endpoints da API

### Swagger UI (Documentação Interativa)
- **URL**: http://localhost:9001/swagger-ui.html
- **Características**: Try it out habilitado, filtros, duração de requisições

### Documentação OpenAPI
- **URL**: http://localhost:9001/api-docs
- **Formato**: JSON OpenAPI 3.0


## Banco de Dados

- **Tipo**: MySQL
- **Porta**: 3306
- **Database**: db_usuario
- **Usuário**: admin
- **Senha**: 123

## 🐰 Mensageria (RabbitMQ)

### Portas
- **Aplicação**: 8080 (interno do container)
- **Exposta**: 9001 (host)

## API

1. Acesse o Swagger UI: http://localhost:9001/swagger-ui.html
2. Clique em qualquer endpoint
3. Clique em **"Try it out"**
4. Preencha os dados necessários
5. Clique em **"Execute"**
