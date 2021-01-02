import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {
    public static void main(String[] args) throws IOException{//这里要抛出异常，不然会报错
        String inPath="C:\\Users\\T-BAO\\Desktop\\week15\\inputTest1.txt";
        String outPath="C:\\Users\\T-BAO\\Desktop\\week15\\outputTest1.txt";
        FileInputStream inputStream=new FileInputStream(inPath);
        FileOutputStream outputStream=new FileOutputStream(outPath);
        int byt=0;
        int[] bytes=new int[1024];
        while((byt=inputStream.read())!=-1){
            outputStream.write(byt);
        }
        outputStream.close();

    }
}
