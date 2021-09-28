# W02

请先编译代码并运行`Scene.main()`，运行以下命令获得运行结果的可视化：

```bash
java -jar asciianimator.jar -f result.txt -l false -c true -fps 3
```

## 任务一
1. 用plantuml画出example的类图与Scene中main方法执行过程中的对象时序图；

   类图：  

   ![image](https://github.com/jwork-2021/jw02-hogwartsfailure66/blob/master/uml/0.png)

   时序图：  
   
   ![image](https://github.com/jwork-2021/jw02-hogwartsfailure66/blob/master/uml/1.png)
   
2. 尝试从面向对象编程角度理解`example`的设计理念，具体阐述这样写的好处与可改进之处（越详细越好）；

   好处：

   Linable和Sorter作为接口类，Gourd和BubbleSorter分别为两个接口类的实现类，表示葫芦娃的位置和具体的排序方法。使用接口方便对后续的实现类进行规范，比如任务二中增加QuickSorter进行排序，不管怎么实现，都可以通过调用sort()进行排序

   Geezer类中有静态对象theGeezer，保证只有唯一的一个爷爷，以及排序这个动作由爷爷调用方法对葫芦娃进行排序，符合现实

   可改进：

   Gourd可以写成普通的类，用枚举类的话，不方便实现后续数据量更大的场景，如任务2要求的256个

## 任务二

参考示例代码，设计自己的类型并完成“蛇精指挥256个小妖怪站成一队“的场景。要求：

1. 每个小妖怪具有一种独特的颜色；

2. 初始状态下小妖怪随机站成一队；

3. 实现至少两种排序算法，将小妖怪按其颜色值排序；

4. 如示例代码一样将排序过程可视化；

5. 在自己的`Readme.md`中画出相应类图，并添加可视化结果展示链接。

   ![image](https://github.com/jwork-2021/jw02-hogwartsfailure66/blob/master/uml/2.png)
   
   眼瞎没看到是要蛇精指挥妖怪...做的是爷爷指挥256个葫芦娃站成一队，不过都差不多...
   
   bubble sort: https://www.bilibili.com/video/BV1au411f7xe  
   quick sort: https://www.bilibili.com/video/BV1hL4y187uo  


## 任务三

将上一任务中自己写的代码，改为“蛇精指挥256个小妖怪站成一个16x16方阵“的场景。要求：

1. 对上一任务中代码的修改应尽量小；

2. 每个小妖怪具有一种独特的颜色；

3. 初始状态下小妖怪随机站成16x16方阵；

4. 实现至少两种排序算法，将小妖怪按其颜色值排序；

5. 如示例代码一样将排序过程可视化；

6. 在自己的`Readme.md`中画出相应类图，并添加可视化结果展示链接。

   ![image](https://github.com/jwork-2021/jw02-hogwartsfailure66/blob/master/uml/3.png)

   添加一个Matrix类继承Line，修改toString方法，每16个换行即可

   bubble sort: https://www.bilibili.com/video/BV1cP4y1a788/  

   quick sort: https://www.bilibili.com/video/BV1QL4y187ir/  

