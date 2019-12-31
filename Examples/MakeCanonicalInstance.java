import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
public class MakeCanonicalInstance {
	public static void main(String[] args){
	String className = JOptionPane.showInputDialog("Enter the class name: ");
	
	String output = ";;Tell to create a canonical_instance.\n(:create-instance " + className + "_canonical_instance root_context)\n(:direct-type-of " + className + " " + className + "_canonical_instance root_context)\n(:direct-type-of canonical_instance " + className + "_canonical_instance root_context)";
	//JOptionPane.showMessageDialog(null, output);
	JTextArea ta = new JTextArea(10,40);
	ta.setText(output);
	ta.setWrapStyleWord(true);
	ta.setLineWrap(true);
	ta.setCaretPosition(0);
	ta.setEditable(false);
	JOptionPane.showMessageDialog(null, new JScrollPane(ta), "RESULT", JOptionPane.INFORMATION_MESSAGE);


	}
}

