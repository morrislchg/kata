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
 *
 * @author carlson
 * @create 2018/1/27 0027
 * @since 1.0.0
 */
public class LifeUniverseEverything {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
        String s;
        while (!(s=r.readLine()).startsWith("42")) System.out.println(s);
    }

}
