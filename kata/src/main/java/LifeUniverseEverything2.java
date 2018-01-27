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

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈 Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.   Example Input: 1 2 88 42 99  Output: 1 2 88〉
 *Scanner实现
 * @author carlson
 * @create 2018/1/27 0027
 * @since 1.0.0
 */
public class LifeUniverseEverything2 {
    public static void main(String[] args){
        boolean result = true;
        Scanner scan = new Scanner(System.in);
        while (result){
            try {
                String read = scan.next();
                if("42".equals(read)){
                    result=false;
                }else{
                    System.out.println(read);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
