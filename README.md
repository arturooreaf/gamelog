# GameLog

A backend REST API to track your video game collection, like a personal [Backloggd](https://backloggd.com).

![Java](https://img.shields.io/badge/Java_21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.5-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit_5-25A162?style=flat-square&logo=junit5&logoColor=white)
![Status](https://img.shields.io/badge/status-in_progress-yellow?style=flat-square)

## Domain model

| Entity | Description |
|---|---|
| **Game** | A video game in the catalog: title, release year and developer |
| **Developer** | The studio behind a game (FromSoftware, Nintendo...) |
| **User** | A player with username, email and password |
| **Playthrough** | A user's record of playing a game: status and hours played |
| **Review** | A user's rating and comment on a game, with publication date |

A playthrough moves through four states: `BACKLOG` → `PLAYING` → `COMPLETED` or `DROPPED`.

`Game` and `Developer` share a common abstract base, `CatalogItem`. Entities validate their own data in the constructor and setters, so an invalid object can't be created.

## API

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/games` | List all games |
| `POST` | `/games` | Add a game to the catalog |

Example request (also in [`test.http`](test.http)):

```http
POST http://localhost:8080/games
Content-Type: application/json

{
  "title": "Elden Ring",
  "releaseYear": 2022
}
```

## Architecture

```
GameController  ──►  GameRepository (interface)  ◄──  InMemoryGameRepository
  @RestController        save · findById               @Repository
                         findAll · delete
```

The controller depends on the `GameRepository` interface, not on a concrete class. Spring injects the implementation through the constructor, so the in-memory storage can be swapped for a database without touching the controller.

## Getting started

Requires **Java 21**. The Maven wrapper is included, so Maven doesn't need to be installed.

```bash
cd gamelog
./mvnw spring-boot:run       # macOS / Linux
mvnw.cmd spring-boot:run     # Windows
```

The API starts at `http://localhost:8080`.

## Project structure

```
gamelog/
├── test.http                     Sample HTTP requests
├── NOTES.MD                      Study notes
└── gamelog/                      Spring Boot project
    ├── pom.xml
    └── src/main/java/com/arturooreaf/gamelog/
        ├── GamelogApplication.java
        ├── GameController.java
        ├── clases/               Domain model and repository
        └── enumerados/           GameStatus
```

## Roadmap

- [x] Domain model with validation
- [x] Repository pattern with an in-memory implementation
- [x] `GET` and `POST` endpoints for games
- [x] Unit tests for the domain classes
- [ ] `GET /games/{id}`, `PUT` and `DELETE` endpoints
- [ ] Persistence with PostgreSQL and Spring Data JPA
- [ ] Run the database with Docker
- [ ] Authentication with JWT and `USER` / `ADMIN` roles
- [ ] Endpoints for playthroughs and reviews
