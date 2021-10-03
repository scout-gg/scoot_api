# Scoot GG Api
REST API exposing Age of Empire 2 Definitive Edition data for scoot.gg

⚠️ This is still a work in progress, breaking changes and bugs will happen.

## Using the API

A development version is available at https://scoot-gg.cleverapps.io.
You can browse the [swagger-ui](https://scoot-gg.cleverapps.io/docs) get familiar with the available endpoints.

> **_NOTE:_** some endpoints expose a huge amount of data and swagger-ui will sometimes 
take a while to render the json response. 
For better performance use an HTTP client such as curl, insomnia or postman.

## Running the application locally

**Prerequisites** :  
- java 17
- a postgresql instance
- a steam installation of Age of Empire 2 Definitive Edition
- follow the [scoot database exporter readme](https://github.com/scout-gg/scoot_database) to populate your db.
- You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.


## Licence

All the code in this repository is released under the MIT License, for more information take a look at the LICENSE file.

## Microsoft Game Content Usage Rules

Age of Empires II © Microsoft Corporation. Scoot-gg-Api was created under Microsoft's "Game Content Usage Rules" using assets
from Age of Empires II, and it is not endorsed by or affiliated with Microsoft.