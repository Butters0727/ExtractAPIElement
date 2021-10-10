package fold1;
import java.io.BufferedWriter;
public class SO {
private static Logger log = LoggerFactory.getLogger(WriteReadFiles.class);
    public boolean writeFile(String content) {
        String filename = "E:/java_src/MVCDemo3/MVCDemo3/accounts.txt";
        try {
            File f = new File(filename);
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));
            BufferedWriter writer = new BufferedWriter(write);
            writer.write(content);
            writer.flush(); 
            write.close();
            writer.close();
            log.debug("Write File complete!");
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
}
