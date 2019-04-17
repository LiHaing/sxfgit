package com.yuki.util;

public class Page {
	// 当前页
	private int pageNow = 1;
	// 页面大小
	private int pageSize = 5;
	// 总数据
	private int totalData = 0;
	// 总页数
	private int totalPage = 0;
	// 分页第一条数据
	private int limit1 = 0;
	// 上一页
	private int pagePrev = 1;
	// 下一页
	private int pageNext = 0;

	private String pageHTML = "";

	private static Page page = new Page();

	private Page() {
	}

	public static Page getInstance(String pageNow, int totalData) {
		if (pageNow == null || pageNow == "") {
			pageNow = "1";
		}
		page.setTotalData(totalData);
		page.setPageNow(Integer.parseInt(pageNow));
		page.setPageHTML();
		return page;
	}

	// 获取当前页
	public int getPageNow() {
		return pageNow;
	}

	// 设置当前页
	public void setPageNow(int pageNow) {
		// 如果当前页小于等于0 就赋值为1
		this.pageNow = pageNow <= 0 ? 1 : pageNow;
		// 设置当前页时设置 分页第一条数据
		this.limit1 = (this.pageNow - 1) * this.pageSize;
		// 设置当前页时设置 前一页
		this.pagePrev = this.pageNow == 1 ? 1 : pageNow - 1;
		// 设置当前页时设置 下一页
		this.pageNext = this.pageNow == this.totalPage ? this.totalPage : this.pageNow + 1;
	}

	// 获取页面大小
	public int getPageSize() {
		return pageSize;
	}

	// 设置页面大小
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		// 设置页面大小时设置 总页数
		this.totalPage = (pageSize + this.totalData - 1) / pageSize;

	}

	// 获取总数据
	public int getTotalData() {
		return totalData;
	}

	// 设置总数据
	public void setTotalData(int totalData) {
		this.totalData = totalData;
		// 设置总数据时设置 总页数
		this.totalPage = (pageSize + this.totalData - 1) / pageSize;
	}

	// 设置前台分页代码
	public void setPageHTML() {
		pageHTML="";
		pageHTML += "<td>总共"+totalData+"条数据</td>";
		pageHTML += "<td>总共"+totalPage+"页</td>";
		pageHTML += "<td><a href='javascript:page(1)' >首页</a></td>";
		pageHTML += "<td><a href='javascript:page(" + pagePrev + ")' >上一页</a></td>";
		pageHTML += "<td><a href='javascript:page(" + pageNext + ")' >下一页</a></td>";
		pageHTML += "<td><a href='javascript:page(" + totalPage + ")' >尾页</a></td>";
		this.pageHTML = pageHTML;
	}

	// 获取总页数
	public int getTotalPage() {
		return totalPage;
	}

	// 获取分页第一个数据
	public int getLimit1() {
		return limit1;
	}

	// 获取下一页
	public int getPageNext() {
		return pageNext;
	}

	// 获取上一页
	public int getPagePrev() {
		return pagePrev;
	}

	public String getPageHTML() {
		return pageHTML;
	}

}
