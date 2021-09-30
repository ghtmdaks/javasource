package com.hot.util.page;

public class Pager {

	// 페이징 설정
	private Integer perPage; // 페이지 당 글의 갯수
	private Integer perBlock; // 블럭 당 페이지의 갯수
	// total
	private Integer totalRow; // 글의 총 갯수
	private Integer totalPage; // 페이지의 총 갯수
	private Integer totalBlock; // 블럭의 총 갯수
	// 페이지
	private Integer curPage; // 현재 페이지
	private Integer startRow; // 글의 시작 ROWNUM
	private Integer endRow; // 글의 끝 ROWNUM
	// 블럭
	private Integer curBlock; // 현재 블럭
	private Integer startPage; // 시작 페이지
	private Integer endPage; // 끝 페이지

	public void paging() { // 페이징 처리

		System.out.println("Paging:");

		// data
		Integer tPerPage = this.getPerPage();
		Integer tPerBlock = this.getPerBlock();
		Integer tTotalRow = this.getTotalRow();
		Integer tCurPage = this.getCurPage();

		// total
		totalPage = (tTotalRow / tPerPage) + (tTotalRow % tPerPage == 0 ? 0 : 1);
		totalBlock = (totalPage / tPerBlock) + (totalPage % tPerBlock == 0 ? 0 : 1);

		// page
		startRow = (tCurPage - 1) * tPerPage + 1;
		endRow = tCurPage * tPerPage;

		// block
		curBlock = (tCurPage - 1) / tPerBlock + 1;
		startPage = (curBlock - 1) * tPerBlock + 1;
		endPage = (curBlock * tPerBlock) > totalPage ? totalPage : (curBlock * tPerBlock);
	}

	public Integer getTotalRow() {
		if (totalRow == null)
			totalRow = 0;
		return totalRow;
	}

	public void setTotalRow(Integer totalRow) {
		if (totalRow == null)
			totalRow = 0;
		this.totalRow = totalRow;
	}

	public Integer getPerPage() {
		if (perPage == null || perPage < 10)
			perPage = 10;
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		if (perPage == null || perPage < 10)
			perPage = 10;
		this.perPage = perPage;
	}

	public Integer getPerBlock() {
		if (perBlock == null || perBlock < 5)
			perBlock = 5;
		return perBlock;
	}

	public void setPerBlock(Integer perBlock) {
		if (perBlock == null || perBlock < 5)
			perBlock = 5;
		this.perBlock = perBlock;
	}

	public Integer getCurPage() {
		if (curPage == null || curPage < 1)
			curPage = 1;
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		if (curPage == null || curPage < 1)
			curPage = 1;
		this.curPage = curPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public Integer getTotalBlock() {
		return totalBlock;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public Integer getCurBlock() {
		return curBlock;
	}

	public Integer getStartPage() {
		return startPage;
	}

	public Integer getEndPage() {
		return endPage;
	}

}
