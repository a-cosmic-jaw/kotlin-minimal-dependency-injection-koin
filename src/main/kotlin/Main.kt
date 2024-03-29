import kotlin.io.path.Path
import kotlin.io.path.absolutePathString
import kotlin.io.path.exists
//import kotlin.reflect.full.createInstance

fun main(args: Array<String>) {
    println("Hello, world!")
    println("TODO: We assume that there is no ./build/classes/kotlin/main/TestModule.class")
    println("Program arguments: ${args.joinToString()}")

    // Setting things up
    val dir = Path(args[0])
    if (!dir.exists()) {
        println("Path ${dir.absolutePathString()} does not exist. Quiting!")
        return
    }

    // Loading that should fail
    try {

    }
    catch (e: Exception) {
        println("This message should print, indeed!")
    }

    println("TODO: ŒNow move TestClass.class to $dir")
    readln()

    // Loading that should succeed
    try {

    }
    catch (e: Exception) {
        println("This message should not print!")
    }
}