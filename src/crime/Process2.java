
package crime;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.lucene.search.spell.JaroWinklerDistance;

public class Process2 
{
    DetectFrame df;
    String appId;
    double Tsim=0.8;
    
    Process2(DetectFrame de,String id)
    {
        df=de;
        appId=id;        
    }
    
    public void detect()
    {
        try
        {
            ArrayList AppList=new ArrayList();
            DBConnection db=new DBConnection();
            Statement st=db.stt;
            ResultSet rs=st.executeQuery("select * from Application where AppId!='"+appId+"'");
            while(rs.next())
            {
                String a1=rs.getString(1);
                String a2=rs.getString(2);
                String a3=rs.getString(3);
                String a4=rs.getString(4);
                String a5=rs.getString(5);
                String a6=rs.getString(6);
                String a7=rs.getString(7);
                
                
                AppList.add(a1+"#"+a2+"#"+a3+"#"+a4+"#"+a5+"#"+a6+"#"+a7);
            }
            
            String currentApp="";
            ResultSet rs1=st.executeQuery("select * from Application where AppId='"+appId+"'");
            if(rs1.next())
            {
                String a1=rs1.getString(1);
                String a2=rs1.getString(2);
                String a3=rs1.getString(3);
                String a4=rs1.getString(4);
                String a5=rs1.getString(5);
                String a6=rs1.getString(6);
                String a7=rs1.getString(7);
                                
                currentApp=a1+"#"+a2+"#"+a3+"#"+a4+"#"+a5+"#"+a6+"#"+a7;                          
            }
            
             String cr[]=currentApp.split("#");
             ArrayList at1=new ArrayList();
             ArrayList at2=new ArrayList();
            for(int i=0;i<AppList.size();i++)
            {
                String g1[]=AppList.get(i).toString().split("#");
                String ek1="";
                int ek2=0;
                for(int j=1;j<g1.length;j++)
                {
                    JaroWinklerDistance jd=new JaroWinklerDistance();
                    double at=jd.getDistance(cr[j],g1[j]);
                    //System.out.print(" "+at);
                    if(at>=Tsim)
                    {
                        ek1=ek1+"1";
                        ek2++;
                    }
                    else
                    {
                        ek1=ek1+"0";
                        //ek2++;
                    }                        
                }
               // System.out.println("");
                System.out.println(g1[0]+" : "+ek1+" : "+ek2);
                at1.add(ek1);
                at2.add(ek2);               
            }      
            
            ArrayList at3=new ArrayList();
            double a=0.8;
            double t=10;
            double e2=0;
            for(int i=0;i<at2.size();i++)
            {
                String g1=at2.get(i).toString();
                double e1=(1-a)*Double.parseDouble(g1)+a*(Double.parseDouble(g1)/t);
                System.out.println("s(ak)"+e1);
                e2=e2+e1;
            }
            System.out.println("e2 "+e2);
            double sc=e2/(cr.length-1);
            
            DecimalFormat dft=new DecimalFormat("#.##");
            String d=dft.format(sc);
            double sus=Double.parseDouble(d);
            JOptionPane.showMessageDialog(df, "suspicion score "+sus);
            
            
            if(sus>=0.5)
            {
                st.executeUpdate("update Status set Status='Checked',Verification='Rejected' where AppId='"+appId+"'");
                JOptionPane.showMessageDialog(df, "Application "+appId +" is Rejected");
            }
            else
            {
                st.executeUpdate("update Status set Status='Checked',Verification='Accepted' where AppId='"+appId+"'");
                JOptionPane.showMessageDialog(df, "Application "+appId +" is Accepted");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
