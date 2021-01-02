import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(){

    println("Main Program Starts: ${Thread.currentThread().name}")
    /**
     * Program exited only after Completion of print both main and background thread
     */

    /*Output :
    Main Program Starts: main
    Main Program Ends: main
    Fake work starts Thread-0
    Fake work finished Thread-0*/
    GlobalScope.launch {
        println("Fake work starts ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work finished ${Thread.currentThread().name}")
    }
    Thread.sleep(2000)

    println("Main Program Ends: ${Thread.currentThread().name}")

    //Coroutine thread

    println("Main Program Ends: ${Thread.currentThread().name}")
}