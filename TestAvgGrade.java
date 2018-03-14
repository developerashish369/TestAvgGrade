/* Ashish Acharya
   ProjectII
   Due Date:Feb 26, 2018
   
   Write a program called TestAvgGrade.java. The program should ask the user to enter three test scores, and then assign the value 
    entered to the variables. The program should display a letter letter grade for each test score, and the average of test scores.
 */

import javax.swing.JOptionPane;

public class TestAvgGrade {
	
	public static void main(String[] args) {
		// Declare variables to hold user input
		String input1, input2, input3;
		// Declare variables to store converted user input
		double score1, 
			   score2, 
			   score3, 
	   		averageScore;
            String grade1="",grade2="",grade3="";
		
		// Prompt user for 3 test scores
		input1 = JOptionPane.showInputDialog(null,"Enter Test1 score:");
		input2 = JOptionPane.showInputDialog(null,"Enter Test2 score :");
		input3 =JOptionPane.showInputDialog(null,"Enter Test3 score:");
		
	   // Convert test scores to data type double
		score1 = Double.parseDouble(input1);
		score2 = Double.parseDouble(input2);
		score3 = Double.parseDouble(input3);
     

		
		// Calculate test score averageScore
		averageScore = (score1 + score2 + score3) / 3;
		
		
         // Design a decision structure to determine a letter grade for each test
	   
      if ((score1>=0&&score1<=100)&&(score2>=0&&score2<=100)&&(score3>=0&&score3<=100)){
         
         //tests conditions for score1
   		if(score1 >= 90){ grade1="A";
   		}
   		else if(score1 >= 80){grade1="B";
   		}
   		else if(score1 >= 70){grade1="C";
   		}
   		else if(score1 >= 60){grade1="D";
   		}
   		else if (score1 < 60) {grade1="F";
   		}
         
   		//tests conditions for score2
         if(score2 >= 90){grade2="A";
         }
         else if(score2 >= 80){grade2="B";
         }
         else if(score2 >= 70){grade2="C";
         }
         else if(score2 >= 60){grade2="D";
         }
         else if (score2 < 60) {grade2="F";
         }
         
      	//tests conditions for score1
	      if(score3 >= 90){grade3="A";
      	}
      	else if(score3 >= 80){grade3="B";
      	}
      	else if(score3 >= 70){grade3 =" C";
      	}
      	else if(score3 >= 60){grade3 =" D";
      	}
      	else if (score3 < 60) {grade3 =" F";
      	}
      	
         //Displays grades for each score and average score	
      	JOptionPane.showMessageDialog(null, "Your average is  " +String.format("%.2f\nGrade for Test1: %s\nGrade for Test2: %s\nGrade for Test3: %s",averageScore,grade1,grade2,grade3));
      }
      
      //Displays error if score1,score2 &score3 doesnt within 0-100
      else{
      JOptionPane.showMessageDialog(null, "Error");
      }
   }
}   