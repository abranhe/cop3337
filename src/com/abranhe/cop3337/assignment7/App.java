/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */

package com.abranhe.cop3337.assignment7;

/**
 * User interface for the currency converter.
 * 
 * @author Carlos Hernandez
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App {
  Currency currencies[] = { Currency.USD, Currency.EUR, Currency.GBP };

  private final int WIDTH = 400;
  private final int HEIGHT = 250;

  public App() {
    JFrame frame = new JFrame();
    frame.setSize(WIDTH, HEIGHT);
    frame.setTitle("Currency Converter");

    JPanel app = new JPanel();

    JLabel amountLabel = new JLabel("Enter the amount to change: ");
    TextField input = new TextField(30);
    input.setColumns(45);

    JLabel sourceLabel = new JLabel("Select the currency source: ");
    JComboBox<Currency> source = new JComboBox<Currency>(currencies);
    source.setPreferredSize(new Dimension(90, 30));

    JLabel targetLabel = new JLabel("Select the currency target: ");
    JComboBox<Currency> target = new JComboBox<Currency>(currencies);
    target.setPreferredSize(new Dimension(90, 30));

    JLabel outputLabel = new JLabel("The converted value is: ");
    TextField output = new TextField(30);
    output.setColumns(45);
    output.setEditable(false);

    JButton convertBtn = new JButton();
    convertBtn.setPreferredSize(new Dimension(100, 40));
    convertBtn.setText("Convert");

    // Adding convert button listener.
    convertBtn.addActionListener(new ActionListener() {
      @Override

      public void actionPerformed(ActionEvent event) {
        try {
          double amount = Double.parseDouble(input.getText());

          // Getting currency types.
          Currency sourceCurrency = (Currency) source.getSelectedItem();
          Currency targetCurrency = (Currency) target.getSelectedItem();

          // Validating currency units.
          if (sourceCurrency == targetCurrency) {
            JOptionPane.showMessageDialog(null, "Source and target currencies are same!");
          } else {

            // Performing convertion.
            double result = Converter.convert(amount, sourceCurrency, targetCurrency);

            // Rounding and adding currency symbol.
            output.setText(String.format(currencySymbol(targetCurrency) + " %.2f", result));

          }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Invalid input amount");
        }
      }
    });

    app.add(amountLabel);
    app.add(input);
    app.add(sourceLabel);
    app.add(source);
    app.add(targetLabel);
    app.add(target);
    app.add(outputLabel);
    app.add(output);
    app.add(convertBtn);

    frame.add(app);
    frame.setVisible(true);
  }

  /**
   * Returns the symbol for a given currency.
   * 
   * @param currency the desired currency.
   * @return an string with the symbol of the currency.
   */
  private String currencySymbol(Currency currency) {
    String symbol = "";

    if (currency == Currency.USD) {
      symbol = "﹩";
    }

    if (currency == Currency.EUR) {
      symbol = "€";
    }

    if (currency == Currency.GBP) {
      symbol = "£";
    }

    return symbol;
  }

  public static void main(String[] args) {
    new App();
  }
}