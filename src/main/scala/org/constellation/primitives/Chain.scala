package org.constellation.primitives

import scala.collection.mutable.ListBuffer

object Chain {

  case class Chain(chain: ListBuffer[Block] = ListBuffer.empty[Block])

}