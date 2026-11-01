fun gradeOf(nilai: Int) = when {
    nilai >= 90 -> "A"
    nilai >= 80 -> "B"
    nilai >= 70 -> "C"
    nilai >= 60 -> "D"
    else -> "E"
}

fun main() {
    val nilaiMahasiswa = listOf(95, 82, 71, 60, 45)
    for (nilai in nilaiMahasiswa) {
        println("Nilai $nilai -> Grade ${gradeOf(nilai)}")
    }
}