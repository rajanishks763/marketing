package com.marketing.payload;

import java.util.List;

import com.marketing.entities.Lead;

public class PostResponse {

	private List<Lead> content;
	private int pageNo;
	private int pageSize;
	private long totalElements;
	private long totalPages;
	private boolean last;
	public List<Lead> getContent() {
		return content;
	}
	public void setContent(List<Lead> content) {
		this.content = content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	

	
}
