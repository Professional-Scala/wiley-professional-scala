# Code Examples for Professional Scala - Wrox
ISBN: 978-1-119-26722-5

This is the companion source code repository containing examples covered in Professional Scala by Wrox Press.

## Prerequisites

### Required Software

To run all the examples you will need the following software installed,

 - Scala 2.11.7 or later
 - SBT 0.13.8 or later
 - Maven 3.2.5 or later
 - JDK 8

Ensure the `scala`, `scaladoc`, `sbt` and `mvn` commands are on the command path.

### Required Hardware

Processor: Pentium 2 266 MHz or better

RAM: 1GB or better

## Installation

Clone the repository.

## Structure

| Directory  | Chapter |
| ------------- | ------------- |
| Chapter 1 - Introduction | src/main/scala/com/wrox/professionalscala/ch01 |
| Chapter 2 - Functional Programming | src/main/scala/com/wrox/professionalscala/ch02 |
| Chapter 3 - Java Compatibility | src/main/scala/com/wrox/professionalscala/ch03 |
| Chapter 4 - SBT | chapter4_codesamples |
| Chapter 5 - Maven | chapter-5 |
| Chapter 7 - Testing | chapter7_codesamples |
| Chapter 8 - Scaladoc | chapter-8 |
| Chapter 9 - Type System | src/main/scala/com/wrox/professionalscala/ch09 |
| Chapter 10 - Advanced Functional Programming | src/main/scala/com/wrox/professionalscala/ch10 |
| Chapter 11 - Java Compatibility | src/main/scala/com/wrox/professionalscala/ch11 |

## Usage

### Chapters 1, 2, 3, 4, 7, 8, 9, 10 and 11

Run the examples using `sbt` on the  command line (sbt run  will do the trick).

### Chapters 5 and 8

These chapters use Maven instead of SBT.

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

1. Fork the respository in GitHub.
2. Create your feature branch:  `git checkout -b my-new-feature`
3. Commit your changes:  `git commit -am 'Add some feature'`
4. Push to the branch:  `git push origin my-new-feature`
5. Submit a pull request.

## Contact the Authors

For questions please visit the Wrox forum at http://p2p.wrox.com/book-professional-scala-804/

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
