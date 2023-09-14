import java.awt.event.*;

public class BAction extends Main {

	public BAction(){
		super("");  
	}

	BAction (String title){
		super (title) ;
		String s = this.getText();
		this.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
				if(sch2){
					tf2.setText("");
					sch2 = false;
				}
				try{
					switch(s){
						case "Clear":
							clear();
							break;
						case "Ans":
							ans();
							break;
						case "±":
							double i = Double.parseDouble(tf1.getText());
							i *= -1;
							tf1.setText(i + "");
							break;
						case "=":
							equal("=");
							tf2.setText(tf2.getText() + c);
							tf1.setText(Double.toString(ans));
							frame.setSize(410, 377);
							bdlt.setBounds(370, 40, 40, 60);
							mod = 0;
							num = ans;
							sch2 = true;
							history();
							break;
						case "↵":
							delete();
							break;
						case "AC":
							AC();
							break;
					}
				} catch (Exception ex){
					AC();
					tf1.setText("ERROR1");
					tf2.setText(ex.getMessage().toUpperCase());
				}
        	}
        });
	}

	private void clear(){
		hf1.setText("");
		hf2.setText("");
		hf3.setText("");
		hf4.setText("");
		hf5.setText("");
		frame.setSize(204, 377);
		bdlt.setBounds(164, 40, 40, 60);
		cnt = 0;
	}

	private void ans(){
		tf1.setText(num + "");
	}

	public void equal(String s){
		check();
		modifiar();
		switch(s.charAt(0)){
			case '%' : mod = 1; break;
			case '÷' : mod = 2; break;
			case '×' : mod = 3; break;
			case '-' : mod = 4; break;
			case '+' : mod = 5; break;
		}
        sch1 = true;
	}
	
	private void delete(){
		String s = tf1.getText();
		StringBuilder sb = new StringBuilder(s);
		sb.deleteCharAt(s.length()-1);
		tf1.setText(sb.toString());
	}

	public void AC(){
		tf1.setText("0");
		tf2.setText("");
		sch1 = true;
		sch2 = true;
		ans = 0;
		num = 0;
		h = "";
		c = "";
	}

    private void history(){
        cnt++;
		h = h + "=" + ans;
        if(cnt == 1){
            hf1.setText(h);
        }else if(cnt == 2){
            hf2.setText(h);
        }else if(cnt == 3){
            hf3.setText(h);
        }else if(cnt == 4){
            hf4.setText(h);
        }else if(cnt == 5){
            hf5.setText(h);
        }else if(cnt > 5){
            hf1.setText(hf2.getText());
            hf2.setText(hf3.getText());
            hf3.setText(hf4.getText());
            hf4.setText(hf5.getText());
            hf5.setText(h);
        }
		h = "";
    }

    private void modifiar(){
		int m = mod;
        double ii = Double.parseDouble(tf1.getText());
        if(m == 0){
            ans = ii;
            h = h + c;
        }else if(m == 1){
            ans = (ans/100)*ii;
            h = h + "%" + c;
        }else if(m == 2){
            ans /= ii;
            h = h + "÷" + c;
        }else if(m == 3){
            ans *= ii;
            h = h + "×" + c;
        }else if(m == 4){
            ans -= ii;
            h = h + "-" + c;
        }else if(m == 5){
            ans += ii;
            h = h + "+" + c;
        }

        long temp;
        ans *= 100000000;
        temp = (long)ans;
        if(ans-temp > 0.5){
            temp++;
        }
        ans = (double)temp;
        ans /= 100000000;
    }

	private void check(){
		double i = Double.parseDouble(tf1.getText());
		if(i < 0){
			c = "(" + i + ")";
		}else{
			c = i + "";
		}
	}
}
