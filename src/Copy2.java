import java.io.*;

public class Copy2 {
    public static void main(String[] args) throws IOException {
        String inPath="C:\\Users\\T-BAO\\Desktop\\week15\\inputTest2.txt";
        String outPath="C:\\Users\\T-BAO\\Desktop\\week15\\outputTest2.txt";
        InputStream inputStream=new FileInputStream(inPath);
        OutputStream outputStream=new FileOutputStream(outPath);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        int byt=0;
        int[] bytes=new int[1024];
        while ((byt=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(byt);
        }
        bufferedOutputStream.close();
    }
}
