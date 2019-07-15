# Microservices

This project backend for user request to view his/her accounts and transactions in them. This is a microservices project, with User microserivce making calls to Account and then Transaction service to fetch user data. Written using Java, Spring JPA and boot

## Installation

There are 3 microservices, each with spring boot, pull the change and 
start the following services

`java -jar account/target/Account-0.0.1-SNAPSHOT.jar --server.port=8082`

`java -jar account/target/transaction-0.0.1-SNAPSHOT.jar --server.port=8081`

`java -jar account/target/client-0.0.1-SNAPSHOT.jar --server.port=8088`


## Usage


User Accounts
`http://localhost:8088/accounts/1`

Account Transactions 
`http://localhost:8088/transactions/123-2223-212`

