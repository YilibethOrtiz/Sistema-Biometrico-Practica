/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanajframe;

import java.time.Month;

/**
 *
 * @author DELL
 */
public class calendario extends javax.swing.JFrame {
    
    javax.swing.JButton[] listaBotonesDias= new javax.swing.JButton[42];
    int diaActualSeleccionado = 0; // <<-- AGREGA ESTA
java.util.HashMap<String, String> agendaEntregas = new java.util.HashMap<>();
  



    public void crearTablero(){
    
    // 1. CREAR LOS NOMBRES DE LOS DÍAS DE LA SEMANA (CABECERA)
    panelCabecera.removeAll();
    String[] diasSemana = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};
    
    for (int i = 0; i < 7; i++) {
        javax.swing.JLabel etiquetaDia = new javax.swing.JLabel(diasSemana[i], javax.swing.SwingConstants.CENTER);
        
        // Ponemos el texto en negrita y un tamaño bonito
        etiquetaDia.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        
        // Añadimos la etiqueta al panel de la cabecera
        panelCabecera.add(etiquetaDia);
    }
    panelCabecera.revalidate();
    panelCabecera.repaint();

    // 2. CREAR LOS 42 BOTONES DE LOS DÍAS (Tu código que ya funciona fino)
    panelDia.removeAll();
   // panelDia.setBackground(new java.awt.Color(30, 30, 30));
    for (int i = 0; i < 42; i++) {
        listaBotonesDias[i] = new javax.swing.JButton();
        listaBotonesDias[i].setText("");
        listaBotonesDias[i].setBackground(new java.awt.Color(255, 240, 245)); 
        
        
      final int indice = i; 
        listaBotonesDias[i].addActionListener(new java.awt.event.ActionListener() {   
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Si el botón que tocamos tiene un número de día
                if (!listaBotonesDias[indice].getText().equals("")) {
                    String numeroDia = listaBotonesDias[indice].getText();
                    diaActualSeleccionado = Integer.parseInt(numeroDia);
                    
                    String mes = cmbMes.getSelectedItem().toString();
                    String ano = cmbAno.getSelectedItem().toString();
                    
                    // 1. Cambiamos el título de la izquierda
                    DiaSeleccionado.setText("Entrega para el: " + numeroDia + " de " + mes);
                    
                    // 2. Creamos una clave única para este día (Ejemplo: "22-Junio-2026")
                    String claveFecha = numeroDia + "-" + mes + "-" + ano;
                    
                    // 3. Buscamos si ya existía una nota guardada para esta fecha
                    if (agendaEntregas.containsKey(claveFecha)) {
                        txtNotas.setText(agendaEntregas.get(claveFecha)); // Muestra la nota guardada
                    } else {
                        txtNotas.setText(""); // Si no hay nada, lo deja limpio para escribir
                    }
                }
            }
        });  
    panelDia.add(listaBotonesDias[i]);
    }
    panelDia.revalidate();
    panelDia.repaint();
    }    

    
    
 public void actualizarDias() {
    // 1. Obtener el mes y año seleccionados en los JComboBox
    int mesSeleccionado = cmbMes.getSelectedIndex() + 1; // Enero es 0, sumamos 1 para que sea mes 1
int anioSeleccionado;
try {
    anioSeleccionado = Integer.parseInt(cmbAno.getSelectedItem().toString());
} catch (NumberFormatException e) {
    anioSeleccionado = 2026; // Si dice "Item 1", por defecto usará el año 2026 para no romperse
}
    
    // 2. Crear una fecha fijada en el primer día de ese mes
    java.time.LocalDate fechaInicial = java.time.LocalDate.of(anioSeleccionado, mesSeleccionado, 1);
    
    // 3. Saber cuántos días reales tiene ese mes (28, 29, 30 o 31)
    int totalDiasMes = fechaInicial.lengthOfMonth();
    
    // 4. Saber en qué día de la semana empieza (Lunes = 1, Martes = 2... Domingo = 7)
    int diaSemanaEmpieza = fechaInicial.getDayOfWeek().getValue();
    
    // Convertimos el inicio para que coincida con nuestra cuadrícula (Lunes primer espacio)
    // Si tu calendario arranca en Domingo, avísame y ajustamos este número
    int indiceInicio = diaSemanaEmpieza - 1; 

    // 5. Limpiar todos los botones antes de pintar los nuevos días
    for (int i = 0; i < 42; i++) {
        listaBotonesDias[i].setText("");
        listaBotonesDias[i].setEnabled(false); // Los dejamos desactivados si están vacíos
    }
    
    // 6. Rellenar los botones con los números correspondientes
    int numeroDia = 1;
   for (int i = indiceInicio; i < 42; i++) {
        if (numeroDia <= totalDiasMes) {
            listaBotonesDias[i].setText(String.valueOf(numeroDia));
            listaBotonesDias[i].setEnabled(true); // Activamos el botón
            
            // --- NUEVA LÓGICA DE COLOR ---
            String mes = cmbMes.getSelectedItem().toString();
            String ano = cmbAno.getSelectedItem().toString();
            String claveFecha = numeroDia + "-" + mes + "-" + ano;
            
            // Si la agenda tiene guardado algo en esta fecha y NO está vacío
            if (agendaEntregas.containsKey(claveFecha) && !agendaEntregas.get(claveFecha).trim().equals("")) {
                // Pintamos el botón de un color diferente (Por ejemplo, un rosado más oscuro o fucsia)
                listaBotonesDias[i].setBackground(new java.awt.Color(255, 105, 180)); // Color HotPink
                listaBotonesDias[i].setForeground(java.awt.Color.WHITE); // Texto blanco para que resalte
            } else {
                // Si no tiene nota, le dejamos su color tierno original
                listaBotonesDias[i].setBackground(new java.awt.Color(255, 240, 245)); 
                listaBotonesDias[i].setForeground(java.awt.Color.BLACK); // Texto negro
            }
            // ------------------------------
            
            numeroDia++;
        }
    }
}
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(calendario.class.getName());

    /**
     * Creates new form calendario
     */
    public calendario() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(20, 20, 20));
        this.setTitle("Desarrollado por : ORTIZ");
        this.setLocationRelativeTo(null);
        crearTablero();
        actualizarDias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAno = new javax.swing.JComboBox<>();
        panelDia = new javax.swing.JPanel();
        panelCabecera = new javax.swing.JPanel();
        DiaSeleccionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMes.addActionListener(this::cmbMesActionPerformed);
        jPanel2.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cmbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cmbAno.addActionListener(this::cmbAnoActionPerformed);
        jPanel2.add(cmbAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panelDia.setBackground(new java.awt.Color(255, 204, 255));
        panelDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDia.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 420, 410));

        panelCabecera.setBackground(new java.awt.Color(255, 153, 255));
        panelCabecera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCabecera.setLayout(new java.awt.GridLayout(1, 7));
        getContentPane().add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 420, 40));

        DiaSeleccionado.setBackground(new java.awt.Color(255, 204, 255));
        DiaSeleccionado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        DiaSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        DiaSeleccionado.setText("Selecciona Un Dia");
        DiaSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204)));
        getContentPane().add(DiaSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNotas.setColumns(20);
        txtNotas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNotas.setRows(5);
        jScrollPane1.setViewportView(txtNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, 360));

        btnGuardar.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardar.setText("Guardar Nota");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
actualizarDias();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesActionPerformed

    private void cmbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnoActionPerformed
actualizarDias();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAnoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                                           
    if (diaActualSeleccionado != 0) {
        String mes = cmbMes.getSelectedItem().toString();
        String anio = cmbAno.getSelectedItem().toString();
        
        // Creamos la misma clave única del día
        String claveFecha = diaActualSeleccionado + "-" + mes + "-" + anio;
        String notaParaGuardar = txtNotas.getText();
        
        // Guardamos la nota en nuestra agenda mental
        agendaEntregas.put(claveFecha, notaParaGuardar);
        
        // Un mensaje emergente de confirmación (visto en la Clase 4)
        javax.swing.JOptionPane.showMessageDialog(this, "¡Guardad con éxito!");
     actualizarDias();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecciona primero un día en el calendario.");
    }
    



        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new calendario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiaSeleccionado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelDia;
    private javax.swing.JTextArea txtNotas;
    // End of variables declaration//GEN-END:variables
}
