package controller;

import view.AppWindow;

public class App {

    public static AppWindow win;

    public static void main(String[] args) {        
        win = new AppWindow();
        win.init();
        win.setDefaultCloseOperation(AppWindow.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);   
    }
}
