package com.hot.board.notice;

import com.hot.board.BoardDTO;

public class NoticeDTO extends BoardDTO {

	private String email;
	private String nickname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
