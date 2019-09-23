
package slaintehealth;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;


public class Assignment extends javax.swing.JFrame {
    //Variables
    String firstName = "";
    String surName = "";
    String ifOther = "";
    String gender = "";
    String ageChoice ="";
    String policyCover ="";
    String hospitalCover="";
    String dayExpenses="";
    int idNumber= 0;
    String total="";
    boolean smoker = false;
    
    //ArrayList
    ArrayList healthConditions = new ArrayList();
    
    int policyId = 1;
    Policy p1;
    Customer c1;
    
    boolean policyForm = false;
   
    
    public Assignment() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        buttonGroup6 = new javax.swing.ButtonGroup();
        Border = new javax.swing.JPanel();
        SlainteHealthInsuranceLbl = new javax.swing.JLabel();
        PersonalDetailsLbl = new javax.swing.JLabel();
        PersonalDetailsPanel = new javax.swing.JPanel();
        FirstNameLbl = new javax.swing.JLabel();
        SurNameLbl = new javax.swing.JLabel();
        GenderLbl = new javax.swing.JLabel();
        AgeLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        surnameTxt = new javax.swing.JTextField();
        age = new javax.swing.JComboBox();
        MaleBtn = new javax.swing.JRadioButton();
        FemaleBtn = new javax.swing.JRadioButton();
        HealthDetailsPanel = new javax.swing.JPanel();
        HealthConditionsLbl = new javax.swing.JLabel();
        ifOtherLbl = new javax.swing.JLabel();
        SmokerLbl = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        healthCond = new javax.swing.JScrollPane();
        healthConditionsList = new javax.swing.JList();
        otherTxt = new javax.swing.JTextField();
        HealthDetailsLbl = new javax.swing.JLabel();
        SchemeDetailsLbl = new javax.swing.JLabel();
        SchemeDetailsPanel = new javax.swing.JPanel();
        PolicyLbl = new javax.swing.JLabel();
        HospitalCoverLbl = new javax.swing.JLabel();
        DtoDLbl = new javax.swing.JLabel();
        policyTypeBox = new javax.swing.JComboBox();
        hospitalCoverBox = new javax.swing.JComboBox();
        dailyExpenseBox = new javax.swing.JComboBox();
        QuoteLbl = new javax.swing.JLabel();
        FinalQuotationPanel = new javax.swing.JPanel();
        IDLbl = new javax.swing.JLabel();
        TotalLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JLabel();
        totalTxt = new javax.swing.JLabel();
        calcBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        buyBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slainte Health Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        Border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SlainteHealthInsuranceLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SlainteHealthInsuranceLbl.setText("Slainte Health Insurance");

        PersonalDetailsLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PersonalDetailsLbl.setText("Personal Details");

        PersonalDetailsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PersonalDetailsPanel.setToolTipText("Personal Details");

        FirstNameLbl.setText("Firstname:");

        SurNameLbl.setText("Surname:");

        GenderLbl.setText("Gender:");

