package com.xhomerly.clipboard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.text.Font;


public class HelloController {
    @FXML Label labelis;
    @FXML TextField fromText, toText, stepText;
    @FXML TextArea textArea;

    public void copy() {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(textArea.getText());
        clipboard.setContent(content);
        labelis.setText("Text: Hello World has been copied to Clipboard");
    }

    public void calc() {
        int from = Integer.parseInt(fromText.getText());
        int to = Integer.parseInt(toText.getText());
        double step = Double.parseDouble(stepText.getText());

        for (double i = from; i <= to+step; i+=step) {
            String text = "Číslo " + Math.round(i* 10.0) / 10.0 + ":\t" + Math.round(Math.pow(2, i)* 100.0) / 100.0 + "\t" + Math.round(Math.pow(3, i)* 1000.0) / 1000.0 + "\n";
            textArea.appendText(text);
        }
    }
}