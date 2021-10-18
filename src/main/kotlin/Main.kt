fun main(args: Array<String>) {
runSimulation()
}
fun runSimulation(){
  val greetingFunction = configureGreetingFunction()
    println(greetingFunction ("Rawan"))
}
fun configureGreetingFunction(): (String) ->String{
  val structureType = "hospitals"
  var numBuildings = 5
  return{ playerName: String->
    val currentYear = 2018
        numBuildings +=1
 println("Adding $numBuildings $structureType")
      "Welcome to sim village $playerName! (copyright $currentYear)"

  }
}