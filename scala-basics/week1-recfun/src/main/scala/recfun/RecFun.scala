package recfun

import scala.annotation.tailrec

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
//    println("Pascal's Triangle")
//    for (row <- 0 to 10) {
//      for (col <- 0 to row)
//        print(s"${pascal(col, row)} ")
//      println()
//    }

//    println(balance("((lisa)kj()())".toList))

    println(countChange(5, List()))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceDo(chars: List[Char], depth: Int): Int = {
      if (chars.isEmpty || depth < 0) depth
      else if (chars.head == '(') balanceDo(chars.tail, depth + 1)
      else if (chars.head == ')') balanceDo(chars.tail, depth - 1)
      else balanceDo(chars.tail, depth)
    }
    balanceDo(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    val combinations = 1 :: List.fill(money)(0)

    @tailrec
    def forCoin(coin: Int, combinations: List[Int], i: Int) : List[Int] =
      if (i > money) combinations
      else forCoin(coin, combinations.updated(i, combinations(i) + combinations(i - coin)), i + 1)

    @tailrec
    def forAllCoins(coins: List[Int], combinations: List[Int]) : List[Int] =
      if (coins.isEmpty) combinations
      else forAllCoins(coins.tail, forCoin(coins.head, combinations, coins.head))

    if (money == 0) 0
    else forAllCoins(coins, combinations).last
  }
}
