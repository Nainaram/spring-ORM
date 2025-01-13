package com.ram.spring.orm.model.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name ="user")
public class User {

		@Id
		@Column(name ="id")
		@GeneratedValue (strategy = GenerationType.AUTO)
		private int id;
		@Column(name ="name")
		private String name;
		@Column(name ="email")
		private String email;
		@Column(name ="phone")
		private String phone;
		@Column(name ="address")
		private String address;
		@Column(name ="password")
		private String password;
		
		
		public User(int id, String name, String email, String phone, String address, String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.password = password;
		}
		@Autowired
		public User(
				@Value("rahul") String name,
				@Value("rahul@gmail.com") String email, 
				@Value("9110792672") String phone,
				@Value("bangalore") String address, 
				@Value("5057")String password) {
			super();
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
					+ address + ", password=" + password + "]";
		}
		
		
}
