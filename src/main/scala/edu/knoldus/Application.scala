package edu.knoldus

import org.apache.log4j.Logger
import Constants._

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  val givenList = List(ONE, TWO, THREE, FOUR, FIVE,SIX,7,8)
  val subList = List(ONE, TWO,3,5)
  val subList1 = List(TWO, THREE)
  val subList2 = List(SIX)
  val concatList = List(THREE, FOUR, FIVE, SIX)
  log.info(s"length of $givenList is :" + length(givenList) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList, subList) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList, subList1) + "\n")
  log.info("Status of subsequence presence :" + subSequenceChecker(givenList, subList2) + "\n")
  log.info(s"concatenating $subList and $concatList =>" + concateLists(subList, concatList) + "\n")

  def function(x: Int):Boolean = {
    x % 2 == 0
  }

  log.info(s"splitted lists of given : $givenList is=>" + splitList(givenList, function))

}

