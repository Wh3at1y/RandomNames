package random.controller;

import java.util.ArrayList;

import random.view.ArrayListPopUp;

public class RandomController
	{
		
		private ArrayList<String> nameList;
		private ArrayListPopUp showPopUp;
		private ArrayListPopUp popUp;
		private int userYesNo;
		private String firstMember;
		private String secondMember;
		private String thirdMember;
		private String fourthMember;
		private String fithMember;
		
		public RandomController()
		{
			nameList = new ArrayList<String>();
			showPopUp = new ArrayListPopUp();
			popUp = new ArrayListPopUp();
		}
		
		public void start()
		{
			showPopUp.userConfirm("Family age test! Ready to start?");
			if(userYesNo==popUp.yesOption())
				{
					familyNames();
				}
				
			else
				{
					showPopUp.showSomething("Exiting program...");
				}
		}
		
		private void familyNames()
		{
			firstMember = showPopUp.userInput("Enter a family member's name. Click Cancel when you're finished.");
			nameList.add(firstMember);
			
			secondMember = showPopUp.userInput("Enter another family member's name. Click Cancel when you're finished.");
			nameList.add(secondMember);
			
			secondMember = showPopUp.userInput("Enter another family member's name. Click Cancel when you're finished.");
			nameList.add(firstMember);
			
			thirdMember = showPopUp.userInput("Enter another family member's name. Click Cancel when you're finished.");
			nameList.add(thirdMember);
			
			fourthMember = showPopUp.userInput("Enter another family member's name. Click Cancel when you're finished.");
			nameList.add(fourthMember);
			
			fithMember = showPopUp.userInput("Enter another family member's name. Click Cancel when you're finished.");
			nameList.add(fithMember);
			
			showPopUp.showSomething(nameList.get(showPopUp.toString()));
		}
	}
