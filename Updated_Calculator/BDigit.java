import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BDigit extends Main {

	public BDigit (String title){
		super (title) ;
		this.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
        		click () ;
        	}
        });
		
	}

	private void click () {
		if(sch2){
			tf2.setText("");
			sch2 = false;
		}
        try{
            if(sch1){
                tf1.setText("");
                sch1 = false;
            }
            String s = tf1.getText();
            tf1.setText(s + this.getText());
        }catch(Exception ex){
            new BAction().AC();
            tf1.setText("ERROR3");
            tf2.setText(ex.getMessage().toUpperCase());
        }
	}
}
