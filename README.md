# The Band - a Mockito kata

## Background
Back in the 80's everyone asked the question. What would you use a personal computer for, except playing games?
The answer was - keep a register of your record collection!

It's back for the benefit of practicing Mockito.

## The domain
In this domain there are **Albums**, **Artists**, **Bands** and **Song** recordings.

A song recording appears on an album. An artist has contributed to zero or more 
song recordings. Artists has sometimes been members of bands that has
produced albums.

How the domain model works in details are up to you. 
There is no right or wrong answer, we are here to
explore mocking.

## Architecture

It is a micro service, based on Spring Boot.
Built with Maven and the pom includes some additions to 
what is included with Spring starter. 

### Flyway
Flyway maintains a database schema for you by reading the files in
src/main/resources/db/migration. When you need to change something
in the schema, add a file and standing with the naming convention of capital
V, number and two underlines.

### Postgresql
The database is assumed to be Postgresql, running on your localhost. Now, nobody
wants to install a database on their development machine so use this docker command
instead:

`docker run --name pgdatabase -e POSTGRES_PASSWORD=mysecret -d -p 5432:5432 postgres
`

Docker can be found here: https://docs.docker.com/docker-for-mac/install/

### Sonarqube
Test coverage with JaCoCo is also there. If you run SonarQube using docker, 
you can have your code analyzed.

`docker run -d --name sonarqube -p 9000:9000 sonarqube`

## What to explore

Mocking is about isolating units so that you can test them in isolation. When you look at the code, you'll see
that some code is just stubs. They may return an empty collection, no matter of what the input is.
Still, we can test the clients that use that code by using mocks. A service may depend on another service
that is not done yet. No problem, we just put in a mock and explore how the interaction between the services
should be.

E.g. AlbumService depends on both the AlbumRepository and the SongService. But neither needs any implementation
to test AlbumService. We just inject mocks. 

### Mockito when
The `when` is used to serve a canned answer when a method on a mock is called. It can also be used to throw an
exception. 