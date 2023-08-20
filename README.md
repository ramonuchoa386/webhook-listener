# Aplicação de Broker de Notificações

![Java Badge](https://img.shields.io/badge/Java-11%2B-blue)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-2.5.x-brightgreen)
![RabbitMQ Badge](https://img.shields.io/badge/RabbitMQ-3.9.x-orange)

A Aplicação de Broker de Notificações é uma aplicação Spring Boot que atua como intermediária para receber notificações de uma empresa e encaminhá-las para uma fila do RabbitMQ para serem processadas por outros sistemas dentro da empresa.

## Recursos

- Recebe notificações no formato JSON e as encaminha para uma fila do RabbitMQ.
- Utiliza o RabbitMQ para processar notificações de forma assíncrona, possibilitando um fluxo de trabalho escalável.

## Pré-requisitos

Certifique-se de ter instalado:

- Java 11 ou superior
- RabbitMQ 3.9.x

## Configuração

1. Clone este repositório para o seu ambiente local.
2. Configure as propriedades do RabbitMQ no arquivo `application.properties`.

## Como Usar

1. Inicie a aplicação Spring Boot.
2. Envie notificações no formato JSON para o endpoint `/listener`.
3. As notificações serão processadas de forma assíncrona e encaminhadas para a fila do RabbitMQ.

## Exemplo de Uso

```http
POST /listener
Content-Type: application/json

{
    "notification": {
        // Notification structure
    }
}
```

## Contribuição

Contribuições são bem-vindas! Se você encontrou um bug ou tem melhorias para sugerir, por favor abra uma [issue](https://github.com/ramonuchoa386/webhook-listener/issues) ou envie um pull request.

## Licença

Copyright [2023] [Ramon Pinho]

Permissão é concedida, gratuitamente, a qualquer pessoa que obtenha uma cópia deste software e dos arquivos de documentação associados (o "Software"), para negociar no Software sem restrições, incluindo, sem limitação, os direitos de usar, copiar, modificar, mesclar, publicar, distribuir, sublicenciar e/ou vender cópias do Software, e permitir que as pessoas a quem o Software seja fornecido o façam, sob as seguintes condições:

O aviso de direitos autorais acima e este aviso de permissão devem ser incluídos em todas as cópias ou partes substanciais do Software.

O SOFTWARE É FORNECIDO "COMO ESTÁ", SEM GARANTIA DE QUALQUER TIPO, EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO, ADEQUAÇÃO A UM DETERMINADO PROPÓSITO E NÃO VIOLAÇÃO. EM NENHUM CASO OS AUTORES OU DETENTORES DE DIREITOS AUTORAIS SERÃO RESPONSÁVEIS POR QUALQUER RECLAMAÇÃO, DANOS OU OUTRAS RESPONSABILIDADES, QUER EM AÇÃO DE CONTRATO, DELITO OU DE OUTRA FORMA, DECORRENTES DE, OU EM CONEXÃO COM O SOFTWARE OU O USO OU OUTRAS NEGOCIAÇÕES NO PROGRAMAS.
