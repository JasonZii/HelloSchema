package com.jason.lambda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author : jasonzii @Author
 * @Description :  使用lambda表达式和函数式接口Predicate
 * predicate  做集合过滤
 * @CreateDate : 18.6.25  22:19
 */
public class PredicateT {

    public static void main(String[] args) throws Exception {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("languages集合中找 J 开头的:");
//        filter(languages, (str) -> str.startsWith("J"));

        System.out.println("languages集合中找 a 结尾的:");
//        filter(languages, (str) -> str.endsWith("a"));

        System.out.println("输出集合languages :");
        filter(languages, (str) -> true);

        System.out.println("不输出集合languages : ");
        filter(languages, (str) -> false);

        System.out.println("输出集合中长度小于4的 :");
//        filter(languages, (str) -> str.length() > 4);
    }

    /*public static void filter(List names, Predicate condition) {
        for(Object name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }*/

    public static void filter(List names, Predicate condition) {
        //.forEach之前表示过滤集合，之后表示遍历集合
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }

    //合并两个条件(Predicate)查询
    public static void filter2(List names, Predicate condition) {
        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
        // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
        names.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
    }

}
