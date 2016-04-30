# Code Examples for Professional Scala - Wrox
ISBN: 978-1-119-26722-5

TODO: Update to include all chapters.

This is a companion repository containing examples from Professional Scala by Wrox Press.

## Prerequisites

### Required Software

Both chapters require

 - Scala 2.11.7 or later
 - Maven 3.2.5 or later
 - JDK 8

Ensure the `scala`, `scaladoc`, `sbt` and `mvn` commands are on the command path.

### Required Hardware

Processor: Pentium 2 266 MHz or better

RAM: 1GB or better

## Installation

Clone the repository.

## Structure

  TODO

| Directory  | Chapter |
| ------------- | ------------- |
| src/main/scala/com/professionalscala/ch2 | Chapter 2 - Functional Programming |
| src/main/scala/com/professionalscala/ch3 | Chapter 3 - Concurrency |
| src/main/scala/com/wrox/professionalscala/ch03 | Chapter 3 - Scala and Java Collections |
| chapter4_codesamples | Chapter 4 - SBT |
| chapter-5 | Chapter 5 - Maven |
| chapter7_codesamples | Chapter 7 - Testing |
| chapter-8 | Chapter 8 - Scaladoc |
| src/main/scala/com/wrox/professionalscala/ch09 | Chapter 9 - Type System |
| src/main/scala/com/wrox/professionalscala/ch10 | Chapter 10 - Advanced Functional Programming  |
| src/main/scala/com/professionalscala/ch11 | Chapter 11 - Java Compatibility |

## Usage

### Chapters 2, 4, 7, 11 and some of 3

Run the examples using `sbt` on the  command line (sbt run  will do the trick).

### Chapters 9, 10 and some of 3

Launch sbt. Then from the sbt prompt launch the `runMain` command followed by the example you want to run. E.g.:

```scala
> runMain com.wrox.professionalscala.ch09.TypeClassExample
```

## Chapters 5 and 8

These chapter use Maven instead of SBT. The Maven specific details are covered here.

This project contains two Maven modules corresponding to chapters 5 and 8

 - Chapter 5 - Maven
 - Chapter 8 - Scaladoc

The module layout follows standard Maven practice.

    pom.xml
    chapter-5/
        pom.xml
    chapter-8/
        pom.xml

Build the code with `mvn install`. Build the Scaladoc with `mvn site`.

`misc-examples/` contains Scaladoc samples not listed in chapter 8.

## Contributing

1. Fork it!
2. Create your feature branch:  `git checkout -b my-new-feature`
3. Commit your changes:  `git commit -am 'Add some feature'`
4. Push to the branch:  `git push origin my-new-feature`
5. Submit a pull request.

## Contact the Authors

For questions please visit the Wrox forum: http://p2p.wrox.com/book-professional-scala-804/

## License

    The MIT License (MIT)

    Copyright (c) 2016 John Wiley & Sons, Inc. or related companies.

    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
    documentation files (the "Software"), to deal in the Software without restriction, including without limitation
    the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
    to permit persons to whom the Software is furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
    TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
    TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
