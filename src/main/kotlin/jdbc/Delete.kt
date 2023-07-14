package jdbc

import java.sql.*

object Delete {
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
//            var query: String = "select * from doctor"

            // INSERT OPERATION
//            ***************
            var query: String = "delete from manager where manager_id = 1002"
            val rows = stmt!!.executeUpdate(query)
            println("Delete Successful $rows")
            // ****************

            // THIS IS ONLY REQUIRED FOR READ OPERATION
//            if (stmt.execute(query)) {
//                rs = stmt.resultSet
//            }
//            while (rs!!.next()) {
//                println(rs.getString("id"))
//                println(rs.getString("name"))
//                println(rs.getString("department"))
//                println(rs.getString("age"))
//            }
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

