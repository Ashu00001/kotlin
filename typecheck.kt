fun main() {
    //type checking
    //any class is superclass of all the classes
val name:Any ="John"
    if(name is String)//is is used to check type of variable
    {
        println(name.length)
    }
    
}
