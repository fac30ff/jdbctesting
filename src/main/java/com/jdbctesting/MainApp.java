package com.jdbctesting;

public class MainApp {
  public static void main(String[] args) throws Exception {
    MySqlDao dao = new MySqlDao();
    dao.readDataBase();
  }
}
