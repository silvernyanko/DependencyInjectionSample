package com.example.DependencyInjectionSample.chapter03.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
//    @Before("execution(* com.example.DependencyInjectionSample.chapter03.used.*Greet.*(..))")
//    public void beforeAdvice(JoinPoint joinPoint) {
////        分かりやすいように表示
//        System.out.println("===== Before Advice =====");
////        日付を表示する
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
////        メソッド名を表示する
//        System.out.printf("メソッド名:%s%n", joinPoint.getSignature().getName());
//    }

//    @After("execution(* com.example.DependencyInjectionSample.chapter03.used.*Greet.*(..))")
//    public void afterAdvice(JoinPoint joinPoint) {
////        分かりやすいように表示
//        System.out.println("===== After Advice =====");
////        日付を表示する
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
////        メソッド名を表示する
//        System.out.printf("メソッド名:%s%n", joinPoint.getSignature().getName());
//    }

    @Around("execution(* com.example.DependencyInjectionSample.chapter03.used.*Greet.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
//        分かりやすいように表示
        System.out.println("===== Around Advice =====");
        System.out.println("▼▼▼処理前▼▼▼");
//        指定したクラスの指定したメソッドを実行
        Object result = joinPoint.proceed();
        System.out.println("▲▲▲処理後▲▲▲");
//        戻り値を返す必要がある場合はObject型の戻り値で値を返す
        return result;
    }
}
