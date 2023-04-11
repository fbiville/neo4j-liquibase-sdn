# Liquibase & Spring Data Neo4j

 1. start a local Neo4j instance:
```shell
docker run --rm \
    --env NEO4J_AUTH='neo4j/letmein!' \
    --env NEO4J_ACCEPT_LICENSE_AGREEMENT=yes \
    --publish=7687:7687 \
    --health-cmd "cypher-shell -u neo4j -p 'letmein!' 'RETURN 1'" \
    --health-interval 5s \
    --health-timeout 5s \
    --health-retries 5 \
    neo4j:5.6-enterprise
```
 2. run the CLI app by just running `mvn --quiet` or `./mvnw --quiet`
