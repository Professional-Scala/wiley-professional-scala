# Code Examples for Professional Scala - Wrox
ISBN: 978-1-119-26722-5

TODO: Update to include all chapters.

These code examples support chapters 5 and 8 of Professional Scala covering Maven and Scaladoc.

## Prerequisites

### Required Software

Both chapters require

 - Scala 2.11.7 or later
 - Maven 3.2.5 or later
 - JDK 8

Ensure the `scala`, `scaladoc` and `mvn` commands are on the command path.

### Required Hardware

Processor: Pentium 2 266 MHz or better

RAM: 1GB or better

## Structure

  TODO

## Chapters 5 and 8 Structure

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

## Other Notes

`misc-examples/` contains Scaladoc samples not listed in chapter 8.

## Contact the Authors

For questions please visit the Wrox forum: http://p2p.wrox.com/book-professional-scala-804/

