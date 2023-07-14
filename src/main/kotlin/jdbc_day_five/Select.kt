import java.sql.DriverManager
import java.sql.*

object Select {
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
            // Read Operation
           var query: String = "select * from manager"

            if (stmt.execute(query)) {
                rs = stmt.resultSet
            }
            while (rs!!.next()) {
                println(rs.getInt("manager_id"))
                println(rs.getString("name"))
                println(rs.getInt("age"))
                println(rs.getInt("add_id"))
            }
        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
    fun getConnection() {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            // Obtaining the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", username, password)
        } catch (ex: Exception) {
            println("Exception occured. Handled")
            ex.printStackTrace()
        }

    }

}