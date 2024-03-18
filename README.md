# Backend Spring Boot




## Executar 

A aplicação estará disponível em http://localhost:8080

## Banco de dados

PostgreSQL

### Configuração

O JwtAuthFitler é necessário para ler o JWT dos cabeçalhos HTTP.

O PasswordConfig é para codificar e decodificar as senhas, para evitar ter as senhas em texto simples.

O SecurityConfig contém a configuração do Spring Security 6, com as rotas protegidas, manipulador de exceções e os filtros HTTP.

O UserAuthenticationEntryPoint gerencia as exceções.

O UserAuthenticationProvider gerencia a autenticação, criando o JWT ou validando-o.

O UsernamePasswordAuthFilter é o filtro que lê as informações de nome de usuário e senha.

O WebConfig contém a configuração do CORS.

### Controladores

Aqui estão os dois controladores disponíveis. Um para autenticação e registro. E o outro para acessar os recursos protegidos.

### DTOs

Aqui serão colocados os Objetos de Transferência de Dados. Objetos que serão retornados para o frontend em vez das entidades do banco de dados.

### Entidades

Os objetos presentes aqui são aqueles que refletem a estrutura do banco de dados.

### Exceções

Aqui estão as exceções personalizadas.

### Mapeadores

Os mapeadores do Mapstruct estão presentes neste pacote.

### Repositórios

Os repositórios do Spring JPA estão presentes neste pacote.

### Serviços

Dois serviços estão disponíveis neste pacote. Um para autenticar um usuário, para verificar as credenciais.

E o outro serviço é para registrar um novo usuário.

## Autenticação

A autenticação é tratada com um JWT.

A aplicação é stateless. Isso significa que nenhuma sessão é gerenciada pelo Spring, nenhum dado é armazenado na sessão.

Cada solicitação para recursos protegidos deve conter um JWT no cabeçalho de Autorização para ser aceita.

Apenas duas solicitações não precisam do JWT, o login e o registro. Mas ambos gerarão um JWT após a conclusão da ação corretamente.

www.linkedin.com/in/daniel-cgc
