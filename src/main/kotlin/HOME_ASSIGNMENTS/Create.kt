package HOME_ASSIGNMENTS

import java.sql.DriverManager
import java.sql.*

object Create {
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

            // Create table
            var query: String = "create table Player(id int, name varchar(100), sport varchar(100), age int, country varchar(100))"

            val rows = stmt!!.executeUpdate(query)
            println("Table created Successfully & values inserted ")
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
        }
        catch (ex: Exception){
            println("Exception occured. Handled")
            ex.printStackTrace()
        }

    }

}