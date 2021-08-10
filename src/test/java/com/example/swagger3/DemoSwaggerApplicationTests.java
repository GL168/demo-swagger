package com.example.swagger3;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class DemoSwaggerApplicationTests {

    @Test
    public void contextLoads() {
      genDirTree("D:/personweb/demo-swagger2",0,"");
    }


    public  void  genDirTree(String path, int level, String dir) {
        level++;
        File file = new File(path);
        File[] files = file.listFiles();
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        if (files.length != 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    dir = f.getName();
                    System.out.println(levelSign(level) + dir);
                    genDirTree(f.getAbsolutePath(), level, dir);
                } else {
                    System.out.println(levelSign(level) + f.getName());
                }
            }
        }
    }

    //文件层级信息
    private  String levelSign(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ├─");
        for (int x = 0; x < level; x++) {
            sb.insert(0, " │   ");
        }
        return sb.toString();
    }

}
