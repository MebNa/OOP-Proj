package lib.manager.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnBewwwwwww
 */
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class CryptPass {
    public static String cryptPass(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            String sha256 = number.toString(16);

            while (sha256.length() < 32) {
                sha256 = "0" + sha256;
            }

            return sha256;
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Lỗi không xác định"); 
            return null;
        }
    }

}

