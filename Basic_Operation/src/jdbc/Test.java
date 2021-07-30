package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[]args)
	{
	try
	{
	 Class.forName("oracle.jdbc.OracleDriver");
	}

	catch(ClassNotFoundException e)
	{
	 System.out.println("can not found the driver:"+e.getMessage());
	 System.exit(0);
	}
	try
	{
	   
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","root");
	System.out.println("record found..........");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select bname,bprice from book");
	String bname;
	int cost=0;
	int totalcost=0,count=0;
	while(rs.next())
	{
	bname=rs.getString(1);
	cost=rs.getInt(2);
	System.out.println(bname+"\t"+cost);
	totalcost+=cost;
	++count;
	}
	if(cost!=0)
	System.out.println("Average price="+totalcost/count);
	else
	System.out.println("no record found");
	conn.close();
	}
	catch(Exception se)
	{
	System.out.println("problum while executing:"+se.getMessage());
	}
}
}
