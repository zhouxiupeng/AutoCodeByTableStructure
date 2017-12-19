/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.code.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil
{
  public static String configPath = System.getProperty("file.separator") + System.getProperty("user.dir") + System.getProperty("file.separator") + "conf" + System.getProperty("file.separator");

  public static List<String> readLines(File file)
  {
    if (!(file.isFile())) {
      throw new RuntimeException("文件" + file.getName() + "不是一个标准文件!");
    }

    List list = new ArrayList();

    FileReader fr = null;
    BufferedReader br = null;
    try {
      fr = new FileReader(file);
      br = new BufferedReader(fr);
      String line = br.readLine();
      while (line != null) {
        if (line.length() > 0) {
          list.add(line);
        }
        line = br.readLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (br != null) try {
          br.close(); } catch (IOException e) { e.printStackTrace();
        }
      if (fr != null) try {
          fr.close(); } catch (IOException e) { e.printStackTrace();
        }
    }

    return list;
  }

  public static File makeDir(String dirName)
  {
    File file = new File(dirName);
    try {
      if ((!(file.exists())) && 
        (!(file.exists()))) {
        file.mkdirs();
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw new RuntimeException("创建目录【" + dirName + "】失败!");
    }

    return file;
  }

  public static File makeDirAndFile(String fileName)
  {
    File file = new File(fileName);
    try {
      if (!(file.exists()))
      {
        File dir = file.getParentFile();
        if (!(dir.exists())) {
          dir.mkdirs();
        }

      }

      file.createNewFile();
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("创建文件【" + fileName + "】失败!");
    }

    return file;
  }

  public static void writeToFile(String outputFile, String str)
  {
    try
    {
      FileOutputStream out = new FileOutputStream(outputFile);
      out.write(str.getBytes("UTF-8"));
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
  }
}