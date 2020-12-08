package com.vwits.register;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionRepo {

       public static int Insert(Question q){
             int x=0;
             MyDBConnection con= new MyDBConnection();
       
   PreparedStatement ps = con.getPreparedStatement("insert into exam values(?,?,?,?,?,?)");
    try {
       ps.setString(1, q.getQuestion());
       
       ps.setString(2, q.getOption1());
        ps.setString(3,q.getOption2());  
        ps.setString(4,q.getOption3()); 
        ps.setString(5,q.getOption4());  
        ps.setString(6,q.getAnswer());  

        x=ps.executeUpdate();  

  } 
    catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    } 
    return x;
}
}
