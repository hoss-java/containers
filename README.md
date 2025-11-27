# Docker composer files

**Deck board** -> https://github.com/hoss-java/containers/blob/main/DECK.md

## How to use

To build a compose file:

```bash
docker compose -f <compose-file-name> up -d
# In the case using .env file with a different name
docker compose --env-file "<env-file-name>" -f <compose-file-name> up -d
```

To stop and removing all file create by a compose up (included images)

```bash
docker compose -f <compose-file-name> down --rmi local
# In the case using .env file with a different name
docker compose --env-file "<env-file-name>" -f <compose-file-name> down --rmi local -v
# Or
docker compose --env-file "<env-file-name>" -f <compose-file-name> down --remove-orphans --rmi local -v

#docker system prune -a
```

## Available compose files
### openjdk
Create a openjdk by running a container, openjdk, and creating a network named `javanetwork`

```bash
docker compose --env-file ".env.openjdk" -f docker-compose-openjdk.yaml up -d
docker compose --env-file ".env.openjdk" -f docker-compose-openjdk.yaml down --rmi local -v
#docker compose --env-file ".env.openjdk" -f docker-compose-openjdk.yaml down --remove-orphans --rmi local -v
```

### openjdk+msven
Create a openjdk and maven by running 1 container, maven, and creating a network named `jabanetwork`

```bash
docker compose --env-file ".env.maven" -f docker-compose-maven.yaml up -d
docker compose --env-file ".env.maven" -f docker-compose-maven.yaml down --rmi local -v
#docker compose --env-file ".env.maven" -f docker-compose-maven.yaml down --remove-orphans --rmi local -v
```


### tomcat
Create a tomcat by running 1 container, tomcat, and creating a network named `tcnetwork`

```bash
docker compose --env-file ".env.tomcat" -f docker-compose-tomcat.yaml up -d
docker compose --env-file ".env.tomcat" -f docker-compose-tomcat.yaml down --rmi local -v
#docker compose --env-file ".env.tomcat" -f docker-compose-tomcat.yaml down --remove-orphans --rmi local -v
```

