# GameLog

A backend REST API to track your video game collection — like a personal Backloggd.

## Domain model

- **User** — a player (with USER or ADMIN role)
- **Developer** — the studio that makes a game (FromSoftware, Nintendo...)
- **Game** — a video game in the catalog (title, release year, developer)
- **Playthrough** — a user's record of playing a game (status, hours, dates)
- **Review** — a user's review and rating of a game they've played

## Tech stack

Java 21 · Spring Boot 3 · PostgreSQL · Docker · JWT




