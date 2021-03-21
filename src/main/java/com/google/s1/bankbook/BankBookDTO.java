package com.google.s1.bankbook;

public class BankBookDTO {

	private long booknumber;
	private String bookname;
	private double bookrate;
	private String booksale;
	
	public long getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(long booknumber) {
		this.booknumber = booknumber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookrate() {
		return bookrate;
	}
	public void setBookrate(double bookrate) {
		this.bookrate = bookrate;
	}
	public String getBooksale() {
		return booksale;
	}
	public void setBooksale(String booksale) {
		this.booksale = booksale;
	}
	
}
