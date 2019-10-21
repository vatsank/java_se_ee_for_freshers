package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.rest_quickstart.Customer;
import com.training.ifaces.Dao;
import com.training.utils.DbConnection;

public class CustomerDaoImpl implements Dao<Customer> {

	private Connection con;
	
	
	
	public CustomerDaoImpl() {
		super();
	
		this.con = DbConnection.getOracleConnection();
	}

	@Override
	public int add(Customer t) throws SQLException {
		
		String sql = "insert into mycustomer values(?,?,?)";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setInt(1, t.getCustomerId());
		pstmt.setString(2, t.getCustomerName());
		pstmt.setLong(3, t.getMobileNumber());
		
		return pstmt.executeUpdate();
	}

	@Override
	public List<Customer> findAll() throws SQLException {

		String sql = "select *  from  mycustomer ";
		PreparedStatement pstmt= createStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();

		List<Customer> custList = new ArrayList<>();
		
		while(rs.next()) {
			 
			 Customer cust = mapToRow(rs);
			 
			 custList.add(cust);
		 }
		
		return custList;
	}

	@Override
	public Customer findById(int id) throws SQLException {

		String sql = "select * from  mycustomer where customerId =?";
		PreparedStatement pstmt= createStatement(sql);
		Customer cust =null;
		pstmt.setInt(1,id);
		
		ResultSet rs = pstmt.executeQuery();
		
		  if(rs.next()) {
			cust = mapToRow(rs);
		  }
		  
		  return cust;
	}

	@Override
	public int update(Customer t) throws SQLException {
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		String sql = "delete  from mycustomer where customerId =?";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setInt(1,id);
		
		return  pstmt.executeUpdate();
		
		  
		}

	public PreparedStatement createStatement(String sql) throws SQLException {
		
		
		return  con.prepareCall(sql);
		 
	}
	
	public Customer mapToRow(ResultSet rs)  throws SQLException{
		
		int customerId = rs.getInt("customerId");
		String customerName = rs.getString("customerName");
		long mobileNumber = rs.getLong("mobileNumber");
		
		
		return new Customer(customerId, customerName, mobileNumber);
	}
}
