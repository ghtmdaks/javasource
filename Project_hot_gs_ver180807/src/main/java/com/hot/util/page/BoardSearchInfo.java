package com.hot.util.page;

public class BoardSearchInfo {

	private String kind;
	private String search;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search.toLowerCase();
	}

}
