package ejercicio1;

import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, semestre,expediente,m1,m2,m3;
		Double materia1, materia2, materia3;

		//Captura de Informacion
		nombre = JOptionPane.showInputDialog("Escribe tu Nombre:");
		expediente= JOptionPane.showInputDialog("Escribe tu Numero de Expediente:");
		semestre = JOptionPane.showInputDialog("Semestre en Curso(numero):",1);
		//		String[] options = {"Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4", "Semestre 5", "Semestre 6"};
				
		m1 = JOptionPane.showInputDialog("Calificacion Español:",5.0);
		m2 = JOptionPane.showInputDialog("Calificacion Matematicas:",5.0);
		m3 = JOptionPane.showInputDialog("Calificacion Ingles:",5.0);
		
		materia1=Double.parseDouble(m1);
		materia2=Double.parseDouble(m2);
		materia3=Double.parseDouble(m3);
		Double promedio=(materia1+materia2+materia3)/3;
		
		JOptionPane.showMessageDialog(null,"El promedio Obtenido es: "+materia1+" + "+materia2+" + "+materia3+" = "+promedio  );
		int semestrenum =Integer.parseInt(semestre);
		int semnuevo = (promedio >=6.0)?
				semestrenum=semestrenum+1 : semestrenum+0;
		
		
		String prom = (promedio >=6.0)?
				"Aprobado" : "Reprobado, Repite Curso";
		
		String msg1= ""+semnuevo;
		String msg2= ""+promedio;
		
		String resultado = " Nombre: "+nombre+"\n No.Expediente: "+expediente+" \n Promedio: "+promedio+"\n Semestre a Cursar: "+ semnuevo;
		
		JOptionPane.showMessageDialog(null, resultado);

		
	}

}
