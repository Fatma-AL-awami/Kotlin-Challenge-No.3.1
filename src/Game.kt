fun main(){
    var healthPoints:Int =100;
    val playerName="madrigal";
    var isBlessed =true;


    if(healthPoints==100)  println("madrigal is in condition");
    else if(healthPoints in 90..99)  println("madrigal has afew scratches");
    else if(healthPoints in 75..98) { println("madrigal has some minor wounds");
        if (isBlessed == true) println("has some minor wounds but is healing quite quickly");
        else  println("has some minor wounds");
    }
    else if(healthPoints in 15..74) println("madrigal looks pretty hurt");
    else if(healthPoints in 0..14)  println("madrigal is in awful condition");
    else println("This number does not exist");

    println(healthPoints);
    println(playerName);
}