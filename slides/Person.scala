val sentence = "The mattress costs 90 pounds"

// abstract base class
abstract class Person {
    def say(s: String): String
    def @:(s: String): String
}

// core class, for a mattress-store employee
class MSEmployee extends Person {
  override def say(s: String) = "(In an English accent) " + s
  override def @:(s: String) = s
}

// multiplies every number by 10
trait TimesTen extends Person {
  abstract override def say(s: String) =
    super.say("""\d+""".r.replaceAllIn(s, m=>(m.toString.toInt * 10).toString))
}

// divides every number by 3
trait DivThree extends Person {
  abstract override def say(s: String) =
    super.say("""\d+""".r.replaceAllIn(s, m=>(m.toString.toInt / 3).toString))
}
  
// don't say "mattress" to this person, say "dog kennel"
trait DogKennels extends Person {
  abstract override def @:(s: String) = 
    super.@:(s.replace("mattress", "dog kennel"))
}

object MrVerity  extends MSEmployee with TimesTen 
object MrLambert extends MSEmployee with DivThree with DogKennels
