package myJavaProjects;

import java.awt.*;
import javax.swing.*;

/*
 * Name: Anoj Ganeshalingam 
 * Date: 6/12/2022
 * Description: A game of blackjack
 * Notes: 
 */
public class blackjack_client {

    public static void main(String[] args) {
        blackjack player1 = new blackjack();
        player1.outputGUI();
        System.out.println("Game Launched");
        //Help Screen
        player1.panel3.setBackground(Color.BLACK);
        JLabel label8 = new JLabel(getHelp());
        label8.setForeground(Color.WHITE);
        player1.panel3.add(label8);
        player1.panel3.add(player1.back);
        player1.panel3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        player1.setFrame(player1.frame3, 710, 310, false);

        //Out of Funds Screen
        JLabel label19 = new JLabel("OUT OF FUNDS...");
        label19.setFont(new Font("Monospaced", Font.PLAIN, 18));
        JLabel label20 = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        JLabel label21 = new JLabel("*Balanace will be defaulted back to $1000");
        JLabel label21b = new JLabel("*Wins/Losses will also be reset");
        player1.panel4.setBackground(Color.BLACK);
        label19.setForeground(Color.WHITE);
        label21.setForeground(Color.RED);
        label21b.setForeground(Color.RED);
        player1.panel4.add(label19);
        player1.panel4.add(player1.reset);
        player1.panel4.add(label20);
        player1.panel4.add(label21);
        player1.panel4.add(label21b);
        player1.panel4.setBorder(BorderFactory.createLineBorder(Color.RED));
        player1.setFrame(player1.frame4, 275, 200, false);

        //Bet Screen
        player1.panel5.setBackground(Color.BLACK);
        JLabel label22 = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Place Your Bets: ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        label22.setFont(new Font("Dialogue", Font.ITALIC, 18));
        label22.setForeground(Color.WHITE);

        player1.label23.setForeground(Color.WHITE);
        JLabel label24 = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀*Bets cannot exceed current balance⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        label24.setForeground(Color.MAGENTA);
        JLabel label25 = new JLabel("When finished, push the button below to submit your bet and begin the game");
        label25.setForeground(Color.WHITE);
        player1.plus7.setBackground(Color.RED);
        player1.betAmt.setForeground(Color.WHITE);
        player1.warning.setForeground(Color.RED);
        player1.panel5.add(label22);
        player1.panel5.add(player1.plus1);
        player1.panel5.add(player1.plus2);
        player1.panel5.add(player1.plus3);
        player1.panel5.add(player1.plus4);
        player1.panel5.add(player1.plus5);
        player1.panel5.add(player1.plus6);
        player1.panel5.add(player1.plus7);
        player1.panel5.add(player1.betAmt);
        player1.panel5.add(player1.label23);
        player1.panel5.add(label20);
        player1.panel5.add(label24);
        player1.panel5.add(label20);
        player1.panel5.add(label25);
        player1.panel5.add(player1.submit);
        player1.panel5.add(player1.warning);

        player1.panel5.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        player1.setFrame(player1.frame5, 500, 250, false);

        // Menu Screen
        player1.panel.setBackground(Color.BLACK);
        JLabel label = new JLabel("Welcome to Blackjack!");
        label.setFont(new Font("Dialouge", Font.BOLD, 18));
        label.setForeground(Color.WHITE);
        player1.labelWins.setForeground(Color.WHITE);
        player1.labelLosses.setForeground(Color.WHITE);
        player1.labelBalance.setForeground(Color.WHITE);
        player1.panel.add(label);
        player1.panel.add(player1.play);
        player1.panel.add(player1.help);
        player1.panel.add(player1.labelBalance);
        player1.panel.add(player1.labelWins);
        player1.panel.add(player1.labelLosses);

        player1.panel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        player1.setFrame(player1.frame, 250, 160, true);

        //Blackjack Screen (MAIN GAME)
        JLabel label2 = new JLabel(" ██████╗ ░██╗░░░░░░ █████╗ ░░█████╗ ░██╗░░██╗ ░░░░░██╗ ░█████╗ ░░█████╗ ░██╗░░██╗");
        JLabel label3 = new JLabel(" ██╔══██╗ ██║░░░░░ ██╔══██╗ ██╔══██╗ ██║░██╔╝ ░░░░░██║ ██╔══██╗ ██╔══██╗ ██║░██╔╝");
        JLabel label4 = new JLabel(" ██████╦╝ ██║░░░░░ ███████║ ██║░░╚═╝ █████═╝ ░░░░░░██║ ███████║ ██║░░╚═╝ █████═╝░");
        JLabel label5 = new JLabel(" ██╔══██╗ ██║░░░░░ ██╔══██║ ██║░░██╗ ██╔═██╗  ░██╗ ██║ ██╔══██║ ██║░░██╗ ██╔═██╗░");
        JLabel label6 = new JLabel(" ██████╦╝ ███████╗ ██║░░██║ ╚█████╔╝ ██║░╚██╗ ╚█████╔╝ ██║░░██║ ╚█████╔╝ ██║░╚██╗");
        JLabel label7 = new JLabel(" ╚═════╝░ ╚══════╝ ╚═╝░░╚═╝  ░╚════╝░ ╚═╝░░╚═╝ ░╚════╝░ ╚═╝░░╚═╝ ░╚════╝░ ╚═╝░░╚═╝");
        JLabel labela = new JLabel("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰 Dealer's Hand: 〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰");
        JLabel labelb = new JLabel("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰 Player's Hand: 〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰");
        JLabel spacing2 = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        player1.labelc.setForeground(Color.WHITE);
        player1.labelc.setFont(new Font("Dialouge", Font.BOLD | Font.ITALIC, 16));
        labela.setForeground(Color.WHITE);
        labela.setBackground(Color.RED);
        labela.setFont(new Font("Dialouge", Font.BOLD | Font.ITALIC, 20));
        labelb.setForeground(Color.WHITE);
        labelb.setFont(new Font("Dialouge", Font.BOLD | Font.ITALIC, 20));
        player1.panel2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label5.setForeground(Color.WHITE);
        label6.setForeground(Color.WHITE);
        label7.setForeground(Color.WHITE);
        
        player1.panel2.add(spacing2);
        player1.panel2.add(label2);
        player1.panel2.add(label3);
        player1.panel2.add(label4);
        player1.panel2.add(label5);
        player1.panel2.add(label6);
        player1.panel2.add(label7);
        //player1.panel2.add(spacing2);
        player1.panel2.add(labela); // Dealers hand 
        player1.panel6.setLayout(player1.grid);
        player1.panel6.setBackground(Color.DARK_GRAY);
        player1.panel6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        player1.panel2.add(player1.panel6);
        player1.valsD.setForeground(Color.WHITE);
        player1.valsD.setFont(new Font("Monologue", Font.ITALIC | Font.BOLD, 14));
        player1.panel2.add(player1.valsD);
        player1.panel2.add(labelb);
        player1.panel7.setLayout(player1.grid2);
        player1.panel7.setBackground(Color.DARK_GRAY);
        player1.panel7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        player1.panel2.add(player1.panel7);
        player1.valsP.setForeground(Color.WHITE);
        player1.valsP.setFont(new Font("Monologue", Font.ITALIC | Font.BOLD, 14));
        player1.panel2.add(player1.valsP);
        player1.panel2.add(label20);
        player1.panel2.add(player1.panel8);
        player1.panel8.setBackground(Color.DARK_GRAY);
        player1.panel8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        player1.panel8.add(player1.labelc);
        player1.panel8.add(player1.options);
        player1.panel8.add(player1.submit2);
        player1.choice.setForeground(Color.WHITE);
        player1.choice.setFont(new Font("Monologue", Font.ITALIC | Font.BOLD, 14));
        player1.panel8.add(player1.choice);
        player1.bust.setVisible(false);
        player1.bustD.setVisible(false);
        player1.play2.setVisible(false);
        player1.winsD.setVisible(false);
        player1.winsP.setVisible(false);
        player1.draw.setVisible(false);
        player1.winsD.setForeground(Color.RED);
        player1.winsD.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 70));
        player1.winsP.setForeground(Color.GREEN);
        player1.winsP.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 70));
        player1.draw.setForeground(Color.WHITE);
        player1.draw.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 70));
        player1.panel8.add(player1.bust);
        player1.panel8.add(player1.bustD);
        player1.panel8.add(player1.winsD);
        player1.panel8.add(player1.winsP);
        player1.panel8.add(player1.draw);
        JLabel spacing = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        player1.panel2.add(spacing);
        player1.panel2.add(player1.play2);
        player1.warning2.setForeground(Color.RED);
        player1.warning2.setFont(new Font("Serif",Font.ITALIC, 15));
        player1.warning2.setVisible(false);
        player1.panel2.add(player1.warning2);

        player1.panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        player1.setFrame(player1.frame2, 1000, 800, false);

                JLabel card1 = new JLabel(player1.getCard(false));
                player1.addCard(card1, false);
                JLabel card2 = new JLabel(player1.getCard(false));
                player1.addCard(card2, false);

                for (int i = 0; i < player1.cardsD.size(); i++) {
                    // System.out.println(player1.cardsD.get(i));
                    //       player1.cardsD.get(i)
                    player1.cardsD.get(i).setForeground(Color.WHITE);
                    player1.cardsD.get(i).setFont(new Font("Dialouge", Font.ITALIC, 15));
                    player1.panel6.add(player1.cardsD.get(i));
                }
                
                JLabel card3 = new JLabel(player1.getCard(true));
                JLabel card4 = new JLabel(player1.getCard(true));
                player1.addCard(card3, true);
                player1.addCard(card4, true);
                
                for (int i = 0; i < player1.cardsP.size(); i++) {
                    player1.cardsP.get(i).setForeground(Color.WHITE);
                    player1.cardsP.get(i).setFont(new Font("Dialouge", Font.ITALIC, 15));
                    player1.panel7.add(player1.cardsP.get(i));
                }
                
                player1.valsP.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Player's Total Value: " + player1.valP + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                player1.valsD.setText("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀Dealer's Total Value: " + player1.valD + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    } // end of main


    public static String getHelp() {
        String help
                = "<html>B͟A͟S͟I͟C͟ B͟L͟A͟C͟K͟J͟A͟C͟K͟ R͟U͟L͟E͟S͟:<br/><br/>"
                + "• The goal of blackjack is to beat the dealer's hand without going over 21.<br/>"
                + "• Face cards (Jack, Queen, King) are worth 10. Aces are worth only 1.<br/>"
                + "• Each player starts with two cards. All cards are pulled faced up.<br/>"
                + "• To 'Hit' is to ask for another card. To 'Stand' is to hold your total and end your turn.<br/>"
                + "• If you go over 21 you bust, and the dealer wins regardless of the dealer's hand.<br/>"
                + "• Doubling is like a hit, only the bet is doubled and you cannot hit again.<br/>"
                + "• Dealer will hit until his/her cards total 17 or higher.<br/>"
                + "• Winning means you earn the amount of your original bet. Losing means you lose your entire bet.<br/>"
                + "• You can continue to bet until your balance reaches 0, at which point you lose the game and must start again.<br/>"
                + "• Now its your turn. How much money do you think you can make?<br/>"
                + "• Note: Do not fullscreen to keep a proper view of the game.<br/>⠀<br/> </html>";
        return help;
    } // end of Help method

} // end of Blackjack