# Reflection-based POJO->JSON converter

Simple POJO->JSON converter created using reflection and org.json library.
Right now it supports:
- primitive fields
- private fields
- collections
- arrays
Unfortunately, it accepts only primitive type collections, without any nested complex objects.

By running tests you verify my converter's output JSON string vs org.json library-generated result.

## running the project
`mvn compile exec:java` 

## running the tests
`mvn compile test`
