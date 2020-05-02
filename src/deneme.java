import javax.swing.table.DefaultTableModel;
import java.util.ArrayList; 

import java.util.HashSet;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class deneme extends javax.swing.JFrame {
    

    public ArrayList<Flight> flights;
	public ArrayList<Capital> capitals;
	public ArrayList<ControlTower> ctws;

    public deneme(ArrayList<Flight> flights, ArrayList<Capital> capitals, ArrayList<ControlTower> ctws) {
    	this.flights = new ArrayList<Flight>();
    	this.capitals = new ArrayList<Capital>();
    	this.ctws = new ArrayList<ControlTower>();
        setResizable(false);
    	initComponents();
    }

    @SuppressWarnings("unchecked")                     
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        flightNoShow = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowsFlights = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        weekdayDeleteAddFlightNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weekdayDeleteAddWeekday = new javax.swing.JTextField();
        addWeekday = new javax.swing.JButton();
        deleteWeekday = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AF_flight_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AF_airlines = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AF_aircraft = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AF_flrom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AF_to = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AF_timetaken = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AF_departure = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        AF_arrival = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DF_flight_no = new javax.swing.JTextField();
        addFlight = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        showInformation = new javax.swing.JButton();
        airlineShow = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        DF_airlines = new javax.swing.JTextField();
        deleteFlight = new javax.swing.JButton();
        updateFlight = new javax.swing.JButton();
        systemTime = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        controlFlightNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ctrlDelayTime = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        delayButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        resume = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hour = new javax.swing.JLabel();
        dmy = new javax.swing.JLabel();
        wd = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        setSystem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Flight NO:");

        tableShowsFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Departure", "Arrival", "Time Taken", "Aircraft Model", "Weekdays", "From", "To", "Remaining", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShowsFlights);

        jLabel2.setText("Show Information");

        jLabel3.setText("Add/Delete Weekday");

        jLabel4.setText("Flight No");

        jLabel5.setText("Weekday");

        weekdayDeleteAddWeekday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekdayDeleteAddWeekdayActionPerformed(evt);
            }
        });

        addWeekday.setText("Add");
        addWeekday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWeekdayActionPerformed(evt);
            }
        });

        deleteWeekday.setText("Delete");
        deleteWeekday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWeekdayActionPerformed(evt);
            }
        });

        jLabel6.setText("Add/Update Flight");

        jLabel7.setText("Flight No");

        AF_flight_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AF_flight_noActionPerformed(evt);
            }
        });

        jLabel8.setText("Airlines");

        jLabel9.setText("Aircraft M.");

        jLabel10.setText("From");

        jLabel11.setText("To");

        jLabel12.setText("Time Taken");

        jLabel13.setText("Departure");

        jLabel14.setText("Arrival");

        AF_arrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AF_arrivalActionPerformed(evt);
            }
        });

        jLabel15.setText("Delete Flight");

        jLabel16.setText("Flight No");

        addFlight.setText("Add");
        addFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightActionPerformed(evt);
            }
        });

        jLabel17.setText("Airlines");

        showInformation.setText("Show ");
        showInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInformationActionPerformed(evt);
            }
        });

        jLabel18.setText("Airlines");

        deleteFlight.setText("Delete");
        deleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightActionPerformed(evt);
            }
        });

        updateFlight.setText("Update");
        updateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFlightActionPerformed(evt);
            }
        });

        systemTime.setText("System Time Information");

        jLabel19.setText("Control");

        jLabel20.setText("Flight No");

        jLabel21.setText("Delay Time");

        ctrlDelayTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrlDelayTimeActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        delayButton.setText("Delay");
        delayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delayButtonActionPerformed(evt);
            }
        });

        jLabel22.setText("System");

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        pause.setText("Pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        resume.setText("Resume");
        resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeActionPerformed(evt);
            }
        });

        jButton2.setText("Show All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hour.setText("jLabel23");

        dmy.setText("jLabel24");

        wd.setText("jLabel25");

        setSystem.setText("Set");

        jButton1.setText("Crash the Flight Into Island ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(showInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airlineShow, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(flightNoShow))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(controlFlightNo)
                            .addComponent(ctrlDelayTime)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weekdayDeleteAddFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addWeekday, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deleteWeekday))
                                        .addComponent(weekdayDeleteAddWeekday, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 136, Short.MAX_VALUE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resume, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(AF_flight_no)
                            .addComponent(AF_airlines)
                            .addComponent(AF_flrom)
                            .addComponent(AF_to)
                            .addComponent(AF_departure)
                            .addComponent(AF_aircraft)
                            .addComponent(AF_timetaken)
                            .addComponent(AF_arrival)
                            .addComponent(addFlight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DF_flight_no)
                                    .addComponent(DF_airlines, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                .addGap(33, 33, 33)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wd)
                                    .addComponent(dmy)
                                    .addComponent(hour))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(setSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(systemTime)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel16)
                        .addComponent(DF_flight_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AF_flight_no, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flightNoShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(weekdayDeleteAddFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(airlineShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(deleteWeekday)
                                            .addComponent(addWeekday))
                                        .addGap(104, 104, 104))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showInformation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DF_airlines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteFlight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel19))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel20)
                                                    .addComponent(controlFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(start)
                                                    .addComponent(stop))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(ctrlDelayTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel21)
                                                    .addComponent(resume)
                                                    .addComponent(pause)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(systemTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hour))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(dmy)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(AF_arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(addFlight)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateFlight)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton)
                            .addComponent(delayButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setSystem))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weekdayDeleteAddWeekday)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(AF_airlines))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AF_aircraft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AF_flrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AF_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(AF_timetaken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AF_departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }                        

    private void weekdayDeleteAddWeekdayActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void AF_flight_noActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void showInformationActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	if((flightNoShow.getText().isEmpty()) ||(airlineShow.getText().isEmpty())) {
    		flightNoShow.setText("You must fill this area!");
    		airlineShow.setText("You must fill this area!");
    		return;
    	}
    	String a = flightNoShow.getText();
        String b = airlineShow.getText();
        int len = this.flights.size();
        int i=0;
        DefaultTableModel model1 = (DefaultTableModel) tableShowsFlights.getModel();
        model1.setRowCount(0);
        while(i<len && (this.flights.get(i).getFlightNO().equals(a) == false && this.flights.get(i).getAirlines().equals(b)==false )) {
        	i++;
        }
        if(i<len) {
        	String status;
            if(this.flights.get(i).getStatus()) {
        		status = "Available";
        	}
            else{
            	status = "Cancelled";
            }
        	
        	Object[] row = {(Object)this.flights.get(i).getFlightNO(),(Object)this.flights.get(i).getDeparture(),(Object)this.flights.get(i).getArrivalTime(),
        			(Object)this.flights.get(i).getTimeTaken(),
        			(Object)this.flights.get(i).getAircraftModel(),(Object)this.flights.get(i).getWeekdays(),
        			(Object)this.flights.get(i).getFrom().getCapitalName(),this.flights.get(i).getTo().getCapitalName(),
        			(Object)"xd",(Object)status};
        	DefaultTableModel model = (DefaultTableModel) tableShowsFlights.getModel();
            model.addRow(row);
        }
        else {
        	Object[] row = {(Object)"null",(Object)"null",(Object)"null",(Object)"null",(Object)"null",(Object)"null",(Object)"null"};
        	DefaultTableModel model = (DefaultTableModel) tableShowsFlights.getModel();
            model.addRow(row);
        }
    }                                               

    private void addWeekdayActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	 String a = weekdayDeleteAddFlightNo.getText();
         String b = weekdayDeleteAddWeekday.getText();
         String[] days = new String[7];
         days[0] = "Monday";
 		 days[1] = "Tuesday";
 		 days[2] = "Wednesday";
 		 days[3] = "Thursday";
 		 days[4] = "Friday";
 		 days[5] = "Saturday";
 		 days[6] = "Sunday";
 		 int ctrl = 0;
 		 for(String q: days) {
 			 if(q.equals(b)) {
 				 ctrl++;
 			 }
 		 }
 		 if(ctrl == 0) {
 			 weekdayDeleteAddWeekday.setText("It is not even a day!");
 			 weekdayDeleteAddFlightNo.setText("");
 			 return;
 		 }
         
         int len = this.flights.size();
         int i = 0;
         while(i<len && (this.flights.get(i).getFlightNO().equals(a) == false && this.flights.get(i).getAirlines().equals(b)==false )) {
         	i++;
         }
         int controller = 0;
         for(String j: this.flights.get(i).weekdays) {
         	if(b.equals(j)) {
         		weekdayDeleteAddWeekday.setText("Already Exists!");
                weekdayDeleteAddFlightNo.setText("");
         		controller++;
         	}
         }
         if(controller == 0) {
         	this.flights.get(i).addWeekday(b);
         	weekdayDeleteAddFlightNo.setText("");
         	weekdayDeleteAddWeekday.setText("Done!");
         }
    }                                          

    private void deleteWeekdayActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	String a = weekdayDeleteAddFlightNo.getText();
        String b = weekdayDeleteAddWeekday.getText();
        String[] days = new String[7];
        days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		int ctrl = 0;
		for(String q: days) {
		 if(q.equals(b)) {
			 ctrl++;
			 }
		}
		 if(ctrl == 0) {
			 weekdayDeleteAddWeekday.setText("It is not even a day!");
			 weekdayDeleteAddFlightNo.setText("");
			 return;
		 }
        int len = this.flights.size();
        int i = 0;
        while(i<len && (this.flights.get(i).getFlightNO().equals(a) == false && this.flights.get(i).getAirlines().equals(b)==false )) {
        	i++;
        }
        this.flights.get(i).deleteWeekday(b);
    }                                             

    private void addFlightActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	if(AF_flight_no.getText().isEmpty() || AF_airlines.getText().isEmpty() || AF_aircraft.getText().isEmpty() || AF_flrom.getText().isEmpty() || AF_to.getText().isEmpty() || AF_timetaken.getText().isEmpty() || AF_departure.getText().isEmpty() || AF_arrival.getText().isEmpty()) {
        	AF_flight_no.setText("You Must Enter All Areas!");
	        AF_airlines.setText("");
	        AF_aircraft.setText("");
	        AF_flrom.setText("");
	        AF_to.setText("");
	        AF_timetaken.setText("");
	        AF_departure.setText("");
	        AF_arrival.setText("");
	        return;
        }
    	String flight_no = AF_flight_no.getText();
        String airlines = AF_airlines.getText();
        String aircraft = AF_aircraft.getText();
        String from = AF_flrom.getText();
        String to = AF_to.getText();
        float timetk = Float.parseFloat(AF_timetaken.getText());
        String departure = AF_departure.getText();
        String arrival = AF_arrival.getText();
        ArrayList<String> weekdaynew = new ArrayList<String>();
        
        
        
        int ctrlflight = 0;
        for(Flight j: this.flights) {
        	if(j.getFlightNO().equals(flight_no) && j.getAirlines().equals(airlines)) {
        		ctrlflight = 1;
        	}
        }
        if(ctrlflight == 0) {
        
        
	        int fromct = 0;
	        int toct = 0;
	        int indexfrom =0;
	        int indexto=0;
	        int k=0;
	        for(Capital i: this.capitals) {
	        	if(from.equals(i.getCapitalName())) {
	        		fromct++;
	        		indexfrom = k;
	        	}
	        	if(to.equals(i.getCapitalName())) {
	        		toct++;
	        		indexto = k;
	        	}
	        	k++;
	        }
	        if(fromct == 0 && toct == 0) {
	        	this.capitals.add(new Capital(from,new ControlTower("Control Tower of"+from)));
	        	this.capitals.add(new Capital(to,new ControlTower("Control Tower of"+to)));
	        	this.flights.add(new Flight(arrival,airlines,aircraft,departure,weekdaynew,flight_no,timetk,this.capitals.get(this.capitals.size()-2),this.capitals.get(this.capitals.size()-1)));
	        }
	        else if(fromct == 0 && toct == 1) {
	        	this.capitals.add(new Capital(from,new ControlTower("Control Tower of"+from)));
	        	this.flights.add(new Flight(arrival,airlines,aircraft,departure,weekdaynew,flight_no,timetk,this.capitals.get(this.capitals.size()-1),this.capitals.get(indexto))); 	
	        }
	        else if(fromct == 1 && toct == 0 ) {
	        	this.capitals.add(new Capital(to,new ControlTower("Control Tower of"+to)));
	        	this.flights.add(new Flight(arrival,airlines,aircraft,departure,weekdaynew,flight_no,timetk,this.capitals.get(indexfrom),this.capitals.get(this.capitals.size()-1)));
	        }
	        else if(fromct == 1 && toct == 1) {
	        	this.flights.add(new Flight(arrival,airlines,aircraft,departure,weekdaynew,flight_no,timetk,this.capitals.get(indexfrom),this.capitals.get(indexto)));
	        }
	       	 AF_flight_no.setText("Flight has been added.");
	         AF_airlines.setText("");
	         AF_aircraft.setText("");
	         AF_flrom.setText("");
	         AF_to.setText("");
	         AF_timetaken.setText("");
	         AF_departure.setText("");
	         AF_arrival.setText("");
        }
        else {
        	 AF_flight_no.setText("This Flight Already Exists!");
             AF_airlines.setText("");
             AF_aircraft.setText("");
             AF_flrom.setText("");
             AF_to.setText("");
             AF_timetaken.setText("");
             AF_departure.setText("");
             AF_arrival.setText("");
        }
    }                                         

    private void deleteFlightActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	String flight_no = DF_flight_no.getText();
        String airlines = DF_airlines.getText();
        int ctrl = 0;
        int j = 0;
        while(!(this.flights.get(j).getFlightNO().equals(flight_no)) && !(this.flights.get(j).getAirlines().equals(airlines))){
            j++;
        }
        if(this.flights.get(j).getFlightNO().equals(flight_no) && this.flights.get(j).getAirlines().equals(airlines)) {
        	this.flights.remove(j);
        	ctrl++;
        	DF_flight_no.setText("Delete is done!");
        	DF_airlines.setText("");
        }
        if(ctrl == 0) {
        	DF_flight_no.setText("Flight does not exist!");
        	DF_airlines.setText("");
        }
    }                                            

    private void updateFlightActionPerformed(java.awt.event.ActionEvent evt) {                                             
            	String flight_no="";
    	String airlines="";
    	String aircraft="";
    	String from="";
    	String to="";
    	float timetk=0f;
    	String departure="";
    	String arrival="";
    	if(!(AF_flight_no.getText().isEmpty())) {
    		flight_no = AF_flight_no.getText();
    	}
    	else {
    		AF_flight_no.setText("You must enter flight no!");
            AF_airlines.setText("");
            AF_aircraft.setText("");
            AF_flrom.setText("");
            AF_to.setText("");
            AF_timetaken.setText("");
            AF_departure.setText("");
            AF_arrival.setText("");
    		return;
    	}
    	if(!(AF_airlines.getText().isEmpty())) {
    		airlines = AF_airlines.getText();
    	}
    	else {
    		AF_airlines.setText("You must enter flight no!");
            AF_airlines.setText("");
            AF_aircraft.setText("");
            AF_flrom.setText("");
            AF_to.setText("");
            AF_timetaken.setText("");
            AF_departure.setText("");
            AF_arrival.setText("");
    		return;
    	}
    	
        int h = 0;
        int index = 0;
        int ctrlflight = 0;
        for(Flight j: this.flights) {
        	if(j.getFlightNO().equals(flight_no) && j.getAirlines().equals(airlines)) {
        		ctrlflight = 1;
        		index = h;
        	}
        	h++;
        }

    	if(!(AF_aircraft.getText().isEmpty())) {
    		aircraft = AF_aircraft.getText();
    	}
    	else {
    		aircraft = this.flights.get(index).getAircraftModel();
    	}
    	if(!(AF_flrom.getText().isEmpty())) {
    		from = AF_flrom.getText();
    	}
    	else {
    		from = this.flights.get(index).from.getCapitalName();
    	}
    	if(!(AF_to.getText().isEmpty())) {
    		to = AF_to.getText();	
    	}
    	else {
    		to = this.flights.get(index).to.getCapitalName();
    	}
    	if(!(AF_timetaken.getText().isEmpty())) {
    		timetk = Float.parseFloat(AF_timetaken.getText());	
    	}
    	else {
    		timetk = this.flights.get(index).getTimeTaken();
    	}
    	if(!(AF_departure.getText().isEmpty())) {
    		departure = AF_departure.getText();	
    	}
    	else {
    		departure = this.flights.get(index).getDeparture();
    	}
    	if(!(AF_arrival.getText().isEmpty())) {
    		arrival = AF_arrival.getText();
    	}
    	else {
    		arrival = this.flights.get(index).getArrivalTime();
    	}

        int fromct = 0;
        int toct = 0;
        int indexfrom = 0;
        int indexto = 0;
        int k = 0;

        if(ctrlflight == 1) {
        	 
        	for(Capital i: this.capitals) {
        		if(from.equals(i.getCapitalName())) {
	        		fromct++;
	        		indexfrom = k;
	        	}
	        	if(to.equals(i.getCapitalName())) {
	        		toct++;
	        		indexto = k;
	        	}
	        	k++;
        	}
        	 
        	if(fromct == 0 && toct == 0) {
 	        	this.capitals.add(new Capital(from,new ControlTower("Control Tower of"+from)));
 	        	this.capitals.add(new Capital(to,new ControlTower("Control Tower of"+to)));
 	        	this.flights.get(index).setArrivalTime(arrival);
 	        	this.flights.get(index).setAircraftModel(aircraft);
 	        	this.flights.get(index).setDeparture(departure);
 	        	this.flights.get(index).setTimeTaken(timetk);
 	        	this.flights.get(index).setFrom(this.capitals.get(this.capitals.size()-2));
 	        	this.flights.get(index).setTo(this.capitals.get(this.capitals.size()-1));
 	        	
 	        }
 	        else if(fromct == 0 && toct == 1) {
 	        	this.capitals.add(new Capital(from,new ControlTower("Control Tower of"+from)));
 	        	this.flights.get(index).setArrivalTime(arrival);
 	        	this.flights.get(index).setAircraftModel(aircraft);
 	        	this.flights.get(index).setDeparture(departure);
 	        	this.flights.get(index).setTimeTaken(timetk);
 	        	this.flights.get(index).setFrom(this.capitals.get(this.capitals.size()-1));
 	        	this.flights.get(index).setTo(this.capitals.get(indexto));
 	        }
 	        else if(fromct == 1 && toct == 0 ) {
 	        	this.capitals.add(new Capital(to,new ControlTower("Control Tower of"+to)));
 	        	this.flights.get(index).setArrivalTime(arrival);
 	        	this.flights.get(index).setAircraftModel(aircraft);
 	        	this.flights.get(index).setDeparture(departure);
 	        	this.flights.get(index).setTimeTaken(timetk);
 	        	this.flights.get(index).setFrom(this.capitals.get(indexfrom));
 	        	this.flights.get(index).setTo(this.capitals.get(this.capitals.size()-1));
 	        }
 	        else if(fromct == 1 && toct == 1) {
 	        	this.capitals.add(new Capital(to,new ControlTower("Control Tower of"+to)));
 	        	this.flights.get(index).setArrivalTime(arrival);
 	        	this.flights.get(index).setAircraftModel(aircraft);
 	        	this.flights.get(index).setDeparture(departure);
 	        	this.flights.get(index).setTimeTaken(timetk);
 	        	this.flights.get(index).setFrom(this.capitals.get(indexfrom));
 	        	this.flights.get(index).setTo(this.capitals.get(indexto));
 	        }
        	
	       	 AF_flight_no.setText("Flight has been updated.");
	         AF_airlines.setText("");
	         AF_aircraft.setText("");
	         AF_flrom.setText("");
	         AF_to.setText("");
	         AF_timetaken.setText("");
	         AF_departure.setText("");
	         AF_arrival.setText("");
        }
        else {
        	 AF_flight_no.setText("This Flight Doest Not Exist!");
             AF_airlines.setText("");
             AF_aircraft.setText("");
             AF_flrom.setText("");
             AF_to.setText("");
             AF_timetaken.setText("");
             AF_departure.setText("");
             AF_arrival.setText("");
        }
    }                                            

    private void ctrlDelayTimeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void delayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void startActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void resumeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void AF_arrivalActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //show all
        DefaultTableModel model1 = (DefaultTableModel) tableShowsFlights.getModel();
        model1.setRowCount(0);
        for(Flight i: this.flights){
            String status="";
            if(i.getStatus()) {
        		status = "Available";
            }
            else{
                status = "Cancelled";
            }
            Object[] row = {(Object)i.getFlightNO(),(Object)i.getDeparture(),(Object)i.getArrivalTime(),
        			(Object)i.getTimeTaken(),
        			(Object)i.getAircraftModel(),(Object)i.getWeekdays(),
        			(Object)i.getFrom().getCapitalName(),i.getTo().getCapitalName(),
        			(Object)"xd",(Object)status};
        	DefaultTableModel model = (DefaultTableModel) tableShowsFlights.getModel();
            model.addRow(row);
            
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // crash the flight :)))
        String flight_no = DF_flight_no.getText();
        String airlines = DF_airlines.getText();
        int ctrl = 0;
        int j = 0;
        while(!(this.flights.get(j).getFlightNO().equals(flight_no)) && !(this.flights.get(j).getAirlines().equals(airlines))){
            j++;
        }
        if(this.flights.get(j).getFlightNO().equals(flight_no) && this.flights.get(j).getAirlines().equals(airlines)) {
        	this.flights.remove(j);
        	ctrl++;
        	DF_flight_no.setText("...Live together die alone.");
        	DF_airlines.setText("");
        }
        if(ctrl == 0) {
        	DF_flight_no.setText("Flight does not exist!");
        	DF_airlines.setText("");
        }
                                     
    }                                        


    public static void main(String args[]) {
    	ArrayList<Flight> flights = new ArrayList<Flight>();
    	ArrayList<Capital> capitals = new ArrayList<Capital>();
    	ArrayList<ControlTower> ctws = new ArrayList<ControlTower>();
		
		ctws.add(new ControlTower("Tower of Moscow"));
		capitals.add(new Capital("Moscow",ctws.get(0)));
	
		ctws.add(new ControlTower("Tower of Havana"));
		capitals.add(new Capital("Havana",ctws.get(1)));
	
		ctws.add(new ControlTower("Tower of Luanda"));
		capitals.add(new Capital("Luanda",ctws.get(2)));
			
		ctws.add(new ControlTower("Tower of Budapest"));
		capitals.add(new Capital("Budapest",ctws.get(3)));
	        
		ctws.add(new ControlTower("Tower of Kanberra"));
		capitals.add(new Capital("Kanberra",ctws.get(4)));
			
		ctws.add(new ControlTower("Tower of Brasilia"));
		capitals.add(new Capital("Brasilia",ctws.get(5)));
		
		ctws.add(new ControlTower("Tower of Washington DC"));
		capitals.add(new Capital("Washington DC",ctws.get(6)));
	
			
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
			
		ArrayList<String> weekdays1 = new ArrayList<String>();
        weekdays1.add(days[0]);
		weekdays1.add(days[2]);
		weekdays1.add(days[4]);
		ArrayList<String> weekdays2 = new ArrayList<String>();
		weekdays2.add(days[3]);
		weekdays2.add(days[5]);
		weekdays2.add(days[6]);
		ArrayList<String> weekdays3 = new ArrayList<String>();
		weekdays3.add(days[1]);
		weekdays3.add(days[3]);
		weekdays3.add(days[0]);
		ArrayList<String> weekdays4 = new ArrayList<String>();
		weekdays4.add(days[4]);
		weekdays4.add(days[6]);
		weekdays4.add(days[2]);
		ArrayList<String> weekdays5 = new ArrayList<String>();
		weekdays5.add(days[0]);
		weekdays5.add(days[1]);
		weekdays5.add(days[2]);

        deneme safak1 = new deneme(flights,capitals,ctws);
		safak1.flights.add(new Flight("20:00","Republic Airlines","RPB666-1000H","14:00",weekdays1,"001917",360f,capitals.get(5),capitals.get(1)));
		safak1.flights.add(new Flight("12:00","Coffee Airlines","CFE170-137S","10:00",weekdays2,"001848",120f,capitals.get(0),capitals.get(3)));
		safak1.flights.add(new Flight("00:00","Marx Airlines","CCCP111-SSS","14:00",weekdays3,"001818",480f,capitals.get(2),capitals.get(3)));
		safak1.flights.add(new Flight("22:00","King Gizzard Airlines","KGALW-FMB","02:00",weekdays4,"002017",1200f,capitals.get(1),capitals.get(4)));
		safak1.flights.add(new Flight("23:00","Oceanic Airlines","4-8-15-16-23-42","03:00",weekdays5,"Oceanic815",12000f,capitals.get(4),capitals.get(6)));
		safak1.flights.get(0).addWeekday(weekdays1.get(0));
		safak1.flights.get(0).addWeekday(weekdays1.get(1));
		safak1.flights.get(0).addWeekday(weekdays1.get(2));
		safak1.flights.get(1).addWeekday(weekdays2.get(0));
		safak1.flights.get(1).addWeekday(weekdays2.get(1));
		safak1.flights.get(1).addWeekday(weekdays2.get(2));
		safak1.flights.get(2).addWeekday(weekdays3.get(0));
		safak1.flights.get(2).addWeekday(weekdays3.get(1));
		safak1.flights.get(2).addWeekday(weekdays3.get(2));
		safak1.flights.get(3).addWeekday(weekdays4.get(0));
		safak1.flights.get(3).addWeekday(weekdays4.get(1));
		safak1.flights.get(3).addWeekday(weekdays4.get(2));
		safak1.flights.get(4).addWeekday(weekdays4.get(0));
		safak1.flights.get(4).addWeekday(weekdays4.get(1));
		safak1.flights.get(4).addWeekday(weekdays4.get(2));
		
		safak1.capitals.add(capitals.get(0));
		safak1.capitals.add(capitals.get(1));
		safak1.capitals.add(capitals.get(2));
		safak1.capitals.add(capitals.get(3));
		safak1.capitals.add(capitals.get(4));
		safak1.capitals.add(capitals.get(5));
		safak1.capitals.add(capitals.get(6));
	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
	    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                safak1.setVisible(true);
            }
        });
    }
           
    private javax.swing.JTextField AF_aircraft;
    private javax.swing.JTextField AF_airlines;
    private javax.swing.JTextField AF_arrival;
    private javax.swing.JTextField AF_departure;
    private javax.swing.JTextField AF_flight_no;
    private javax.swing.JTextField AF_flrom;
    private javax.swing.JTextField AF_timetaken;
    private javax.swing.JTextField AF_to;
    private javax.swing.JTextField DF_airlines;
    private javax.swing.JTextField DF_flight_no;
    private javax.swing.JButton addFlight;
    private javax.swing.JButton addWeekday;
    private javax.swing.JTextField airlineShow;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField controlFlightNo;
    private javax.swing.JTextField ctrlDelayTime;
    private javax.swing.JButton delayButton;
    private javax.swing.JButton deleteFlight;
    private javax.swing.JButton deleteWeekday;
    private javax.swing.JLabel dmy;
    private javax.swing.JTextField flightNoShow;
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton pause;
    private javax.swing.JButton resume;
    private javax.swing.JButton setSystem;
    private javax.swing.JButton showInformation;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel systemTime;
    private javax.swing.JTable tableShowsFlights;
    private javax.swing.JButton updateFlight;
    private javax.swing.JLabel wd;
    private javax.swing.JTextField weekdayDeleteAddFlightNo;
    private javax.swing.JTextField weekdayDeleteAddWeekday;                
}
