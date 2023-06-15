fun main(args: Array<String>) {
    val like = 21
    val variant = if (like % 10 == 1 && like % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println(512 % 10)
    println("Понравилось $like $variant")
}