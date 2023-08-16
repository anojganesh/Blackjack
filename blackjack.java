package myJavaProjects;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author ganesha003
 */
public class blackjack implements ActionListener {

    //integer variables
    public int wins;
    public int losses;
    public int balance;
    public int bet;
    public int valP;
    public int valD;

    //JButtons
    public JButton play; // to blackjack screen
    public JButton play2; //to play again
    public JButton help; // to help screen
    public JButton back; //back to menu from help screen
    public JButton back2; //back to menu from blackjack screen
    public JButton reset; //reset from out of funds screen
    public JButton plus1; //adds 1 to bet
    public JButton plus2; //adds 10 to bet
    public JButton plus3; //adds 25 to bet
    public JButton plus4; //adds 50 to bet
    public JButton plus5; //adds 100 to bet
    public JButton plus6; //adds 500 to bet
    public JButton plus7; // resets bet
    public JButton submit; //submits bet
    public JButton submit2; // submits player option

    //JFrames and JPanels
    public JFrame frame;
    public JPanel panel;
    public JFrame frame2;
    public JPanel panel2;
    public JFrame frame3;
    public JPanel panel3;
    public JFrame frame4;
    public JPanel panel4;
    public JFrame frame5;
    public JPanel panel5;
    public JPanel panel6;
    public JPanel panel7;
    public JPanel panel8;

    //JLabels
    public JLabel betAmt;
    public JLabel warning;
    public JLabel choice;
    public JLabel valsD;
    public JLabel valsP;
    public JLabel labelc;
    public JLabel bust;
    public JLabel bustD;
    public JLabel winsD;
    public JLabel winsP;
    public JLabel draw;
    public JLabel label23;
    public JLabel labelWins;
    public JLabel labelLosses;
    public JLabel labelBalance;
    public JLabel warning2;
    public GridLayout grid;
    public GridLayout grid2;

    //Hands
    public ArrayList<JLabel> cardsD;
    public ArrayList<JLabel> cardsP;

    //Drop down menu
    public JComboBox<String> options;

    //cards
    public String[] cards;
    public String[] suits;
    public String[] deck;
    public int[] cardVals;

    //to be used
    public boolean playable = true;

