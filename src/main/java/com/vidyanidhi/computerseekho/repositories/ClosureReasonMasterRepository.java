package com.vidyanidhi.computerseekho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.ClosureReasonMaster;

@Repository
public interface ClosureReasonMasterRepository extends JpaRepository<ClosureReasonMaster, Integer> {

}
