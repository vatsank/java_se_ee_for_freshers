package com.training.ifaces;

import java.sql.SQLException;
import java.util.List;

public interface BloodDonorDAO<T> extends Dao<T> {

	public List<T> findByGroup(String bloodGroup) throws SQLException;
}