    public blackjack() { //constructor method
        //Integer variables
        wins = 0;
        losses = 0;
        balance = 1000;
        bet = 0;
        valP = 0;
        valD = 0;

        //JLabels
        betAmt = new JLabel("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
        warning = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        warning2 = new JLabel("*Insufficient funds for double down");
        choice = new JLabel("No option selected");
        labelc = new JLabel("Chose an option from below, and click submit");
        label23 = new JLabel("⠀⠀⠀⠀⠀⠀Current Balance: $" + balance);
        labelWins = new JLabel("Wins: " + wins);
        labelLosses = new JLabel("Losses: " + wins);
        labelBalance = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀Balance: $" + balance + "⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        cardsD = new ArrayList<JLabel>(); // add arraylist of jlabels for cards
        cardsP = new ArrayList<JLabel>();

        valsD = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Dealer's Total Value: " + valD + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        valsP = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value:⠀" + valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        bust = new JLabel("☹ ︾☙Bust☙︾ ☹ ");
        bustD = new JLabel(" ☺ ︾☙Dealer Busts☙︾ ☺  ");
        winsD = new JLabel(" ☹ ☙Dealer Wins☙ ☹ ");
        winsP = new JLabel(" ☺ ☙You win☙ ☺ ");
        draw = new JLabel("∭ ☙Draw☙ ∭ ");

        //Jframes
        frame = new JFrame("Menu Screen");
        frame2 = new JFrame("Blackjack Screen");
        frame3 = new JFrame("Help Screen");
        frame4 = new JFrame("Out of Funds Screen");
        frame5 = new JFrame("Bet Screen");

        //JPanels
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        frame.add(panel);
        frame2.add(panel2);
        frame3.add(panel3);
        frame4.add(panel4);
        frame5.add(panel5);

        //GridLayouts 
        grid = new GridLayout(6, 2); // Note: maximum cards possible to be held is 11
        grid2 = new GridLayout(6, 2);

        //Global JButtons  
        play = new JButton("Start");
        help = new JButton("Help");
        back = new JButton("Back To Menu");
        back2 = new JButton("Back To Menu");
        reset = new JButton("Try Again?");
        plus1 = new JButton("+1");
        plus2 = new JButton("+10");
        plus3 = new JButton("+25");
        plus4 = new JButton("+50");
        plus5 = new JButton("+100");
        plus6 = new JButton("+500");
        plus7 = new JButton("Reset");
        submit = new JButton("Submit");
        submit2 = new JButton("Submit");
        play2 = new JButton("⠀⠀⠀⠀⠀Play Again?⠀⠀⠀⠀⠀");
    }

    public void outputGUI() {
        cards = new String[13]; // setting card names
        cards[0] = "Ace";
        cards[1] = "Two";
        cards[2] = "Three";
        cards[3] = "Four";
        cards[4] = "Five";
        cards[5] = "Six";
        cards[6] = "Seven";
        cards[7] = "Eight";
        cards[8] = "Nine";
        cards[9] = "Ten";
        cards[10] = "Jack";
        cards[11] = "Queen";
        cards[12] = "King";

        suits = new String[4]; // card suits
        suits[0] = "Hearts ♥ ";
        suits[1] = "Spades ♠ ";
        suits[2] = "Clubs ♣ ";
        suits[3] = "Diamonds ♦ ";

        cardVals = new int[53];
        deck = new String[53];
        int count = 0;
        int count2 = 1;
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                int num = i + 1;
                if (num > 10) {
                    num = 10;
                }
                deck[count] = ("⠀" + cards[i] + " of " + suits[j] + " (" + (num) + ")⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                count++;
            }

        }

        for (int i = 0; i < (cardVals.length - 4); i = i + 4) {
            cardVals[i] = count2;
            cardVals[i + 1] = count2;
            cardVals[i + 2] = count2;
            cardVals[i + 3] = count2;
            count2++;
            if (count2 > 10) {
                count2 = 10;
            }
        }

        String[] list = {"Select option", "Hit", "Stand", "Double down"};
        options = new JComboBox<String>(list);

        //adding ActionListerners
        play.addActionListener(this);
        help.addActionListener(this);
        back.addActionListener(this);
        back2.addActionListener(this);
        reset.addActionListener(this);
        plus1.addActionListener(this);
        plus2.addActionListener(this);
        plus3.addActionListener(this);
        plus4.addActionListener(this);
        plus5.addActionListener(this);
        plus6.addActionListener(this);
        plus7.addActionListener(this);
        submit.addActionListener(this);
        submit2.addActionListener(this);
        play2.addActionListener(this);

    }

    public void setFrame(JFrame frame, int length, int width, boolean visibility) {
        frame.setSize(length, width);
        frame.setLocationRelativeTo(null); // centers window     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(visibility);
    } //end of setFrame

    public void addCard(JLabel label, boolean player) {
        if (player) {
            cardsP.add(label);
        } else if (!player) {
            cardsD.add(label);
        }
    } //end of addCard

