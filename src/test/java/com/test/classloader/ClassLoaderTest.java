package com.test.classloader;

import java.net.URL;

import org.junit.jupiter.api.Test;
// java 8
//import sun.misc.Launcher;

public class ClassLoaderTest {

    /**
     * 获取根类加载器所加载的核心类库
     */
    @Test
    public void testBootstrapClassLoader() {
//        for (URL url : Launcher.getBootstrapClassPath().getURLs()) {
//            System.out.println(url);
//        }
    }

    /**
     * 拓展类加载器
     */
    @Test
    public void testExtensionClassLoader() {
        System.out.println(System.getProperty("java.ext.dirs"));

        // print D:\Java\jdk8u212-b04\jre\lib\ext;...

        // 根据输出可以看出，Java本身的ext目录配置也在这个属性中，所以如果直接指定
        // 这个配置的值，会覆盖系统默认的配置。正确的做法是除了添加新的配置，还要添
        // 加默认配置
    }

    /**
     * 系统类加载器
     */
    @Test
    public void testClassLoader() {
        // jdk8 println sun.misc.Launcher$AppClassLoader@xxxx
        //jdk11 println jdk.internal.loader.ClassLoaders$AppClassLoader@xxxx
        System.out.println(this.getClass().getClassLoader());
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        // jdk8 println sun.misc.Launcher$AppClassLoader@xxxx
        //jdk11 println jdk.internal.loader.ClassLoaders$AppClassLoader@xxxx
        System.out.println(appClassLoader);
        ClassLoader extensionClassLoader = appClassLoader.getParent();
        // jdk8 println sun.misc.Launcher$ExtClassLoader@xxxx
        //jdk11 println jdk.internal.loader.ClassLoaders$PlatformClassLoader@xxxx
        System.out.println(extensionClassLoader);
        // jdk8 println null
        //jdk11 println null
        System.out.println(extensionClassLoader.getParent());
        System.out.println(Object.class.getClassLoader());
    }
}
