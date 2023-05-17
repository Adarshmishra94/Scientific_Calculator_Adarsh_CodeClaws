import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class publiccalculator extends Applet implements ActionListener{

Label lblcasio = new Label("CASIO");
Label lblfx = new Label("fx-8265 PLUS");
Label lblnatural = new Label("NATURAL - V.P.A.M");

TextField txtfield1 = new TextField(30);

Button abs = new Button("Abs");
Button X2 = new Button("X^2");
Button X3 = new Button("X^3");
Button log = new Button("log");
Button sqrt = new Button("/---");

Button sin = new Button("sin");
Button cos = new Button("cos");
Button tan = new Button("tan");
Button pie = new Button("π");
Button E = new Button("E");

Button seven = new Button("7");
Button eight = new Button("8");
Button nine = new Button("9");
Button DEL = new Button("DEL");
Button AC = new Button("AC/CLEAR");

Button four = new Button("4");
Button five = new Button("5");
Button six = new Button("6");
Button multiply = new Button("X");
Button subtract = new Button("-");

Button one = new Button("1");
Button two = new Button("2");
Button three = new Button("3");
Button plus = new Button("+");
Button dive = new Button("/");

Button zero = new Button("0");
Button equals = new Button("=");
Button dot = new Button(".");
Button round = new Button("RND");


public void init(){

    setLayout(null);
    resize(500,400);

    Font myCasio= new Font("Serif",Font.BOLD,18);
    Font myFX= new Font("Serif",Font.BOLD,18);
    Font myNatural = new Font("Serif",Font.BOLD,15);


    lblcasio.setFont(myCasio);
    lblfx.setFont(myFX);
    lblnatural.setFont(myNatural);

    add(lblcasio);
    add(lblfx);
    add(lblnatural);

    add(txtfield1);

    add(abs);
    add(X2);
    add(X3);
    add(log);
    add(sqrt);

    add(sin);
    add(cos);
    add(tan);
    add(pie);
    add(E);

    add(seven);
    add(eight);
    add(nine);
    add(DEL);
    add(AC);

    add(four);
    add(five);
    add(six);
    add(multiply);
    add(subtract);

    add(one);
    add(two);
    add(three);
    add(plus);
    add(dive);

    add(zero);
    add(equals);
    add(dot);
    add(round);

    lblcasio.setBounds(60,0,100,20);
    lblfx.setBounds(350,0,150,20);
    lblnatural.setBounds(160,25,200,20);
    txtfield1.setBounds(100,50,240,20);

    abs.setBounds(100,75,35,35);
    X2.setBounds(150,75,35,35);
    X3.setBounds(200,75,35,35);
    log.setBounds(250,75,35,35);
    sqrt.setBounds(300,75,35,35);

    sin.setBounds(100,120,35,35);
    cos.setBounds(150,120,35,35);
    tan.setBounds(200,120,35,35);
    pie.setBounds(250,120,35,35);
    E.setBounds(300,120,35,35);

    seven.setBounds(100,165,35,35);
    eight.setBounds(150,165,35,35);
    nine.setBounds(200,165,35,35);
    AC.setBounds(250,165,85,35);

    four.setBounds(100,210,35,35);
    five.setBounds(150,210,35,35);
    six.setBounds(200,210,35,35);
    multiply.setBounds(250,210,35,35);
    subtract.setBounds(300,210,35,35);

    one.setBounds(100,255,35,35);
    two.setBounds(150,255,35,35);
    three.setBounds(200,255,35,35);
    plus.setBounds(250,255,35,35);
    dive.setBounds(300,255,35,35);

    zero.setBounds(100,300,35,35);
    equals.setBounds(150,300,85,35);
    dot.setBounds(250,300,35,35);
    round.setBounds(300,300,35,35);



    equals.addActionListener(this);
    one.addActionListener(this);
    two.addActionListener(this);
    three.addActionListener(this);
    plus.addActionListener(this);
    dive.addActionListener(this);
    four.addActionListener(this);
    five.addActionListener(this);
    six.addActionListener(this);
    multiply.addActionListener(this);
    subtract.addActionListener(this);
    seven.addActionListener(this);
    eight.addActionListener(this);
    nine.addActionListener(this);
    sin.addActionListener(this);
    cos.addActionListener(this);
    tan.addActionListener(this);
    pie.addActionListener(this);
    E.addActionListener(this);
    abs.addActionListener(this);
    X2.addActionListener(this);
    X3.addActionListener(this);
    log.addActionListener(this);
    sqrt.addActionListener(this);
    zero.addActionListener(this);
    dot.addActionListener(this);
    round.addActionListener(this);
    txtfield1.setEnabled(false);
}

public void actionPerformed(ActionEvent e) 
    {
    if(e.getSource()==one){ 
        txtfield1.setText(one.getActionCommand());
    }
        else if(e.getSource()==two){
            txtfield1.setText(two.getActionCommand());
        }
        else if(e.getSource()==two){
            txtfield1.setText(two.getActionCommand());
        }
        else if(e.getSource()==three){
            txtfield1.setText(three.getActionCommand());
        }
        else if(e.getSource()==four){
            txtfield1.setText(four.getActionCommand());
        }
        else if(e.getSource()==five){
            txtfield1.setText(five.getActionCommand());
        }
        else if(e.getSource()==six){
            txtfield1.setText(six.getActionCommand());
        }
        else if(e.getSource()==seven){
            txtfield1.setText(seven.getActionCommand());
        }
        else if(e.getSource()==eight){
            txtfield1.setText(eight.getActionCommand());
        }
        else if(e.getSource()==nine){
            txtfield1.setText(nine.getActionCommand());
        }
        else if(e.getSource()==plus){
            txtfield1.setText(plus.getActionCommand());
        }
        else if(e.getSource()==subtract){
            txtfield1.setText(subtract.getActionCommand());
        }
        else if(e.getSource()==multiply){
            txtfield1.setText(multiply.getActionCommand());
        }
        else if(e.getSource()==dive){
            txtfield1.setText(dive.getActionCommand()); 
        }
    }
}