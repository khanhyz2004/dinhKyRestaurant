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
@Table(name = "sanh")
public class Sanh implements Serializable {
	@Id
	Integer id_sanh;
	String ten_sanh;
	Integer soluongchua;
	Float giatien;
	String motasanh;

	@OneToMany(mappedBy = "sanh")
	List<DatLich> datlich;
}
