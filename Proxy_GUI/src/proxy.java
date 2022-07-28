import java.io.*;
import java.net.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class proxy extends javax.swing.JFrame {    
    static ServerSocket ss;
    static String URL;
    static String name;
    public proxy() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        url_panel = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        url = new javax.swing.JTextArea();
        cache_panel = new javax.swing.JPanel();
        cache = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        blocked = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proxy Server");
        setName("Proxy Server"); // NOI18N

        url_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Site"));

        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        url.setColumns(20);
        url.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        url.setRows(5);
        jScrollPane1.setViewportView(url);

        javax.swing.GroupLayout url_panelLayout = new javax.swing.GroupLayout(url_panel);
        url_panel.setLayout(url_panelLayout);
        url_panelLayout.setHorizontalGroup(
            url_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        url_panelLayout.setVerticalGroup(
            url_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(url_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(url_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        cache_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cached Sites"));

        javax.swing.GroupLayout cache_panelLayout = new javax.swing.GroupLayout(cache_panel);
        cache_panel.setLayout(cache_panelLayout);
        cache_panelLayout.setHorizontalGroup(
            cache_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cache_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cache, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cache_panelLayout.setVerticalGroup(
            cache_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cache_panelLayout.createSequentialGroup()
                .addComponent(cache, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Blocked Sites"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blocked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(blocked, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cache_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(url_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(url_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cache_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        URL = url.getText();
        String[] split = URL.split("\\.");
        name = split[0];
        StringBuffer sb = new StringBuffer(name);
        if(URL.contains("https://")){
            sb.delete(0, 8);
        }
        else if(URL.contains("http://")){
            StringBuffer ur = new StringBuffer(URL);
            ur.delete(0, 7);
            URL = ur.toString();
            URL = "https://" + URL;
            sb.delete(0, 7);
        }
        name = sb.toString();
        try
        {
            Socket s=new Socket("localHost",8000);
            DataInputStream in = new
            DataInputStream(s.getInputStream());
            String filename = in.readLine();
            File file = new File(name + ".html");
            FileWriter fr = new FileWriter(file);
            fr.write(filename);
            fr.close();
            File htmlFile = new File(name + ".html");
            Desktop.getDesktop().browse(htmlFile.toURI());
        }
        catch(Exception e) {

        }
    }//GEN-LAST:event_searchActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proxy().setVisible(true);
            }
        });
        try{
        
            Scanner myObj = new Scanner(System.in);
            System.out.println("Block any website, just write its URL or no: ");
            String site = myObj.nextLine();
            if(!site.equals("no")){
            if(site.contains("http") && site.contains(".com")){
                boolean yes = true;
                File file = new File("blocked.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine())  
                {
                    if (sc.nextLine().equals(site)){
                        yes = false;
                        System.out.println(site + " is already blocked");
                        sc.close();
                        break;
                    }
                }
                if(yes){
                    FileWriter fr = new FileWriter(file, true);
                    fr.write(site + "\n");
                    fr.close();
                    System.out.println("Site is blocked successfully...");
                }
            }
            else{
                throw new MalformedURLException("Malformed URL Exception raised");
            }}
        }
        catch (MalformedURLException mue)
        {
            System.out.println("Malformed URL Exception raised");
        }
        catch (IOException ie)
        {
            status.setText("IOException raised");
        }
        try
        {
            ServerSocket ss = new ServerSocket(8000);
            Socket s = ss.accept();
            DataInputStream in=new DataInputStream(System.in);
            PrintStream dos=new PrintStream(s.getOutputStream());
            boolean flag = true;
            try {
                FileInputStream fis=new FileInputStream("blocked.txt");       
                Scanner sc = new Scanner(fis);
                while(sc.hasNextLine())  
                {
                    if (sc.nextLine().equals(URL)){
                        System.out.println(URL + " is blocked");
                        System.exit(0);
                    }
                }  
                sc.close(); 
            }
            catch(IOException e)  
            {  
                e.printStackTrace();  
            }
            try {
                File file=new File("cache.txt");
                FileReader fr=new FileReader(file);
                BufferedReader br=new BufferedReader(fr);
                StringBuffer sb=new StringBuffer(); 
                String line;
                while((line=br.readLine())!=null) {
                    if(line.equals(URL)){
                        flag = false;
                        FileInputStream fis;
                        BufferedInputStream bis;
                        BufferedOutputStream out;
                        byte[] buffer = new byte[70000];
                        try {
                            String filename = "c_"+name+".html";
        //                    String file = name+".html";
                            fis = new FileInputStream(filename);
                            bis = new BufferedInputStream(fis);
                            out = new BufferedOutputStream(s.getOutputStream());
                            int count;
                            while ((count = bis.read(buffer)) > 0) {
                                out.write(buffer, 0, count);
                            }
                            out.close();
                            fis.close();
                            bis.close();
                            status.setText(name + " fetched from cache.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }  
                fr.close();
            }  
            catch(IOException e)  
            {  
                e.printStackTrace();  
            }
            if(flag){
                try{
                    URL url = new URL(URL);
                    BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));
                    BufferedWriter writer = new BufferedWriter(new FileWriter("c_"+name+".html"));
                    String line;
                    while ((line = readr.readLine()) != null)
                    {
                        writer.write(line);
                    }
                    readr.close();
                    writer.close();
                    status.setText(name + " successfully downloaded.");
                    File file = new File("cache.txt");
                    FileWriter fr = new FileWriter(file, true);
                    fr.write(URL + "\n");
                    fr.close();
                }
                catch (MalformedURLException mue)
                {
                    System.out.println("Malformed URL Exception raised");
                    status.setText("Malformed URL Exception raised");
                    System.exit(0);
                }
                catch (IOException ie)
                {
                    System.out.println("IOException raised");
                    status.setText("IOException raised");
                    System.exit(0);
                }
                FileInputStream fis;
                BufferedInputStream bis;
                BufferedOutputStream out;
                byte[] buffer = new byte[70000];
                try {
                    String file = "c_"+name+".html";
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    out = new BufferedOutputStream(s.getOutputStream());
                    int count;
                    while ((count = bis.read(buffer)) > 0) {
                        out.write(buffer, 0, count);
                    }
                    out.close();
                    fis.close();
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch(Exception e){
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel blocked;
    public static javax.swing.JLabel cache;
    public javax.swing.JPanel cache_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton search;
    public static javax.swing.JLabel status;
    public javax.swing.JTextArea url;
    public javax.swing.JPanel url_panel;
    // End of variables declaration//GEN-END:variables

    private boolean substringExistsInArray(String URL, String[] array) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
