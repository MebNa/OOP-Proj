package lib.manager.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookDao {
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}

    /**
     *
     * @param Publisher
     * @return
     */
    public static boolean PublisherValidate( String Publisher)
{
    boolean status = false;
    try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("select * from Publisher where PublisherName = ?"); 
        ps.setString(1, Publisher);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
        con.close();
    }catch(Exception e){System.out.println(e);}
    return status;
}
    
    public static int AddPublisher( String Publisher)
    {
        int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("insert into Publisher(PublisherName) values(?)");
		ps.setString(1,Publisher);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
        
    }

  
    public static int SaveBook(String BookN, String AuthorN, String PublisherN, String ShelfN, String RowN, String GenreN) {
        int status = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("select max(bookid) as maxBookId from books");
            rs = stmt.executeQuery();
            int maxBookId = 0;
            if (rs.next()) {
                maxBookId = rs.getInt("maxBookId");
            }
            int BookID = maxBookId + 1;
            java.util.Date currentDate = new java.util.Date();
            java.sql.Date regDate = new java.sql.Date(currentDate.getTime());
            PreparedStatement ps;
            ps = conn.prepareStatement("insert into Books(BookId, BookName, Author, Genre, Publisher, `Shelf`, `Row`, RegBookDate) values(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, BookID);
            ps.setString(2, BookN);
            ps.setString(3, AuthorN);
            ps.setString(4, GenreN);
            ps.setString(5, PublisherN);
            ps.setString(6, ShelfN);
            ps.setString(7, RowN);
            ps.setDate(8, regDate);
            status = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
        }
        return status;
        }

    }

    
    public static int Delete(int BookID)
    {
          int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("DELETE FROM Books where BookID=?");
		ps.setInt(1,BookID);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
        
    }
            
    
 

}
