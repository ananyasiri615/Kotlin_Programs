package HOME_ASSIGNMENTS

import java.sql.*

object Insert {
    var con : Connection ? = null
    var username = "root"
    var password = "ananya10"

    @JvmStatic
    fun main(args: Array<String>) {
        getConnection()
        executeQuery()
    }
    fun executeQuery(){
        try {
            var stmt: Statement? = null
            var rs: ResultSet? = null

            stmt = con!!.createStatement()

            var query: String = "insert into Player values(1006, 'Anita', 'Football', 18, 'India')"
            val rows = stmt!!.executeUpdate(query)
            println("Insertion Successful $rows")

        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
    fun getConnection(){
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            // Obtaining the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", username, password)
        }catch (ex: Exception){
            println("Exception occured. Handled")
            ex.printStackTrace()
        }

    }

}

