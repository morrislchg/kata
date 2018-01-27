/**
 * Copyright (C), 2017-2018, lc
 * FileName: LifeUniverseEverything
 * Author:   carlson
 * Date:     2018/1/27 0027 12:02
 * Description:  Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.   Example Input: 1 2 88 42 99  Output: 1 2 88
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈 Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.   Example Input: 1 2 88 42 99  Output: 1 2 88〉
 * 使用readline 中的read方法解决问题
 * @author carlson
 * @create 2018/1/27 0027
 * @since 1.0.0
 */
public class LifeUniverseEverything1 {

    public static void main(String[] args) throws IOException {
        int read = 0;
        boolean result = true;
        final int four = 52;
        final int two = 50;
        final int enter = 10;
        int firstint = -1;
        int secondint = -1;
        while (result){
            try {
                read = (int) System.in.read();
                // is two
                if(firstint==four&&secondint==two){
                    result = false;
                }else{
                    if(read == enter){
                        char firstchar = (char)firstint;
                        if(secondint!=-1){
                            char secondchar = (char)secondint;
                            System.out.println(String.valueOf(firstchar)+String.valueOf(secondchar));
                        }else{
                            System.out.println(firstchar);
                        }
                        firstint = -1;
                        secondint = -1;
                    }else{
                        if(secondint!=-1){
                            throw new RuntimeException("only one or two digitals is allowed!");
                        }else{
                            if(firstint == -1){
                                firstint = read;
                            }else{
                                secondint = read;
                            }
                        }
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    
}
