package utils;

import javax.swing.*;
import java.awt.*;
/**
 * Classe regroupant des utilitaires pour l'affichage de l'interface graphique.
 * Ce fichier sert seulement de code de depart pour tester lalibrairie swing de java.
 */

// Ne pas copier coller entierement dans changemenr dans votre projet (pour ne pas etre accuser de plagia).
public class MyFrame {

        /**
         * Cree une fenetre de taille moyenne
         * @param title titre de la fenetre
         * @param frame panneau JFrame
         */
        public static void buildSmallSizeFrame(String title, JFrame frame) {
            frame.setBackground(Style.BACKGROUND_STANDART_COLOR);
            frame.setResizable(false);
            frame.setTitle(title);
            frame.setBounds(500, 350, 500, 250);
            //frame.setBounds(400, 200, Style.MEDIUM_WIDTH,
            //        Style.MEDIUM_HEIGHT);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().setLayout(null);
            frame.setVisible(true);
        }

        /**
         * Cree une fenetre de petite taille
         * @param frame panneau JFrame
         */
        public static void buildSmallSizeFrame (JFrame frame) {
            frame.setBackground(Style.BACKGROUND_STANDART_COLOR);
            frame.setResizable(false);
            frame.setBounds(500, 350, 500, 250);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().setLayout(null);
            frame.setVisible(true);
        }

        /**
         * Cree un panneau personnalise
         * @param frame panneau JFrame
         */
        public static void buildCustomFrame(JFrame frame) {
            frame.getContentPane().setBackground(new Color(238,238,238));
            frame.setBounds(100, 100, 600, 400);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(null);
            frame.setVisible(true);
        }

        /**
         * Cree un bouton de taille normale
         *	@param x Horizontal position
         *	@param y Vertical position
         */
        public static JButton createNormalSizeButton(String text, int x, int y) {
            JButton jbutton = new JButton(text);
            jbutton.setBackground(Style.BACKGROUND_STANDART_COLOR);
            jbutton.setBounds(x, y, 188, 32);
            return jbutton;
        }

        /**
         * Cree un bouton avec surbrillance de taille normale
         *	@param x Horizontal position
         *	@param y Vertical position
         */
        public static JButton createNormalSizeHighlightButton(String text,int x,
                                                              int y) {
            JButton jbutton = new JButton(text);
            jbutton.setBackground(SystemColor.controlHighlight);
            jbutton.setBounds(x, y, 188, 32);
            return jbutton;
        }

        /**
         * Cree un bouton de petite taille
         *	@param x Horizontal position
         *	@param y Vertical position
         */
        public static JButton createSmallSizeButton(String text,int x, int y) {
            JButton jbutton = new JButton(text);
            jbutton.setBackground(Style.BACKGROUND_STANDART_COLOR);
            jbutton.setBounds(x, y, 120, 25);
            return jbutton;
        }

        /**
         * Cree une etiquette standard
         *	@param x Horizontal position
         *	@param y Vertical position
         */
        public static JLabel createStandartLabel(String text, int x, int y ) {
            JLabel jLabel = new JLabel(text);
            jLabel.setVerticalAlignment(SwingConstants.TOP);
            jLabel.setFont(Style.LABEL_FONT);
            jLabel.setBounds(x, y, 600, 50);
            return jLabel;
        }

        /**
         * Cree une etiquette de titre
         *	@param x Horizontal position
         *	@param y Vertical position
         */
        public static JLabel createTitleLabel(String text, int x, int y ) {
            JLabel jLabel = new JLabel(text);
            jLabel.setFont(Style.LABEL_FONT_TITLE);
            jLabel.setBounds(x, y, 114, 30);
            return jLabel;
        }

        /**
         * Cree le panneau lateral de MainWindow
         */
        public static Panel createLeftPanel() {
            Panel panel = new Panel();
            panel.setBackground(Style.BACKGROUND_STANDART_COLOR);
            panel.setBounds(21, 30, 222, 636);
            panel.setLayout(null);
            return panel;
        }
        /**
         * Cree un panneau de taille moyenne
         */
        public static JPanel createMediumPanel() {
            JPanel panel = new JPanel();
            panel.setBackground(Style.BACKGROUND_STANDART_COLOR);
            panel.setBounds(0, 0, Style.MEDIUM_WIDTH, Style.MEDIUM_HEIGHT);
            return panel;
        }
}

