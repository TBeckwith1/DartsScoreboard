import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scoreboard extends JFrame implements ActionListener {
    JTextField inputResult;
    JLabel teamADartsPoints, teamBDartsPoints, teamASetScore, teamBSetScore, teamAPointAverageLabel, teamBPointAverageLabel;
    JButton numberPad1, numberPad2, numberPad3, numberPad4, numberPad5, numberPad6, numberPad7, numberPad8, numberPad9, numberPadDelete, numberPad0, numberPadEnter;
    Border whiteLine = BorderFactory.createLineBorder(Color.white);
    int amountOfPointsA = 501;
    int amountOfPointsB = 501;
    int scoreA = 0;
    int scoreB = 0;
    int playerTurn = 0;
    int teamAPointAverage = 0;
    int teamBPointAverage = 0;

    public Scoreboard() {
        inputResult = new JTextField();
        inputResult.setBounds(175, 150, 150, 30);
        inputResult.setEditable(false);

        numberPad1 = new JButton("1");
        numberPad1.setBounds(0, 350, 166, 100);
        numberPad1.setFocusable(false);
        numberPad1.addActionListener(this);

        numberPad2 = new JButton("2");
        numberPad2.setBounds(166, 350, 166, 100);
        numberPad2.setFocusable(false);
        numberPad2.addActionListener(this);

        numberPad3 = new JButton("3");
        numberPad3.setBounds(332, 350, 166, 100);
        numberPad3.setFocusable(false);
        numberPad3.addActionListener(this);

        numberPad4 = new JButton("4");
        numberPad4.setBounds(0, 450, 166, 100);
        numberPad4.setFocusable(false);
        numberPad4.addActionListener(this);

        numberPad5 = new JButton("5");
        numberPad5.setBounds(166, 450, 166, 100);
        numberPad5.setFocusable(false);
        numberPad5.addActionListener(this);

        numberPad6 = new JButton("6");
        numberPad6.setBounds(332, 450, 166, 100);
        numberPad6.setFocusable(false);
        numberPad6.addActionListener(this);

        numberPad7 = new JButton("7");
        numberPad7.setBounds(0, 550, 166, 100);
        numberPad7.setFocusable(false);
        numberPad7.addActionListener(this);

        numberPad8 = new JButton("8");
        numberPad8.setBounds(166, 550, 166, 100);
        numberPad8.setFocusable(false);
        numberPad8.addActionListener(this);

        numberPad9 = new JButton("9");
        numberPad9.setBounds(332, 550, 166, 100);
        numberPad9.setFocusable(false);
        numberPad9.addActionListener(this);

        numberPadDelete = new JButton("Delete");
        numberPadDelete.setBounds(0, 650, 166, 100);
        numberPadDelete.setFocusable(false);
        numberPadDelete.addActionListener(this);

        numberPad0 = new JButton("0");
        numberPad0.setBounds(166, 650, 166, 100);
        numberPad0.setFocusable(false);
        numberPad0.addActionListener(this);

        numberPadEnter = new JButton("Enter");
        numberPadEnter.setBounds(332, 650, 166, 100);
        numberPadEnter.setFocusable(false);
        numberPadEnter.addActionListener(this);

        teamADartsPoints = new JLabel();
        teamADartsPoints.setText(String.valueOf(amountOfPointsA));
        teamADartsPoints.setBounds(100, 75, 60, 50);
        teamADartsPoints.setFont(new Font("Helvetica", Font.PLAIN, 30));
        teamADartsPoints.setForeground(Color.white);
        teamADartsPoints.setBorder(whiteLine);

        teamBDartsPoints = new JLabel();
        teamBDartsPoints.setText(String.valueOf(amountOfPointsB));
        teamBDartsPoints.setBounds(350, 75, 60, 50);
        teamBDartsPoints.setFont(new Font("Helvetica", Font.PLAIN, 30));
        teamBDartsPoints.setForeground(Color.white);

        teamASetScore = new JLabel();
        teamASetScore.setText(String.valueOf(scoreA));
        teamASetScore.setBounds(125, 200, 60, 50);
        teamASetScore.setFont(new Font("Helvetica", Font.PLAIN, 30));
        teamASetScore.setForeground(Color.white);

        teamBSetScore = new JLabel();
        teamBSetScore.setText(String.valueOf(scoreB));
        teamBSetScore.setBounds(350, 200, 60, 50);
        teamBSetScore.setFont(new Font("Helvetica", Font.PLAIN, 30));
        teamBSetScore.setForeground(Color.white);

        teamAPointAverageLabel = new JLabel();
        

        teamBPointAverageLabel = new JLabel();

        this.setSize(500, 800);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(inputResult);
        this.add(teamADartsPoints);
        this.add(teamBDartsPoints);
        this.add(teamASetScore);
        this.add(teamBSetScore);
        this.add(numberPad1);
        this.add(numberPad2);
        this.add(numberPad3);
        this.add(numberPad4);
        this.add(numberPad5);
        this.add(numberPad6);
        this.add(numberPad7);
        this.add(numberPad8);
        this.add(numberPad9);
        this.add(numberPadDelete);
        this.add(numberPad0);
        this.add(numberPadEnter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == numberPad1) {
            inputResult.setText((inputResult.getText() + "1"));
        }

        if (e.getSource() == numberPad2) {
            inputResult.setText((inputResult.getText() + "2"));
        }

        if (e.getSource() == numberPad3) {
            inputResult.setText((inputResult.getText() + "3"));
        }

        if (e.getSource() == numberPad4) {
            inputResult.setText((inputResult.getText() + "4"));
        }

        if (e.getSource() == numberPad5) {
            inputResult.setText((inputResult.getText() + "5"));
        }

        if (e.getSource() == numberPad6) {
            inputResult.setText((inputResult.getText() + "6"));
        }

        if (e.getSource() == numberPad7) {
            inputResult.setText((inputResult.getText() + "7"));
        }

        if (e.getSource() == numberPad8) {
            inputResult.setText((inputResult.getText() + "8"));
        }

        if (e.getSource() == numberPad9) {
            inputResult.setText((inputResult.getText() + "9"));
        }

        if (e.getSource() == numberPad0) {
            inputResult.setText((inputResult.getText() + "0"));
        }

        if (e.getSource() == numberPadDelete) {
            inputResult.setText(inputResult.getText().substring(0, inputResult.getText().length()-1));
        }

        String result = inputResult.getText();
        int resultNum = Integer.parseInt(result);
        if (e.getSource() == numberPadEnter && resultNum <= 180 && (amountOfPointsA >= resultNum || amountOfPointsB >= resultNum)) {
            playerTurn();
            teamAWinner();
            teamBWinner();
        }
    }

    public void playerTurn() {
        playerTurn++;
        String result = inputResult.getText();
        int resultNum = Integer.parseInt(result);
        inputResult.setText("");

        if (playerTurn % 2 == 1) {
            amountOfPointsA -= resultNum;
            teamADartsPoints.setText(String.valueOf(amountOfPointsA));
            teamBDartsPoints.setBorder(whiteLine);
            teamADartsPoints.setBorder(null);
        }
        else {
            amountOfPointsB -= resultNum;
            teamBDartsPoints.setText(String.valueOf(amountOfPointsB));
            teamADartsPoints.setBorder(whiteLine);
            teamBDartsPoints.setBorder(null);
        }
    }

    public void teamAWinner() {
        String scoreAText = teamASetScore.getText();
        int scoreANum = Integer.parseInt(scoreAText);
        if (amountOfPointsA == 0) {
            amountOfPointsA = 501;
            teamADartsPoints.setText(String.valueOf(amountOfPointsA));
            scoreANum++;
            teamASetScore.setText(String.valueOf(scoreANum));

            amountOfPointsB = 501;
            teamBDartsPoints.setText(String.valueOf(amountOfPointsB));
            /* If team A wins a set the score increases by one for team A
            and both teams darts score return to 501 for the next set */
        }
    }

    public void teamBWinner() {
        String scoreBText = teamBSetScore.getText();
        int scoreBNum = Integer.parseInt(scoreBText);
        if (amountOfPointsB == 0) {
            amountOfPointsA = 501;
            teamADartsPoints.setText(String.valueOf(amountOfPointsA));
            scoreBNum++;
            teamBSetScore.setText(String.valueOf(scoreBNum));

            amountOfPointsB = 501;
            teamBDartsPoints.setText(String.valueOf(amountOfPointsB));
            /* If team B wins a set the score increases by one for team B
            and both teams darts score return to 501 for the next set */
        }
    }
}