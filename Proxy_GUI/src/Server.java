import java.io.*;
import java.net.*;
import java.io.File;
import java.io.IOException;
public class Server {
    public static void main(String args[]) {
        try
        {
            ServerSocket ss = new ServerSocket(8000);
            Socket s = ss.accept();
            DataInputStream in=new DataInputStream(System.in);
            PrintStream dos=new PrintStream(s.getOutputStream());
            boolean flag = true;
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
                            System.out.println(name + " fetched from cache.");
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
                    System.out.println(name + " successfully downloaded.");
                    File file = new File("cache.txt");
                    FileWriter fr = new FileWriter(file, true);
                    fr.write(URL + "\n");
                    fr.close();
                }
                catch (MalformedURLException mue)
                {
                    System.out.println("Malformed URL Exception raised");
                }
                catch (IOException ie)
                {
                    System.out.println("IOException raised");
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
}
