package week4.oop_physics.with_oop

import physics.PhysicsVector

object PlayerMain {

  def main(args: Array[String]): Unit = {

    val ball: Ball = new Ball(new PhysicsVector(), new PhysicsVector(), new PhysicsVector(), 5)
    val potion: HealthPotion = new HealthPotion(new PhysicsVector(), new PhysicsVector(), new PhysicsVector(), 5)

    val player1: Player = new Player(new PhysicsVector(), new PhysicsVector(), new PhysicsVector(), new PhysicsVector(), 20, 12)

    player1.useItem(ball)
    player1.useItem(potion)

  }

}
