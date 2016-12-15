package todojava.exercise.UtilsTest;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Administrator on 2016/12/12.
 * 将DO变成Model且去除注释
 */
public class Do2ModelNoDoc {

    public static File transFile(File src){
        String targetFileName;
        String contentString;
        String name=src.getName();
        targetFileName=name.replace("DO.","Model.");
        File target=new File(src.getParentFile(),targetFileName);
        FileReader fis=null;
        FileWriter fw=null;
        try {
            target.createNewFile();
            fw=new FileWriter(target);
            contentString=IOUtils.toString(new FileInputStream(src));
            contentString=contentString.replaceAll("[^\\'\\\"]/\\*(.|\\s)*?\\*/[^\\'\\\"]","");
            contentString=contentString.replace(src.getName().replace(".java",""),targetFileName.replace(".java",""));
            fw.write(contentString);
            fw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null) fis.close();
                if(fw!=null) fw.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return target;
    }


    @Test
    public void fun(){
        Do2ModelNoDoc.transFile(new File("G:\\controlScope\\借财童子\\git-exercise\\ToBetter\\src\\main\\java\\todojava\\exercise\\TestData\\APPBannerDO.java"));
    }


}
