package com.restaurantly.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {
	@Id
	String id_users;
	String hoten;
	String sdt;
	String email;
	String avatar;
	String role;

	@OneToMany(mappedBy = "users")
	List<DatLich> datlich;
}
