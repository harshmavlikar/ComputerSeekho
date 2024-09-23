package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.ClosureReasonMaster;
import com.vidyanidhi.computerseekho.entities.Video;

public interface ClosureReasonManager {
	void addClosureReason(ClosureReasonMaster cr);
	void deleteClosureReason(int id);
	List<ClosureReasonMaster> getAllClosureResons();
	Optional<ClosureReasonMaster> getClosureReason(int id);
}
