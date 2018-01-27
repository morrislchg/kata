/**
 * Copyright (C), 2017-2018, lc
 * FileName: PrimeGenerator
 * Author:   carlson
 * Date:     2018/1/27 0027 18:32
 * Description: prime
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉<br> 
 * Input
 The input begins with the number t of test cases in a single line (t<=10). In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

 Output
 For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.

 Example
 Input:
 2
 1 10
 3 5

 Output:
 2
 3
 5
 7

 3
 5
 *
 * @author carlson
 * @create 2018/1/27 0027
 * @since 1.0.0
 */
public class PrimeGenerator {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
        boolean flag = true;
        int num = 0;
        String inarray[] = null;
        long ed1 = System.currentTimeMillis();
        System.out.println("stp1"+(ed1-st));
        while (flag){
            try {
                if(num == 0){
                    num = Integer.valueOf(r.readLine());
                    inarray = new String[num];
                }else{
                    int length = inarray.length;
                    inarray[length-num] = r.readLine();
                    num--;
                }
                if(num==0){
                    System.out.println(inarray.length);
                    int m = 0;
                    long ed2 = System.currentTimeMillis();
                    System.out.println("stp2"+(ed2-ed1));
                    for(String str:inarray){
                        if(m!=0){
                            System.out.println("");
                        }
                        String[] primearray = str.split(" ");
                        PrimeGenerator primeGenerator = new PrimeGenerator();
                        primeGenerator.getPrime(Long.valueOf(primearray[0]),Long.valueOf(primearray[1]));
                        m++;
                    }
                    long ed3 = System.currentTimeMillis();
                    System.out.println("stp3"+(ed3-ed2));
                    flag = false;
                }
                long ed4 = System.currentTimeMillis();
                System.out.println("stp4"+(ed4-ed1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getPrime(long start,long end){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        try{
            for(long i=start;i<=end;i++){
                final long index = i;
                fixedThreadPool.execute(new Runnable() {
                    public void run() {
                        if(isPrime(index))
                            System.out.println(index);
                    }
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fixedThreadPool.shutdown();
        }

    }
    public boolean isPrime(long re){
        boolean result = true;
        if(re<2){
            return false;
        }
        for(int i=2;i<re;i++){
            if(re%i==0){
                result = false;
                break;
            }
        }
        return result;
    }
}
