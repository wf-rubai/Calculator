import java.awt.event.*;

public class BOperator extends Main {

	public BOperator (String title){
		super (title) ;
		this.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
                click();
        	}
        });
	}

	private void click () {
		if(sch2){
			tf2.setText("");
			sch2 = false;
		}
        try{
            if(tf2.getText() != ""){
                String s = this.getText();
                new BAction().equal(s);
                tf2.setText(c + this.getText());
                tf1.setText("");
            }
        }catch(Exception ex){
            new BAction().AC();
            tf1.setText("ERROR2");
            tf2.setText(ex.getMessage().toUpperCase());
        }
	}
}