        AgeLbl.setText("Age:");

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });

        surnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTxtActionPerformed(evt);
            }
        });

        age.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "Under 35", "35 to 55", "56 to 70", "Over 70" }));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        buttonGroup1.add(MaleBtn);
        MaleBtn.setText("Male");
        MaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(FemaleBtn);
        FemaleBtn.setText("Female");

        javax.swing.GroupLayout PersonalDetailsPanelLayout = new javax.swing.GroupLayout(PersonalDetailsPanel);
        PersonalDetailsPanel.setLayout(PersonalDetailsPanelLayout);
        PersonalDetailsPanelLayout.setHorizontalGroup(
            PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalDetailsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLbl)
                    .addComponent(SurNameLbl)
                    .addComponent(GenderLbl)
                    .addComponent(AgeLbl))
                .addGap(18, 18, 18)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalDetailsPanelLayout.createSequentialGroup()
                        .addComponent(MaleBtn)
                        .addGap(18, 18, 18)
                        .addComponent(FemaleBtn))
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(surnameTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        PersonalDetailsPanelLayout.setVerticalGroup(
            PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalDetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLbl)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurNameLbl)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLbl)
                    .addComponent(MaleBtn)
                    .addComponent(FemaleBtn))
                .addGap(16, 16, 16)
                .addGroup(PersonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLbl)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        HealthDetailsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        HealthConditionsLbl.setText("Existing Health Condition:");

        ifOtherLbl.setText("If, other please specify:");

        SmokerLbl.setText("Smoker:");

        buttonGroup2.add(yesBtn);
        yesBtn.setText("Smoker");

        buttonGroup2.add(noBtn);
        noBtn.setText("Non-Smoker");
        noBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBtnActionPerformed(evt);
            }
        });

        healthConditionsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Please Select", "None", "Bone Marrow and Immune System", "Cancer", "Cardiovascular Disease", "Gastrointestinal", "Infections", "Kidneys", "Lungs", "Musculoskeletal" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        healthCond.setViewportView(healthConditionsList);

        otherTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HealthDetailsPanelLayout = new javax.swing.GroupLayout(HealthDetailsPanel);
        HealthDetailsPanel.setLayout(HealthDetailsPanelLayout);
        HealthDetailsPanelLayout.setHorizontalGroup(
            HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ifOtherLbl)
                    .addComponent(HealthConditionsLbl)
                    .addComponent(SmokerLbl))
                .addGap(18, 18, 18)
                .addGroup(HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healthCond)
                    .addComponent(otherTxt))
                .addGap(20, 20, 20))
        );
        HealthDetailsPanelLayout.setVerticalGroup(
            HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthDetailsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HealthConditionsLbl)
                    .addComponent(healthCond, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifOtherLbl)
                    .addComponent(otherTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(HealthDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SmokerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBtn))
        );

        HealthDetailsLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HealthDetailsLbl.setText("Health Details");

        SchemeDetailsLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SchemeDetailsLbl.setText("Scheme Details");

        SchemeDetailsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        PolicyLbl.setText("Policy Type:");

        HospitalCoverLbl.setText("Hospital Cover:");

        DtoDLbl.setText("Day to Day Expenses:");

        policyTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "Individual", "Corporate" }));
        policyTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policyTypeBoxActionPerformed(evt);
            }
        });

        hospitalCoverBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "Public Cover", "Private Cover", "Comprehensive" }));

        dailyExpenseBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "Standard", "Enhanced", "Comprehensive" }));

        javax.swing.GroupLayout SchemeDetailsPanelLayout = new javax.swing.GroupLayout(SchemeDetailsPanel);
        SchemeDetailsPanel.setLayout(SchemeDetailsPanelLayout);
        SchemeDetailsPanelLayout.setHorizontalGroup(
            SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchemeDetailsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PolicyLbl)
                    .addComponent(HospitalCoverLbl)
                    .addComponent(DtoDLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dailyExpenseBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalCoverBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(policyTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        SchemeDetailsPanelLayout.setVerticalGroup(
            SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchemeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolicyLbl)
                    .addComponent(policyTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalCoverLbl)
                    .addComponent(hospitalCoverBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(SchemeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DtoDLbl)
                    .addComponent(dailyExpenseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        QuoteLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QuoteLbl.setText("Final Quoation");

        FinalQuotationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        IDLbl.setText("ID No. :");

        TotalLbl.setText("Total:");

        javax.swing.GroupLayout FinalQuotationPanelLayout = new javax.swing.GroupLayout(FinalQuotationPanel);
        FinalQuotationPanel.setLayout(FinalQuotationPanelLayout);
        FinalQuotationPanelLayout.setHorizontalGroup(
            FinalQuotationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalQuotationPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(IDLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(TotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        FinalQuotationPanelLayout.setVerticalGroup(
            FinalQuotationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalQuotationPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(FinalQuotationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalLbl)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        calcBtn.setText("Calculate");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear Form");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        buyBtn.setText("Buy Policy");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BorderLayout = new javax.swing.GroupLayout(Border);
        Border.setLayout(BorderLayout);
        BorderLayout.setHorizontalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SchemeDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BorderLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(FinalQuotationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BorderLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(QuoteLbl))))
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PersonalDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PersonalDetailsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HealthDetailsLbl)
                            .addComponent(HealthDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SlainteHealthInsuranceLbl))
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(SchemeDetailsLbl)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BorderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(calcBtn)
                .addGap(54, 54, 54)
                .addComponent(clearBtn)
                .addGap(50, 50, 50)
                .addComponent(buyBtn)
                .addGap(207, 207, 207))
        );
        BorderLayout.setVerticalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SlainteHealthInsuranceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonalDetailsLbl)
                    .addComponent(HealthDetailsLbl))
                .addGap(18, 18, 18)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonalDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HealthDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SchemeDetailsLbl)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(QuoteLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FinalQuotationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BorderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SchemeDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn)
                    .addComponent(calcBtn)
                    .addComponent(buyBtn))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Border, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
       
    }//GEN-LAST:event_noBtnActionPerformed

    private void otherTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherTxtActionPerformed
  
    }//GEN-LAST:event_otherTxtActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
    
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        validateForm();
        if (policyForm){
        c1 = createCustomer();
        
//        System.out.println(c.toString());
        //call the policy class
        
        if(policyCover.equalsIgnoreCase("Individual"))
        {
            p1 = new IndividualPolicy(policyId);
        }
        else if (policyCover.equalsIgnoreCase("Corporate"))
                {
             p1 = new CorporatePolicy(policyId);
        }
      
        p1.setDailyExpenses(dayExpenses);
        p1.setHospitalCover(hospitalCover);
        p1.setPolicyType(policyCover);
        
//            System.out.println(p.toString());
            
                float finalAmount = p1.calculatePolicy(c1);
                  p1.setTotal(finalAmount);
        c1.assignPolicyToCustomer(p1);
        
        idTxt.setText(Integer.toString(policyId));
        //Setting up the total to appear on a text label to 2 decimal places.
        totalTxt.setText(Float.toString(finalAmount));
       
        System.out.println(c1.toString());
        // Outputting the data into a currency format
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        totalTxt.setText(currencyFormat.format(Math.round(finalAmount)));
         
        policyForm = false;
    }//GEN-LAST:event_calcBtnActionPerformed
    }
    private void surnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTxtActionPerformed

    }//GEN-LAST:event_surnameTxtActionPerformed

    private void MaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleBtnActionPerformed
           
    }//GEN-LAST:event_MaleBtnActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        
    }//GEN-LAST:event_ageActionPerformed

    private void policyTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policyTypeBoxActionPerformed
      //Same as Age Selection code
    }//GEN-LAST:event_policyTypeBoxActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //resetting the form to its default values.
        firstNameTxt.setText("");
        surnameTxt.setText("");
        otherTxt.setText("");
        age.setSelectedItem("Please Select");
        policyTypeBox.setSelectedItem("Please Select");
        hospitalCoverBox.setSelectedItem("Please Select");
        dailyExpenseBox.setSelectedItem("Please Select");
        healthConditionsList.setSelectedIndex(0);
        totalTxt.setText("");
        
        //removing buttongroup selections
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
       
        idTxt.setText(Integer.toString(policyId++));
    
    }//GEN-LAST:event_clearBtnActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
      
        BuyPolicy window = new BuyPolicy(this, false, c1, p1);
        
        window.setVisible(true);
    }//GEN-LAST:event_buyBtnActionPerformed

