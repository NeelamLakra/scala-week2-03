package edu

package object knoldus {

  def length(givenList:List[Int]):Int ={
    givenList.foldRight(0)((_,n)=>n + 1)
  }

  def subSequenceChecker(originalList:List[Int],subList:List[Int]):Boolean ={
    val actualList = originalList.toStream
    val shortList = subList.toStream
    actualList.tails exists(_.startsWith(shortList))

  }

  def concateLists(firstList:List[Int],secondList:List[Int]):List[Int]={
    firstList match {
      case head::tail =>concateLists(secondList :+head,tail)
      case head ::Nil =>secondList :+head
      case _ =>secondList
    }
  }

  //def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])={

  //}
}
