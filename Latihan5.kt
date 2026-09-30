object AppConfig {
    const val MAX_COURSES = 5
}

data class Course(val code: String, val name: String, val credits: Int) {
    companion object {
        const val PREFIX = "PAB"
    }
}

fun MutableList<Course>.addCourse(course: Course): Boolean {
    if (this.size >= AppConfig.MAX_COURSES) return false
    if (!course.code.startsWith(Course.PREFIX)) return false
    this.add(course)
    return true
}

fun main() {
    val courses = mutableListOf<Course>()

    println(courses.addCourse(Course("PAB101", "Pemrograman Android", 3))) 
    println(courses.addCourse(Course("MTK101", "Matematika", 3)))         
    println(courses.addCourse(Course("PAB102", "Kotlin Dasar", 2)))   
    println(courses.addCourse(Course("PAB103", "UI Compose", 3)))     
    println(courses.addCourse(Course("PAB104", "Database Lokal", 3)))      
    println(courses.addCourse(Course("PAB105", "Networking", 3)))        
    println(courses.addCourse(Course("PAB106", "Testing", 2)))             

    println("Jumlah mata kuliah: ${courses.size}")
}
