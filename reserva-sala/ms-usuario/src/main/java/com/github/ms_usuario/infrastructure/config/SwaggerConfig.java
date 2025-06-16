package com.github.ms_usuario.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI userServiceOpenAPI() {
        Server server1 = new Server();
        server1.setUrl("http://localhost:9001");
        server1.setDescription("Servidor Direto - Microserviço Usuario");

        Server server2 = new Server();
        server2.setUrl("http://localhost:8080");
        server2.setDescription("Servidor via Nginx Gateway");

        Server server3 = new Server();
        server3.setUrl("http://localhost/api");
        server3.setDescription("Servidor de Produção via Gateway");

        Contact contact = new Contact()
                .email("admin@controlesa.com")
                .name("Equipe de Desenvolvimento")
                .url("https://github.com/LuizPagliari/controle-sala");

        License license = new License()
                .name("MIT License")
                .url("https://opensource.org/licenses/MIT");

        Info info = new Info()
                .title("API de Usuários - Sistema de Controle de Salas")
                .version("1.0.0")
                .contact(contact)
                .description(" API REST para gerenciamento de usuários no sistema de controle de salas.\n\n" +
                           "### Funcionalidades:\n" +
                           "- Cadastro de usuários com validação de CPF\n" +
                           "- Validação de email único\n" +
                           "- Busca por CPF\n" +
                           "- Listagem de usuários\n" +
                           "- Comunicação assíncrona via RabbitMQ\n\n" +
                           "### Como usar:\n" +
                           "1. Clique em qualquer endpoint abaixo\n" +
                           "2. Clique em **'Try it out'**\n" +
                           "3. Preencha os dados necessários\n" +
                           "4. Clique em **'Execute'**\n\n" +
                           "### Exemplo de CPF válido: `12345678901`")
                .termsOfService("http://swagger.io/terms/")
                .license(license);

        return new OpenAPI()
                .info(info)
                .servers(List.of(server1, server2, server3));
    }
}
