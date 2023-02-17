package com.aixu.io;

import com.aixu.testError.FileException;

import java.io.*;

/**
 * @author aixu
 * @ClassName CopyFile
 * @Date 2023/2/16 16:46
 *
 * 简易版大文件拷贝（文档就算了）
 */
public class CopyFile  {

    public static void main(String[] args) {

        copy("D:\\百度网盘\\BaiduNetdiskDownload\\爱上火车lrbgm全集\\まいてつ Last Run!! Vocal Collection.rar  ",
                "C:\\Users\\lenovo\\Desktop\\まいてつ Last Run!! Vocal Collection.rar");
    }

    public static void copy(String inputFileName,String outputFileName) {
        if(inputFileName.replaceAll("\\s+","").length() == 0) throw new FileException("路径为空或文件不存在");
        if(outputFileName.replaceAll("\\s+","").length() == 0) throw new FileException("路径不能为空");
        File file = new File(inputFileName);
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFileName))){

            // 1、创建一个byte数组用来存储输入/输出数据
            byte[] bytes = new byte[1024 * 1024];
            int length; // 获取byte数组中读取的字节数
            long total = file.length(),sum = 0;
            // 2、循环往返
            while((length = inputStream.read(bytes)) != -1){    // 每次都读取byte中的字节数，当 read() 方法返回-1表示已经没有数据了

                outputStream.write(bytes,0,length);     // 利用读取到的数据长度，往目标位置写入
                sum+=length;
                System.out.println("文件已拷贝"+ (sum * 100 / total) +"%" );
            }

        }catch(IOException e){
            System.out.println("复制失败");
            e.printStackTrace();
        }


    }

}
