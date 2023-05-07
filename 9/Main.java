package Assignment_9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
        public static void main(String[] args)
        {
            String sql = "select Team_Name from league_standing;";
            try(Connection connection = DBUtil.getConnection();
                Statement statement = connection.createStatement()){
                ResultSet resultSet = statement.executeQuery(sql); // In case of select executeQuery is used
                int count = 0;
                while(resultSet.next())
                {
                    count++;
                    System.out.println(resultSet.getString("Team_name"));
                }
                System.out.println(count+ " teams found");
                resultSet.close();
            }catch (SQLException ex)
            {
                System.out.println("Problem:" + ex.getMessage());
            }
        }
}

