package random.view;

import javax.swing.JOptionPane;

public class ArrayListPopUp
	{
		public String userInput(String input)
		{
			String answer = "";
				answer = JOptionPane.showInputDialog(input);
			return answer;
		}
		
		
		public void showSomething(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}
		
		public int yesOption()
		{
			int answer = 0;
				answer = JOptionPane.YES_OPTION;
			return answer;
		}
		
		public int noOption()
		{
			int answer = 0;
				answer = JOptionPane.NO_OPTION;
			return answer;
		}
		
		
	}
