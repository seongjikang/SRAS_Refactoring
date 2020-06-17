package com.shinhan.sras.daoimpl;

import com.shinhan.sras.dao.ReviewDao;

import java.util.Map;

public class ReviewDaoImpl implements ReviewDao {
	@Override
	public Map<String, Object> selectReviewList(String osType, String state, String searchText, String tagList, String startDate, String endDate) throws Exception {
		return null;
	}

	@Override
	public Map<String, Object> selectDetailReview(String reviewDate, String reviewId) throws Exception {
		return null;
	}

	@Override
	public Map<String, Object> selectRecommendReview(String reviewDate, String reviewId, String recommendReviewNo) throws Exception {
		return null;
	}
}