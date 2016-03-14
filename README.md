# Reflection-based POJO->JSON converter

Simple POJO->JSON converter created using reflection and org.json library.
Right now it supports:
- primitive fields
- private fields

By running tests you verify my converter's output JSON string vs org.json library-generated result.

## running the project
`mvn compile exec:java` 

## running the tests
`mvn compile test`
