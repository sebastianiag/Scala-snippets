import scala.util.Random


object Player {
  def game(): Boolean = {
    var iterations: Int = 2
    var picks1: Int = Random.nextInt(6)
    var turn: Int =  2
    while (true) {
      var picks2: Int =  Random.nextInt(6)
      if (turn%2 !=0){
	if (picks1 <= picks2) return false 
	else {
	  picks2 = Random.nextInt(6)
	  i += 1
	}
      }
      else if (picks2 <= picks1) return true 
      else {
	picks1 = Random.nextInt(6)
	i += 1
      }
    }  
      throw new IllegalStateException("Something went wrong in the Loop")
  }
}

object Simulation {
  def main(){
    var victories = (for (i <-1 to 10000000) yield Player.game()).count(x => x == true)
    println("="*30)
    println(f"Results \n \tPlayer1: $player1.victories%f  \n \tPlayer2: $player2.victories%f")
    println("="*30)
  }
}
