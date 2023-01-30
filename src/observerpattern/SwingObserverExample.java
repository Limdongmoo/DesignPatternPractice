package observerpattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();

    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(action -> System.out.println("하지마! 아마 후회할걸?"));
        button.addActionListener(action -> System.out.println("그냥 저질러버려!"));

        frame.setSize(300, 300);
        Dimension frameSize = frame.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        // 레이블을 프레임에 추가
        frame.add(button, BorderLayout.CENTER);
        // 프레임 보이기
        frame.setVisible(true);
    }


}
