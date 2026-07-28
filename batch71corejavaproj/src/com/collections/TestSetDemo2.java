package com.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Customer {
	int cid;
	String cname;
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (!(obj instanceof Customer))
			return false;

		Customer other = (Customer) obj;
		
		return cid == other.cid &&
			   Objects.equals(cname, other.cname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cid, cname);
	}

	public Customer(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}

}

public class TestSetDemo2 {

	public static void main(String[] args) {

		Customer c1 = new Customer(7, "Dhoni");
		Customer c2 = new Customer(7, "Dhoni");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		Set<Customer> ss = new HashSet<>();
		ss.add(c1);
		ss.add(c2);

		System.out.println(ss);

	}

}
