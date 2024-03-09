package application;

import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GradeCalculator extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		Label name=new Label("Name:  ");
		Label id=new Label("ID:  ");
		Label title=new Label("CGPA CALCULATOR");
		
		TextField tf1=new TextField();
	    TextField tf2=new TextField();
		
	    Label lb1=new Label("Course:  ");
		Label lb2=new Label("Credit:  ");
		Label lb3=new Label("Grade:  ");
	    
		Label clb1=new Label("Course 1:  ");
		Label clb2=new Label("Course 2:  ");
		Label clb3=new Label("Course 3:  ");
		Label clb4=new Label("Course 4:  ");
		Label clb5=new Label("Course 5:  ");
		Label clb6=new Label("");
		
		ComboBox course1=new ComboBox();
		course1.getItems().add("ENG 102");
		course1.getItems().add("ENG 103");
		course1.getItems().add("ENG 111");
		course1.getItems().add("PHI 101");
		course1.getItems().add("PHI 104");
		course1.getItems().add("POL 101");
		course1.getItems().add("POL 104");
		course1.getItems().add("ECO 101");
		course1.getItems().add("ECO 104");
		course1.getItems().add("SOC 101");
		course1.getItems().add("ENV 203/ GEO 205");
		course1.getItems().add("ANT 101");
		course1.getItems().add("BIO 103");
		course1.getItems().add("MAT 116");
		course1.getItems().add("MAT 120");
		course1.getItems().add("MAT 125");
		course1.getItems().add("MAT 130");
		course1.getItems().add("MAT 250");
		course1.getItems().add("MAT 350");
		course1.getItems().add("MAT 361");
		course1.getItems().add("PHY 107");
		course1.getItems().add("PHY 108");
		course1.getItems().add("CHE 101");
		course1.getItems().add("EEE 452");
		course1.getItems().add("CEE 110");
		course1.getItems().add("CSE 115");
		course1.getItems().add("CSE 115L");
		course1.getItems().add("CSE 215");
		course1.getItems().add("CSE 215L");
		course1.getItems().add("CSE 173");
		course1.getItems().add("CSE 225");
		course1.getItems().add("CSE 225L");
		course1.getItems().add("CSE 231");
		course1.getItems().add("CSE 231L");
		course1.getItems().add("CSE 299");
		course1.getItems().add("EEE 141");
		course1.getItems().add("EEE 141L");
		course1.getItems().add("EEE 111/ ETE 111");
		course1.getItems().add("EEE 111L/ ETE 111L");
		course1.getItems().add("CSE 311");
		course1.getItems().add("CSE 311L");
		course1.getItems().add("CSE 323");
		course1.getItems().add("CSE 327");
		course1.getItems().add("CSE 331");
		course1.getItems().add("CSE 331L");
		course1.getItems().add("CSE 332");
		course1.getItems().add("CSE 373");
		course1.getItems().add("CSE 325/CSE 425");
		course1.getItems().add("CSE 498/EEE 498/ETE 498");
		course1.getItems().add("CSE499A/EEE499A/ETE499A");
		course1.getItems().add("CSE499B/EEE499B/ETE499B");
		course1.getItems().add("CSE 417");
		course1.getItems().add("CSE 401");
		course1.getItems().add("CSE 418");
		course1.getItems().add("CSE 426");
		course1.getItems().add("CSE 473");
		course1.getItems().add("CSE 491");
		course1.getItems().add("CSE 411");
		course1.getItems().add("CSE 424");
		course1.getItems().add("CSE 427");
		course1.getItems().add("CSE 428");
		course1.getItems().add("CSE 429");
		course1.getItems().add("CSE 492");
		course1.getItems().add("CSE 422");
		course1.getItems().add("CSE 438");
		course1.getItems().add("CSE 482");
		course1.getItems().add("CSE 485");
		course1.getItems().add("CSE 486");
		course1.getItems().add("CSE 493");
		course1.getItems().add("CSE 433");
		course1.getItems().add("CSE 435");
		course1.getItems().add("CSE 413");
		course1.getItems().add("CSE 414");
		course1.getItems().add("CSE 494");
		course1.getItems().add("CSE 419");
		course1.getItems().add("CSE 440");
		course1.getItems().add("CSE 445");
		course1.getItems().add("CSE 465");
		course1.getItems().add("CSE 467");
		course1.getItems().add("CSE 468");
		course1.getItems().add("CSE 470");
		course1.getItems().add("CSE 495");
		course1.getItems().add("CSE 446");
		course1.getItems().add("CSE 447");
		course1.getItems().add("CSE 448");
		course1.getItems().add("CSE 449");
		course1.getItems().add("CSE 496");

		
		ComboBox course2=new ComboBox();
		course2.getItems().add("ENG 102");
		course2.getItems().add("ENG 103");
		course2.getItems().add("ENG 111");
		course2.getItems().add("PHI 101");
		course2.getItems().add("PHI 104");
		course2.getItems().add("POL 101");
		course2.getItems().add("POL 104");
		course2.getItems().add("ECO 101");
		course2.getItems().add("ECO 104");
		course2.getItems().add("SOC 101");
		course2.getItems().add("ENV 203/ GEO 205");
		course2.getItems().add("ANT 101");
		course2.getItems().add("BIO 103");
		course2.getItems().add("MAT 116");
		course2.getItems().add("MAT 120");
		course2.getItems().add("MAT 125");
		course2.getItems().add("MAT 130");
		course2.getItems().add("MAT 250");
		course2.getItems().add("MAT 350");
		course2.getItems().add("MAT 361");
		course2.getItems().add("PHY 107");
		course2.getItems().add("PHY 108");
		course2.getItems().add("CHE 101");
		course2.getItems().add("EEE 452");
		course2.getItems().add("CEE 110");
		course2.getItems().add("CSE 115");
		course2.getItems().add("CSE 115L");
		course2.getItems().add("CSE 215");
		course2.getItems().add("CSE 215L");
		course2.getItems().add("CSE 173");
		course2.getItems().add("CSE 225");
		course2.getItems().add("CSE 225L");
		course2.getItems().add("CSE 231");
		course2.getItems().add("CSE 231L");
		course2.getItems().add("CSE 299");
		course2.getItems().add("EEE 141");
		course2.getItems().add("EEE 141L");
		course2.getItems().add("EEE 111/ ETE 111");
		course2.getItems().add("EEE 111L/ ETE 111L");
		course2.getItems().add("CSE 311");
		course2.getItems().add("CSE 311L");
		course2.getItems().add("CSE 323");
		course2.getItems().add("CSE 327");
		course2.getItems().add("CSE 331");
		course2.getItems().add("CSE 331L");
		course2.getItems().add("CSE 332");
		course2.getItems().add("CSE 373");
		course2.getItems().add("CSE 325/CSE 425");
		course2.getItems().add("CSE 498/EEE 498/ETE 498");
		course2.getItems().add("CSE499A/EEE499A/ETE499A");
		course2.getItems().add("CSE499B/EEE499B/ETE499B");
		course2.getItems().add("CSE 417");
		course2.getItems().add("CSE 401");
		course2.getItems().add("CSE 418");
		course2.getItems().add("CSE 426");
		course2.getItems().add("CSE 473");
		course2.getItems().add("CSE 491");
		course2.getItems().add("CSE 411");
		course2.getItems().add("CSE 424");
		course2.getItems().add("CSE 427");
		course2.getItems().add("CSE 428");
		course2.getItems().add("CSE 429");
		course2.getItems().add("CSE 492");
		course2.getItems().add("CSE 422");
		course2.getItems().add("CSE 438");
		course2.getItems().add("CSE 482");
		course2.getItems().add("CSE 485");
		course2.getItems().add("CSE 486");
		course2.getItems().add("CSE 493");
		course2.getItems().add("CSE 433");
		course2.getItems().add("CSE 435");
		course2.getItems().add("CSE 413");
		course2.getItems().add("CSE 414");
		course2.getItems().add("CSE 494");
		course2.getItems().add("CSE 419");
		course2.getItems().add("CSE 440");
		course2.getItems().add("CSE 445");
		course2.getItems().add("CSE 465");
		course2.getItems().add("CSE 467");
		course2.getItems().add("CSE 468");
		course2.getItems().add("CSE 470");
		course2.getItems().add("CSE 495");
		course2.getItems().add("CSE 446");
		course2.getItems().add("CSE 447");
		course2.getItems().add("CSE 448");
		course2.getItems().add("CSE 449");
		course2.getItems().add("CSE 496");
		
		ComboBox course3=new ComboBox();
		course3.getItems().add("ENG 102");
		course3.getItems().add("ENG 103");
		course3.getItems().add("ENG 111");
		course3.getItems().add("PHI 101");
		course3.getItems().add("PHI 104");
		course3.getItems().add("POL 101");
		course3.getItems().add("POL 104");
		course3.getItems().add("ECO 101");
		course3.getItems().add("ECO 104");
		course3.getItems().add("SOC 101");
		course3.getItems().add("ENV 203/ GEO 205");
		course3.getItems().add("ANT 101");
		course3.getItems().add("BIO 103");
		course3.getItems().add("MAT 116");
		course3.getItems().add("MAT 120");
		course3.getItems().add("MAT 125");
		course3.getItems().add("MAT 130");
		course3.getItems().add("MAT 250");
		course3.getItems().add("MAT 350");
		course3.getItems().add("MAT 361");
		course3.getItems().add("PHY 107");
		course3.getItems().add("PHY 108");
		course3.getItems().add("CHE 101");
		course3.getItems().add("EEE 452");
		course3.getItems().add("CEE 110");
		course3.getItems().add("CSE 115");
		course3.getItems().add("CSE 115L");
		course3.getItems().add("CSE 215");
		course3.getItems().add("CSE 215L");
		course3.getItems().add("CSE 173");
		course3.getItems().add("CSE 225");
		course3.getItems().add("CSE 225L");
		course3.getItems().add("CSE 231");
		course3.getItems().add("CSE 231L");
		course3.getItems().add("CSE 299");
		course3.getItems().add("EEE 141");
		course3.getItems().add("EEE 141L");
		course3.getItems().add("EEE 111/ ETE 111");
		course3.getItems().add("EEE 111L/ ETE 111L");
		course3.getItems().add("CSE 311");
		course3.getItems().add("CSE 311L");
		course3.getItems().add("CSE 323");
		course3.getItems().add("CSE 327");
		course3.getItems().add("CSE 331");
		course3.getItems().add("CSE 331L");
		course3.getItems().add("CSE 332");
		course3.getItems().add("CSE 373");
		course3.getItems().add("CSE 325/CSE 425");
		course3.getItems().add("CSE 498/EEE 498/ETE 498");
		course3.getItems().add("CSE499A/EEE499A/ETE499A");
		course3.getItems().add("CSE499B/EEE499B/ETE499B");
		course3.getItems().add("CSE 417");
		course3.getItems().add("CSE 401");
		course3.getItems().add("CSE 418");
		course3.getItems().add("CSE 426");
		course3.getItems().add("CSE 473");
		course3.getItems().add("CSE 491");
		course3.getItems().add("CSE 411");
		course3.getItems().add("CSE 424");
		course3.getItems().add("CSE 427");
		course3.getItems().add("CSE 428");
		course3.getItems().add("CSE 429");
		course3.getItems().add("CSE 492");
		course3.getItems().add("CSE 422");
		course3.getItems().add("CSE 438");
		course3.getItems().add("CSE 482");
		course3.getItems().add("CSE 485");
		course3.getItems().add("CSE 486");
		course3.getItems().add("CSE 493");
		course3.getItems().add("CSE 433");
		course3.getItems().add("CSE 435");
		course3.getItems().add("CSE 413");
		course3.getItems().add("CSE 414");
		course3.getItems().add("CSE 494");
		course3.getItems().add("CSE 419");
		course3.getItems().add("CSE 440");
		course3.getItems().add("CSE 445");
		course3.getItems().add("CSE 465");
		course3.getItems().add("CSE 467");
		course3.getItems().add("CSE 468");
		course3.getItems().add("CSE 470");
		course3.getItems().add("CSE 495");
		course3.getItems().add("CSE 446");
		course3.getItems().add("CSE 447");
		course3.getItems().add("CSE 448");
		course3.getItems().add("CSE 449");
		course3.getItems().add("CSE 496");
	
		ComboBox course4=new ComboBox();
		course4.getItems().add("ENG 102");
		course4.getItems().add("ENG 103");
		course4.getItems().add("ENG 111");
		course4.getItems().add("PHI 101");
		course4.getItems().add("PHI 104");
		course4.getItems().add("POL 101");
		course4.getItems().add("POL 104");
		course4.getItems().add("ECO 101");
		course4.getItems().add("ECO 104");
		course4.getItems().add("SOC 101");
		course4.getItems().add("ENV 203/ GEO 205");
		course4.getItems().add("ANT 101");
		course4.getItems().add("BIO 103");
		course4.getItems().add("MAT 116");
		course4.getItems().add("MAT 120");
		course4.getItems().add("MAT 125");
		course4.getItems().add("MAT 130");
		course4.getItems().add("MAT 250");
		course4.getItems().add("MAT 350");
		course4.getItems().add("MAT 361");
		course4.getItems().add("PHY 107");
		course4.getItems().add("PHY 108");
		course4.getItems().add("CHE 101");
		course4.getItems().add("EEE 452");
		course4.getItems().add("CEE 110");
		course4.getItems().add("CSE 115");
		course4.getItems().add("CSE 115L");
		course4.getItems().add("CSE 215");
		course4.getItems().add("CSE 215L");
		course4.getItems().add("CSE 173");
		course4.getItems().add("CSE 225");
		course4.getItems().add("CSE 225L");
		course4.getItems().add("CSE 231");
		course4.getItems().add("CSE 231L");
		course4.getItems().add("CSE 299");
		course4.getItems().add("EEE 141");
		course4.getItems().add("EEE 141L");
		course4.getItems().add("EEE 111/ ETE 111");
		course4.getItems().add("EEE 111L/ ETE 111L");
		course4.getItems().add("CSE 311");
		course4.getItems().add("CSE 311L");
		course4.getItems().add("CSE 323");
		course4.getItems().add("CSE 327");
		course4.getItems().add("CSE 331");
		course4.getItems().add("CSE 331L");
		course4.getItems().add("CSE 332");
		course4.getItems().add("CSE 373");
		course4.getItems().add("CSE 325/CSE 425");
		course4.getItems().add("CSE 498/EEE 498/ETE 498");
		course4.getItems().add("CSE499A/EEE499A/ETE499A");
		course4.getItems().add("CSE499B/EEE499B/ETE499B");
		course4.getItems().add("CSE 417");
		course4.getItems().add("CSE 401");
		course4.getItems().add("CSE 418");
		course4.getItems().add("CSE 426");
		course4.getItems().add("CSE 473");
		course4.getItems().add("CSE 491");
		course4.getItems().add("CSE 411");
		course4.getItems().add("CSE 424");
		course4.getItems().add("CSE 427");
		course4.getItems().add("CSE 428");
		course4.getItems().add("CSE 429");
		course4.getItems().add("CSE 492");
		course4.getItems().add("CSE 422");
		course4.getItems().add("CSE 438");
		course4.getItems().add("CSE 482");
		course4.getItems().add("CSE 485");
		course4.getItems().add("CSE 486");
		course4.getItems().add("CSE 493");
		course4.getItems().add("CSE 433");
		course4.getItems().add("CSE 435");
		course4.getItems().add("CSE 413");
		course4.getItems().add("CSE 414");
		course4.getItems().add("CSE 494");
		course4.getItems().add("CSE 419");
		course4.getItems().add("CSE 440");
		course4.getItems().add("CSE 445");
		course4.getItems().add("CSE 465");
		course4.getItems().add("CSE 467");
		course4.getItems().add("CSE 468");
		course4.getItems().add("CSE 470");
		course4.getItems().add("CSE 495");
		course4.getItems().add("CSE 446");
		course4.getItems().add("CSE 447");
		course4.getItems().add("CSE 448");
		course4.getItems().add("CSE 449");
		course4.getItems().add("CSE 496");
	
		ComboBox course5=new ComboBox();
		course5.getItems().add("ENG 102");
		course5.getItems().add("ENG 103");
		course5.getItems().add("ENG 111");
		course5.getItems().add("PHI 101");
		course5.getItems().add("PHI 104");
		course5.getItems().add("POL 101");
		course5.getItems().add("POL 104");
		course5.getItems().add("ECO 101");
		course5.getItems().add("ECO 104");
		course5.getItems().add("SOC 101");
		course5.getItems().add("ENV 203/ GEO 205");
		course5.getItems().add("ANT 101");
		course5.getItems().add("BIO 103");
		course5.getItems().add("MAT 116");
		course5.getItems().add("MAT 120");
		course5.getItems().add("MAT 125");
		course5.getItems().add("MAT 130");
		course5.getItems().add("MAT 250");
		course5.getItems().add("MAT 350");
		course5.getItems().add("MAT 361");
		course5.getItems().add("PHY 107");
		course5.getItems().add("PHY 108");
		course5.getItems().add("CHE 101");
		course5.getItems().add("EEE 452");
		course5.getItems().add("CEE 110");
		course5.getItems().add("CSE 115");
		course5.getItems().add("CSE 115L");
		course5.getItems().add("CSE 215");
		course5.getItems().add("CSE 215L");
		course5.getItems().add("CSE 173");
		course5.getItems().add("CSE 225");
		course5.getItems().add("CSE 225L");
		course5.getItems().add("CSE 231");
		course5.getItems().add("CSE 231L");
		course5.getItems().add("CSE 299");
		course5.getItems().add("EEE 141");
		course5.getItems().add("EEE 141L");
		course5.getItems().add("EEE 111/ ETE 111");
		course5.getItems().add("EEE 111L/ ETE 111L");
		course5.getItems().add("CSE 311");
		course5.getItems().add("CSE 311L");
		course5.getItems().add("CSE 323");
		course5.getItems().add("CSE 327");
		course5.getItems().add("CSE 331");
		course5.getItems().add("CSE 331L");
		course5.getItems().add("CSE 332");
		course5.getItems().add("CSE 373");
		course5.getItems().add("CSE 325/CSE 425");
		course5.getItems().add("CSE 498/EEE 498/ETE 498");
		course5.getItems().add("CSE499A/EEE499A/ETE499A");
		course5.getItems().add("CSE499B/EEE499B/ETE499B");
		course5.getItems().add("CSE 417");
		course5.getItems().add("CSE 401");
		course5.getItems().add("CSE 418");
		course5.getItems().add("CSE 426");
		course5.getItems().add("CSE 473");
		course5.getItems().add("CSE 491");
		course5.getItems().add("CSE 411");
		course5.getItems().add("CSE 424");
		course5.getItems().add("CSE 427");
		course5.getItems().add("CSE 428");
		course5.getItems().add("CSE 429");
		course5.getItems().add("CSE 492");
		course5.getItems().add("CSE 422");
		course5.getItems().add("CSE 438");
		course5.getItems().add("CSE 482");
		course5.getItems().add("CSE 485");
		course5.getItems().add("CSE 486");
		course5.getItems().add("CSE 493");
		course5.getItems().add("CSE 433");
		course5.getItems().add("CSE 435");
		course5.getItems().add("CSE 413");
		course5.getItems().add("CSE 414");
		course5.getItems().add("CSE 494");
		course5.getItems().add("CSE 419");
		course5.getItems().add("CSE 440");
		course5.getItems().add("CSE 445");
		course5.getItems().add("CSE 465");
		course5.getItems().add("CSE 467");
		course5.getItems().add("CSE 468");
		course5.getItems().add("CSE 470");
		course5.getItems().add("CSE 495");
		course5.getItems().add("CSE 446");
		course5.getItems().add("CSE 447");
		course5.getItems().add("CSE 448");
		course5.getItems().add("CSE 449");
		course5.getItems().add("CSE 496");
		
		ComboBox credit1=new ComboBox();
		credit1.getItems().add("0.0");
		credit1.getItems().add("1.0");
		credit1.getItems().add("1.5");
		credit1.getItems().add("3.0");
		
		ComboBox credit2=new ComboBox();
		credit2.getItems().add("0.0");
		credit2.getItems().add("1.0");
		credit2.getItems().add("1.5");
		credit2.getItems().add("3.0");
		
		ComboBox credit3=new ComboBox();
		credit3.getItems().add("0.0");
		credit3.getItems().add("1.0");
		credit3.getItems().add("1.5");
		credit3.getItems().add("3.0");
		
		ComboBox credit4=new ComboBox();
		credit4.getItems().add("0.0");
		credit4.getItems().add("1.0");
		credit4.getItems().add("1.5");
		credit4.getItems().add("3.0");
		
		ComboBox credit5=new ComboBox();
		credit5.getItems().add("0.0");
		credit5.getItems().add("1.0");
		credit5.getItems().add("1.5");
		credit5.getItems().add("3.0");
		
		
		ComboBox grade1=new ComboBox();
		grade1.getItems().add("A");
		grade1.getItems().add("A-");
		grade1.getItems().add("B+");
		grade1.getItems().add("B");
		grade1.getItems().add("B-");
		grade1.getItems().add("C+");
		grade1.getItems().add("C");
		grade1.getItems().add("C-");
		grade1.getItems().add("D+");
		grade1.getItems().add("D");
		grade1.getItems().add("F");
		
		
		ComboBox grade2=new ComboBox();
		grade2.getItems().add("A");
		grade2.getItems().add("A-");
		grade2.getItems().add("B+");
		grade2.getItems().add("B");
		grade2.getItems().add("B-");
		grade2.getItems().add("C+");
		grade2.getItems().add("C");
		grade2.getItems().add("C-");
		grade2.getItems().add("D+");
		grade2.getItems().add("D");
		grade2.getItems().add("F");
		
		
		ComboBox grade3=new ComboBox();
		grade3.getItems().add("A");
		grade3.getItems().add("A-");
		grade3.getItems().add("B+");
		grade3.getItems().add("B");
		grade3.getItems().add("B-");
		grade3.getItems().add("C+");
		grade3.getItems().add("C");
		grade3.getItems().add("C-");
		grade3.getItems().add("D+");
		grade3.getItems().add("D");
		grade3.getItems().add("F");
		
		
		ComboBox grade4=new ComboBox();
		grade4.getItems().add("A");
		grade4.getItems().add("A-");
		grade4.getItems().add("B+");
		grade4.getItems().add("B");
		grade4.getItems().add("B-");
		grade4.getItems().add("C+");
		grade4.getItems().add("C");
		grade4.getItems().add("C-");
		grade4.getItems().add("D+");
		grade4.getItems().add("D");
		grade4.getItems().add("F");
		
		
		ComboBox grade5=new ComboBox();
		grade5.getItems().add("A");
		grade5.getItems().add("A-");
		grade5.getItems().add("B+");
		grade5.getItems().add("B");
		grade5.getItems().add("B-");
		grade5.getItems().add("C+");
		grade5.getItems().add("C");
		grade5.getItems().add("C-");
		grade5.getItems().add("D+");
		grade5.getItems().add("D");
		grade5.getItems().add("F");
		
		Button calculate =new Button("CALCULATE");
		
		ArrayList<String> courseName=new ArrayList<String>();
		ArrayList<String> courseCredit=new ArrayList<String>();
		ArrayList<String> courseGrade=new ArrayList<String>();
		
		course1.setOnAction((event)->{
			Object selectedItem= course1.getSelectionModel().getSelectedItem();
			courseName.add(selectedItem.toString());
		});
		course2.setOnAction((event)->{
			Object selectedItem= course2.getSelectionModel().getSelectedItem();
			courseName.add(selectedItem.toString());
		});
		course3.setOnAction((event)->{
			Object selectedItem= course3.getSelectionModel().getSelectedItem();
			courseName.add(selectedItem.toString());
		});
		course4.setOnAction((event)->{
			Object selectedItem= course4.getSelectionModel().getSelectedItem();
			courseName.add(selectedItem.toString());
		});
		course5.setOnAction((event)->{
			Object selectedItem= course5.getSelectionModel().getSelectedItem();
			courseName.add(selectedItem.toString());
		});
		
		
		credit1.setOnAction((event)->{
			Object selectedItem= credit1.getSelectionModel().getSelectedItem();
			courseCredit.add(selectedItem.toString());
		});
		credit2.setOnAction((event)->{
			Object selectedItem= credit2.getSelectionModel().getSelectedItem();
			courseCredit.add(selectedItem.toString());
		});
		credit3.setOnAction((event)->{
			Object selectedItem= credit3.getSelectionModel().getSelectedItem();
			courseCredit.add(selectedItem.toString());
		});
		credit4.setOnAction((event)->{
			Object selectedItem= credit4.getSelectionModel().getSelectedItem();
			courseCredit.add(selectedItem.toString());
		});
		credit5.setOnAction((event)->{
			Object selectedItem= credit5.getSelectionModel().getSelectedItem();
			courseCredit.add(selectedItem.toString());
		});
		
		
		grade1.setOnAction((event)->{
			Object selectedItem= grade1.getSelectionModel().getSelectedItem();
			courseGrade.add(selectedItem.toString());
		});
		grade2.setOnAction((event)->{
			Object selectedItem= grade2.getSelectionModel().getSelectedItem();
			courseGrade.add(selectedItem.toString());
		});
		grade3.setOnAction((event)->{
			Object selectedItem= grade3.getSelectionModel().getSelectedItem();
			courseGrade.add(selectedItem.toString());
		});
		grade4.setOnAction((event)->{
			Object selectedItem= grade4.getSelectionModel().getSelectedItem();
			courseGrade.add(selectedItem.toString());
		});
		grade5.setOnAction((event)->{
			Object selectedItem= grade5.getSelectionModel().getSelectedItem();
			courseGrade.add(selectedItem.toString());
		});
		
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				int i;
				double totalCredit=0;
				double sum=0;
				for(i=0 ; i<courseCredit.size() ; i++) {
					double mult=1;
					if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("A")) {
						mult*=Double.parseDouble(courseCredit.get(i))*4.0;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("A")) {
						mult*=Double.parseDouble(courseCredit.get(i))*4.0;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("A")) {
						mult*=Double.parseDouble(courseCredit.get(i))*4.0;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("A")) {
						mult*=Double.parseDouble(courseCredit.get(i))*4.0;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("A-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.7;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("A-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.7;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("A-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.7;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("A-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.7;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("B+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.3;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("B+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.3;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("B+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.3;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("B+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.3;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("B")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.0;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("B")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.0;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("B")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.0;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("B")) {
						mult*=Double.parseDouble(courseCredit.get(i))*3.0;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("B-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.7;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("B-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.7;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("B-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.7;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("B-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.7;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("C+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.3;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("C+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.3;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("C+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.3;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("C+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.3;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("C")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.0;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("C")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.0;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("C")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.0;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("C")) {
						mult*=Double.parseDouble(courseCredit.get(i))*2.0;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("C-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.7;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("C-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.7;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("C-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.7;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("C-")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.7;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("D+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.3;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("D+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.3;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("D+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.3;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("D+")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.3;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("D")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.0;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("D")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.0;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("D")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.0;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("D")) {
						mult*=Double.parseDouble(courseCredit.get(i))*1.0;
					}
					else if(courseCredit.get(i).equals("0.0") && courseGrade.get(i).equals("F")) {
						mult*=Double.parseDouble(courseCredit.get(i))*0.0;
					}
					else if(courseCredit.get(i).equals("1.0") && courseGrade.get(i).equals("F")) {
						mult*=Double.parseDouble(courseCredit.get(i))*0.0;
					}
					else if(courseCredit.get(i).equals("1.5") && courseGrade.get(i).equals("F")) {
						mult*=Double.parseDouble(courseCredit.get(i))*0.0;
					}
					else if(courseCredit.get(i).equals("3.0") && courseGrade.get(i).equals("F")) {
						mult*=Double.parseDouble(courseCredit.get(i))*0.0;
					}
					
					sum+=mult;
					totalCredit+=Double.parseDouble(courseCredit.get(i));
					
				}
				
				double cgpa=sum/totalCredit;
				
				String name1=tf1.getText().toString();
				String id1=tf2.getText().toString();
				
				DecimalFormat df=new DecimalFormat(".##");
				String cg=String.valueOf(df.format(cgpa));
				
				File file=new File("Info.txt");
				try {
					file.createNewFile();
					FileWriter fw=new FileWriter(file);
					
					fw.write("Name: "+name1+"        "+"ID: "+id1+"\n");
					for(i=0 ; i<courseName.size() ; i++) {
						fw.write(courseName.get(i)+"     "+courseCredit.get(i)+"     "+courseGrade.get(i)+"\n");
					}
					fw.write("Your CGPA: "+cg);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Label l1=new Label("CGPA");
				HBox h1=new HBox(20,l1);
				h1.setAlignment(Pos.CENTER);
				
				Label l2=new Label("Name :"+name1+"   ID: "+id1);
				HBox h2=new HBox(20,l2);
				h2.setAlignment(Pos.CENTER);
				
				
				
				Label c1=new Label(courseName.get(0));
				Label c2=new Label(courseName.get(1));
				Label c3=new Label(courseName.get(2));
				Label c4=new Label(courseName.get(3));
				Label c5=new Label(courseName.get(4));
				
				Label cr1=new Label(courseCredit.get(0));
				Label cr2=new Label(courseCredit.get(1));
				Label cr3=new Label(courseCredit.get(2));
				Label cr4=new Label(courseCredit.get(3));
				Label cr5=new Label(courseCredit.get(4));
				
				Label g1=new Label(courseGrade.get(0));
				Label g2=new Label(courseGrade.get(1));
				Label g3=new Label(courseGrade.get(2));
				Label g4=new Label(courseGrade.get(3));
				Label g5=new Label(courseGrade.get(4));
				
				Label lcg=new Label("Your CGPA :"+cg);
				HBox h4=new HBox(20,lcg);
				h4.setAlignment(Pos.CENTER);
				
				VBox v1=new VBox(20,clb6,clb1,clb2,clb3,clb4,clb5);
				VBox v2=new VBox(20,lb1,c1,c2,c3,c4,c5);
				VBox v3=new VBox(20,lb2,cr1,cr2,cr3,cr4,cr5);
				VBox v4=new VBox(20,lb3,g1,g2,g3,g4,g5);
				
				
				HBox h3=new HBox(20,v1,v2,v3,v4);
				h3.setAlignment(Pos.CENTER);
				
				
				VBox v5=new VBox(25,h1,h2,h3,h4);
				
				Scene scene1=new Scene(v5,500,500);
				
				primaryStage.setScene(scene1);
				primaryStage.setTitle("CGPA");
				primaryStage.show();
			}
		});
		
		
		HBox hb1=new HBox(20,title);
		hb1.setAlignment(Pos.CENTER);
		HBox hb2=new HBox(20,name,tf1,id,tf2);
		hb2.setAlignment(Pos.CENTER);
				
		VBox vb2=new VBox(27,clb6,clb1,clb2,clb3,clb4,clb5);
		VBox vb3=new VBox(20,lb1,course1,course2,course3,course4,course5);
		VBox vb4=new VBox(20,lb2,credit1,credit2,credit3,credit4,credit5);
		VBox vb5=new VBox(20,lb3,grade1,grade2,grade3,grade4,grade5);
		
		HBox hb3=new HBox(20,vb2,vb3,vb4,vb5);
		hb3.setAlignment(Pos.CENTER);
		
		HBox hb4=new HBox(20,calculate);
		hb4.setAlignment(Pos.CENTER);
		
		VBox vb=new VBox(20,hb1,hb2,hb3,hb4);
		vb.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(vb,500,500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("CGPA CALCULATOR");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
