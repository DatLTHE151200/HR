/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import DAL.*;
import java.util.*;
import model.*;
/**
 *
 * @author Admin
 */
public class test {
    public static void main(String args[]) {
        try {
            UserDAO udao = new UserDAO();
            List<TrinhDoHocVan> list = udao.getListHocVan();
            for (TrinhDoHocVan hv : list) {
                System.out.println(hv.getMaTrinhDoHocVan() + ' ' + hv.getTenTrinhDo());
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
