enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String = when (status) {
    CourseStatus.ACTIVE    -> "Mata kuliah sedang berjalan"
    CourseStatus.COMPLETED -> "Mata kuliah telah selesai ditempuh"
    CourseStatus.DROPPED   -> "Mata kuliah dibatalkan/tidak dilanjutkan"
}

fun main() {
    val courses: MutableList<Course> = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("INF303", "Software Engineering", CourseStatus.ACTIVE),
        Course("INF404", "Machine Learning", CourseStatus.DROPPED)
    )

    println(" Deskripsi Status Mata Kuliah ")
    courses.forEach { course ->
        println("${course.displayInfo()} → ${describe(course.status)}")
    }
}
