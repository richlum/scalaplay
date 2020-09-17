#!/bin/sh
echo "$0"
echo "$@"
exec scala "$0" "$@"
!#

case class Person(name:String)

object HelloWorld {
  def main(args: Array[String]){
    val al = Person("Al")
    println(al + ",Hello, World!! " + args.toList)
  }
};

