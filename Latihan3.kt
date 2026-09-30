enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

// 1. Singleton object untuk konfigurasi global
object AppConfig {
    const val MAX_COURSES = 5
}

data class Course(val code: String, val name: String, val status: CourseStatus) {
    // 2. Companion object konstanta terkait class Course
    companion object {
        const val PREFIX = "PAB"
    }
}

// 3 & 4 & 5. Extension function pada MutableList<Course>
fun MutableList<Course>.addCourse(course: Course): Boolean {
    if (this.size >= AppConfig.MAX_COURSES) {
        println("Gagal: list sudah penuh (maks ${AppConfig.MAX_COURSES})")
        return false
    }
    if (!course.code.startsWith(Course.PREFIX)) {
        println("Gagal: kode '${course.code}' harus diawali '${Course.PREFIX}'")
        return false
    }
    this.add(course)
    return true
}

fun main() {
    val courses = mutableListOf<Course>()
    
    println(courses.addCourse(Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE)))
    println(courses.addCourse(Course("PAB102", "UI/UX Design", CourseStatus.ACTIVE)))
    println(courses.addCourse(Course("PAB103", "Flutter Development", CourseStatus.ACTIVE)))
    println(courses.addCourse(Course("PAB104", "Backend API", CourseStatus.COMPLETED)))
    println(courses.addCourse(Course("PAB105", "Cloud Computing", CourseStatus.ACTIVE)))

    println(courses.addCourse(Course("PAB106", "DevOps", CourseStatus.ACTIVE)))

    println(courses.addCourse(Course("INF201", "Data Mining", CourseStatus.ACTIVE)))

    println("\nDaftar Akhir (${courses.size} mata kuliah)")
    courses.forEach { println("${it.code} - ${it.name} - ${it.status}") }
}
