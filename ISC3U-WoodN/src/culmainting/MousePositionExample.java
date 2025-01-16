package culmainting;
import javax.swing.*;
import java.awt.event.*;

		

		public class MousePositionExample extends JFrame {
		    public MousePositionExample() {
		        // Create a JTable with 5 rows and 5 columns
		        String[][] data = {
		            {"1", "2", "3", "4", "5"},
		            {"6", "7", "8", "9", "10"},
		            {"11", "12", "13", "14", "15"},
		            {"16", "17", "18", "19", "20"},
		            {"21", "22", "23", "24", "25"}
		        };
		        String[] columnNames = {"A", "B", "C", "D", "E"};
		        JTable table = new JTable(data, columnNames);

		        // Add a MouseListener to capture mouse clicks
		        table.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                // Get the row and column from the MouseEvent
		                int row = table.rowAtPoint(e.getPoint());
		                int col = table.columnAtPoint(e.getPoint());

		                System.out.println("Mouse clicked at Row: " + row + ", Column: " + col);
		            }
		        });

		        add(new JScrollPane(table));

		        setTitle("Mouse Position in JTable");
		        setSize(400, 400);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setVisible(true);
		    }

		    public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> new MousePositionExample());
		    }
		}

	


