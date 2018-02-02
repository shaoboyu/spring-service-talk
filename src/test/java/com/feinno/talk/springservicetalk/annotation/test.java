package com.feinno.talk.springservicetalk.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by yushaobo on 18-2-2.
 */
@TestAnnotation(id = 1)
public class test {
    @FileID(id =6)
    int id;

    @MethodID(methodName = "ok")
    public void helloSpring(){
        System.out.println("helloSpring method");
    }


    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        //通过反射获取类级别注解
        boolean annotation = test.class.isAnnotationPresent(TestAnnotation.class);
        if (annotation){
            TestAnnotation annotation1 = test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id"+annotation1.id());
            System.out.println("msg"+annotation1.msg());
        }


        Field id = test.class.getDeclaredField("id");
        FileID annotation1 = id.getAnnotation(FileID.class);

        if (annotation1!=null) {
            System.out.println("变量注解" + annotation1.id());
        }

        Method helloSpring = test.class.getDeclaredMethod("helloSpring");
        MethodID annotation2 = helloSpring.getAnnotation(MethodID.class);
        if (annotation2!=null){
            annotation2.methodName();
            // 获取方法中的注解
            Annotation[] ans = helloSpring.getAnnotations();
            for( int i = 0;i < ans.length;i++) {
                System.out.println("获取注解的名字:"+ans[i].annotationType().getSimpleName());
            }
        }
    }
}
