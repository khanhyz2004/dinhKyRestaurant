package com.restaurantly.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "monan")
public class MonAn implements Serializable {
	@Id
	String tenmon;
	Float giamon;
	String loaimonan;
	String mota;
	char anhmon;

	@ManyToOne
	@JoinColumn(name = "id_monan")
	MonAnDacBiet monandacbiet;
	@OneToMany(mappedBy = "monan")
	List<DatMonTruoc> datmontruoc;
}
