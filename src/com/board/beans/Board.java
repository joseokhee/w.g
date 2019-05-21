package com.board.beans;

public class Board{
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", writer=" + writer + ", difficulty=" + difficulty + ", content=" + content
				+ ", getIdx()=" + getIdx() + ", getWriter()=" + getWriter() + ", getDifficulty()=" + getDifficulty()
				+ ", getContent()=" + getContent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private int idx;
	private String writer;
	private String difficulty;
	private String content;
}