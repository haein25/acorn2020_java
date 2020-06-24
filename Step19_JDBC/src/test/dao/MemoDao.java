package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemoDto;
import test.util.DBConnect;

public class MemoDao {
	//필드
	public static MemoDao dao;
	//생성자(private)
	private MemoDao() {}
	
	//이 메소드를 호출하면 MemoDao가 만들어진다 
	public static MemoDao getInstance() {
		if(dao==null) {
			dao=new MemoDao();
		}
		return dao;
	}
		//회원 한명의 정보를 리턴해주는 메소드
		public MemoDto getData(int num) {
			//회원 한명의 정보를 담을 MemoDto 
			MemoDto dto=null;
			
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
				conn=new DBConnect().getConn();
				//실행할 sql 문
				String sql="SELECT content, regdate"
						+ " FROM memo"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				//query 문 수행하고 결과 얻어오기
				rs=pstmt.executeQuery();
				//반복문 돌면서 select 된 회원정보  읽어오기
				while(rs.next()) {
					//MemberDto 객체 생성해서 
					dto=new MemoDto();
					//회원 한명의 정보를 담는다. 
					dto.setNum(num);
					dto.setContent(rs.getString("content"));
					dto.setRegdate(rs.getDate("regdate"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					//객체를 사용했던 순서 역순으로 닫아준다.
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}		
			
			return dto;
		}
		
		//회원 목록을 리턴해주는 메소드
		public List<MemoDto> getList(){
			//회원 목록을 담을 객체 생성
			List<MemoDto> list=new ArrayList<>();
			
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
				conn=new DBConnect().getConn();
				//실행할 sql 문
				String sql="SELECT num,content,regdate"
						+ " FROM memo"
						+ " ORDER BY num ASC";
				pstmt=conn.prepareStatement(sql);
				//query 문 수행하고 결과 얻어오기
				rs=pstmt.executeQuery();
				//반복문 돌면서 select 된 회원정보  읽어오기
				while(rs.next()) {
					//회원정보를 list 에 담아 보세요.
					int num=rs.getInt("num");
					String content=rs.getString("content");
					Date regdate=rs.getDate("regdate");
					//MemberDto 객체를 생성해서 회원 한명의 정보를 담는다.
					MemoDto dto=new MemoDto();
					dto.setNum(num);
					dto.setContent(content);
					dto.setRegdate(regdate);
					//MemoDto 객체를 List 에 누적 시킨다.
					list.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					//객체를 사용했던 순서 역순으로 닫아준다.
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
			
			return list;
		}
		
		//회원 한명의 정보를 DB 에서 삭제하는 메소드
		public boolean delete(int num) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="DELETE FROM memo"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				flag=pstmt.executeUpdate();
				System.out.println("회원 정보를 삭제 했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
			if(flag>0) {
				return true;
			}else {
				return false;
			}
		}
		
		//회원 정보를 DB 에 저장하는 메소드  (작업의 성공여부가 boolean 으로 리턴된다.)
		public boolean insert(MemoDto dto) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="INSERT INTO memo"
						+ " (num, content, regdate)"
						+ " VALUES(memo_seq.NEXTVAL, ?, SYSDATE)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dto.getContent());
				// sql 문을 수행하고 변화된 row의 갯수를 리턴받는다. (1)을 리턴받을것
				flag=pstmt.executeUpdate();
				System.out.println("회원 정보를 추가 했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
			if(flag>0) {
				return true; //작업 성공이라는 의미에서 true 를 리턴한다.
			}else {
				return false; //작업 실패라는 의미에서 false 를 리턴한다.
			}
		}
	
	
		//회원 정보를 DB 에서 수정하는 메소드
		public boolean update(MemoDto dto) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int flag=0;
			try {
				conn=new DBConnect().getConn();
				String sql="UPDATE memo"
						+ " SET content=?, regdate=SYSDATE"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dto.getContent());
				pstmt.setInt(2, dto.getNum());
				//update 문 row 의 갯수가 반환된다.
				flag=pstmt.executeUpdate();
				System.out.println("회원 정보를 수정했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {}
			}
			if(flag>0) {
				return true;
			}else {
				return false;
			}
		}
}