private void validateForm()
    {
        //extract details and validate
        extractFormDetails();
                
    }
    
    private void extractFormDetails()
    {
        try {
                String FirstName =firstNameTxt.getText();
                
       if (firstNameTxt.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,
                     "Please enter your first name..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE);
        }
      
        else if (surnameTxt.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,
                     "Please enter your surname..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE);
        }
         
         else if (buttonGroup1.isSelected(null))
        {
                   JOptionPane.showMessageDialog(this,
                     "Please select your gender..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }

        else if (age.getSelectedItem()=="Please Select"){
            JOptionPane.showMessageDialog(this,
                     "Please select your age group..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }
        else if (age.getSelectedItem()=="Over 70"){
            JOptionPane.showMessageDialog(this,
                     "I am sorry to inform you that you are over our age limit "
                             + "for a policy...",
                    "Invalid Data ",
                    JOptionPane.ERROR_MESSAGE );
            }

            else if (policyTypeBox.getSelectedItem()=="Please Select"){
            JOptionPane.showMessageDialog(this,
                     "Please choose your current policy type..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }
       else if (hospitalCoverBox.getSelectedItem()=="Please Select"){
            JOptionPane.showMessageDialog(this,
                     "Please choose a cover type..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }
            else if (dailyExpenseBox.getSelectedItem()=="Please Select"){
            JOptionPane.showMessageDialog(this,
                     "Please choose an option for your expense type..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }
          else if (healthConditionsList.isSelectionEmpty()==true){
            JOptionPane.showMessageDialog(this,
                     "Please select all current health conditions",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
        }
        else if (otherTxt.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,
                     "Input other health issues here, or None",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if (buttonGroup2.isSelected(null))
        {
                   JOptionPane.showMessageDialog(this,
                     "Please choose an option if you are smoker..",
                    "We are Missing this data",
                    JOptionPane.ERROR_MESSAGE );
      
//        else if(healthConditionsList.getSelectedValueList())
       
   }
        else { // Proccess a customer
            firstName = firstNameTxt.getText();
            surName = surnameTxt.getText();
            
            if (MaleBtn.isSelected()== true)
             {
                 gender = "Male";
                }
            else if (FemaleBtn.isSelected()== true)
            {
                gender = "female";
            }
            
            ageChoice = (String) age.getSelectedItem();
            policyCover = (String) policyTypeBox.getSelectedItem();
            hospitalCover = (String) hospitalCoverBox.getSelectedItem();
            dayExpenses = (String) dailyExpenseBox.getSelectedItem();
            healthConditions = (ArrayList) healthConditionsList.getSelectedValuesList();
            ifOther = otherTxt.getText();
            
            if ( yesBtn.isSelected() == true)
            {
                smoker = true;
            }
            else if ( noBtn.isSelected() == true)
            {
                smoker = false;
            }
            
            policyForm = true;
        }
       
        }
catch (Exception e){
        }
    
    }
    private Customer createCustomer()
    {
       c1 = new Customer(firstName, surName, gender, ageChoice, healthConditions, ifOther, smoker);
       
      return c1;  
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JPanel Border;
    private javax.swing.JLabel DtoDLbl;
    private javax.swing.JRadioButton FemaleBtn;
    private javax.swing.JPanel FinalQuotationPanel;
    private javax.swing.JLabel FirstNameLbl;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel HealthConditionsLbl;
    private javax.swing.JLabel HealthDetailsLbl;
    private javax.swing.JPanel HealthDetailsPanel;
    private javax.swing.JLabel HospitalCoverLbl;
    private javax.swing.JLabel IDLbl;
    private javax.swing.JRadioButton MaleBtn;
    private javax.swing.JLabel PersonalDetailsLbl;
    private javax.swing.JPanel PersonalDetailsPanel;
    private javax.swing.JLabel PolicyLbl;
    private javax.swing.JLabel QuoteLbl;
    private javax.swing.JLabel SchemeDetailsLbl;
    private javax.swing.JPanel SchemeDetailsPanel;
    private javax.swing.JLabel SlainteHealthInsuranceLbl;
    private javax.swing.JLabel SmokerLbl;
    private javax.swing.JLabel SurNameLbl;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JComboBox age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton buyBtn;
    private javax.swing.JButton calcBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox dailyExpenseBox;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JScrollPane healthCond;
    private javax.swing.JList healthConditionsList;
    private javax.swing.JComboBox hospitalCoverBox;
    private javax.swing.JLabel idTxt;
    private javax.swing.JLabel ifOtherLbl;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField otherTxt;
    private javax.swing.JComboBox policyTypeBox;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JLabel totalTxt;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}//end of class