import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazOr extends JFrame {
    private JPanel panelPrincipal;
    private JButton ingresarDatosButton;
    private JButton burbujaButton;
    private JButton insercionButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextField a1000TextField;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton inserccionButton;

    public InterfazOr() {
        add(panel1);
        setSize(500, 500);
        setLocationRelativeTo(null);

        setTitle("Metodos Ordenamiento");

        OrdenamientoDatos classOrdenamiento = new OrdenamientoDatos();
        ingresarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numDatos = Integer.parseInt(a1000TextField.getText());
                classOrdenamiento.fillDataArrWithNumData(numDatos);
                textArea1.setText("");
                int[] numeros = classOrdenamiento.getDataArr();
                for (int i = 0; i < numeros.length; i++) {
                    textArea1.append(numeros[i] + "\n");
                }
            }
        });

        burbujaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classOrdenamiento.bubbleSort();
                textArea2.setText("");
                int[] numeros = classOrdenamiento.getBubbleArr();
                for (int i = 0; i < numeros.length; i++) {
                    textArea2.append(numeros[i] + "\n");
                }
            }
        });

        inserccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    classOrdenamiento.insertionSort();
                    textArea3.setText("");
                    int[] numeros = classOrdenamiento.getInsertionArr();
                    for (int i = 0; i < numeros.length; i++) {
                        textArea3.append(numeros[i] + "\n");
                    }
            }
        });
    }

    public static void main(String[] args) {
        InterfazOr interfaz = new InterfazOr();
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.setVisible(true);
    }
}
