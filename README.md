﻿
# Trabalho Final da Disciplina de Microservices

## Inicializar projeto

```sh
mvn clean install
```

## Executar a aplicação

```sh
mvn spring-boot:run
```

## Dockerizar a aplicação

```sh
./mvnw install dockerfile:build
```

## Executar 2 instancias da aplicação em containers

Aplicações serão exeutadas nas portas 8080 e 9090

```sh
docker run -p 8080:8080 -t springio/trabalho-final
docker run -p 9090:8080 -t springio/trabalho-final
```

## Documentação da API

Acessar o link após subir a aplicação na porta 8080

```url
http://localhost:8080/swagger-ui.html
```

## Statistic API

### Transactions

```sh
curl -X POST \
  http://localhost:8000/transactions \
  -H 'content-type: application/json' \
  -d '{ 
	"timestamp": 1554952675125,
	"amount": 1000.10 
      }' 
```

### Statistics

```sh
curl -X GET \
  http://localhost:8000/statistics \
  -H 'content-type: application/json'
```
