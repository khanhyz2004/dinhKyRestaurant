package com.restaurantly.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DatMonTruoc_ID implements Serializable {
	private DatLich datlich;
	private MonAn monan;
}
