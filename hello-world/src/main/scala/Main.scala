object Main extends App {
  println("Hello, World!\n")
  println("The latest news!\n")

  def factorial(n: Int): Int= {
    @annotation.tailrec
    def loop(n:Int, acc:Int): Int = 
      if (n <= 0) acc
      else loop(n-1, n*acc)    
    
    loop(n,1)  
  }  
  
  val t1 = System.nanoTime
  val factorial_25 = factorial(25)
  val duration = (System.nanoTime - t1) / 1e9d


  val msg_1 = "The factorial of %d is %d if tail recursive calculation is used!\n"
  println(msg_1.format(25, factorial_25))

  val msg_2 = "The calculation time on my machine is %f seconds.\n"
  println(msg_2.format(duration))

}
