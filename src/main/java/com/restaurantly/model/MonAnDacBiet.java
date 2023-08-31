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
@Table(name = "Monandacbiet")
public class MonAnDacBiet implements Serializable {
	@Id
	Integer id_monandacbiet;
	Integer id_monan;

	@OneToMany(mappedBy = "monandacbiet")
	List<MonAn> monan;
}
