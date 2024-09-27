import javax.swing.JOptionPane;
public class Star {
	public static void printTriangle(int n) {
		StringBuilder triangle = new StringBuilder();
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n -i -1;j++) {
				triangle.append(" ");
			}
			for (int k = 0; k < (2*i + 1); k++) {
				triangle.append("*");
			}
			triangle.append("\n");
		}
		JOptionPane.showMessageDialog(null, triangle.toString());
	}
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter height(n): ");
		int n = Integer.parseInt(input);
		
		printTriangle(n);
	}
}
