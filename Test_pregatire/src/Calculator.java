import javax.swing.*;

public class Calculator extends JFrame {
    JTextField resultNumber = new JTextField();

    public Calculator(){
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(20, 20, 400, 400);


        /// adding some things

        JLabel primuNumar = new JLabel("X = ");
        primuNumar.setBounds(10, 10, 40,20);
        this.add(primuNumar);

        JTextField xInput = new JTextField();
        xInput.setBounds(80 , 10, 40, 20);
        this.add(xInput);

        JLabel alDoileaNumar = new JLabel("Y = ");
        alDoileaNumar.setBounds(10, 30, 40 ,20);
        this.add(alDoileaNumar);

        JTextField yInput = new JTextField();
        yInput.setBounds(80, 30, 40, 20);
        this.add(yInput);

        JLabel result = new JLabel("result = ");
        result.setBounds(10, 50, 100, 20);
        this.add(result);

        resultNumber.setBounds(80, 50, 100, 20);
        this.add(resultNumber);

        JButton resultButton = new JButton("calculate!");
        resultButton.setBounds(200, 200, 100, 20);
        resultButton.addActionListener(n -> calculateResult(xInput, yInput) );
        this.add(resultButton);



        this.setVisible(true);
    }

    public void calculateResult (JTextField nr1 , JTextField nr2){
        try{
            double number1  = Double.parseDouble(nr1.getText());
            double number2  = Double.parseDouble(nr2.getText());
            double sum = number1 + number2;
            this.resultNumber.setText("" + sum);

        }
        catch (Exception e){};

    }
}

