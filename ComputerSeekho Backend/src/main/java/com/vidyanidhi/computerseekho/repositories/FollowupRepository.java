package com.vidyanidhi.computerseekho.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.Enquiry;
import com.vidyanidhi.computerseekho.entities.Followup;
@Repository
public interface FollowupRepository extends JpaRepository<Followup,Integer>
{
	@Query(value="select * from enquiry",nativeQuery=true)
	public List<Enquiry> getAll();
	
	@Query(value="select * from enquiry where staff_id=:staff_id",nativeQuery = true)
	public List<Enquiry> getBystaffId(@Param("staff_id")int staffid);

}
