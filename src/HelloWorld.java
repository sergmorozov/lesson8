import javax.swing.JFrame;

public class HelloWorld extends JFrame {
		
		public HelloWorld(){
			setSize(200,300);
			setTitle("Hello World");
			setVisible(true);
		}
		public static void main(String[] args) {
			HelloWorld myHello = new HelloWorld();
		}
}