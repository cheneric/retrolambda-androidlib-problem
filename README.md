# retrolambda-androidlib-problem

## Problem
Android Studio compile of this simple `com.android.libary` test project fails with:

```
An exception has occurred in the compiler (1.8.0_60). Please file a bug at the Java Bug Database (http://bugreport.java.com/bugreport/) after checking the database for duplicates. Include your program and the following diagnostic in your report.  Thank you.
com.sun.tools.javac.code.Symbol$CompletionFailure: class file for java.lang.invoke.MethodType not found
```

The error does not occur when building with `gradlew` at the command-line.

## Steps to reproduce

0. Open project in Android Studio.
0. In Android Studio, select Build > Rebuild Project from the menu bar.
0. Check the Gradle Console for the error output.

## Reference

Seems related to https://github.com/evant/gradle-retrolambda/issues/15, which may have been fixed for command-line builds, but seemingly not Android Studio builds.

## Environment

* OS X Yosemite 10.10.5
* Java 1.8.0_60
* Java 1.7.0_70
* Android Studio 1.4.1
