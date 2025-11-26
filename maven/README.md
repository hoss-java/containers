# Maven

A Maven docker container based on Alpine.

## Updates
* Update Alpine to 3.20
* Update openjdk to 21
* Updated with an entrypoint

## How to use

Build an image

```bash
docker build -t maven_image .
# or for arm/v7
docker build --platform linux/arm/v7 -t maven_image .
```

Run a Maven instance:

```bash
docker compose up -d
docker compose down --rmi local
#docker compose down --remove-orphans --rmi local -v
# or
#docker compose -f docker-compose.yml up -d
#docker compose f docker-compose.yml down --rmi local
#docker compose f docker-compose.yml down --remove-orphans --rmi local

#docker system prune -a

docker exec -it maven sh
```
