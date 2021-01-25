package com.spring.arsenalFanBoard.biz.answer;

import java.sql.Date;

public class AnswerVO {
	private String content;
	private String writer;
	private int boardSeq;
	private int seq;
	private Date answerRegDate;
	
	public Date getAnswerRegDate() {
		return answerRegDate;
	}
	public void setAnswerRegDate(Date answerRegDate) {
		this.answerRegDate = answerRegDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
}
