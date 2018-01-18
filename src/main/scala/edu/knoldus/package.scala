package edu

package object knoldus {

  def length[A](givenList: List[A]): Int = {
    givenList.foldRight(0)((_, n) => n + 1)
  }

  def subSequenceChecker[A](originalList: List[A], subList: List[A]): Boolean = {

    val actualList = originalList.toStream
    val shortList = subList.toStream
    actualList.tails exists (_.startsWith(shortList))
/*
    def innerSequence[A](originalList: List[A], subList: List[A], tempSubList: List[A], count: Int): Boolean = {
      subList match {
        case head :: tail => if (head == originalList.head) innerSequence(originalList.tail, tail, tempSubList, count + 1)
        else innerSequence(originalList, tempSubList, tempSubList, count + 1)
        case Nil => if (count == tempSubList.length) true else false
      }
    }
    innerSequence(originalList, subList, subList, 0)
    */
  }


  def concateLists[A](firstList: List[A], secondList: List[A]): List[A] = {
    firstList match {
      case topElement :: remainingList => concateLists(remainingList, secondList :+ topElement)
      case _ => secondList
    }
  }

  def splitList[A](givenList: List[A], func: A => Boolean): (List[A], List[A]) = {
    def splitter(givenList: List[A], validList: List[A], invalidList: List[A]): (List[A], List[A]) = {
      givenList match {
        case head :: tail => if (func(head)) splitter(tail, validList :+ head, invalidList) else splitter(tail, validList, invalidList :+ head)
        case Nil => (validList, invalidList)
      }
    }

    splitter(givenList, List(), List())
  }

}
