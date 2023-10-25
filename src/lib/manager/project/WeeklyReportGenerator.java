/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib.manager.project;

/**
 *
 * @author AnBewwwwwww
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

public class WeeklyReportGenerator {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = (Connection) DB.getConnection();
            StringBuilder report = new StringBuilder();

            // Truy vấn sách đã mượn
            String queryBorrowed = 
                "SELECT b.BookName, u.FullName, ib.IssueDate, ib.ReturnDate " +
                "FROM issuedbook ib " +
                "JOIN books b ON ib.BookID = b.BookID " +
                "JOIN users u ON ib.UserID = u.UserID " +
                "WHERE ib.IssueDate >= DATE_SUB(NOW(), INTERVAL 30 DAY);";

            PreparedStatement stmt = conn.prepareStatement(queryBorrowed);
            ResultSet rs = stmt.executeQuery();

            report.append("Books Borrowed:\n");
            
            while (rs.next()) {
                // Xử lý kết quả từ truy vấn sách đã mượn và thêm vào report
                report.append(rs.getString("BookName"))
                      .append(" - ")
                      .append(rs.getString("FullName"))
                      .append(" - ")
                      .append(rs.getString("IssueDate"))
                      .append(" - ")
                      .append(rs.getString("ReturnDate"))
                      .append("\n");
            }
            report.append("\n");

            // Truy vấn sách đã trả
            String queryReturned = 
                "SELECT books.BookName, users.FullName AS BorrowerName, returned_books.ReturnDate " +
                "FROM returned_books " +
                "INNER JOIN books ON returned_books.BookID = books.BookID " +
                "INNER JOIN users ON returned_books.UserID = users.UserID " +
                "WHERE ReturnDate >= DATE_SUB(NOW(), INTERVAL 30 DAY);";

            stmt = conn.prepareStatement(queryReturned);
            rs = stmt.executeQuery();

            report.append("Books Returned:\n");
            while (rs.next()) {
                report.append(rs.getString("BookName"))
                      .append(" - ")
                      .append(rs.getString("BorrowerName"))
                      .append(" - ")
                      .append(rs.getString("ReturnDate"))
                      .append("\n");
            }
            report.append("\n");

            // Truy vấn người đọc quá hạn
            String queryOverdue = 
                "SELECT u.FullName, b.BookName, ib.IssueDate, ib.ReturnDate " +
                "FROM issuedbook ib " +
                "JOIN books b ON ib.BookID = b.BookID " +
                "JOIN users u ON ib.UserID = u.UserID " +
                "WHERE ib.ReturnDate < CURDATE();";

            stmt = conn.prepareStatement(queryOverdue);
            rs = stmt.executeQuery();

            report.append("Overdue Readers:\n");
            while (rs.next()) {
                report.append(rs.getString("FullName"))
                      .append(" - ")
                      .append(rs.getString("BookName"))
                      .append(" - ")
                      .append(rs.getString("IssueDate"))
                      .append(" - ")
                      .append(rs.getString("ReturnDate"))
                      .append("\n");
            }
            report.append("\n");

            // Truy vấn người đăng ký mới
            String queryNewMembers = 
                "SELECT * " +
                "FROM users " +
                "WHERE DATEDIFF(CURDATE(), RegDate) <= 30;";

            stmt = conn.prepareStatement(queryNewMembers);
            rs = stmt.executeQuery();

            report.append("New Members:\n");
            while (rs.next()) {
                report.append(rs.getString("FullName"))
                      .append(" - ")
                      .append(rs.getString("RegDate"))
                      .append("\n");
            }
            report.append("\n");

            // Truy vấn sách mới
            String queryNewBooks = 
                "SELECT BookName, RegBookDate " +
                "FROM books " +
                "WHERE RegBookDate >= CURDATE() - INTERVAL 30 DAY;";

            stmt = conn.prepareStatement(queryNewBooks);
            rs = stmt.executeQuery();

            report.append("New Books:\n");
            while (rs.next()) {
                report.append(rs.getString("BookName"))
                      .append(" - ")
                      .append(rs.getString("RegBookDate"))
                      .append("\n");
            }


            // Ghi file
            String file_name = generateFileName();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_name))) {
                writer.write(report.toString());
            }
        } catch (SQLException | IOException e) {
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }
    
 
    

    public static String generateFileName() {
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate lastWeek = today.minusDays(7);
        String fileName = lastWeek.toString() + " - " + today.toString() + " report.txt";
        return fileName;
    }

}

