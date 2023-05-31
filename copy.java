import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class copy {
    public static void main(String[] args) throws IOException {
        File sourFile = new File("D:\\壁纸");
        File desFile = new File("E:\\");
        File newfile = new File((desFile.getAbsolutePath().endsWith("\\")
                ? desFile.getAbsolutePath()
                : desFile.getAbsolutePath() + "\\") +
                sourFile.getAbsolutePath().substring(3));
        if (sourFile.isDirectory() && !newfile.exists()) {
            newfile.mkdirs();
        }
        copyDir(sourFile, desFile);
    }

    private static void copyDir(File sourFile, File desFile) throws IOException {
        if (sourFile.isFile()) {
            FileInputStream inputStream = null;
            FileOutputStream OutputStream = null;

            try {
                inputStream = new FileInputStream(sourFile);
                OutputStream = new FileOutputStream((desFile.getAbsolutePath().endsWith("\\")
                        ? desFile.getAbsolutePath()
                        : desFile.getAbsolutePath() + "\\") +
                        sourFile.getAbsolutePath().substring(3));
                byte[] bytes = new byte[1024 * 1024];
                int count = 0;
                while ((count = inputStream.read(bytes)) != -1) {
                    OutputStream.write(bytes, 0, count);
                }
                OutputStream.flush();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (OutputStream != null) {
                    OutputStream.close();
                }
            }
            return;
        }

        File[] files = sourFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                String sourDir = file.getAbsolutePath();
                String desDir = (desFile.getAbsolutePath().endsWith("\\")
                        ? desFile.getAbsolutePath()
                        : desFile.getAbsolutePath() + "\\") + sourDir.substring(3);
                File newFile = new File(desDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            copyDir(file, desFile);
        }
    }
}
