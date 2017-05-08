/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wonderfulmindv1_1;

import com.mysql.jdbc.JDBC4PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author harindra
 */
public class DatabaseUtils {

    

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql687464";

    //  Database credentials
    static final String USER = "sql687464";
    static final String PASS = "zM8!wQ4*";
    
    
    /*static final String DB_URL = "jdbc:mysql://localhost:8889/bmindSimu2015";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";*/

    public static Connection conn = null;
    public static Statement stmt = null;

    public static void connectToDatabase() {

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public static void insertFeedback(HashMap<String,String> feedbackArray) throws SQLException, FileNotFoundException {
        // the mysql insert statement
        connectToDatabase();
        String query = " insert into `feedbacks` (`Email`,`Affiliation`,`Profession`,`StudiedAbbhidhamma`,`ThoughtViewUserfreindlyness`,`ThoughtViewClarityPresentation`,`ThoughtViewSelfGuidence`,`MentalFactorsUserfreindlyness`,`MentalFactorsClarityPresentation`,`MentalFactorsSelfGuidence`,`UsefultTVOrMV`,`PriorKnowTV`,`PriorKnowMV`,`IsUseOtherSimu`,`OtherSimuName`,`Feedback`,`Version`)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
// create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, feedbackArray.get("Email"));
            preparedStmt.setString(2, feedbackArray.get("Affiliation"));
            preparedStmt.setString(3, feedbackArray.get("Profession"));
            preparedStmt.setString(4, feedbackArray.get("StudiedAbhidhamma"));
            preparedStmt.setString(5, feedbackArray.get("ThoughtUserFriendlyness"));
            preparedStmt.setString(6, feedbackArray.get("ThoughtClarityOfPresentation"));
            preparedStmt.setString(7, feedbackArray.get("ThoughtSelfGuidence"));
            preparedStmt.setString(8, feedbackArray.get("MentalUserFriendlyness"));
            preparedStmt.setString(9, feedbackArray.get("MentalClarityOfPresentation"));
            preparedStmt.setString(10, feedbackArray.get("MentalSelfGuidence"));
            preparedStmt.setString(11, feedbackArray.get("ThoughtOrMentalUseful"));
            preparedStmt.setString(12, feedbackArray.get("PriorKnowThoughts"));
            preparedStmt.setString(13, feedbackArray.get("ThoughtOrMentalUseful"));
            preparedStmt.setString(14, feedbackArray.get("UsedMindSimu"));
            preparedStmt.setString(15, feedbackArray.get("OtherSimulatorName"));
            preparedStmt.setString(16, feedbackArray.get("YourFeedback"));
            preparedStmt.setString(17, feedbackArray.get("Version"));

            System.out.println("Insert data");
            // execute the preparedstatement
            preparedStmt.execute();
            //conn.close();
        } catch (SQLException se2) {
            System.out.println(se2);
        } finally {
            conn.close();
        }

    }

    
}
