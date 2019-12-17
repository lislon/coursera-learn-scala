# Coursework on coursera

## Functional Programming Principles in Scala

https://www.coursera.org/learn/progfun1/home/welcome

## Functional Program Design in Scala

https://www.coursera.org/learn/progfun2/home/welcome

## Big Data Analysis with Scala and Spark!

https://www.coursera.org/learn/scala-spark-big-data/



# Installation

## Java
This course requires java 8 (openjdk)

## SBT
This course requires sbt version >0.13.x
http://www.scala-sbt.org/release/docs/Setup.html

## Usage:
```
sbt console
sbt compile
sbt run
```

# Issues

## Error when compiling:
### 
```
error: Unable to load symbol table
[error] (Compile / scalafix) scalafix.sbt.ScalafixFailed: CommandLineError
[error] Total time: 3 s, completed 18 окт. 2019 г., 18:43:58
```

Solution - use openjdk-8:

```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
```

## Error in IDEA with versionss mismatch between sbt and IDEA

Solution: delete scala from module libs
