package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.BloodDonor;
import com.training.ifaces.BloodDonorDAO;
import com.training.ifaces.Dao;
import com.training.utils.DbConnection;

public class BloodDonorDaoImpl implements BloodDonorDAO<BloodDonor> {

	private Connection con;
	
	
	
	public BloodDonorDaoImpl() {
		super();
	
		this.con = DbConnection.getOracleConnection();
	}

	@Override
	public int add(BloodDonor t) throws SQLException {
		
		String sql = "insert into BLOODDONOR	 values(?,?,?)";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setLong(1, t.getMobileNumber());
		pstmt.setString(2, t.getDonorName());
		pstmt.setString(3, t.getBloodGroup());
		
		return pstmt.executeUpdate();
	}

	@Override
	public List<BloodDonor> findAll() throws SQLException {

		String sql = "select *  from  BLOODDONOR ";
		PreparedStatement pstmt= createStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();

		List<BloodDonor> donorList = new ArrayList<>();
		
		while(rs.next()) {
			 
			BloodDonor cust = mapToRow(rs);
			 
			donorList.add(cust);
		 }
		
		return donorList;
	}

	@Override
	public BloodDonor findById(long id) throws SQLException {

		String sql = "select * from  BLOODDONOR	 where mobileNumber =?";
		PreparedStatement pstmt= createStatement(sql);
		BloodDonor donor =null;
		pstmt.setLong(1,id);
		
		ResultSet rs = pstmt.executeQuery();
		
		  if(rs.next()) {
			  donor = mapToRow(rs);
		  }
		  
		  return donor;
	}

	@Override
	public int update(BloodDonor t) throws SQLException {
		return 0;
	}

	@Override
	public int remove(long id) throws SQLException {
		String sql = "delete  from BLOODDONOR	 where mobileNumber =?";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setLong(1,id);
		
		return  pstmt.executeUpdate();
		
		  
		}

	public PreparedStatement createStatement(String sql) throws SQLException {
		
		
		return  con.prepareCall(sql);
		 
	}
	
	public BloodDonor mapToRow(ResultSet rs)  throws SQLException{
		
		
		long mobileNumber = rs.getLong("mobileNumber");
		String donorName = rs.getString("DONORNAME");
		String bloodGroup = rs.getString("BLOODGROUP");

		return new BloodDonor(mobileNumber,donorName,bloodGroup);
	}

	@Override
	public List<BloodDonor> findByGroup(String bloodGroup) throws SQLException {
		String sql = "select * from  BLOODDONOR	 where bloodGroup =?";
		List<BloodDonor> donorList = new ArrayList<>();

		PreparedStatement pstmt;
		try {
			pstmt = createStatement(sql);
			pstmt.setString(1,bloodGroup);
			ResultSet rs = pstmt.executeQuery();

			
			 while(rs.next()) {
				 BloodDonor  donor = mapToRow(rs);
				 donorList.add(donor);
			  }
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		  return donorList;
	}

	
}
