import kotlin.system.exitProcess

class App {
    private var CheckTheWinnerUtils = utils.CheckTheWinnerUtils()
    private val answers = arrayListOf<String>("batu", "gunting", "kertas")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        printHeader()
        openMenuChoosePlayer()
    }

    private fun printHeader() {
        println(
            """
            ======================================
            GAME SUIT TERMINAL VERSION
            ======================================
        """.trimIndent()
        )
    }

    private fun openMenuChoosePlayer() {
        print("1. Masukkan Pemain 1 (Gunting/Batu/Kertas): ")
        val answer1 = readLine().orEmpty()
        print("2. Masukkan Pemain 2 (Gunting/Batu/Kertas): ")
        val answer2 = readLine().orEmpty()
        if ((answer1.lowercase() in answers) and (answer2.lowercase() in answers)) {
            CheckTheWinnerUtils.chooseTheWinner(answer1, answer2)
        } else {
            println("======================================")
            println("JAWABAN SALAH!")
            println("======================================")
            openMenuChoosePlayer()
        }
        askToPlayAgain()
    }

    private fun askToPlayAgain() {
        print("Main lagi (y/n): ")
        if (readLine().equals("Y", true)) {
            println("======================================")
            openMenuChoosePlayer()
        } else {
            exitProcess(0)
        }
    }

}