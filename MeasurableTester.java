import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class MeasurableTester {
	
	private static final int FRAME_WIDTH = 240;
	private static final int FRAME_HEIGHT = 160;
	
   public static void main(String[] args) {
   
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
     
      //Bank
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      
      //Quiz
      System.out.println("Quiz Data");
      Measurable[] quiz = new Measurable[5];
      quiz[0] = new Quiz(95);
      quiz[1] = new Quiz(80);
      quiz[2] = new Quiz(90);
      quiz[3] = new Quiz(50);
      quiz[4] = new Quiz(75);
      avg = Data.average(quiz);
      System.out.println("Average score: " + avg);
      System.out.println("Expected: 78");
      System.out.println("");
      maxData = Data.max(quiz);
      System.out.println("Maximum score: " + maxData);
      System.out.println("Expected: 95");
     
      System.out.println("Enter mertric to use, 1 for max, 2 for min, 3 for average");
      Scanner sc = new Scanner(System.in);
      int whichMetric = sc.nextInt();
      String metricToUse = "average";
      if (whichMetric == 1) {metricToUse = "Maximum";}
      if (whichMetric == 2) {metricToUse = "Minimum";}
      if (whichMetric == 3) {metricToUse = "Average";}
      
      JPanel panel =new JPanel();
      JFrame frame = new JFrame();
      frame.add(panel);
      
      //Bank
      JButton button = new JButton("Get" + metricToUse + " Balance");
      panel.add(button);
      ActionListener listener = new ButtonListener(bank, metricToUse);
      button.addActionListener(listener);
      
      //Countries
      JButton button2 = new JButton("Get" + metricToUse + " Area");
      panel.add(button2);
      ActionListener listener2 = new ButtonListener(countries, metricToUse);
      button2.addActionListener(listener2);
      
      //Quiz
      JButton button3 = new JButton("Get" + metricToUse + " Score");
      panel.add(button3);
      ActionListener listener3 = new ButtonListener(quiz, metricToUse);
      button3.addActionListener(listener3);
      
      //Display Buttons
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

   }

}
