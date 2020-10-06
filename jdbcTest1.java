package jdbs;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbcTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection Conn=null;
		Statement Stat=null;
		String url="jdbc:mysql://localhost:3308/";
		String db="caronavirus";
		String driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			Conn=DriverManager.getConnection(url+db,"root","L@l1th@99");
			Stat=Conn.createStatement();
			for(int i=1;i<=10;i++) {
				switch(i)
		{
				
				case 1:
					ResultSet rs1 = Stat.executeQuery(
							"select states,sum(male) as total_male from caronaDetails where states='TN' ");
                    while (rs1.next()) {    
						System.out.println(rs1.getString("states")  +"  "+"Male"+" "+"Total"+ " : "  + rs1.getShort("total_male"));
					}
					break;
				case 2:
					ResultSet rs2 = Stat.executeQuery(
							"select states,sum(male) as total_male from caronaDetails where states='AP' ");
					while (rs2.next()) {
						System.out.println(rs2.getString("states")  +"  "+"Male"+" "+"Total"+ " : "  + rs2.getShort("total_male"));
					}
					break;
				case 3:
					ResultSet rs3 = Stat.executeQuery(
							"select states,sum(male) as total_male from caronaDetails where states='KL' ");
					while (rs3.next()) {
						System.out.println(rs3.getString("states")  +"  "+"Male"+" "+"Total"+ " : "  + rs3.getShort("total_male"));
					}
					break;
					
				case 4:
					ResultSet rs4 = Stat.executeQuery(
							"select states,sum(female) as total_female from caronaDetails where states='TN'");
				while (rs4.next()) {
			     	System.out.println(rs4.getString("states")  +"  "+"Female"+" "+"Total"+ " : "  + rs4.getShort("total_female"));
				}				
					
                   break;
				case 5:
					ResultSet rs5 = Stat.executeQuery(
							"select states,sum(female) as total_female from caronaDetails where states ='AP'");
					while (rs5.next()) {
			     	System.out.println(rs5.getString("states")  +"  "+"Female"+" "+"Total"+ " : "  + rs5.getShort("total_female"));	
				}				
					
                   break;
				case 6:
					ResultSet rs6 = Stat.executeQuery(
							"select states,sum(female) as total_female from caronaDetails where states ='KL'");
					while (rs6.next()) {
			     	System.out.println(rs6.getString("states")  +"  "+"Female"+" "+"Total"+ " : "  + rs6.getShort("total_female"));
				}				
					
                   break;
				case 7: 
   					ResultSet rs7 = Stat.executeQuery(
   							"select states, sum(male)+sum(female) as total from caronaDetails where states='TN'");
   					while (rs7.next()) {
   						System.out.println(rs7.getString("states")+ " "+"Total"+" : " + rs7.getShort("total"));
   						}
   			
   					break;
				case 8: 
   					ResultSet rs8 = Stat.executeQuery(
   							"select states, sum(male)+sum(female) as total from caronaDetails where states='AP'");
   					while (rs8.next()) {
   						System.out.println(rs8.getString("states")+ " "+"Total"+" : " + rs8.getShort("total"));
   						}
   					
   					break;
				case 9: 
   					ResultSet rs9 = Stat.executeQuery(
   							"select states, sum(male)+sum(female) as total from caronaDetails where states='KL'");
   					while (rs9.next()) {
   						System.out.println(rs9.getString("states")+ " "+"Total"+" : " + rs9.getShort("total"));
   						}
   				
   					break;
				case 10:
   						ResultSet rs10 = Stat.executeQuery("select sum(male)+sum(female) as total from caronaDetails;");
   							while (rs10.next()) {
   							System.out.println("TN"+" "+"AP"+" "+"KL"+" "+"Total"+" "+" : "+rs10.getShort("total"));
   							}
                 		break;
				     default:
				    	 System.out.println("enter correct");
		}
			}
		
				
	}
			catch (Exception exc) {
			exc.printStackTrace();
		}finally {
		      try {
		          // Close connection
		          if (Stat != null) {
		            Stat.close();
		          }
		          if (Conn != null) {
		            Conn.close();
		          }
		        } catch (Exception e) {
		          e.printStackTrace();
		        }
		      System.out.println("connection terminated");
		      }
	}
}
            