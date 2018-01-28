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
        java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
        boolean flag = true;
        int num = 0;
        String inarray[] = null;
        while (flag){
            try {
                if(num == 0){
                    num = Integer.valueOf(r.readLine());
                    if(num>10||num<1){
                        throw new RuntimeException("invalidate input");
                    }
                    inarray = new String[num];
                }else{
                    int length = inarray.length;
                    if(length-num<0){
                        throw new RuntimeException("invalid input");
                    }
                    inarray[length-num] = r.readLine();
                    num--;
                }
                if(num==0){
                    System.out.println(inarray.length);
                    int m = 0;
                    for(String str:inarray){
                        if(m!=0){
                            System.out.println("");
                        }
                        if(str.indexOf(" ")==-1){
                            throw new RuntimeException("invalid input");
                        }
                        String[] primearray = str.split(" ");
                        if(primearray.length!=2){
                            throw new RuntimeException("invalid input");
                        }
                        PrimeGenerator primeGenerator = new PrimeGenerator();
                        long start = Long.valueOf(primearray[0]);
                        long end = Long.valueOf(Long.valueOf(primearray[1]));
                        if(start<1||start>end||end-start>100000||start>1000000000||end>1000000000){
                            throw new RuntimeException("invalid input");
                        }
                        primeGenerator.getPrime(start,end);
                        m++;
                    }
                    flag = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getPrime(long start,long end){
            for(long i=start;i<=end;i++){
                        if(isPrime(i))
                            System.out.println(i);
            }
    }
    public long getEnd(long re){
        double result = Math.sqrt(re);
        long lre = (long)result;
        return lre;
    }
    public boolean isPrime(long re){
        long end = getEnd(re);
        long i;
        for(i=2;i<=end;i++){
            if(re%i==0){
                break;
            }
        }
        if(i>end){
            return true;
        }else{
            return false;
        }
    }
}
