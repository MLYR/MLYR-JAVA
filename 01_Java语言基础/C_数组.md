## 什么是数组？

- 数组是一个存储多个相同数据类型的一个固定长度的容器，是一个引用数据类型；
- 数组存储数据，其实就是开辟了一段连续的内存空间；

## 定义一维数组

- 声明数组

- - 数据类型+变量名[]
  - 数据类型[] +变量名

 

```java
int arr[];
int[] arr;
```

- 分配空间

- - 动态初始化

- - - 数据类型[] 数组名称 = new 数据类型[长度];

 

```java
int[] arr = new int[3];//动态创建一个int类型长度为3的数组
```

- - 静态初始化

- - - 数据类型[] 数组名称 = new 数据类型[]{值1，值2...};
    - 数据类型[] 数组名称 = {元素1，元素2...};  

 

```java
int[] arr = new int[]{1,2,3};//创建一个给定值的int型数组
int[] arr = {1,2,3};//静态初始化简写
```

- 赋值

- - 动态初始化，默认给数组赋值；
  - 静态初始化，必须在声明数组的同时给数组进行赋值，不可以分为两部进行；
    ![image-20201021220126420](https://mlyr.oss-cn-beijing.aliyuncs.com/img/image-20201021220126420.png)


```java
int[] arr = new int[5];
//循环给动态数组赋值
for (int i = 0; i < arr.length; i++) {
    arr[i] = i;
}
//打印数组
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
int[] arrs = {1,2,3,4,5,6};
arrs[0] = 100;//给静态数组的下标0的元素赋值，会覆盖掉原来的值
for (int i = 0; i < arrs.length; i++) {
    System.out.println(arrs[i]);
}
```

- 使用

```java
 System.out.println(arrs[1]);//输出arrs数组中下标为1的元素
 System.out.println(arrs);//输出arrs数组的首地址
```

## 数组的特点

1. 长度是确定的，数组一旦被创建，它的大小就是不可改变；
2. 存储的数据类型必须相同；
3. 数组存储的数据类型可以是任何数据类型，包括基本数据类型与引用数据类型；
4. 数组的元素在堆内存中进行分配，并且是连续的；
5. 数组的每个元素都有其对应的下标(索引)，从0开始；
6. 每一个数组都有一个length属性，数组.length的执行结果就是数组的长度；

## 定义二维数组

- 二维数组就是一维数组里面的元素也是一维数组；

![image-20201021220250779](https://mlyr.oss-cn-beijing.aliyuncs.com/img/image-20201021220250779.png)


- 动态初始化：声明空间和赋值分开进行；

```java
int[][] arr = new int[3][2];//声明一个有三个一维位数组，一维数组里面又有两个一维数组
System.out.println(arr);//打印二维数组的地址
System.out.println(arr[0]);//打印二维数组中第一个一维数组的地址
```

下面的方法只能再对二维数组中的一维数组进行空间分配，再对一维数组进行赋值；new关键字不能省略，不能进行直接大括号进行赋值；

```java
int[][] arr = new int[3][];//声明一个二维数组，每一个二维数组中没有分配空间
System.out.println(arr[0]);//没有分配空间的默认初始值为null
arr[0] = new int[3]; // 一维数组的开辟空间， 长度设置为3
arr[1] = new int[2]; // 一维数组的开辟空间， 长度设置为2
arr[2] = new int[1]; // 一维数组的开辟空间， 长度设置为1
```

- 静态初始化：声明和赋值同时进行；

```java
int[][] arr1 = new int[][] {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15},
    {0,22,56,4,5}
};
//声明一个二维数组，长度为4，其中一维数组的长度都不同
int[][] arr2 = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15}
}; //静态初始化简写
```

- 二维数组的使用

```java
int[][] arr = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15}
};
System.out.println(arr);//二维数组的地址--[[I@2a139a55(两个中括号代表二维数组)
System.out.println(arr[0]);//二维数组中第一个元素，一维数组的地址--[I@2a139a55(一个扩号代表一维数组)
System.out.println(arr[0][0]);//取出二维数组中第一个元素中的下标为0的元素---1
```

 

```java
int[][] arr = new int[3][];//声明一个二维数组，每一个二维数组中没有分配空间
System.out.println(arr[0]);//没有分配空间的默认初始值为null
System.out.println(arr[0][0]);//二维数组中的每个一维数组都没有开辟空间，输出的话会发生空指针异常NullPointerException
```

- 获取数组长度

```java
int[][] arr1 = new int[3][2];//创建一个二维数组
System.out.println(arr1.length);//3--二维数组的长度
System.out.println(arr1[0].length);//2--二维数组中第一个元素的长度
```

## 数组的反转

```
String[] arr = { "A", "B", "C", "D", "F", "E", "G", "H" };
System.out.println(Arrays.toString(arr));
//      for (int i = 0; i < arr.length/2; i++) {
//          String temp = arr[i];
//          arr[i] = arr[arr.length-i-1];
//          arr[arr.length-i-1] = temp;
//      }
for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {//i <= j
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
System.out.println(Arrays.toString(arr));
}
```

## 数组的冒泡排序

1. 比较相邻的元素。如果第一个比第二个大（升序），就交换他们两个。
2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
3. 针对所有的元素重复以上的步骤，除了最后一个。
4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较为止


