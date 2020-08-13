fun main() {
    val Score = 90
    val Peringkat: String
    Peringkat = if (Score > 90 && Score <= 100) {
        "A"
    } else if (Score > 80 && Score <= 90) {
        "B"
    } else if (Score > 70 && Score <= 80) {
        "C"
    } else if (Score > 60 && Score <= 70) {
        "D"
    } else if (Score <= 60) {
        "E"
    } else{
        "Nothing."
    }
    println(Peringkat)
}
