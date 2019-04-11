
# Trabalho Final da Disciplina de Microservices

## Inicializar projeto

```sh
mvn clean install & mvn spring-boot:run
```

## API

### Transactions

```sh
curl -X POST \
  http://localhost:8080/transactions \
  -H 'content-type: application/json' \
  -d '{ 
	"timestamp": 1554952675125,
	"amount": 1000.10 
      }' 
```

### Statistics

```sh
curl -X GET \
  http://localhost:8080/statistics \
  -H 'content-type: application/json'
```
