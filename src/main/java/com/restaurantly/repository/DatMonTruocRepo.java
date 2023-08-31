package com.restaurantly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantly.model.DatMonTruoc;
import com.restaurantly.model.DatMonTruoc_ID;

public interface DatMonTruocRepo extends JpaRepository<DatMonTruoc, DatMonTruoc_ID> {

}
