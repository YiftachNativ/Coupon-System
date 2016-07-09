package com.dao.interfaces;

import java.sql.SQLException;
import java.util.*;
import com.javabeans.*;

public interface CompanyDAO {
	
	public void createCompany(Company company) throws SQLException;
	
	public void removeCompany(Company company) throws SQLException;
	
	public void updateCompany(Company company) throws SQLException;
	public Company getCompany(long id);
	public Collection<Company> getAllCompanies() ;
	public Collection<Coupon> getCoupons(long compID);
	public boolean login(long compID, String password);
	
}
