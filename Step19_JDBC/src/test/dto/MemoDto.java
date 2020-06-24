package test.dto;

import java.sql.Date;

public class MemoDto {
	//필드
	private int num;
	private String content;
	private Date regdate;
	
	//디폴트생성자
	public MemoDto() {}
	//필드에 저장될값을 인자로 받는 생성자
	public MemoDto(int num, String content, Date regdate) {
		super();
		this.num=num;
		this.content=content;
		this.regdate=regdate;
	}
	
	//setter, getter 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num; 
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	
}
