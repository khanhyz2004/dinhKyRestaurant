package com.restaurantly.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "datlich")
public class DatLich implements Serializable {
	@Id
	Integer id_datlich;
	@ManyToOne
	@JoinColumn(name = "id_user")
	Users users;
	LocalDateTime ngaydat;
	Integer soluongnguoi;
	@ManyToOne
	@JoinColumn(name = "id_sanh")
	Sanh sanh;
	String sdt_nguoidat;
	float tiendatcoc;
	@OneToMany(mappedBy = "datlich")
	List<DatMonTruoc> datmontruoc;
}
