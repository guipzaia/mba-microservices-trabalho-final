
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

## Executar a aplicação dockerizada 

```sh
docker run -p 8000:8000 -t springio/trabalho-final
```

## API

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
