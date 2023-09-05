package com.example.UserMicroservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity //@Entity annotation specifies that the class is an entity and is mapped to a database table.
@Table(name="UserRegister") //The @Table annotation specifies the name of the database table to be used for mapping. 
public class UserRegister {
		@Id //@Id annotation specifies the primary key of an entity
		private String username;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		private String password;
		
		

	}




