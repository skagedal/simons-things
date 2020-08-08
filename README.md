## simons-things

A system to keep track of things.

## Setting up database

* Start the server with `./local-infra/docker-compose up`
* Set up database schema with `./local-infra/drop_local.sh`

## Tech stack

* [Micronaut](https://micronaut.io/) is used for the backend.
* Java 11 is used.  I'd like to use cutting-edge Java for this project (unless I decide to go Kotlin).  However, there was no prepackaged Java 14 on Ubuntu so I went with 11 for now. Might use 15 when it gets released. 
* MySQL 8.0 is used for storage, and Flyway for handling migrations.
* It all runs on a Ubuntu 20.04 instance on Digital Ocean.  