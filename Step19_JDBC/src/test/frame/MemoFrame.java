package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dao.MemoDao;
import test.dto.MemberDto;
import test.dto.MemoDto;

/* CREATE TABLE MEMO
 * (num NUMBER PRIMARY KEY,
 * content VARCHAR2(30),
 * regdate DATE);
 * 
 * 
 * 	CREATE SEQUENCE MEMO_SEQ;
 * 
 * 	위와 같이 테이블과 시퀀스를 만들고 해당 테이블에 데이터를
 * 	SELECT, INSERT, UPDATE, DELETE 기능을 수행할 수 있는 MemoFrame 을 만들어보세요.
 * 
 * 조건
 * 1. num 칼럼의 값은 시퀀스를 이용해서 넣으세요.
 * 2. regdate 칼럼(등록일)의 값은 SYSDATE 를 이용해서 넣으세요.
 * 3. 수정은 content 만 수정 가능하게 하세요.
 * 4. MemoDto, MemoDao 를 만들어서 프로그래밍 하세요.
 * 
 * 
 */
public class MemoFrame extends JFrame implements ActionListener{
	//필드
	JTextField inputcontent;
	DefaultTableModel model;
	
	
	public MemoFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("content");
		inputcontent=new JTextField(10);
		
		JButton insertBtn=new JButton("insert");
		insertBtn.addActionListener(this);
		insertBtn.setActionCommand("insert");
		JButton updateBtn=new JButton("update");
		updateBtn.addActionListener(this);
		updateBtn.setActionCommand("update");
		JButton deleteBtn=new JButton("delete");
		deleteBtn.addActionListener(this);
		deleteBtn.setActionCommand("delete");

		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputcontent);
		panel.add(insertBtn);
		panel.add(updateBtn);
		panel.add(deleteBtn);
		
		add(panel, BorderLayout.NORTH);
		
		//표형식으로 정보를 출력하기 위한 JTable
		//table=new JTable();
		//칼럼명을 String[] 에 순서대로 준비
		String[] colNames= {"번호", "내용", "등록일"};
		//테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
		model=new DefaultTableModel(colNames, 0) {
			//인자로 전달되는 행(row), 열(column) 수정 가능 여부를 리턴하는 메소드  
			@Override
			public boolean isCellEditable(int row, int column) {
				//만일 첫번째(0번째) 칼럼이면 수정이 불가 하도록 한다.
				if(column==0) {
					return false;
				}
				return true;
			}
		};
	}
	
	public void displayMemo() {
		//row  의 갯수를 강제로 0 으로 지정해서 삭제 한다. 
		model.setRowCount(0);
		//회원 목록을 얻어와서 
		MemoDao dao=MemoDao.getInstance();
		List<MemoDto> list=dao.getList();
		for(MemoDto tmp:list) {
			//MemoDto 객체에 저장된 정보를 Object[] 객체에 순서대로 담는다.
			Object[] row= {tmp.getNum(), tmp.getContent(), tmp.getRegdate()};
			model.addRow(row);
		}
	}
	
	
	//main  메소드
	public static void main(String[] args) {
		MemoFrame f=new MemoFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command=e.getActionCommand();
		if(command.equals("insert")) {
			String content=inputcontent.getText();
			MemoDto dto=new MemoDto();
			dto.setContent(content);
			MemoDao dao=MemoDao.getInstance();
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this,"정보가 추가 됐습니다.");
			}else {
				JOptionPane.showMessageDialog(this, "추가 실패!");
			}
			//JTable 에 목록 다시 출력하기 
			displayMemo();
			
			
			
		}else if(command.equals("update")) {
			
		}else if(command.equals("delete")) {
			
		}
		
		
	}
}
