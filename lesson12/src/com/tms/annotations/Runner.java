package com.tms.annotations;

import com.tms.annotations.ann.Profileable;
import com.tms.annotations.service.AnnotationDemoService;

import java.lang.reflect.Method;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) throws Exception {
        AnnotationDemoService ads = new AnnotationDemoService();

        Class<AnnotationDemoService> clazz = AnnotationDemoService.class;

//        inspectService(String.class);
        inspectService(clazz);
    }

    public static void inspectService(Class clazz) throws Exception {
        // 1. Если есть наша аннотация над классом - продолжаем анализ класса
        // 2. Если над методом есть наша аннотация и execute == true - вызываем наш метод и профилируем его
        // 3. Если аанотации нет - пропускаем

        /*
        * 1. Берем объект класса
        * 2. проверяем наличие аннотации
        * 2.1 Если аннотация есть:
        *   2.1.1 Берем все методы класса
        *   2.1.2 Проходим по очереди по каждому методу и делаем следующее:
        *       2.1.2.1
        * 2.2. Если аннотации нет:
        *   2.2.1 Выходим из метода
        *
        * */

        boolean isAnnotated = clazz.isAnnotationPresent(Profileable.class);
        if (isAnnotated) {
            AnnotationDemoService adsObject = (AnnotationDemoService) clazz.newInstance();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                Profileable annotation = m.getAnnotation(Profileable.class);
                if (Objects.nonNull(annotation)) {
                    if (annotation.execute()) {
                        m.setAccessible(true);
                        long startTime = System.currentTimeMillis();
                        System.out.println(annotation.desc());
                        System.out.printf("[%s] started at: %s%n", m.getName(), startTime);
                        m.invoke(adsObject);
                        long finishTime = System.currentTimeMillis();
                        System.out.printf("[%s] finished at: %s%n", m.getName(), finishTime);
                        System.out.printf("Method [%s] proceeded. Elapsed time: %s%n", m.getName(), finishTime - startTime);
                    } else {
                        System.out.println("Profileable execute parameter is FALSE.");
                    }
                }
            }
        } else {
            System.out.printf("Class [ %s ] not annotated with `Profileable` annotation", clazz.getName());
        }

    }
}
