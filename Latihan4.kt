fun main() {
    // Buat MutableMap NIM
    val scores: MutableMap<Int, Int> = mutableMapOf(
        24523098 to 85,
        24002 to 90,
        24003 to 78
    )

    // Perbarui nilai mahasiswa NIM 24523098
    scores[24523098] = 92

    // Hapus mahasiswa NIM 24003
    scores.remove(24003)

    // Cetak setiap entri dengan destructuring
    println("Daftar Nilai")
    for ((nim, score) in scores) {
        println("NIM: $nim → Nilai: $score")
    }

    // Cetak nilai untuk NIM yang tidak ada
    val missing = scores[99999]
    println("\nNilai NIM 99999: $missing")
}
