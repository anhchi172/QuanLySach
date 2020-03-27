import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class TaiLieuDao {
    private static final String FILE_NAME = "TaiLieu.txt";

    public void write(List<TaiLieu> al) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File(FILE_NAME);
            if (!file.exists())
                file.createNewFile();
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public void closeStream(OutputStream os) {
        if (os != null)
            try {
                os.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
    }

    public List<TaiLieu> read() {
        List<TaiLieu> al = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);
            al = (List<TaiLieu>) ois.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return al;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
