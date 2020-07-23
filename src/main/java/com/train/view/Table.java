package com.train.view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Table extends JFrame {

	private static final long serialVersionUID = 1L;

    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Table();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table() {
		setTitle("学生信息首页");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 664);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(129, 98, 897, 481);
		contentPane.add(scrollPane);

        JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button_refresh = new JButton("刷新");
		button_refresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_refresh.setBounds(129, 30, 153, 39);
		button_refresh.setIcon(new ImageIcon(Table.class.getResource("/images/refresh.png")));
		button_refresh.setFont(new Font("楷体", Font.BOLD, 25));
		contentPane.add(button_refresh);
		
		JButton button_lock = new JButton("锁定");
		button_lock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_lock.setBounds(498, 30, 153, 39);
		button_lock.setIcon(new ImageIcon(Table.class.getResource("/images/lock.png")));
		button_lock.setFont(new Font("楷体", Font.BOLD, 25));
		contentPane.add(button_lock);
		
		JButton button_unlock = new JButton("解锁");
		button_unlock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_unlock.setBounds(873, 30, 153, 39);
		button_unlock.setIcon(new ImageIcon(Table.class.getResource("/images/unlock.png")));
		button_unlock.setFont(new Font("楷体", Font.BOLD, 25));
		contentPane.add(button_unlock);
	}

}
