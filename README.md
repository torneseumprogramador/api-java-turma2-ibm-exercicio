# Está é uma API criada com alunos da turma 2 do treinamento para Gama/IBM
## Para iniciar os testes no código, siga os passos abaixo:

### Pré requisito
- Java SDK
- Maven

### Windows
```shell
choco install openjdk
choco install maven
```

### Mac
```shell
brew install openjdk
brew install maven
```

### Linnux
```shell
sudo apt install openjdk
sudo apt install maven
```

- Criar o banco de dados
```shell
mysql -u root -p'root'

# dentro do maysql rodar:
mysql>create database petshop_api;
mysql>exit;
```
- Rodar a aplicação
```shell
./start.sh
````