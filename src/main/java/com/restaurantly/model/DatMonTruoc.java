package com.restaurantly.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "datmontruoc")
@IdClass(DatMonTruoc_ID.class)
public class DatMonTruoc implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "id_datlich")
	DatLich datlich;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_monan")
	MonAn monan;

	Integer soluong;
	String ghichu;

}
