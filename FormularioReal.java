import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class FormularioReal extends JFrame implements ActionListener, ChangeListener{
  private JLabel bienv, id, nomb, edad, sexo, direcc , termi;
  private JTextField idT, nombT, edadT,  direccT;
  private JButton idS, nombS, edadS, sexoS, generS, acepS, direccS, calcS;
  private JCheckBox mascu, femen, termiC;
 
  
  public FormularioReal(){
  setLayout(null);
  bienv = new JLabel("Hola, Registrate Por Favor");
  bienv.setBounds(10,10,400,40);
  add(bienv);
  
  id = new JLabel("Cree un usuario");
  id.setBounds(10,40,300, 40);
  add(id);

  idT = new JTextField();
  idT.setBounds(150,50, 180, 25);
  idT.setEnabled(true);
  add(idT);

  idS = new JButton("Enviar");
  idS.setBounds(360,50,90,25);
  add(idS);
  idS.addActionListener(this);


  nomb = new JLabel("Nombre y Apellidos: ");
  nomb.setBounds(10,70,300, 40);
  add(nomb);

  nombT = new JTextField();
  nombT.setBounds(150,80, 180, 25);
  nombT.setEnabled(true);
  add(nombT);

  nombS = new JButton("Enviar");
  nombS.setBounds(360,80,90,25);
  add(nombS);
  nombS.addActionListener(this);
  

  edad = new JLabel("Edad:");
  edad.setBounds(10,100,300, 40);
  add(edad);

  edadT = new JTextField();
  edadT.setBounds(150,110, 180, 25);
  edadT.setEnabled(true);
  add(edadT);

  edadS = new JButton("Enviar");
  edadS.setBounds(360,110,90,25);
  add(edadS);
  edadS.addActionListener(this);

  sexo = new JLabel("Seleccione Su Genero: ");
  sexo.setBounds(10,130,300,40);
  add(sexo);

  mascu = new JCheckBox("Masculino");
  mascu.setBounds(150,140, 180,25);
  mascu.addChangeListener(this);
  add(mascu);

  femen = new JCheckBox("Femenino");
  femen.setBounds(150,170,180,25);
  femen.addChangeListener(this);
  add(femen);


  direcc = new JLabel("Direccion: ");
  direcc.setBounds(10,185,300, 40);
  add(direcc);

  direccT = new JTextField();
  direccT.setBounds(150,198,180,25);
  direccT.setEnabled(true);
  add(direccT);

  direccS = new JButton("Enviar");
  direccS.setBounds(360, 198, 90,25);
  add(direccS);
  direccS.addActionListener(this);

  termi = new JLabel("Acepto los terminos y condiciones");
  termi.setBounds(10,235,400,40);
  add(termi);

  termiC = new JCheckBox();
  termiC.setBounds(215, 240,30,30);
  add(termiC);
  termiC.addChangeListener(this);

  acepS = new JButton("Aceptar");
  acepS.setBounds(360, 300, 90, 30);
  add(acepS);
  acepS.addActionListener(this);

  calcS = new JButton("Cancelar");
  calcS.setBounds(255, 300, 90, 30);
  add(calcS);
  calcS.addActionListener(this);
  }
  


  public void actionPerformed(ActionEvent e){
   if (e.getSource() == nombS) {
      nombT.setEnabled(false);
   	
   }

   if (e.getSource() == edadS) {
      edadT.setEnabled(false);
   	
   }

   if (e.getSource() == direccT) {
      direccS.setEnabled(false);
   	
   }

   if (e.getSource() == direccS) {
      direccT.setEnabled(false);
   	
   }

   if (e.getSource() == idS) {
      idT.setEnabled(false);
   	
   }

   if (e.getSource() == calcS) {
      System.exit(0);
   	
   }

   if (e.getSource() == acepS) {
      System.exit(0);
   	
   }
  } 

  public void stateChanged(ChangeEvent e){
    if(mascu.isSelected() == true){
     mascu.setEnabled(false);
     femen.setEnabled(false); 
  
    }

  }


  public static void main(String[] args) {
	FormularioReal bao = new FormularioReal();
	bao.setTitle("Registro");
	bao.setBounds(0,0,500,400);
	bao.setResizable(false);
	bao.setVisible(true);
	
	bao.setLocationRelativeTo(null);
}













}