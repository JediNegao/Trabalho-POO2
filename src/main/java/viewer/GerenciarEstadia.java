/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import com.toedter.calendar.JDateChooser;
import control.EstadiaAbstractTableModel;
import control.QuartoAbstractTableModel;
import control.uiManeger;
import control.uiManeger.JPaneLGradient;
import control.uiManeger.TableUtilidades;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Estadia;
import model.Quarto;

public class GerenciarEstadia extends javax.swing.JDialog {

    private Cliente cliSelecionado = null;
    private Quarto quartoSelecionado = null;
    private EstadiaAbstractTableModel estadiaTblModel = null;
    private Estadia estadiaSelecionada = null;

    public GerenciarEstadia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocation(500, 100);
        setSize(782, 469);
        estadiaTblModel = new EstadiaAbstractTableModel();
        tabelaReserva.setModel(estadiaTblModel);
        List<Estadia> lista = uiManeger.getInstance().getDomainManeger().ListarEstadia();
        EstadiaAbstractTableModel clienteTableModel = (EstadiaAbstractTableModel) tabelaReserva.getModel();
        clienteTableModel.setLista(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popReserva = new javax.swing.JPopupMenu();
        popADD = new javax.swing.JMenuItem();
        popRemove = new javax.swing.JMenuItem();
        jPanel1 = JPaneLGradient.criarPainelDegrade();
        jPanel2 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblIN = new javax.swing.JLabel();
        lblOut = new javax.swing.JLabel();
        dateCheckIn = new com.toedter.calendar.JDateChooser();
        dateCheckOut = new com.toedter.calendar.JDateChooser();
        txtCliente = new javax.swing.JTextField();
        txtNumQuarto = new javax.swing.JTextField();
        btPesquisarQuarto = new javax.swing.JButton();
        btPesquisarCliente1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblRerserva = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTbl = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaReserva = new javax.swing.JTable();

        popADD.setText("Adicionar");
        popADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        popReserva.add(popADD);

        popRemove.setText("Remover");
        popRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        popReserva.add(popRemove);

        setTitle("Reservar Quartos");
        setMinimumSize(new java.awt.Dimension(765, 469));

        jPanel1.setMaximumSize(new java.awt.Dimension(782, 469));
        jPanel1.setMinimumSize(new java.awt.Dimension(782, 469));

        jPanel2.setOpaque(false);

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente.setText("Cliente");

        lblNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNum.setForeground(new java.awt.Color(0, 0, 0));
        lblNum.setText("Núm. Quarto");

        lblIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIN.setForeground(new java.awt.Color(0, 0, 0));
        lblIN.setText("Check-In");

        lblOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOut.setForeground(new java.awt.Color(0, 0, 0));
        lblOut.setText("Check-Out");

        dateCheckIn.setDateFormatString("dd/MM/yyyy");
        dateCheckIn.setName("dateCheckIN"); // NOI18N
        dateCheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateCheckInPropertyChange(evt);
            }
        });

        dateCheckOut.setDateFormatString("dd/MM/yyyy");
        dateCheckOut.setName("dateCheckOut"); // NOI18N

        btPesquisarQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btPesquisarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarQuartoActionPerformed(evt);
            }
        });

        btPesquisarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btPesquisarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente)
                    .addComponent(lblNum)
                    .addComponent(lblIN)
                    .addComponent(lblOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPesquisarQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesquisarCliente1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCliente)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesquisarQuarto)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNum)
                        .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIN)
                    .addComponent(dateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOut)
                    .addComponent(dateCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel4.setOpaque(false);

        lblRerserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRerserva.setForeground(new java.awt.Color(0, 51, 255));
        lblRerserva.setText("Gerenciar Estadia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRerserva, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblRerserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        lblTbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTbl.setForeground(new java.awt.Color(0, 51, 255));
        lblTbl.setText("Quartos Alocados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTbl)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lblTbl)
                .addContainerGap())
        );

        jPanel6.setOpaque(false);

        btAdd.setBackground(new java.awt.Color(102, 255, 102));
        btAdd.setForeground(new java.awt.Color(0, 0, 0));
        btAdd.setText("Adicionar");
        btAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 51, 51));
        btRemover.setForeground(new java.awt.Color(0, 0, 0));
        btRemover.setText("Remover");
        btRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(204, 204, 255));
        btLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btLimpar.setText("Limpar");
        btLimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 204, 102));
        btAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btAlterar.setText("Alterar");
        btAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btRemover)
                    .addComponent(btLimpar)
                    .addComponent(btAlterar))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Selecionar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Núm.Quarto", "Check-IN", "Check-Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaReserva.setComponentPopupMenu(popReserva);
        jScrollPane1.setViewportView(tabelaReserva);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateCheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateCheckInPropertyChange
        Date checkInDate = dateCheckIn.getDateEditor().getDate();

        // Verifica se a data de check-in não é nula
        if (checkInDate != null) {
            // Obtém o calendário atual
            Calendar calendar = Calendar.getInstance();
            // Define a data do calendário como a data de check-in
            calendar.setTime(checkInDate);
            // Adiciona um dia ao calendário
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            // Obtém a nova data após adicionar um dia
            Date nextDay = calendar.getTime();

            // Define o mínimo permitido para o check-out DateChooser como o próximo dia
            dateCheckOut.setMinSelectableDate(nextDay);
        }
    }//GEN-LAST:event_dateCheckInPropertyChange

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // Obtendo o Cliente selecionado
        Cliente cliente = cliSelecionado;

        if (cliente == null) {
            // Se nenhum cliente foi selecionado, exiba uma mensagem de erro e retorne
            JOptionPane.showMessageDialog(this, "Por favor, selecione um cliente.");
            return;
        }

        Quarto quarto = quartoSelecionado;
        if (quarto == null) {
            // Se nenhum quarto foi selecionado, exiba uma mensagem de erro e retorne
            JOptionPane.showMessageDialog(this, "Por favor, selecione um quarto.");
            return;
        }

        Estadia estadia = new Estadia();
        estadia.setCliente(cliSelecionado);
        estadia.setQuarto(quartoSelecionado);
        estadia.setCheckin(dateCheckIn.getDate());
        estadia.setCheckOut(dateCheckOut.getDate());

        if (estadiaSelecionada != null) {
            uiManeger.getInstance().getDomainManeger().alterarEstadia(estadiaSelecionada.getIdEstadia(), cliente, quarto, dateCheckIn.getDate(), dateCheckOut.getDate());
            JOptionPane.showMessageDialog(this, "Estadia com num quarto " + quarto.getNumQuarto() + " alterada com sucesso.", "Cadastro Estadia", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabelaEstadia();

        } else {
            //adicionar
            uiManeger.getInstance().getDomainManeger().inserirEstadia(cliSelecionado, quartoSelecionado, dateCheckIn.getDate(), dateCheckOut.getDate());

            estadiaTblModel.adicionar(estadia);
            JOptionPane.showMessageDialog(this, "Estadia com num quarto " + quarto.getNumQuarto() + " inserido com sucesso.", "Cadastro Estadia", JOptionPane.INFORMATION_MESSAGE);
            
        }

        limparCampos();
    }//GEN-LAST:event_btAddActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int index = tabelaReserva.getSelectedRow();
        estadiaSelecionada = estadiaTblModel.getEstadia(index);
        estadiaTblModel.remover(index);
        try {
            uiManeger.getInstance().getDomainManeger().excluir(estadiaSelecionada);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CadastrarQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btPesquisarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCliente1ActionPerformed
        cliSelecionado = uiManeger.getInstance().abrirPesqCliente();
        txtCliente.setText(String.valueOf(cliSelecionado.getIdCliente()));
    }//GEN-LAST:event_btPesquisarCliente1ActionPerformed

    private void btPesquisarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarQuartoActionPerformed
        quartoSelecionado = uiManeger.getInstance().abrirPesqQuarto();
        txtNumQuarto.setText(String.valueOf(quartoSelecionado.getNumQuarto()));
    }//GEN-LAST:event_btPesquisarQuartoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EstadiaAbstractTableModel model = (EstadiaAbstractTableModel) tabelaReserva.getModel();

        int linha = tabelaReserva.getSelectedRow();

        if (linha >= 0) {

            estadiaSelecionada = estadiaTblModel.getEstadia(linha);
        }

        if (linha != -1) {

            String idCliente = model.getValueAt(linha, 0).toString();
            String numQuarto = model.getValueAt(linha, 1).toString();
            String checkInString = model.getValueAt(linha, 2).toString(); // Obtendo a data de check-in como uma string da tabela
            String checkOutString = model.getValueAt(linha, 3).toString(); // Obtendo a data de check-out como uma string da tabela

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Cliente cliente = uiManeger.getInstance().getDomainManeger().buscarClientePorId(Integer.parseInt(idCliente));
            Quarto quarto = uiManeger.getInstance().getDomainManeger().buscarQuartoPorId(Integer.parseInt(numQuarto));

            Date checkInDate = null;
            try {
                checkInDate = dateFormat.parse(checkInString);
            } catch (ParseException ex) {
                Logger.getLogger(GerenciarEstadia.class.getName()).log(Level.SEVERE, null, ex);
            }
            Date checkOutDate = null;
            try {
                checkOutDate = dateFormat.parse(checkOutString);
            } catch (ParseException ex) {
                Logger.getLogger(GerenciarEstadia.class.getName()).log(Level.SEVERE, null, ex);
            }

            // tenho que arranjar um jeito de pegar esse id e falar que o cliente selecionado 
            // recebe o cliente com esse ID
            cliSelecionado = cliente;
            quartoSelecionado = quarto;
            preencherCampos(cliente, quarto, checkInDate, checkOutDate);
        } else {

            JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha primeiro.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void preencherCampos(Cliente cliente, Quarto quarto, Date checkIn, Date checkOut) {
        txtCliente.setText(String.valueOf(cliente.getIdCliente()));
        txtNumQuarto.setText(String.valueOf(quarto.getNumQuarto()));
        dateCheckIn.setDate(checkIn);
        dateCheckOut.setDate(checkOut);

    }

    private void atualizarTabelaEstadia() {
        List<Estadia> lista = uiManeger.getInstance().getDomainManeger().ListarEstadia();
        estadiaTblModel.setLista(lista);
        estadiaTblModel.fireTableDataChanged();
    }

    private void limparCampos() {
        txtCliente.setText("");
        txtNumQuarto.setText("");
        dateCheckIn.setDate(null);
        dateCheckOut.setDate(null);
        estadiaSelecionada = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisarCliente1;
    private javax.swing.JButton btPesquisarQuarto;
    private javax.swing.JButton btRemover;
    private com.toedter.calendar.JDateChooser dateCheckIn;
    private com.toedter.calendar.JDateChooser dateCheckOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblIN;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblOut;
    private javax.swing.JLabel lblRerserva;
    private javax.swing.JLabel lblTbl;
    private javax.swing.JMenuItem popADD;
    private javax.swing.JMenuItem popRemove;
    private javax.swing.JPopupMenu popReserva;
    private javax.swing.JTable tabelaReserva;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtNumQuarto;
    // End of variables declaration//GEN-END:variables
}
