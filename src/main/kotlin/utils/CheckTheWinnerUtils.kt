package utils

class CheckTheWinnerUtils {
    fun chooseTheWinner(player1: String, player2: String) {
        if (player1.lowercase() == player2.lowercase()) {
            println("======================================")
            println("DRAW!")
            println("======================================")
        } else if ((player1.lowercase() == "batu" && player2.lowercase() == "gunting") or (player1.lowercase() == "gunting" && player2.lowercase() == "kertas") or (player1.lowercase() == "kertas" && player2.lowercase() == "batu")) {
            println("======================================")
            println("Pemain 1 MENANG!")
            println("======================================")

        } else {
            println("======================================")
            println("Pemain 2 MENANG!")
            println("======================================")
        }
    }
}