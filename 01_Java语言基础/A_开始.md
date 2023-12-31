## 了解Java的历史和发展

Java是一门由Sun Microsystems（后被Oracle收购）于1995年推出的高级编程语言，它是一种面向对象、跨平台的编程语言。以下是Java的历史和发展概述：

**1. 起源：**
Java的创始人是詹姆斯·高斯林（James Gosling），他在1991年开始设计这门语言，最初名为Oak，目标是用于家用电器等嵌入式系统的编程。然而，由于当时家用电器市场的不景气，Oak的前景并不乐观。

**2. 转型：**
随着万维网（World Wide Web）的崛起，Sun Microsystems意识到Oak在网络世界中的潜力，重新定位Oak，将其用于Web应用程序的开发。1995年，Sun发布了Oak的首个公开版本，后来改名为Java。

**3. "Write Once, Run Anywhere"（一次编写，到处运行）：**
Java最显著的特点之一是它的跨平台性。Java程序被编译成中间字节码（Bytecode），而不是直接编译成机器码，然后可以在任何支持Java虚拟机（JVM）的计算机上运行。这种设计使得Java程序具有很高的可移植性，也为Java赢得了"Write Once, Run Anywhere"的口号。

**4. Java的发展和流行：**

- 1996年：发布了Java 1.0版本，引起了广泛的关注和开发者的兴趣。
- 1998年：发布了Java 2（也称为J2SE，Java Standard Edition）版本，引入了许多新功能和改进。
- 2006年：Sun开源了Java的实现，并发布了OpenJDK项目。
- 2010年：Oracle收购了Sun Microsystems，成为Java的维护者。
- 2014年：发布了Java 8，引入了Java中的Lambda表达式、函数式接口等重要特性。
- 2017年：发布了Java 9，引入了模块化系统，使得Java平台更加灵活和可维护。
- 2018年：发布了Java 10和Java 11，其中Java 11成为长期支持版本（LTS）。
- 之后的版本：Java持续在不断发展，每半年发布一个小版本，每三年发布一个LTS版本。

**5. Java的应用领域：**
由于Java具有跨平台性、稳定性和安全性，它在许多领域得到广泛应用，包括但不限于：

- Web应用程序开发（Java Servlets，JavaServer Pages）
- 移动应用程序开发（Android应用开发）
- 企业级应用开发（Java EE，现在称为Jakarta EE）
- 大数据和云计算
- 嵌入式系统
- 游戏开发（使用Java的游戏库如LibGDX）

总体来说，Java是一门功能强大且具有广泛应用的编程语言，它在不同领域持续发展，为开发者提供了丰富的工具和框架来构建各种类型的应用程序。

## 安装Java开发工具（JDK，IDE）

网上自己搜索安装吧

## 简单的"Hello World"程序

```java
public class HelloWorld{  //类名
   //java程序的执行入口 ---- 主方法
  public static void main(String[] args){
      //将 HelloWorld 打印到控制台
   System.out.println("HelloWorld");
 } //方法结束
 } //类结束
```

- 单行注释 //
- 多行注释 /* */
- 文档注释：/** */

## java的执行过程

    1. 创建java语言编写的源文件。后缀名为.java的文件
    2. 通过javac命令对java文件进行编译
       - 在DOS窗口cmd中输入javac java源文件路径。
       - 编译阶段主要任务是检查java源程序是否符合java语法,合法就会生成字节码文件(.class)
    3. 通过java命令对生成的class文件进行运行   
       - 在DOS窗口cmd中输入java 类名。例如：运行A.class文件，java A，A就是类名。  
       - java.exe命令会启动java虚拟机（JVM）   
       - JVM会启动类加载器（ClassLoader）  
       - 类加载器回去硬盘上搜索所要运行的class文件，找到后将该字节码装载到JVM中  
       - JVM将该class文件解释为二进制数据给操作系统执行交互。