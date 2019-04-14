The application runs using the gradle wrapper in spring boot.

To run:
```
./gradlew bootRun
```

To get a result from the graphql endpoint hit:
```
http://localhost:8080/graphql
```
with:
```
query {
    recentPosts(count: 10, offset: 0) {
        id
        title
        category
    }
}
```