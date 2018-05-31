package basic

/**
  * Created by ypokhrel on 5/31/2018.
  */

object App extends App{
	def normal_factorial(n:Int):Int = {
		if (n <= 0 ) 1
		else
			n * normal_factorial(n-1)
	}

	def tail_factorial(n: Int): Int = {
		def go(n:Int, acc:Int): Int = {
			if (n <=0) acc
			else go(n-1, n*acc)
		}

		go(n, 1)
	}

	println("factorial of 5 is : " + normal_factorial(5))
	println("factorial of 500000 is : " + tail_factorial(500000))
}
