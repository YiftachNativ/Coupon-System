package com.dao.interfaces;

import java.util.*;

import com.exeptionerrors.DaoExeption;
import com.javabeans.*;

public interface CompanyDAO {

	public void createCompany(Company company) throws DaoExeption;
	
	public void removeCompany(Company company) throws DaoExeption;
	
	public Coupon createCoupon(Company company ,Coupon coupon) throws DaoExeption;
	
	public void updateCompany(Company company) throws DaoExeption;

	public Company getCompany(long id) throws DaoExeption;
	public Company getCompanyByCoupon(Coupon coupon, Company company) throws DaoExeption;
	public Company getCompany(String compName) throws DaoExeption;

	public Collection<Company> getAllCompanies() throws DaoExeption;

	public Collection<Coupon> getCoupons(long compID) throws DaoExeption;

	public boolean login(String compName, String password) throws DaoExeption;



	

}
