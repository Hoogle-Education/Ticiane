# Programação Funcional / Lambda

```java
List<Obj> list;

list.()
```

## Predicate<T> (return boolean)

Pode ser lido como "tal que"

```java
list.stream().filter(x -> x.value == 2).[...]
```

## Action<T> (return void)

```java
list.stream().map(x -> x+2).[...]
list.forEach(System.out::println)
```

## Function<T, R> (return R) 

+ (override in T)'

```java
list.stream().map( altura, peso -> peso/(altura*altura) )
```