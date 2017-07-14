import javax.swing.*;


public class fonda{

 public static void main(String[] args) {
int regresar=0;
entrada e=new entrada();
guisado g=new guisado();
postre p=new postre();

JOptionPane.showMessageDialog(null,"Bienvenido a la fonda Capitan Morgan ");
JOptionPane.showMessageDialog(null,"Elige una opcion de cada menu ");
do{
String oen = JOptionPane.showInputDialog("Eliga su entrada\n1.-Pasta \n 2.-Arroz\n 3 .-Cebiche \n");


int ope=Integer.parseInt(oen);

String gui = JOptionPane.showInputDialog("Elija su guisado\n1.-Chicharron\n 2.-Tacos al pastor\n 3.-Papas \n4.-Cochinita");
int ogui=Integer.parseInt(gui);

String pos = JOptionPane.showInputDialog("Elija su postre\n1.-Helado\n 2.-Fresas\n 3.-Malteada \n 4.-Tarta de Fresa");
int opos=Integer.parseInt(pos);

JOptionPane.showMessageDialog(null,"Su menu es:\n"+cocina.preparar(g,ogui)+"\n"+cocina.preparar(e,ope)+"\n"+cocina.preparar(p,opos));
String r=JOptionPane.showInputDialog(null, "Deseas ordenar otra cosa\n1.-Volver a ordenar \n2.-Salir");
regresar=Integer.parseInt(r);
}while(regresar==1);
}



} 
