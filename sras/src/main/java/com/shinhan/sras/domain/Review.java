package com.shinhan.sras.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

public class Review {
	@Embedded
	@Id
	private ReviewPK reviewPK;

	@Column(name = "REVIEWER")
	private  String reviewer;

	@Column(name = "REVIEW_CONTENT")
	private  String reviewContent;

	@Column(name = "REVIEW_STAR")
	private String reviewStar;

	@Column(name = "DEVICE_INFO")
	private String deviceInfo;

	@Column(name = "APP_VERSION")
	private String appVersion;

	@Column(name = "OS_KIND")
	private String osKind;

	@Column(name = "OS_VERSION")
	private String osVersion;

	@Column(name = "TAG")
	private String tag;

	public Review() {
	}

	public Review(ReviewPK reviewPK, String reviewer, String reviewContent, String reviewStar, String deviceInfo, String appVersion, String osKind, String osVersion, String tag) {
		this.reviewPK = reviewPK;
		this.reviewer = reviewer;
		this.reviewContent = reviewContent;
		this.reviewStar = reviewStar;
		this.deviceInfo = deviceInfo;
		this.appVersion = appVersion;
		this.osKind = osKind;
		this.osVersion = osVersion;
		this.tag = tag;
	}

	public ReviewPK getReviewPK() {
		return reviewPK;
	}

	public void setReviewPK(ReviewPK reviewPK) {
		this.reviewPK = reviewPK;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewStar() {
		return reviewStar;
	}

	public void setReviewStar(String reviewStar) {
		this.reviewStar = reviewStar;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getOsKind() {
		return osKind;
	}

	public void setOsKind(String osKind) {
		this.osKind = osKind;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
}
