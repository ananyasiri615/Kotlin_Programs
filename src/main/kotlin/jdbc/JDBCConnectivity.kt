package jdbc

import java.sql.DriverManager
import java.sql.*

object MySQLConnectivityExample {

    var con : Connection ? = null
    var username = "root"
    var password = "ananya10"

    @JvmStatic
    fun main(args: Array<String>){
        getConnection()
        executeQuery()
    }

    fun executeQuery(){

        try {
            var stmt: Statement? = null
            var rs: ResultSet? = null

            stmt = con!!.createStatement()
            var query: String = "show databases"

            if (stmt.execute(query)) {
                rs = stmt.resultSet
            }

            while (rs!!.next()) {
                println(rs.getString("Database"))
            }
        } catch (ex: Exception){
            ex.printStackTrace()
        }

    }

    fun getConnection() {
        try {
            //Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            //Obtaining the connectin object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_test_db", username, password)
        } catch (ex: Exception){
            println("Exception occurred. Handled")
            ex.printStackTrace()
        }
    }



}