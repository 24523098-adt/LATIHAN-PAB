enum class CourseStatus { ACTIVE, COMPLETED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
    val courses: MutableList<Course> = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("INF202", "Data Structures", CourseStatus.COMPLETED),
        Course("INF303", "Software Engineering", CourseStatus.ACTIVE)
    )

    courses.add(Course("INF404", "Machine Learning", CourseStatus.ACTIVE))

    courses.removeIf { it.code == "INF202" }

   
    println(" Daftar Mata Kuliah ")
    courses.forEach { println(it.displayInfo()) }

    val (code, name, status) = courses[0]
    println("\n Destructuring courses[0] ")
    println("Code   : $code")
    println("Name   : $name")
    println("Status : $status")
}
