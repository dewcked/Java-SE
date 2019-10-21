package com.dewcked.DiceGameModule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
    String driver        = "org.mariadb.jdbc.Driver";
    // 수정해야 하는 곳, 데이터베이스 경로
    String url           = "jdbc:mariadb://localhost:3306/db";
    // 수정해야 하는 곳, 테이블명
    String tablename = "score";
    // 수정해야 하는 곳, 최고 점수 컬럼명 (int형 컬럼)
    String columnname = "highscore";
    Connection               con;
    PreparedStatement        pstmt;
    ResultSet                rs;
    
    public DBManager() {
         try {
            Class.forName(driver);
            // 수정해야 하는 곳, 데이터베이스 계정 이름, 계정 비밀번호
            con = DriverManager.getConnection(url, "계정 이름", "계정 비밀번호");
            
            if( con != null ){ System.out.println("데이터 베이스 접속 성공"); }
            
        } catch (ClassNotFoundException e) { System.out.println("드라이버 로드 실패");    } 
          catch (SQLException e) { System.out.println("데이터 베이스 접속 실패"); }
    }
    
    public int LoadScore(){
        String sql    = "select "+columnname+" from "+tablename;
        try {
            pstmt                = con.prepareStatement(sql);
            rs                   = pstmt.executeQuery();
            if(rs.next())
            	return rs.getInt(columnname);
            return 0;
        } catch (SQLException e) { System.out.println("쿼리 수행 실패"+e); }
        return -1;
    }
    public void WriteScore(int highscore){
        String sql;
        try {
        	sql = "truncate "+tablename;
            pstmt                = con.prepareStatement(sql);
            rs                   = pstmt.executeQuery();
            
        	sql = "insert into "+tablename+" values ("+highscore+")";
            pstmt                = con.prepareStatement(sql);
            rs                   = pstmt.executeQuery();
            
        } catch (SQLException e) { System.out.println("쿼리 수행 실패"+e); }
    }
}