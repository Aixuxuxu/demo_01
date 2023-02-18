package com.aixu.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author aixu
 * @ClassName Main
 * @Date 2023/2/18 16:12
 */
public class Main {
    public static void main(String[] args) {
        // 原来 Scanner 是这回事啊
       try(Scanner scanner = new Scanner(new FileInputStream("将文件作为输入流"))){
           System.out.println(scanner.nextLine());
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
