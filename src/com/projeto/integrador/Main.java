package com.projeto.integrador;
import java.sql.Connection;
import java.sql.Statement;

import com.projeto.integrador.util.ConnectionUtil;

public class Main {

	public static void main(String[] args) {
		Connection connection = ConnectionUtil.getConnection();
		Statement stmt = connection.createStatement();
		

	}

}
