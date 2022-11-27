package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Customer;

public class CustomerDaoImpl implements CustomerDao{
	private EntityManager em;

	public CustomerDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	//CRUD OPERATION

	public void addCustomer(Customer customer) {
		em.persist(customer);		
	}

	public void updateCustomer(Customer customer) {
		em.merge(customer);
		
	}

	public void deleteCustomer(Customer customer) {
		em.remove(customer);
		
	}

	public Customer getCustomerById(int cust_ID) {
		Customer customer=em.find(Customer.class, cust_ID);
		return customer;
	}

	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	public void beginTransaction() {
		em.getTransaction().begin();

	}
}
