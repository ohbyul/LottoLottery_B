package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Lotto extends JFrame{
	

	
	
	public JTextField tfLotto;
	public JTextField tfNumber1;
	public JTextField tfNumber2;
	public JTextField tfNumber3;
	public JTextField tfNumber4;
	public JTextField tfNumber5;
	public JTextField tfNumber6;
	
	public JButton btnRandom;
	public JButton btnEnd;
	
	
	public Lotto() {
		super("♥ 벼리가 만든 로또 랜덤 추첨기 ♥");
			//기본창 설정
		Frames.lotto = this;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(200, 200, 400, 350);
		
		tfLotto = new JTextField("  추첨 버튼을 누르면 랜덤 번호가 생성 됩니다'^'희희");
		tfLotto.setBounds(40, 20, 300, 40);
		this.add(tfLotto);
		
		tfNumber1 = new JTextField();
		tfNumber1.setBounds(40, 70, 50, 50);
		this.add(tfNumber1);
		
		tfNumber2 = new JTextField();
		tfNumber2.setBounds(100, 70, 50, 50);
		this.add(tfNumber2);
		
		tfNumber3 = new JTextField();
		tfNumber3.setBounds(160, 70, 50, 50);
		this.add(tfNumber3);
		
		tfNumber4 = new JTextField();
		tfNumber4.setBounds(40, 150, 50, 50);
		this.add(tfNumber4);
		
		tfNumber5 = new JTextField();
		tfNumber5.setBounds(100, 150, 50, 50);
		this.add(tfNumber5);
		
		tfNumber6 = new JTextField();
		tfNumber6.setBounds(160, 150, 50, 50);
		this.add(tfNumber6);
		
		
		btnRandom = new JButton("추첨");
		btnRandom.setBounds(40, 220, 80, 50);
		btnRandom.addActionListener(new LottoGetNum());
		this.add(btnRandom);
		
		btnEnd = new JButton("종료");
		btnEnd.setBounds(220, 220, 80, 50);
		btnEnd.addActionListener(new MainCloseCommand());
		this.add(btnEnd);
		
		
		
		
		
		this.setVisible(true);
	}
	
}
class MainCloseCommand implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Frames.lotto.dispose();		//널포인트 입셉션.
	}
}


class LottoGetNum implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int [] lottonum	 = new int [6];
		int n = 6 ;
		int index = 0;
		int temp;
		
		while(true) {
			boolean b = false;
			int aa= (int)(Math.random()*46)+1;
			for (int i = 0; i < n ; i++) {
				if( aa == lottonum[i]) {
					b=true;
					break;				
				}
			}
			if(b == false) {
				lottonum[index] = aa;
				index++;
				
			}
			
			if(index >= 6) {
				break;
			}
			
			
		}	//while
		

		
		
		Frames.lotto.tfNumber1.setText(lottonum[0]+"");
		Frames.lotto.tfNumber2.setText(lottonum[1]+"");
		Frames.lotto.tfNumber3.setText(lottonum[2]+"");
		Frames.lotto.tfNumber4.setText(lottonum[3]+"");
		Frames.lotto.tfNumber5.setText(lottonum[4]+"");
		Frames.lotto.tfNumber6.setText(lottonum[5]+"");
		
		

		

		
		
		
	}
	
}