    public String getCard(boolean player) {
        Random rng = new Random();
        int index = rng.nextInt(52);
        if (player) {
            valP = valP + cardVals[index];

        } else if (!player) {
            valD = valD + cardVals[index];
        }
        return deck[index];

    } //end of getCard

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            frame.setVisible(false);
            System.out.println("Play pressed.");
            frame5.setVisible(true);
        } // end of play button

        if (e.getSource() == help) {
            frame.setVisible(false);
            System.out.println("Help pressed.");
            frame3.setVisible(true);
        } // end of help button

        if (e.getSource() == back) {
            frame3.setVisible(false);
            frame.setVisible(true);
        } // end of back button

        if (e.getSource() == back2) {
            frame2.setVisible(false);
            frame.setVisible(true);
        } // end of back2 button

        if (e.getSource() == reset) {
            frame4.setVisible(false);
            frame.setVisible(true);
        }// end of reset button

        if (e.getSource() == plus1) {
            if (bet + 1 <= balance) {
                bet = bet + 1;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 1 button

        }
        if (e.getSource() == plus2) {
            if (bet + 10 <= balance) {
                bet = bet + 10;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 10 button
        }

        if (e.getSource() == plus3) {
            if (bet + 25 <= balance) {
                bet = bet + 25;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 25 button
        }

        if (e.getSource() == plus4) {
            if (bet + 50 <= balance) {
                bet = bet + 50;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 50 button
        }

        if (e.getSource() == plus5) {
            if (bet + 100 <= balance) {
                bet = bet + 100;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 100 button
        }

        if (e.getSource() == plus6) {
            if (bet + 500 <= balance) {
                bet = bet + 500;
                betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
            } // end of add 500 button
        }

        if (e.getSource() == plus7) {
            bet = 0;
            betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
        } // end of reset button

        if (e.getSource() == submit) {
            if (bet > 0) {
                warning.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                frame5.setVisible(false);
                frame2.setVisible(true);
            } else {
                warning.setText("  Cannot enter game without betting.");
            }
        } // end of submit button

        if (e.getSource() == submit2) { //submit2 button clicked
            
            //hit selected
            if (playable) {
                if (options.getSelectedItem().toString() == "Hit") {
                    choice.setText("You chose: Hit");
                    warning2.setVisible(false);
                    String card = getCard(true);
                    valsP.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value: " + valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    JLabel label = new JLabel(card);
                    label.setForeground(Color.WHITE);
                    label.setFont(new Font("Dialouge", Font.ITALIC, 15));
                    cardsP.add(label);
                    panel7.add(label);
                    panel6.setVisible(false);
                    panel6.setVisible(true);
                    checkPlayer();
                    updateLabels();
                } // end of Hit
                
                //stand selected
                if (options.getSelectedItem().toString() == "Stand") {
                    choice.setText("You chose: Stand");
                    warning2.setVisible(false);
                    while (valD < 17) {
                        JLabel label = new JLabel(getCard(false));
                        label.setForeground(Color.WHITE);
                        label.setFont(new Font("Dialouge", Font.ITALIC, 15));
                        cardsD.add(label);
                        panel6.add(label);
                        checkDealer();
                        updateLabels();
                    }
                    checkWinner();
                } // end of Stand
                
                //double selected
                if (options.getSelectedItem().toString() == "Double down") {
                    if (balance - bet * 2 >= 0) {

                        choice.setText("You chose: Double down");
                        bet = bet * 2;

                        String card = getCard(true);
                        valsP.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value: " + valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        JLabel label = new JLabel(card);
                        label.setForeground(Color.WHITE);
                        label.setFont(new Font("Dialouge", Font.ITALIC, 15));
                        cardsP.add(label);
                        panel7.add(label);
                        panel6.setVisible(false);
                        panel6.setVisible(true);
                        checkPlayer();
                        updateLabels();
                        if (valP < 22) {
                            while (valD < 17) {
                                JLabel label2 = new JLabel(getCard(false));
                                label2.setForeground(Color.WHITE);
                                label2.setFont(new Font("Dialouge", Font.ITALIC, 15));
                                cardsD.add(label2);
                                panel6.add(label2);
                                checkDealer();
                                updateLabels();
                            }
                        }
                        checkWinner();
                    } // end of if
                    else {
                        warning2.setVisible(true);
                    }
                } // end of double down
            } // end of if playable
        } // end of submit2 button

        if (e.getSource() == play2) {    //play again pressed
            if (checkBalance() == true) {
                resetGame();
                updateLabels();
                frame.setVisible(false);
            } else {
                resetGame();
            }
        }
    } // end of Action preformed

    public void checkWinner() {
        if (valD > valP) { //checks for dealers win
            if (valD < 22) {
                winsD.setVisible(true);
                options.setVisible(false);
                submit2.setVisible(false);
                labelc.setText("");
                choice.setText("");
                play2.setVisible(true);
                playable = true;
                addLoss();
            }
        }
        
        if (valP > valD) { //checks for players win
            if (valP < 22) {
                winsP.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 80));
                valsP.setForeground(Color.GREEN);
                winsP.setVisible(true);
                options.setVisible(false);
                submit2.setVisible(false);
                labelc.setText("");
                choice.setText("");
                play2.setVisible(true);
                playable = true;
                addWin();
            }
        }

        if (valD == valP) { //checks for draw
            draw.setVisible(true);
            draw.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 80));
            draw.setForeground(Color.WHITE);
            options.setVisible(false);
            submit2.setVisible(false);
            labelc.setText("");
            choice.setText("");
            play2.setVisible(true);
            playable = true;
        }
    }
    
    public void resetGame() { // resets game
        frame2.setVisible(false);
        frame.setVisible(true);
        bust.setVisible(false);
        bustD.setVisible(false);
        winsP.setVisible(false);
        winsD.setVisible(false);
        draw.setVisible(false);
        play2.setVisible(false);
        options.setVisible(true);
        submit2.setVisible(true);
        labelc.setText("Chose an option from below, and click submit");
        betAmt.setText("Amount Bet: $" + bet + "⠀⠀⠀⠀⠀⠀");
        for (int i = 0; i < cardsP.size(); i++) {
            cardsP.remove(i);
            i--;
        }
        for (int i = 0; i < cardsD.size(); i++) {
            cardsD.remove(i);
            i--;
        }
        valP = 0;
        valD = 0;
        valsD.setForeground(Color.WHITE);
        valsP.setForeground(Color.WHITE);
        valsD.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Dealer's Total Value: " + valD + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        valsP.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value:⠀" + valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        panel6.removeAll();
        panel7.removeAll();
        initializeDealer();
        initializePlayer();
    } //end of resetGame

    public void initializeDealer() { // initializes dealers first two cards
        JLabel card = new JLabel(getCard(false));
        card.setForeground(Color.WHITE);
        cardsD.add(card);
        card.setFont(new Font("Dialouge", Font.ITALIC, 15));
        JLabel card2 = new JLabel(getCard(false));
        card2.setForeground(Color.WHITE);
        card2.setFont(new Font("Dialouge", Font.ITALIC, 15));
        cardsD.add(card2);
        panel6.add(card);
        panel6.add(card2);
        updateLabels();
    }

    public void initializePlayer() { // initializes players first two cards
        JLabel card = new JLabel(getCard(true));
        card.setForeground(Color.WHITE);
        card.setFont(new Font("Dialouge", Font.ITALIC, 15));
        cardsP.add(card);
        JLabel card2 = new JLabel(getCard(true));
        card2.setForeground(Color.WHITE);
        card2.setFont(new Font("Dialouge", Font.ITALIC, 15));
        cardsP.add(card2);
        panel7.add(card);
        panel7.add(card2);
        updateLabels();
    }

    public boolean checkBalance() { // checks for 0 balance (game over)
        boolean lost = false;
        if (balance == 0) {
            frame2.setVisible(false);
            frame4.setVisible(true);
            balance = 1000;
            updateLabels();
            lost = true;
            wins = 0;
            losses = 0;
            return lost;
        }
        return lost;
    }

    public void checkPlayer() { //checks for player bust
        if (valP > 21) {

            bust.setForeground(Color.RED);
            bust.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 80));
            valsP.setForeground(Color.RED);
            options.setVisible(false);
            submit2.setVisible(false);
            labelc.setText("");
            choice.setText("");
            bust.setVisible(true);
            play2.setVisible(true);
            playable = true;
            addLoss();

        }
    } // end of checkPlayer

    public void checkDealer() { // checks for dealer bust
        if (valD > 21) {
            bustD.setForeground(Color.GREEN);
            bustD.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 70));
            valsD.setForeground(Color.RED);
            options.setVisible(false);
            submit2.setVisible(false);
            labelc.setText("");
            choice.setText("");
            bustD.setVisible(true);
            play2.setVisible(true);
            playable = true;
            addWin();

        }
    }

    public void updateLabels() { //updates labels
        label23.setText("⠀⠀⠀⠀⠀⠀Current Balance: $" + balance);
        labelWins.setText("Wins: " + wins);
        labelLosses.setText("Losses: " + losses);
        labelBalance.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀Balance: $" + balance + "⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        valsD.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Dealer's Total Value: " + valD + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        valsP.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value:⠀" + valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

    }

    public void addWin() { //adds win
        wins++;
        balance = balance + bet;
        bet = 0;
    }

    public void addLoss() { //adds loss
        losses++;
        balance = balance - bet;
        bet = 0;
    }

} // end of class

