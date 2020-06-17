package com.shinhan.sras.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReviewPK {
	@Column(name = "REVIEW_ID")
	private String reviewId;

	@Column(name = "REVIEW_DATE")
	private String reviewDate;

	public ReviewPK() {
	}

	public ReviewPK(String reviewId, String reviewDate) {
		this.reviewId = reviewId;
		this.reviewDate = reviewDate;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
}
