package com.aixu.io;

import com.aixu.testError.FileException;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author aixu
 * @ClassName CopySmallFile
 * @Date 2023/2/17 17:20
 *
 * 拷贝小文档
 */
public class CopySmallFile {

    public static void main(String[] args) {

        String input = "C:\\Users\\lenovo\\Desktop\\怀化学院专升本资料包\\怀化学院专升本资料包\\说明.docx";
        String output = "C:\\Users\\lenovo\\Desktop\\test.docx";
        copy(input,output);

    }

    public static void copy(String input,String output){
        if(input.replaceAll("\\s+","").length() == 0) throw new FileException("路径为空或文件不存在");
        if(output.replaceAll("\\s+","").length() == 0) throw new FileException("路径为空");

        try(FileReader reader = new FileReader(input);
            FileWriter writer = new FileWriter(output)){

            char[] chars = new char[3];
            int length;
            while ((length = reader.read(chars)) != -1){
                writer.write(chars,0,length);
            }
            writer.flush();
            System.out.println("拷贝成功");
        }catch (IOException e){
            System.out.println("拷贝失败");
            e.printStackTrace();
        }

    }
}
