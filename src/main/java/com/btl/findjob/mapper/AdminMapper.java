package com.btl.findjob.mapper;

import java.util.List;


import com.btl.findjob.model.CompanyReview;
import com.btl.findjob.model.InterviewReviewDTO;
import com.btl.findjob.model.UserDTO;

public interface AdminMapper {
	public List<UserDTO> get_userlist();
	
	List<CompanyReview> myReviewComment(int user_id);
	
	List<InterviewReviewDTO> myInterviewReview(int user_id);
   


}
