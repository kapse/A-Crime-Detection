package crime;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserService {

    public static String currentString(String appId) {
        try {
            DBConnection db = new DBConnection();
            Statement st = db.stt;
            ResultSet rs = st.executeQuery("select * from Application where AppId='" + appId + "'");
            while (rs.next()) {
                String a1 = rs.getString(1);
                String a2 = rs.getString(2);
                String a3 = rs.getString(3);
                String a4 = rs.getString(4);
                String a5 = rs.getString(5);
                String a6 = rs.getString(6);
                String a7 = rs.getString(7);
                return a1 + "#" + a2 + "#" + a3 + "#" + a4 + "#" + a5 + "#" + a6 + "#" + a7;
            }
        } catch (Exception e) {
        }
        return "";
    }

    public static ArrayList<String> historicString(String appId) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            DBConnection db = new DBConnection();
            Statement st = db.stt;
            ResultSet rs = st.executeQuery("select * from Application where AppId!='" + appId + "'  ");
            while (rs.next()) {
                String a1 = rs.getString(1);
                String a2 = rs.getString(2);
                String a3 = rs.getString(3);
                String a4 = rs.getString(4);
                String a5 = rs.getString(5);
                String a6 = rs.getString(6);
                String a7 = rs.getString(7);
                arrayList.add(a1 + "#" + a2 + "#" + a3 + "#" + a4 + "#" + a5 + "#" + a6 + "#" + a7);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    public static boolean updateStatus(String status, String verification, String appId) {
        String update = "UPDATE status SET Status = '" + status + "' , Verification = '" + verification + "' WHERE AppId = " + appId + " ";
        System.out.println("update = " + update);
        DBConnection db = new DBConnection();
        Statement st = db.stt;
        try {
            st.execute(update);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

}
