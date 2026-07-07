
import javax.swing.*;
import javax.swing.table.*;
public class CincoEjercicio extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    DefaultTableModel modeloNotas;
    DefaultTableModel modeloNumero;
    DefaultTableModel modeloPorcentage;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CincoEjercicio.class.getName());

    public CincoEjercicio() {
        initComponents();        
        this.setTitle("Desarrollado¨Por: Yilibeth Ortiz");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
        
        modelo= (DefaultTableModel) tablaDatos.getModel();
        modeloNotas= (DefaultTableModel) TablaDatos2.getModel();
        modeloNumero= (DefaultTableModel) TablaNumero.getModel();
        modeloPorcentage= (DefaultTableModel) CajadeDatos.getModel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtEdad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnCalificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaNumero = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtArticulo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnCarrito = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        CajadeDatos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        txtEdad2 = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        lblResumen = new javax.swing.JLabel();
        lblEstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese Su Nombre");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese su Apellido");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese su Edad");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 30));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);
        jPanel6.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Mayor", "Menor"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        jPanel6.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        tab1.addTab("Calificador de edades", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Estudiantes :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 20));
        jPanel7.add(txtEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Notas de Examenes");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 20));
        jPanel7.add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, -1));
        jPanel7.add(txtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, -1));
        jPanel7.add(txtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));
        jPanel7.add(txtNota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, -1));

        jLabel6.setText("Nota1");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 20));

        jLabel7.setText("Nota 2");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, -1));

        jLabel8.setText("Nota 3");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, 20));

        jLabel9.setText("Nota 4");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);
        jPanel7.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        TablaDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio Final"
            }
        ));
        jScrollPane2.setViewportView(TablaDatos2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 570, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 500));

        tab1.addTab("Promedio de estudiantes", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Ingrese un Número:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 30));
        jPanel8.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 30));

        btnCalificar.setText("CALIFICAR NUMERO");
        btnCalificar.addActionListener(this::btnCalificarActionPerformed);
        jPanel8.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        TablaNumero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Ingresado", "¿Par o Impar?", "¿Positivo o Negativo?"
            }
        ));
        jScrollPane3.setViewportView(TablaNumero);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 520, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 490));

        tab1.addTab("Filtro de Numeros", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 170, 30));
        jPanel9.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, 30));
        jPanel9.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 170, 30));

        btnCarrito.setText("Agregar al Carrito");
        btnCarrito.addActionListener(this::btnCarritoActionPerformed);
        jPanel9.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        CajadeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Precio($)", "Cantidad", "IVA(16%)", "Total a Pagar"
            }
        ));
        jScrollPane4.setViewportView(CajadeDatos);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Ingrese el Articulo");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 20));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Precio");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 40));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Cantidad");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 30));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1030, 470));

        tab1.addTab("Calculo de Porcentaje", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 30));
        jPanel10.add(txtEdad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 30));
        jPanel10.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        jLabel14.setText("Cliente ");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel15.setText("Edad");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel16.setText("Ingreso");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(this::btnSolicitarActionPerformed);
        jPanel10.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        lblResumen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblResumen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(lblResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 260, 60));

        lblEstatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblEstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(lblEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 320, 50));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 470));

        tab1.addTab("Credito Estudiantil", jPanel5);

        getContentPane().add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


if(txtNombre.getText().trim().equals("") || txtApellido.getText().trim().equals("") || txtEdad.getText().trim().equals("") ){
    JOptionPane.showMessageDialog(this,"Por favor, llenar todos los campos");
}else{
    String nombre= txtNombre.getText();
    String apellido= txtApellido.getText();
    int edad= Integer.parseInt(txtEdad.getText());
    
    if(edad>=18){
        Object[] filaMayor= {nombre, apellido, edad, "x", ""};
        modelo.addRow(filaMayor);
        
    }else{
        Object[] filaMenor= {nombre, apellido, edad, "", "x"};
        modelo.addRow(filaMenor);
    }
    txtNombre.setText("");
    txtApellido.setText("");
    txtEdad.setText("");
    txtNombre.requestFocus();
}

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

String estudiante= txtEstudiante.getText();
double nota1= Double.parseDouble(txtNota1.getText());
double nota2= Double.parseDouble(txtNota2.getText());
double nota3= Double.parseDouble(txtNota3.getText());
double nota4= Double.parseDouble(txtNota4.getText());

double promedio= (nota1 + nota2 + nota3 + nota4)/4;

Object[] filaNueva= {estudiante, nota1, nota2, nota3, nota4, promedio};
modeloNotas.addRow(filaNueva);

txtEstudiante.setText("");
txtNota1.setText("");
txtNota2.setText("");
txtNota3.setText("");
txtNota4.setText("");
txtEstudiante.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed

int numero= Integer.parseInt(txtNumero.getText());
String ParImpar;
String tipoSigno;

if(numero %2==0){
    
   ParImpar= "Par"; 
}else{
    ParImpar= "Impar";
}
if(numero > 0){   
  tipoSigno= "Positivo";  
}else if(numero < 0){
    tipoSigno= "Negativo";
}else{
    tipoSigno= "Cero";
}
Object[] NuevaFila= {numero, ParImpar, tipoSigno};
modeloNumero.addRow(NuevaFila);
txtNumero.setText("");
txtNumero.requestFocus();

    }//GEN-LAST:event_btnCalificarActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed

String articulo= txtArticulo.getText();
double precio= Double.parseDouble(txtPrecio.getText());
int cantidad= Integer.parseInt(txtCantidad.getText());

double subtotal= precio*cantidad;
 double iva=  subtotal * 0.16;
 double totalFinal= subtotal + iva;

Object[] filanuevas= {articulo, precio, cantidad, iva, totalFinal};
modeloPorcentage.addRow(filanuevas);

txtArticulo.setText("");
txtPrecio.setText("");
txtCantidad.setText("");
txtArticulo.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed

String cliente = txtCliente.getText();
int edad1= Integer.parseInt(txtEdad2.getText());
double precio1= Double.parseDouble(txtIngreso.getText());
boolean creditoPersonal = (edad1 >= 18) && (precio1 > 500);

if(creditoPersonal == true ){
   lblEstatus.setText("Estado: CRÉDITO APROVADO CON ÉXITO");
}else{
    
    lblEstatus.setText("Estado: SOLICITUD RECHAZADA");
}

lblResumen.setText("Cliente procesado: "+ cliente);

txtCliente.setText("");
txtEdad2.setText("");
txtIngreso.setText("");
txtCliente.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CincoEjercicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CajadeDatos;
    private javax.swing.JTable TablaDatos2;
    private javax.swing.JTable TablaNumero;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JTabbedPane tab1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad2;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
