/**
 * Copyright (C), 2017-2018, lc
 * FileName: LiFeUniverseTest
 * Author:   carlson
 * Date:     2018/1/27 0027 13:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author carlson
 * @create 2018/1/27 0027
 * @since 1.0.0
 */
public class LiFeUniverseTest {
    @Test
    public void testequals(){
        int two = 2;
        int test = 2;
        Assert.assertTrue(two==test);
    }
    @Test
    public void testPrime(){
        PrimeGenerator primeGenerator = new PrimeGenerator();
        long start = System.currentTimeMillis();
        primeGenerator.getPrime(1,100000);
        long end = System.currentTimeMillis();
        System.out.println("======"+(end-start));
    }

    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        System.out.println(primeGenerator.isPrime(45));;
    }
}
