import java.io.*;

class ReadFile {
    void readFile() {
        String path = getClass().getResource("Texto.txt").getPath();
        String line;
        File file = new File(path);
        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
