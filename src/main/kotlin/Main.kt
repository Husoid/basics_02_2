fun main(args: Array<String>) {
    val like = 1015
    val variant = if (like % 10 == 1 && like != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $like $variant")
}