package edu.knoldus

import org.apache.log4j.Logger
import Constants._

object Application extends App{

  val log = Logger.getLogger(this.getClass)
val givenList = List(ONE,TWO,THREE,FOUR,FIVE)
  val subList = List (ONE,TWO)
  val subList1 = List (TWO,THREE)
  val subList2 = List(SIX)
  val concatList = List(THREE,FOUR,FIVE,SIX)
  log.info(s"length of $givenList is :" + length(givenList) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList,subList) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList,subList1) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList,subList2))
  log.info(s"concatenaing $subList and $concatList " + concateLists(subList,concatList))



}

