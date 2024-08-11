## Java考点



### 1.基本数据类型

- 数值型

  - 整型（byte，1字节。short，2字节。int，4字节。long，8字节。）

  - 浮点型（float，4字节。double，8字节。）      定义float变量时，变量的末尾要以f或F结尾

- 字符型（char，2字节）   只能声明单个字符或者转义字符或者ASCII码

- 布尔类（boolean）    true或false



### 2.Java标识符

1.定义：java对各种变量，方法，和类等要素命名时用到的字符序列称为标识符

2.规则：

- 由26个英文字母大小写，0-9 ，_或 $ 组成

- 数字不可以开头

- 不可以使用关键字和保留字，但能包含关键字(true,abstract等)和保留字(Java保留字是对Java编译器有特殊含义的字符串，如main，public等)

- Java中严格区分大小写，长度无限

- 标识符不能包含空格



### 3.数组

#### 数组的概述

1.数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个命名，并通过编号的方式对这些数据进行统一管理

2.数字相关的概念：

- 数组名

- 元素

- 角标，下标，索引

- 数组的长度：元素的个数

3.数组的特点：

- 数组是有序排列的

- 数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型

- 创建数组对象会在内存中开辟一整块连续的空间

- 数组的长度一但确定，就不能修改

4.数组的分类

- 按照维数，一维数组，二维数组...

- 按照数组元素的类型，基本数据类型元素的数组，引用数据类型的数组 

##### 一维数组

- 一维数组的声明和初始化

> int [] arr = new int []{1,2,3,4} ;   初始化和赋值同时进行
>
> int [] arr = new int [4] ;   先初始化后赋值

- 如何调用数组的指定位置的元素

> arr[0] ;

- 如何获取数组的长度

> arr.length ;

- 如何遍历数组

> for(int i = 0;i<arr.length;i++)
>
> System.out.println(arr[i]) ;

- 数组元素的默认初始值

  - 整型：0

  - 浮点型：0.0

  - char型：0并非'0'

  - 布尔型：false

  - 引用数据类型：null

  - String：null

  特例：当调用char数组的地址值时(如arr)，输出的不是地址而是所有遍历的数组值

  >     char [] arr1 = new char[]{'a','b','c'};
  >     System.out.println(arr1);   //abc

- 数组的内存解析

##### 二维数组

1.可以看做一维数组array1又作为另一个一维数组array2的元素出现

从数组底层的运行机制来开，其实没有多维数组

2.二维数组的使用

- 二维数组的声明和初始化

> 1.二维数组的声明和初始化
>
> int [] arr = new int [] {1,2,3} ;

> int [] [] arr1 = new int [] [] {{1,2,3},{4,5},{6,7,8}} ;
>
> 2.动态初始化1
>
> String [] [] arr3 = new String [3] [2];
>
> 动态初始化2
>
> int [] [] arr4 = new int [3] [] ;

- 如何调用数组的指定位置的元素

> arr1 [0] [0] ;

- 如何获取数组的长度

> arr1.length     //3
>
> arr1[1].lemgth   //2

- 如何遍历数组

>     for(int i=0;i<arr1.length;i++){
>
>         for(int j=0;j<arr1[i].length;j++){
>         
>              System.out.println(arr1[i][j]);
>         
>           }
>
>      }

- 数组元素的默认初始化值

> 针对于初始化方式一：比如int [][] arr = new int [4][3];
>
> int [][] arr = new int [4][3] ;
>
> 外层元素的初始化值为：地址值
>
> 内层元素的初始化值为：与一维数组初始化情况相同

> 针对于初始化方拾二：比如int [][] arr = new int [4][] ;
>
> 外层元素的初始化值为：null
>
> 内层元素的初始化值为：不能调用，否则报错

- 数组的内存解析



### 4. 字符串常用函数

常用方法

- int length()：返回字符串的长度： return value.length

- char charAt(int index)： 返回某索引处的字符 return value[index]

- boolean isEmpty()：判断是否是空字符串：return value.length == 0

- String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写

- String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写

- String trim()：返回字符串的副本，忽略前导空白和尾部空白

- boolean equals(Object obj)：比较字符串的内容是否相同

- boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写

- String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”

- int compareTo(String anotherString)：比较两个字符串的大小

- String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串

- String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串

>     public class StringMethodTest {
>         public static void main(String[] args) {
>             String s1 = "hello world";
>             System.out.println(s1.length()); //11
>             System.out.println(s1.charAt(9)); //l
>             System.out.println(s1.isEmpty()); //false
>             System.out.println(s1.toUpperCase());
>          //HELLO WORLD
>             System.out.println(s1.toLowerCase()); 
>          //hello world
>             String s2 = "   hello world";
>             System.out.println(s2.trim()); //hello world
>             String s3 = "HELLO WORLD";
>             System.out.println(s1.equalsIgnoreCase(s3));                    //true
>             System.out.println(s1.concat("1")); 
>     //hello world1
>             String s4 = "abc";
>             String s5 = "abe";
>             System.out.println(s5.compareTo(s4)); //2
>             System.out.println(s1.substring(2)); 
>     //llo world
>             System.out.println(s1.substring(2,5)); //llo
>         }
>     }

- boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束

- boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始

- boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始

- boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true

- int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引

- int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始

- int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引

- int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索

- indexOf和lastIndexOf方法如果未找到都是返回-1

  >     public class StringMethodTest2 {
  >         public static void main(String[] args) {
  >             String str1 = "hello world";
  >             System.out.println(str1.endsWith("ld")); //true
  >             System.out.println(str1.startsWith("h")); //true
  >             System.out.println(str1.startsWith("ll",2));
  >             //从2开始是不是以ll开头
  >             System.out.println(str1.contains("wo")); //true
  >             System.out.println(str1.indexOf("lo")); //3
  >             System.out.println(str1.indexOf("lo",5)); //-1
  >             //从5开始找
  >             System.out.println(str1.lastIndexOf("l")); //9
  >             System.out.println(str1.lastIndexOf("o",9)); //7
  >
  >         }
  >
  >     }

- String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的

- String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串

- String replaceAll(String regex, String replacement) ： 使 用 给 定 的replacement 替换此字符串所有匹配给定的正则表达式的子字符串

- String replaceFirst(String regex, String replacement) ： 使 用 给 定 的replacement 替换此字符串匹配给定的正则表达式的第一个子字符串

- boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式

- String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串

- String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中

  >     public class StringMethodTest3 {
  >         public static void main(String[] args) {
  >             String str1 = "北京尚硅谷教育北京";
  >             System.out.println(str1.replace("北","东"));
  >             //东京尚硅谷教育东京
  >             System.out.println
  >          (str1.replace("北京","上海"));
  >             //上海尚硅谷教育上海
  >             String str = "12hello34world5java7891mysql456";
  >             //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
  >             String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
  >             System.out.println(string);
  >             String s1 = "12345";
  >     //判断str字符串中是否全部有数字组成，即有1-n个数字组成
  >             boolean matches = str.matches("\\d+");
  >             System.out.println(matches);
  >             String tel = "0571-4534289";
  >     //判断这是否是一个杭州的固定电话
  >             boolean result = tel.matches("0571-\\d{7,8}");
  >             System.out.println(result);
  >             String s2 = "hello|world|java";
  >             String[] strs = str.split("\\|");
  >             for (int i = 0; i < strs.length; i++) {
  >                 System.out.println(strs[i]);
  >             }
  >             System.out.println();
  >             String str2 = "hello.world.java";
  >             String[] strs2 = str2.split("\\.");
  >             for (int i = 0; i < strs2.length; i++) {
  >                 System.out.println(strs2[i]);
  >             }
  >
  >
  >         }
  >
  >     }



### 5.类及成员的访问修饰符

对于类来说，只有public和默认（包级别）两种访问修饰符可用。类不能被声明为private或protected。

- public类：可以被任何其他类访问。
- 默认（包级别）类：只能被同一个包内的其他类访问。

对于类的成员（包括字段、方法和内部类）来说，可以使用上述所有四种访问修饰符。

- private成员：只能被其所在类的方法访问。
- 默认（包级别）成员：可以被同一个包内的其他类访问。
- protected成员：可以被同一个包内的其他类以及该类的子类访问。
- public成员：可以被任何其他类访问。



### 6.构造函数

1.构造器的作用：创建对象

2.说明

- 如果没有显式定义类的构造器的话，则系统默认提供一个空参的构造器

>     public class Main {
>
>         public static void main(String[] args) {
>             //创建类的对象：new+构造器
>             person p =new person();
>             p.study();
>         }
>
>     }
>
>     class person
>     {
>         String name;
>         int age;
>         public void study()
>         {
>             System.out.println("学习");
>         }
>
>     }

- 定义构造器的格式：权限修饰符+类名（形参列表）{}

>     public class Main {
>
>         public static void main(String[] args) {
>             //创建类的对象：new+构造器
>             person p =new person();   /// 666
>             p.study();
>                                                                                                                                                                                                     }
>
>     }
>
>     class person
>     {
>         //属性
>         String name;
>         int age;
>         //构造器
>         public person()
>         {
>             System.out.println("666");
>         }
>         //方法
>         public void study()
>         {
>             System.out.println("学习");
>         }
>
>     }

- 一个类中定义的多个构造器，彼此构成重载

- 一但显式的定义了类的构造器之后，系统就不再提供默认的空参构造器

- 一个类中，至少有一个构造器

3.super调用构造器

- 我们可以在子类的构造器中显式的使用“super（形参列表）”的方式，调用父类
  中声明的指定的构造器

- “super（形参列表）”的使用，必须声明在子类构造器的首行

- 我们在类的构造器中，针对于“super（形参列表）”或“this（形参列表）”
  只能二选一，不能同时存在（因为都需要在首行）

- 在构造器的首行，没有显式的声明“super（形参列表）”或“this（形参列表）”
  则默认调用的是父类中空参的构造器

- 在子类的多个构造器中，至少有一个类的构造器中使用了“super（形参列表）”
  调用了父类的构造器



### 7.static 关键字

1.static：静态的(在类内声明)

2.static可以用来修饰：属性，方法，代码块，内部类

3.使用static修饰属性：静态变量(类变量)

- 属性：按是否使用static修饰，又分为：静态属性和非静态属性(实例变量)

  - 实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的
    非静态属性，当修改其中一个对象中的非静态属性时，不会导致其他对象
    中同样的属性值的修改

  - 静态变量：我们创建了类的多个对象，多个对象共享一个静态变量，当通过
    一个对象修改静态变量时，会导致其他对象调用此静态变量时也会随之改变

  >     public class test1 {
  >         public void test2()
  >         {
  >              chinese c1 = new chinese();
  >              c1.name = "姚明";
  >              c1.age=40;
  >              chinese c2 = new chinese();
  >              c2.name = "马龙";
  >              c2.age = 30;
  >              c1.nation = "中国";
  >              System.out.println(c2.nation);   //中国
  >             c2.nation = "China";
  >             System.out.println(c1.nation);   //China
  >         }
  >
  >     }
  >
  >     class chinese
  >     {
  >         String name;
  >         int age;
  >         static String nation;
  >     }

- static修饰属性的其他说明

  - 静态变量随着类的加载而加载

  - 静态变量的加载早于对象的创建

  >     chinese.nation = "中国";   //不报错，nation在chinese之前加载

  - 由于类只会加载一次，则静态变量在内存中也只会存在一份,存在方法区的静态域

  - 类和对象可以调用类变量。类不能调用实例变量，对象可以调用实例对象

- 静态属性举例：System.out，Math.PI

4.使用static修饰方法(静态方法)

- 随着类的加载而加载，可以通过直接“类.静态方法”的方式进行调用

>     public class test1 {1
>         public void test2()
>         {
>              chinese.show();  //我是老六
>         }
>     }
>
>     class chinese
>     {
>         String name;
>         int age;
>         static String nation;
>         public static void show()
>         {
>             System.out.println("我是老六");
>         }
>     }

- 静态方法中，只能调用静态的方法或属性
  非静态方法中，既可以调用非静态的属性和方法，也可以调用静态的属性和方法

- 在静态的方法中，不能使用this关键字，super关键字



### 8.final关键字

1.final可以用来修饰的结构：类，变量，方法

2.final用来修饰一个类：此类不能被其他类继承

   如String类，System类，StringBuffer类都不能被其他类继承

3.final用来修饰方法：方法不可以被子类重写

   如Object类中的getClass方法

4.final用来修饰变量：此时的"变量"称为是一个常量

- final修饰属性：可以考虑赋值的位置有：显式初始化，代码块和构造器中的初始化

>     public class bankTest {
>         public static void main(String[] args)
>         {
>             final int b=10;
>             //   b=20;  报错，用final修饰后a变成了常量
>
>         }
>         final int a;
>         final int c;
>         {
>             a=20;
>         }
>         public bankTest()
>         {
>             c=30;
>         }
>
>     }

- final修饰局部变量

>     public class bankTest {
>         public static void main(String[] args)
>         {
>
>         }
>          public void show(final int num)   //只能调用的时候赋值，不能在方法内赋值
>         {
>         
>         }
>         public void show()
>         {
>             final int a=20;
>         }
>
>     }

static final 用来修饰属性，全局常量，方法



### 9.类和抽象类

#### abstract关键字

abstract关键字的使用

1.abstract：抽象的

2.abstract可以用来修饰结构：类，方法

3.abstract修饰类

- 此类不能实例化

- 抽象类中一定有构造器(联想子类对象实例化的全过程)

- 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作

4.abstract修饰方法

- 只有方法的声明，没有方法体

- 包含抽象方法的类，一定是一个抽象类。一个抽象类不一定有抽象方法

- 若子类重写了父类中的抽象方法后，此子类方可实例化
  若子类没有重写父类的所有抽象方法，则此子类也为抽象类，需要用abstract修饰

>     public class bankTest {
>         public static void main(String[] args)
>         {
>             //   person p1 = new person();  错误，类前加abstract无法实例化对象
>             //   p1.eat();
>         }
>
>     }
>
>     abstract class person {
>         String name;
>         int age;
>
>         public void eat() {
>             System.out.println("吃饭");
>         }
>         
>         public void walk() {
>             System.out.println("走路");
>         }
>         
>         public person() {
>         
>         }
>         
>         public person(String name, int age) {
>             this.name = name;
>             this.age = age;
>         }
>         public abstract void eat1();    //抽象方法
>
>     }
>
>     class person1 extends person
>     {
>         public person1()
>         {
>             super();      //说明抽象类有构造器
>         }
>
>         @Override
>         public void eat1() {          //重写父类抽象类方法后，不再报错
>             super.eat();
>         }
>
>     }

5.abstract注意点

- abstract不能用来修饰：属性，构造器等结构

- abstract不能用来修饰私有方法，静态方法(重写不能是静态方法)，final方法，final类

6.抽象类的匿名对象

>     person p = new person()    //为抽象类的子类对象，不是父类
>     {
>         方法体中重写父类的抽象方法
>     }

#### 类的定义和对象创建

##### 成员（属性）

1.常见的类成员

- 属性：Field = 属性 = 成员变量

- 行为：Method = (成员)方法 = 函数

2.面向对象的使用

- 创建类，设计类的成员

>     class person
>
>     {
>
>     String name;int age;boolean isMale;
>
>     public void eat()
>     { 
>        System.out.println("人可以吃饭");
>     }
>     public void talk()
>     { 
>        System.out.println("人可以说话");
>     }
>
>     }

- 创建类的对象

> person p1 = new person ();

- 匿名对象

理解：我们创建的对象，没有显式的赋给一个变量名

特征：匿名对象只能调用一次，再调用和原来的匿名对象独立

> new person().eat();
>
> new person().eat();

- 通过"对象.属性"调用对象的结构

> p1.name;
>
> p1.eat();

3.如果创建了一个类的多个对象，每个对象都独立的拥有一套类的属性(非static的)

如果我们修改了一个对象的属性，则不影响其他对象的属性值

4.赋值操作

> person p3 = new p3();
>
> p3 = p1;
>
> 则p1.age = p3.age ;

将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体

---

##### 局部变量vs成员变量

1.相同点

- 定义变量的格式：数据类型 + 变量名 = 变量值

- 先声明，后使用

- 变量都有其对应的作用域

2.不同点

- 在类中声明的位置不同

成员变量直接在类内声明，局部变量在类内的函数等内声明

- 权限修饰符不同

成员变量在声明属性时可以指明其权限

java规定的四种权限修饰符：private，public，缺省，protected

局部变量不可以使用权限修饰符

- 默认初始化的情况
  属性：类的属性，根据其类型，都有默认初始值

- 整型（byte，short，int，long） ：0

- 浮点型（float，double） ：0.0

- 字符型（char） ：0 或 '\u0000'

- 布尔型（boolean） ：false

- 引用数据类型  : null

- 局部变量需要初始化值

>     public class java {
>         public static void main(String[] args) {
>             int a ;
>             //   System.out.println(a);   报错，a没有初始化值
>         }
>     }

- 在内存中加载的位置

属性：加载到堆空间（非static）

局部变量：加载到栈空间

##### 方法（函数）

1.方法的声明：权限修饰符+返回值类型+方法名（形参列表）{}

> public String sleep (int hour) {}



### 10.继承与多态

#### 继承

面向对象的特征之二：继承性

1.继承性的好处

- 减少了代码的冗余，提高了代码的复用性

- 便于功能的扩展

- 为多态的使用提供了前提

2.继承性的格式：用法: class A extends B{}

- A：子类，派生类：subclass

- B：父类，超类，基类：superclass

- 体现：一但子类A继承父类B以后，子类A中就获取了父类B的结构：属性。方法
  特别的，父类中声明为private的属性或方法，子类继承父类以后，
  仍然认为获取了父类中私有的结构，封装性的影响使子类不能直接调用私有属性

- 子类继承父类以后，还可以声明自己特有的属性和方法，实现功能的扩展

3.Java对继承性的规定:

- 一个父类可以被多个子类继承

- 一个子类只能有一个父类

- 子父类是相对的概念

- 子类直接继承的父类，称为直接父类。间接继承的父类称为：间接父类

- 子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法

4.

- 如果我们没有显式的声明一个类的父类的话，这个类就继承于java.lang.Object类

- 所有的java类（除java.lang.Object类外）都直接或间接的继承于java.lang.Object类

- 意味着，所有的java类具有java.lang.Object类声明的功能

##### 方法的重写

1.重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作

2.重写以后，当创建子类对象以后，通过子类对象调用父类中的同名同参的方法时

实际执行的是子类重写父类的方法

3.重写的规定：

- 方法的声明：权限修饰符 返回值类型 方法名（形参列表）{}

- 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同

- 子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符

- 特殊的，子类不能重写父类中声明为private权限的方法

- 返回值类型

  - 父类被重写方法的返回值类型是void，则子类重写方法的返回值类型也要是void

  - 父类被重写的方法的返回值类型是A类型，则子类重写方法的返回值类型
    可以是A类，也可以是A类的子类（如A是Object，则子类可以是String）
    注意以上两类为引用数据类型

  - 父类被重写的方法的返回值是基本数据类型，则子类重写方法的返回值类型
    必须是相同的基本数据类型

  - 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型

  - 子类和父类中同名同参数的方法要么都声明为非static的（考虑重写）
    要么都声明为static的（不是重写）

  4.区分方法的重载和重写

##### super关键字

1.super理解为：父类

2.super可以用来调用：属性，方法，构造器

3.super的使用

- 当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性或方法，我们可以在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，表明调用的是父类中的属性或方法



### 11.重写和向上转型

面向对象特征之三：多态性

1.理解多态性：可以理解为一个事物的多种形态

2.何为多态性

   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）

3.多态的使用：虚拟方法调用

   有了对象的多态性以后，我们在编译时只能调用父类中声明的方法，但在

   运行时，实际执行的是子类重写父类的方法

4.多态性的使用前提：

- 要有类的继承关系

- 要有方法的重写

>     public class personTest {
>         public static void main(String[] args)
>         {
>             person p1 =new person();
>             p1.eat(); //多吃
>             man man1 = new man();
>             man1.eat();  //吃肉
>             man1.age=2;
>             //对象的多态性:父类的引用指向子类的对象
>             person p2 =new man();
>             person p3 = new woman();
>             //多态的使用:当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法（虚拟方法调用）
>             p2.eat();   //吃肉
>             //  p2.earnMoney();   错误,只能调用重写方法
>         }
>     }
>
>      class person {
>         String name;
>         int age;
>         int id=1001;
>         public void eat()
>         {
>             System.out.println("多吃");
>         }
>     }
>
>      class woman extends person{
>         boolean isBeauty;
>         public void goShopping()
>         {
>             System.out.println("购物");
>         }
>         public void eat()
>         {
>             System.out.println("少吃");
>         }
>     }
>      class man extends person{ 
>         boolean isSmoking;
>         int id=1002;
>         public void earnMoney()
>         {
>             System.out.println("赚钱");
>         }
>         public void eat()
>         {
>             System.out.println("吃肉");
>         }
>
>     }

5.对象的多态性：只适用于方法，不适用于属性

>     public class animalTest {
>         public static void main(String[] args)
>         {
>             animalTest test = new animalTest();
>             test.func(new dog());  //狗吃饭，狗叫
>             test.func(new cat());  //猫吃饭，猫叫
>         }
>         public void func(animal animal1)
>         {
>             animal1.eat();
>             animal1.shout();
>             System.out.println(animal1.id);  //1001
>         }
>
>     }
>
>     class animal
>     {
>         int id=1001;
>         public void eat()
>         {
>             System.out.println("动物吃饭");
>         }
>         public void shout()
>         {
>             System.out.println("动物叫");
>         }
>     }
>
>     class dog extends animal
>     {
>         int id=1002;
>         public void eat()
>         {
>             System.out.println("狗吃饭");
>         }
>         public void shout()
>         {
>             System.out.println("狗叫");
>         }
>
>     }
>
>     class cat extends animal
>     {
>         public void eat()
>         {
>             System.out.println("猫吃饭");
>         }
>         public void shout()
>         {
>             System.out.println("猫叫");
>         }
>
>     }

6.多态性是运行时行为

   子类中定义了与父类同名同参数的方法，在多态情况下，将此时父类的方法称为

   虚拟方法，父类根据赋给它的不同子类对象，动态调用属于子类的该方法。这样

   的方法调用在编译时是无法确定的

#### instanceof操作符

>     public class animalTest {
>         public static void main(String[] args)
>         {
>             animal animal2 = new cat();
>             animal2.eat();
>             //   animal2.run();    错误
>             //不能引用父类调用子类对象中父类没有的方法（不是重写的方法）
>             //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法
>             //但是由于变量声明为父类类型，导致编译时只能调用父类中的属性和方法
>
>             //如何调用子类特有的属性和方法
>             cat cat1 = new cat();
>             cat1.run();
>             //使用强制类型转换符(向下转型)
>             cat cat2 = (cat)animal2;
>             cat2.run();
>             //使用强转时。可能出现异常，于是我们引入instanceof
>             //a instanceof A:
>
>       //判断对象a是否是类A的实例，如果是，返回true，如果不是，返回false
>             if(animal2 instanceof cat)
>             {
>                 cat cat3 = (cat)animal2;
>                 cat3.run();
>             }
>
>             //问题1    成功，cat向上转换Object，Object强转为animal
>             Object obj = new cat();
>             animal a1 = (animal)obj;   //理解为obj为所有子类的对象
>         }
>
>     }
>
>     class animal
>     {
>         public void eat()
>         {
>             System.out.println("动物吃饭");
>         }
>         public void shout()
>         {
>             System.out.println("动物叫");
>         }
>     }
>
>     class cat extends animal
>     {
>         public void eat()
>         {
>             System.out.println("猫吃饭");
>             super.eat();
>         }
>         public void shout()
>         {
>             System.out.println("猫叫");
>         }
>         public void run()
>         {
>             System.out.println("跑");
>         }
>
>     }



### 12.接口

1.接口使用interface来定义

2.java语言中，接口和类是并列的两个结构

3.如何定义接口：定义接口的成员

- Jdk7及之前，只能定义全局常量和抽象方法

  - 全局常量：public static final的(可以省略，默认为public static final)

  - 抽象方法：public abstract的(可以省略，默认为public abstract)

- Jdk8：除定义全局常量和抽象方法之外，还可以定义静态方法(static)，默认方法(default)

  - 接口中定义的静态方法，只能通过接口来调用

  - 通过实现类的对象，可以调用接口中的默认方法

  - 如果实现类重写了接口的默认方法，调用时，仍然调用的是重写以后的方法

  - 如果子类继承的父类和实现的接口中声明了同名同参数的方法，则子类在没有
    重写此方法的情况下，默认下调用父类中同名同参数的方法

  - 如果实现类实现了多个接口，而多个接口定义了同名同参数的默认方法
    那么在实现类没有重写此方法的情况下，会报错(接口冲突)

  - 实现类重写了接口的默认方法后，再想调用接口的默认方法
    则为接口名.super.方法名(接口.方法名为调用静态方法的方式)

4.接口中不能定义构造器，不能实例化

5.java开发中，接口通过类去实现的方式来使用

   如果实现类覆盖了接口中所有抽象方法，则此实现(implements)类可以实例化

   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类

6.java类可以实现多个接口，弥补了java单继承的缺陷

   格式：class AA extends BB implements cc，dd......

7.接口与接口之间可以继承，可以多继承

>     public class test {
>         public static void main(String[] args)
>         {
>             System.out.println(flyable.max);
>             bullet b1 = new bullet();
>             b1.fly();
>             b1.attack();
>
>             }
>         }
>
>     interface attack
>     {
>         void attack();
>
>     }
>     interface flyable extends attack
>     {
>         //全局常量
>         public static final  int max = 7900;
>
>         //抽象方法
>          public abstract void fly();
>
>     }
>
>     class bullet implements flyable   //flyable包含了接口attack
>     {
>         public void fly()
>         {
>             System.out.println("会飞");
>         }
>         public void attack()
>         {
>             System.out.println("攻击");
>         }
>     }

8.接口实现类的匿名/非匿名类的匿名/非匿名对象

>     public class usbTest
>     {
>         public static void main(String[] args)
>         {
>
>     //接口的使用也满足多态性
>             computer com = new computer();
>             //1.创建了接口的非匿名实现类的非匿名对象
>             flash f1 = new flash();
>             com.test(f1);
>             //2.创建接口的非匿名实现类的匿名对象
>             com.test(new printer());
>             //3.创建接口的匿名实现类的非匿名对象
>             USB phone = new USB()
>             {
>                 @Override
>                 public void start() {
>                     System.out.println("手机开启动作");
>                 }
>                 @Override
>                 public void stop() {
>                     System.out.println("手机停止工作");
>                 }
>             };  //注意有分号
>             com.test(phone);
>             //4.创建了接口的匿名实现类的匿名对象.03
>             com.test(new USB()
>             {
>                 @Override
>                 public void start() {
>                 System.out.println("mp3开启动作");
>             }
>                 @Override
>                 public void stop() {
>                 System.out.println("mp3停止工作");
>             }
>             });
>
>         }
>
>     }
>
>     class computer
>     {
>         public void test(USB usb)
>         {
>             usb.start();
>             System.out.println("具体传输数据的细节");
>             usb.stop();
>         }
>     }
>
>     interface USB
>     {
>         void start();
>         void stop();
>     }
>
>     class flash implements USB
>     {
>         @Override
>         public void start() {
>             System.out.println("U盘开启动作");
>         }
>         @Override
>         public void stop() {
>             System.out.println("U盘停止工作");
>         }
>     }
>
>     class printer implements USB
>     {
>         @Override
>         public void start() {
>             System.out.println("打印机开启动作");
>         }
>         @Override
>         public void stop() {
>             System.out.println("打印机停止工作");
>         }
>     }

9.如何在子类的方法中调用父类，接口中被重写的方法

>     public void myMethod()
>     {
>         method();  //自己重写的方法
>         super.method();   //调用的是父类中声明的
>         compareA.super.method();  //调用接口中的默认方法
>
>     }



### 13.集合

1.集合框架的概述

集合，数组都是对多个数据进行存储操作的结构，简称Java容器

此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储                                                                                                   

2.数组在存储多个数据方面的特点

- 特点

  - 一但初始化后，其长度就确定了

  - 一但定义好，元素类型就确定了

    - 比如String[] arr ; int[] arr
- 缺点

  - 一但初始化后，长度不可修改

  - 数组中提供的方法非常有限，对于添加，删除，插入数据等操作非常不便
    同时效率不高

  - 获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用

  - 数组存储数据的特点：有序，可重复。对于无序，不能重复的需求，数组
    不能满足

#### List接口

1.存储有序的，可重复的数据，"动态"数组

- ArrayList

  - jdk7源码分析
    作为List接口的主要实现类，线程不安全，效率高，底层使用Object[]数组
    底层创建了长度是10的Object[]数组elementData。如果添加数据时导致
    底层elementData数组容量不够，则扩容。默认情况下扩容为容量的1.5倍
    同时需要将原有的数据复制到新的数组中
    建议：开发中使用带参构造器：ArrayList list = new ArrayList(int capacity);

  - jdk8源码分析
    调用无参构造器时，底层Object[] elementData初始化为{}，并没有
    创建长度为10的数组。当第一次调用add()时，底层才创建了长度10的
    数组，并将数据添加到element数组中，后续的添加和扩容操作与jdk7无异

常用方法

- void add(int index,Object ele):在index位置插入ele元素

- boolean addAll(int index,Collection eles)：从index位置开始将
  eles中的所有元素添加进来

- Object get(int index)：获取指定index位置的元素

- int indexOf(Object obj)：返回obj在集合中首次出现的位置，如果
  不存在，返回-1

- int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置

- Object remove(int index)：移除指定index位置的元素，并返回此元素

- Object set(int index,Object ele)：设置指定index位置的元素为ele

- list subList(int fromIndex,int toIndex)：返回从fromIndex到
  toIndex位置的子集合(左闭右开)

>     import java.util.ArrayList;
>     import java.util.Arrays;
>     import java.util.Iterator;
>     import java.util.List;
>
>     public class ListTest {
>         @Test
>         public void test01() {
>             ArrayList list = new ArrayList();
>             list.add(123);
>             list.add("AA");
>             list.add(false);
>             list.add(123);
>             System.out.println(list);
>
>
>             list.add(1, "BB");
>
>     System.out.println(list); //[123, BB, AA, false, 123]
>
>             List i1 = Arrays.asList(1, 2, 3);
>             list.addAll(i1);
>             System.out.println(list.size()); //8
>         
>             System.out.println(list.get(0)); //123
>         }
>         @Test
>         public void test02(){
>             ArrayList list = new ArrayList();
>             list.add(123);
>             list.add("AA");
>             list.add(false);
>             list.add(123);
>             int index = list.indexOf(123);
>             System.out.println(index); //0
>             int index1 = list.lastIndexOf(123);
>             System.out.println(index1); //3
>         
>             Object r1 = list.remove(0);
>             System.out.println(r1); //123
>         
>             list.set(1,"CC");
>             System.out.println(list); //[AA, CC, 123]
>
>        System.out.println(list.subList(0, 2)); //[AA, CC]
>
>     ```java
>     }
>     
>     @Test
>     public void test03(){
>         ArrayList list = new ArrayList();
>         list.add(123);
>         list.add("AA");
>         list.add(false);
>         list.add(123);
>         //遍历
>         //方式一
>         Iterator i1 = list.iterator();
>         while(i1.hasNext()){
>             System.out.println(i1.next());
>         }
>         //方式二
>         for(Object obj:list){
>             System.out.println(obj);
>         }
>         //方式三
>         for(int i=0;i<list.size();i++){
>             System.out.println(list.get(i));
>         }
>     
>     }
>     ```
>
>     }

#### Set接口

1.存储无序的，不可重复的数据，类似高中讲的集合

无序性：不等于随机性,存储的数据在底层数组中并非按照数组索引的位置

进行添加，而是根据数据的哈希值进行添加

不可重复性：保证添加的元素按照equals()方法判断时，不能返回true

相同的元素只能添加一个

我们向HashSet中添加元素a，首先调用元素a所在类的hashSet()方法，计算

a的哈希值，此哈希值接着通过某种算法算出在HashSet底层数组的存储位置，

判断数组此位置是否已经有元素

   如果此位置上没有元素，a添加成功

   如果此位置上有其他元素，先比hash值，如果不同，以链表的形式存放成功

   如果相同，调用equals方法，返回true，添加失败。返回false，以链表的形式

   添加成功。jdk7时，此情况为元素a放在数组中指向原来的元素。jdk8时，此

   情况为原来的元素放在数组中，指向元素a(a代替了原来元素的位置)

要求：向Set中添加的数据，其所在的类一定要重写hashCode()和equals()

两个重写的方法尽可能保证一致性

- TreeSet：可以按照添加对象的指定属性进行排序(对象要求是同一个类的对象)
  若一个对象的两个或多个属性比较，需要用到java比较器

- 自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals方法

>     import org.testng.annotations.Test;
>
>     import java.util.Iterator;
>     import java.util.TreeSet;
>
>     public class TreeSetTest {
>         @Test
>         public void test01(){
>             TreeSet t1 = new TreeSet();
>             t1.add(34);
>             t1.add(-34);
>             t1.add(43);
>             t1.add(11);
>             t1.add(8);
>             Iterator i1 = t1.iterator();
>             while(i1.hasNext()){
>                 System.out.println(i1.next());
>             }  //从小到大排序
>         }
>         @Test
>         public void test02(){
>             TreeSet t1 = new TreeSet();
>             t1.add(new user(12,"Tom"));
>             t1.add(new user(32,"Jerry"));
>             t1.add(new user(2,"Jim"));
>             t1.add(new user(65,"Mike"));
>             t1.add(new user(33,"Jack"));
>             t1.add(new user(56,"Jack"));
>             Iterator i1 = t1.iterator();
>             while(i1.hasNext()){
>                 System.out.println(i1.next());
>             }
>
>         }
>
>     }
>
>     class user implements Comparable{
>         int age;
>         String name;
>         public user(int age,String name){
>             this.age=age;
>             this.name=name;
>         }
>         //按照姓名从小到大排序
>         public int compareTo(Object o){
>               if(o instanceof user){
>                   user u1 = (user)o;
>                   // return this.name.compareTo(u1.name);
>                   int compare = this.name.compareTo(u1.name);
>                   if(compare!=0){
>                       return compare;
>                   }else{
>                       return Integer.compare(this.age,u1.age);
>                   }
>               }
>             else{
>               throw new RuntimeException("输入的类型不匹配");
>               }
>         }
>
>         @Override
>         public String toString() {
>             return "user{" +
>                     "age=" + age +
>                     ", name='" + name + '\'' +
>                     '}';
>         }
>
>     }

- 定制排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals方法

>     import org.testng.annotations.Test;
>
>     import java.util.Comparator;
>     import java.util.Iterator;
>     import java.util.TreeSet;
>
>     public class TreeSetTest1 {
>         @Test
>         public void test01(){
>             Comparator com = new Comparator() {
>                 //按照年龄从小到大排列
>                 @Override
>               public int compare(Object o1, Object o2) {
>           if(o1 instanceof user1 && o2 instanceof user1){
>                user1 u1 = (user1)o1;
>                user1 u2 = (user1)o2;
>                return Integer.compare(u1.age,u2.age);
>         }else{
>            throw new RuntimeException("输入的数据类型不匹配");
>                     }
>                 }
>
>             };
>             TreeSet t1 = new TreeSet(com);
>             t1.add(new user1(12,"Tom"));
>             t1.add(new user1(32,"Jerry"));
>             t1.add(new user1(2,"Jim"));
>             t1.add(new user1(65,"Mike"));
>             t1.add(new user1(33,"Jack"));
>             t1.add(new user1(38,"Jack"));
>             t1.add(new user1(38,"Mary"));
>             Iterator i1 = t1.iterator();
>             while(i1.hasNext()){
>                 System.out.println(i1.next());
>             }
>         }
>
>     }
>
>     class user1 {
>         int age;
>         String name;
>         public user1(int age,String name){
>             this.age=age;
>             this.name=name;
>         }
>
>
>         @Override
>         public String toString() {
>             return "user{" +
>                     "age=" + age +
>                     ", name='" + name + '\'' +
>                     '}';
>         }
>
>     }

#### Map接口

双列集合，用来存储一对一对的数据，类似于函数(y对应x，映射)

- HashMap：作为Map的主要实现类，安全，效率高，可以存储null
  的key和value。Map中的key是无序，不可重复的，使用Set存储
  key所在的类要重写equals()和hashCode()
  Map中的value是无序，可重复的，使用Collection存储
  value所在的类要重写equals()
  一个键值对：key-value构成了一个Entry对象，也是无序，不可重复的
  使用Set存储所有的Entry

  >          mport org.testng.annotations.Test;
  >          import java.util.HashMap;
  >          import java.util.Map;
  >
  >          public class MapTest {
  >              @Test
  >              public void test01(){
  >                 Map m1 = new HashMap();
  >                  m1.put(null,null);
  >              }
  >          }

  - LinkedHashMap：保证在遍历map元素时，可以按照添加的
    顺序实现遍历
       原因：在原有的HashMap底层结构基础上，添加的一对指针
       指向前一个和后一个元素，对于频繁的遍历操作，此类执行
       效率高于HashMap

- Map中定义的方法
  添加、删除、修改操作：

  - Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中 

  - 

  - void putAll(Map m):将m中的所有key-value对存放到当前map中

  - Object remove(Object key)：移除指定key的key-value对，并返回value

  - void clear()：清空当前map中的所有数据

  >     import org.testng.annotations.Test;
  >     import java.util.HashMap;
  >     import java.util.Map;
  >
  >     public class MapTest {
  >         @Test
  >         public void test01(){
  >             Map m1 = new HashMap();
  >             m1.put("AA",123);
  >             m1.put("BB",123);
  >
  >             Map m2 = new HashMap();
  >             m2.put("CC",456);
  >             m2.put("DD",123);
  >             m1.putAll(m2);
  >             System.out.println(m1);
  >             //{AA=123, BB=123, CC=456, DD=123}
  >         
  >             Object v1 = m1.remove("CC");
  >             System.out.println(v1); //456
  >             Object v2 = m1.remove("CC");
  >             System.out.println(v2); //null
  >         
  >             m1.clear();
  >             System.out.println(m1.size()); //0
  >             System.out.println(m1); //{}
  >         
  >         }
  >
  >     }

  元素查询的操作：

  - Object get(Object key)：获取指定key对应的value

  - boolean containsKey(Object key)：是否包含指定的key

  - boolean containsValue(Object value)：是否包含指定的value

  - int size()：返回map中key-value对的个数

  - boolean isEmpty()：判断当前map是否为空

  - boolean equals(Object obj)：判断当前map和参数对象obj是否相等

  >     import org.testng.annotations.Test;
  >     import java.util.HashMap;
  >     import java.util.Map;
  >
  >     public class MapTest {
  >         @Test
  >         public void test01(){
  >             Map m1 = new HashMap();
  >             m1.put("AA",123);
  >             m1.put(45,123);
  >             m1.put("BB",123);
  >             System.out.println(m1.get(45)); //123
  >             System.out.println(m1.get(455)); //null
  >
  >             boolean b1 = m1.containsKey("BB");
  >             System.out.println(b1); //true
  >         
  >             boolean b2 = m1.containsValue(123);
  >             System.out.println(b2); //true
  >         
  >             System.out.println(m1.isEmpty()); //false
  >         
  >             Map m2 = new HashMap();
  >             m2.put("AA",123);
  >             m2.put("BB",123);
  >             m2.put(45,123);
  >             System.out.println(m2.equals(m1)); //true
  >         
  >         }
  >
  >     }

  元视图操作的方法：

  - Set keySet()：返回所有key构成的Set集合

  - Collection values()：返回所有value构成的Collection集合

  - Set entrySet()：返回所有key-value对构成的Set集合

  >     import org.testng.annotations.Test;
  >     import java.util.*;
  >
  >     public class MapTest {
  >         @Test
  >         public void test01(){
  >             Map m1 = new HashMap();
  >             m1.put("AA",123);
  >             m1.put(45,123);
  >             m1.put("BB",123);
  >             //遍历所有的key集
  >             Set s1 = m1.keySet();
  >             Iterator i1 = s1.iterator();
  >             while(i1.hasNext()){
  >                 System.out.println(i1.next());
  >             }
  >
  >             //遍历所有的value集
  >             Collection c1 = m1.values();
  >             for(Object o1:c1){
  >                 System.out.println(o1);
  >             }
  >         
  >             //遍历所有的key-value
  >             Set s2 = m1.entrySet();
  >             Iterator i2 = s2.iterator();
  >             while(i2.hasNext()){
  >                 Object o2 = i2.next();
  >                 //entrySet集合中的元素都是entry
  >                 Map.Entry entry = (Map.Entry)o2;
  >
  >     System.out.println((entry.getKey() + "--->" +   entry.getValue()));
  >             }
  >         }
  >     }



### 14.异常处理

#### 异常处理

1.java程序在执行过程中所发生的的异常事件可以分为两类：

- Error：java虚拟机无法解决的严重问题。如：JVM系统内部错误，资源耗尽等严重情况，一般没有针对性代码解决

>     public class inner {
>         public static void main(String[] args) {
>             //无限递归调用，导致栈溢出，异常(java.lang.StackOverflowError)
>             main(args);
>             //堆空间溢出，异常(java.lang.OutOfMemoryError)
>             Integer[] arr = new Integer[1024 * 1024 * 1024];
>         }
>     }

- Exception：其他因编程错误或偶然的存在因素导致的一般性问题，可以使用针对性代码进行处理

  - 空指针访问

  - 试图读取不存在的文件

  - 网络连接中断

  - 数组角标越界

##### Exception

1.异常的顶级结构(父类)：java.lang.Throwable

   两个主要子类：

- java.lang.Error(一般不写针对性的代码进行处理)

- java.lang.Exception(可以进行异常的处理)

  - 编译时异常(常见)

    - IOException

      - FileNotFoundException

        >     import java.io.File;
        >     import java.io.FileInputStream;
        >     import java.util.Scanner;
        >     public class inner {
        >         public void test01()
        >         {
        >             File file = new File("hello.txt");
        >             FileInputStream fis = new FileInputStream(file);
        >             int data = fis.read();
        >             while(data != -1)
        >             {
        >                 System.out.println((char)data);
        >                 int data = fis.read();
        >             }
        >             fis.close();
        >         }
        >     }

    - ClassNotFoundException

  - 运行时异常(常见)

    - NullPointerException(空指针异常)

      >     public class inner {
      >         public void test01()
      >         {
      >             int [] arr = null;
      >             System.out.println(arr[3]);
      >             String str = "abc";
      >             str = null;
      >             System.out.println(str.charAt(0));
      >         }
      >     }

    - ArrayIndexOutOfBoundsException(角标越界)

      >     public class inner {
      >         public void test01()
      >         {
      >             int [] arr = new int[10];
      >             System.out.println(arr[10]);
      >             String str = "abc";
      >             System.out.println(str.charAt(3));
      >         }
      >     }

    - ClassCastException(类型转换异常)

      >     import java.util.Date;
      >     public class inner {
      >         public void test01()
      >         {
      >             Object obj = new Date(); 
      >             String str = (String)obj;    String不属于Date类型，如果是Date的父类，可以强转
      >         }
      >     }

    - NumberFormatException(数字格式化异常)

      >     public class inner {
      >         public void test01()
      >         {
      >             String str ="abc";
      >             int num = Integer.parseInt(str);
      >         }
      >     }

    - InputMismatchException(数据输入异常)

      >     import java.util.Scanner;
      >     public class inner {
      >         public void test01()
      >         {
      >             Scanner scan = new Scanner(System.in);
      >             int num = scan.nextInt();
      >             //当输入数据类型不一时，会出现异常
      >             System.out.println(num);
      >         }
      >     }

    - ArithmaticException(算数异常)

      >     public class inner {
      >         public void test01()
      >         {
      >             int a= 10;
      >             int b= 0;
      >             System.out.println(a/b);
      >         }
      >     }

##### 异常处理机制：抓抛模型

1.过程

- 过程1："抛"：程序在正常执行的过程中，一但出现异常，就会在异常代码处生成一个对应异常类的对象
  并将此对象抛出，一但抛出对象后，其后的代码就不再执行
  关于异常对象的产生：
  - 系统自动生成的异常对象

  - 手动的生成一个异常对象，并抛出

- 过程2："抓"：可以理解为异常处理的方式

  - try-catch-finally

  - throws

##### try-catch-finally

1.结构(finally不一定要写)

>     try{
>             //可能出现异常的代码
>         }catch(异常类型1 变量名1){
>             //处理异常的方式1
>         }catch(异常类型2 变量名2){
>             //处理异常的方式2
>         }catch(异常类型3 变量名3){
>             //处理异常的方式3
>         }
>         ....
>         finally{ 
>             //一定会执行的代码
>         }

2.注意事项

- 使用try将可能出现的代码包装起来，在执行过程中，一但出现异常就会生成一个对应异常类的对象
  根据此对象的类型，去catch中进行匹配

- 一但try中的异常对象匹配到某一个catch时，就进入catch
  中进行异常的处理，处理完成后就跳出当前的try-catch结构(没有finally)，继续执行后面的代码

- catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓

- catch的异常类型满足子父类关系，则要求子类一定声明在父类的上面,否则报错

- 常用的异常处理对象的方式

  - 异常类对象名.getMessage()      String类型

  - printStackTrace()

- 在try结构中声明的变量，在出了try结构以后，就不能再被调用

>     public class inner {
>         public void test01()
>         {
>             String str = "abc";
>             try {
>                 System.out.println("hello1");
>                 int num = Integer.parseInt(str);
>           //一但发现异常，就会跳转到catch，下面不会运行                             
>                 System.out.println("hello2");
>             }/* catch(Exception e1){
>                 System.out.println("hello3");
>             } 错误，若第一个catch放入父类，则不会执行下列catch，报错 
>               catch(NumberFormatException e) {
>                   /* System.out.println("出现数值转换异常类");
>                     System.out.println(e.getMessage());
>                     e.printStackTrace(); */
>                   System.out.println("出现数值转换异常类");
>               }
>               catch(Exception e1){
>                 System.out.println("hello3");
>             }
>             System.out.println("hello");
>             //最后输出为hello1，出现数值转换异常类，hello
>             //  System.out.println(num);  报错
>         }
>     }

- 体会：使用try-catch-finally处理编译时异常，是让程序在编译时不再报错
  但是运行时仍可能报错，相当于我们使用try-catch-finally将一个编译时可能
  出现的异常，延迟到运行时出现

- try-catch-finally可以嵌套使用

- 开发中，由于运行时异常比较常见，所以我们通常不针对运行时异常编写
  try-catch-finally。针对于编译时异常，我们一定要考虑异常的处理

##### finally

1.finally是可选的

2.finally中声明的是一定会被执行的代码，即使catch中又出现异常了

   或try中和catch语句中有return语句等情况

>     public class inner {
>         public int test01()
>         {
>             try{
>                 int[] arr = new int[10];
>                 System.out.println(arr[10]);
>                 return 1;
>             }catch(ArrayIndexOutOfBoundsException e) {
>                 e.printStackTrace();
>                 return 2;
>             }finally{
>                 System.out.println("我一定会被执行");
>                 return 3;
>                 //输出"我一定会被执行"，返回3，结束
>             }
>         }
>     }

3.像数据库连接，输入输出流，网络编程Socket等资源，JVM是不能

   自动回收的，我们需要自己手动进行资源的释放，此时资源释放，

   就需要声明在finally中

##### throws

1."throws+异常类型"写在方法的声明处，指明此方法执行时，可能会抛出的异常类型

   一但当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象

   此对象满足throws后异常类型时，就会被抛出，异常代码后续的代码，不再执行

2.体会：try-catch-finally：真正的将异常给处理掉了

   throws的方式只是将异常抛给了方法的调用者，并没有真正的将异常处理掉

>     import java.io.IOException;
>
>     public class PointArrayDemo {
>         public static void main(String[] args) {
>             PointArrayDemo p1 = new PointArrayDemo();
>             p1.display(new subClass());
>         }
>         public void display(superClass s)
>         {
>             try {
>                 s.method();
>             }catch(IOException i) {
>                 i.printStackTrace();
>             }
>         }
>     }
>
>     class superClass
>     {
>         public void method() throws IOException
>         {
>
>         }
>
>     }
>
>     class subClass extends superClass
>     {
>         //  public void method()throws Exception{};
>         // 报错，子类重写方法抛出的异常类型不能大于父类被重写方法抛出的异常类型
>         @Override
>         public void method() throws IOException {
>             super.method();
>         }
>     }

3.子类重写方法抛出的异常类型不能大于父类被重写方法抛出的异常类型

>     import java.io.IOException;
>
>     public class PointArrayDemo {
>         public static void main(String[] args) {
>             PointArrayDemo p1 = new PointArrayDemo();
>             p1.display(new subClass());
>         }
>         public void display(superClass s)
>         {
>             try {
>                 s.method();
>             }catch(IOException i) {
>                 i.printStackTrace();
>             }
>         }
>     }
>
>     class superClass
>     {
>         public void method() throws IOException
>         {
>
>         }
>
>     }
>
>     class subClass extends superClass
>     {
>         //  public void method()throws Exception{};  报错
>         @Override
>         public void method() throws IOException {
>             super.method();
>         }
>     }

4.开发中如何选择try-catch-finally，还是使用throws？

- 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法
  也不能使用throws，以为着如果子类重写的方法中有异常，必须使用
  try-catch-finally方式处理

- 执行的方法a中，先后调用了另外的几个方法，这几个方法时递进关系执行的。
  我们建议这几个方法使用throws的方式进行处理。而执行的方法a可以考虑用
  try-catch-finally方式处理

##### 手动抛出异常

>     public class PointArrayDemo {
>         public static void main(String[] args) {
>             try {
>                 student s = new student();
>                 s.r(-1001);
>                 System.out.println(s.toString());
>             }catch(Exception e){
>                 // e.printStackTrace();
>                 System.out.println(e.getMessage());
>             }
>         }
>     }
>
>     class student{
>         private int id;
>         public void r(int id) throws Exception
>         {
>             if(id >0)
>             {
>                 this.id = id;
>             }else{
>                 //System.out.println("您输入的数据非法");
>                 //手动抛出异常对象
>                 //throw new RuntimeException("您输入的数据非法");          //  运行时异常，不需要处理 
>                 throw new Exception("您输入的数据非法");
>             }
>         }
>         public String toString()
>         {
>             return "id="+id;
>         }
>     }

##### 用户自定义异常类

1.如何自定义异常类

- 继承于现有的异常结构：RuntimeException、Exception

- 提供全局常量serialVersionUID

- 提供重载的构造器

>     public class MyException extends RuntimeException{
>         static final long serialVersionUID = -7034897190745766939L;
>         public MyException()
>         {
>
>         }
>         public MyException(String msg)
>         {
>             super(msg);
>         }
>         public static void main(String[] args) {
>             try {
>                 student s = new student();
>                 s.r(-1001);
>                 System.out.println(s.toString());
>             }catch(MyException e){
>                 // e.printStackTrace();
>                 System.out.println(e.getMessage());
>             }
>         }
>
>     }
>
>     class student{
>         private int id;
>         public void r(int id) throws Exception
>         {
>             if(id >0)
>             {
>                 this.id = id;
>             }else{
>                 //System.out.println("您输入的数据非法");
>                 //手动抛出异常对象
>                 //throw newRuntimeException("您输入的数据非法");       //  运行时异常，不需要处理
>                 throw new MyException("不能输入负数");
>             }
>         }
>         public String toString()
>         {
>             return "id="+id;
>         }
>     }

### 15.GUI事件处理

https://blog.csdn.net/dearzcs/article/details/123786493?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171791857316800215061972%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=171791857316800215061972&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~sobaiduend~default-2-123786493-null-null.nonecase&utm_term=javagui%E4%BA%8B%E4%BB%B6%E5%A4%84%E7%90%86&spm=1018.2226.3001.4450



### 16.IO流

1.流的分类

- 操作数据单位

  - 字节流

  - 字符流

- 数据的流向

  - 输入流

  - 输出流

- 流的角色

  - 节点流

  - 处理流

2.流的体系结构

- 抽象基类

  - InputStream

  - OutputStream

  - Reader

  - Writer

- 节点流（文件流）

  - FileInputStream：(read(byte[] buffer))

  - FileOutputStream：(write(byte[] buffer,0,len))

  - FileReader：(read(char[] c1))

  - FileWriter：(write(char[],0,len))

- 缓冲流（处理流的一种）

  - BufferedInputStream：(read(byte[] buffer))

  - BufferedOutputStream：(write(byte[] buffer))

  - BufferedReader：read((char[] c1)) / readline

  - BufferedWriter：write(char[] c1,0,len)

#### 节点流

1.FileReader

- read()的理解：返回读入的一个字符，如果达到文件末尾，返回-1

- 异常的处理：为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally处理

- 读入的文件一定要存在，否则就会报FileFoundException异常

>     import org.testng.annotations.Test;
>
>     import java.io.File;
>     import java.io.FileReader;
>     import java.io.IOException;
>
>     public class FileReaderWriterTest {
>         public static void main(String[] args) {
>             //相较于当前工程下
>             File f1 = new File("hello.txt");
>             File f2 = new File("day05\\hello.txt");
>         }
>
>         //将day05下的hello.txt文件内容读入程序中，并输出到控制台
>         @Test
>         public void test01() {
>             //相较于当前模板下
>             //1.实例化File类的对象，指明要操作的文件
>             File f1 = new File("hello.txt");
>             //2.提供具体的流
>             FileReader fr = null;
>             try {
>                 fr = new FileReader(f1);
>                 //3.数据的读入
>                 //read():返回读入的一个字符，如果达到文件末尾，返回-1
>                 //方式一
>                 int data = fr.read();
>                 while(data!=-1){
>                     System.out.print((char)data);
>                     data = fr.read();
>                 }
>         
>                 //方式二
>                 int data1;
>                 while((data1=fr.read())!=-1){
>                     System.out.print((char)data1);
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>             finally {
>                 //4.流的关闭操作
>                 try {
>                     if(fr!=null)
>                        fr.close();
>                 } catch (IOException e) {
>                     throw new RuntimeException(e);
>                 }
>             }
>         }
>         
>         @Test
>         public void test02()  {
>             FileReader fr = null;
>             try {
>                 //1.File类的实例化
>                 File f1 = new File("hello.txt");
>         
>                 //2.FileReader流的实例化
>                 fr = new FileReader(f1);
>         
>                 //3.读入的操作
>                 //read(char[] c1):返回每次读入c1数组中的字符个数
>                 //如果达到文件末尾，返回-1
>                 //方式一
>                 char[] c1 = new char[5];
>                 int len;
>                 while((len = fr.read(c1))!=-1){
>                     for(int i=0;i<len;i++){
>                         System.out.print(c1[i]);
>                     }
>                 }
>                 //方式二:c1.read(c1,0,c1.length);
>                } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }finally{
>                 if(fr!=null){
>                     //4.资源的关闭
>                     try {
>                         fr.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>         }
>
>     }

2.FileWriter

- 输出操作，对应的File可以不存在的

  - 如果不存在，在输出的过程中，会自动创建此文件

  - 如果存在

    - 如果流使用的构造器是FileWriter(file,false) / FileWriter(file)
      对原有文件的覆盖

    - 如果流使用的构造器是FileWriter(file,true)，不会对文件覆盖
      而是在原有文件追加内容

>     public class FileReaderWriterTest1 {
>         @Test
>         public void test01() {
>             FileWriter fw = null;
>             try {
>                 //1.提供File类的对象，指明写出到的文件
>                 File f1 = new File("hello.txt");
>
>                 //2.提供FileWriter的对象，用于数据的写出
>                fw = new FileWriter(f1,false);
>         
>                 //写出的操作
>                 fw.write("I have a dream");
>                 fw.write("you should have a dream");
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }finally{
>                 if(fw!=null){
>                     //流资源的关闭
>                     try {
>                         fw.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>         } fw.close();
>         }
>
>     }

3.使用FileWriter和FileReader实现文本的复制

>     @Test
>         public void testFileReaderFileWriter() {
>             FileReader fr = null;
>             FileWriter fw = null;
>             try {
>                 //1.创建File类的对象，指明读入和写出的文件
>                 File srcFile = new File("hello.txt");
>                 File destFile = new File("hello2.txt");
>
>                 //2.创建输入流和输出流的对象
>                 fr = new FileReader(srcFile);
>                 fw = new FileWriter(destFile);
>         
>                 //3.数据的读入和写出操作
>                 char[] c1 = new char[5];
>                 int len; //记录每次读入到c1数组中字符的个数
>                 while((len = fr.read(c1))!=-1){
>                     //每次写出len个字符
>                     fw.write(c1,0,len);
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>         
>             //4.关闭流资源
>             try {
>                 fw.close();
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>             try {
>                 fr.close();
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>         }

4.测试FileInputStream和FileOutStream的使用

- 对于文本文件（txt，java，c，c++，cpp），使用字符流处理

- 对于非文本文件（jpg，mp3，mp4，avi，doc，ppt），使用字节流处理

- 如果只是复制操作，文本文件可以用字节流处理

>     import org.testng.annotations.Test;
>
>     import java.io.File;
>     import java.io.FileInputStream;      
>     import java.io.IOException;
>
>     public class FileInOutputStreamTest {
>         @Test
>         public void testFileInputStream() {
>             FileInputStream fis = null;
>             try {
>                 //1.造文件
>                 File f1 = new File("hello.txt");
>
>                 //2.造流
>                 fis = new FileInputStream(f1);
>         
>                 //3.读数据
>                 byte[] buffer = new byte[5];
>                 int len; //记录每次读取的字节的个数
>                 while((len = fis.read(buffer))!= -1){
>                     String str = new String(buffer,0,len);
>                     System.out.println(str);
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             } finally {
>                 if(fis!=null) {
>                     //4.关闭资源
>                     try {
>                         fis.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>         }
>
>     }

- 复制

>     @Test
>         public void test02()  {
>             FileInputStream fis;
>             FileOutputStream fos;
>             try {
>                 File srcFile = new File("爱情与友情.jpg");
>                 File destFile = new File("爱情与友情2.jpg");
>
>                 fis = new FileInputStream(srcFile);
>                 fos = new FileOutputStream(destFile);
>         
>                 byte[] buffer = new byte[5];
>                 int len;
>                 while ((len = fis.read(buffer)) != -1) {
>                     fos.write(buffer, 0, len);
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>         
>             try {
>                 fos.close();
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>             try {
>                 fis.close();
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             }
>         }

#### 缓冲流(处理流的一种)

- 提供流的读取，写入的速度

- 提高读写速度的原因，内部提供了一个缓冲区

- BufferedInputStream和BufferedOutputStream实现非文本文件的复制

>     @Test
>         public void test01() throws FileNotFoundException {
>             BufferedInputStream bis = null;
>             BufferedOutputStream  bos = null;
>             try {
>                 //1.造文件
>                 File srcFile = new File("爱情与友情.jpg");
>                 File destFile = new File("爱情与友情2.jpg");
>                 //2.造流
>                 //2.1 造节点流
>                 FileInputStream fis = new FileInputStream(srcFile);
>                 FileOutputStream fos = new FileOutputStream(destFile);
>                 //2.2 造缓冲流
>                 bis = new BufferedInputStream(fis);
>                 bos = new BufferedOutputStream(fos);
>                 //复制的细节:读取,写入
>                 byte[] buffer = new byte[10];
>                 int len;
>                 while((len=bis.read(buffer))!= -1){
>                     bos.write(buffer,0,len);
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             } finally {
>                 //4.资源关闭
>                 //要求:先关闭外层的流，再关闭内层的流
>                 if(bos!=null) {
>                     try {
>                         bos.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>                 if(bis!=null) {
>                     try {
>                         bis.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>                 //关闭外层流的同时，内层流也会自动关闭
>                 //关于内层流的关闭，我们可以省略
>             }
>          }

- BufferedWriter和BufferedReader实现文本文件的复制

>      @Test
>         public void test02(){
>             BufferedReader br = null;
>             BufferedWriter bw = null;
>             try {
>                 //创建文件和相应的流
>      br= new BufferedReader(new FileReader(new File("h.txt")));
>      bw= new BufferedWriter(new FileWriter(new File("m.txt")));
>
>                 //读写操作
>                 //方式一
>                 char[] c1 = new char[1024];
>                 int len;
>                 while((len=br.read(c1))!=-1){
>                     bw.write(c1,0,len);
>                 }
>                 //方式二
>                 String data;
>                 while((data= br.readLine())!=null){
>                     bw.write(data); //不包含换行符
>                     System.out.println();
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             } finally {
>                 //关闭资源
>                 if(bw!=null) {
>                     try {
>                         bw.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>                 if(br!=null) {
>                     try {
>                         br.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>
>         }          

练习：加密操作

>         @Test
>         //图片的加密
>         public void test03() {
>             FileInputStream fis = null;
>             FileOutputStream fos = null;
>             try {
>            fis = new FileInputStream("E:\\wei1.jpg");
>            fos = new FileOutputStream("D:\\图片\\wei1.jpg");
>                 byte[] buffer = new byte[20];
>                 int len;
>                 while ((len = fis.read(buffer)) != -1) {
>         //字节数据进行修改,增强for循环改变新的变量，并没有改变buffer
>                   /*  for(byte b:buffer){
>                         b = (byte)(b^5);
>                     }  */
>                     //正确
>                     for (int i = 0; i < len; i++) {
>                         buffer[i] = (byte) (buffer[i] ^ 5);
>                     }
>                     fos.write(buffer, 0, len);
>                 }
>             } catch (IOException e) {
>                 e.printStackTrace();
>             } finally {
>                 if (fis != null) {
>                     try {
>                         fis.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>                 if (fos != null) {
>                     try {
>                         fos.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>         }

- 处理流之二：转换流的使用

  - InputStreamReader：将一个字节的输入流转换为字符的输入流

  - OutputStreamWriter：将一个字符的输出流转换为字节的输出流

作用：提供字节流与字符流之间的转换

解码：字节，字节数组 ---> 字符数组，字符串

编码：字符数组，字符串 ---> 字节，字节数组

字符集

>     import org.testng.annotations.Test;
>     import java.io.*;
>
>     public class InputStreamReaderTest {
>         @Test
>         public void test01() throws IOException {
>     FileInputStream fis = new FileInputStream("hello.txt");
>     //指明了字符集,具体使用哪个字符集，取决于文件hello.txt保存时使用的字符集
>     InputStreamReader isr =new InputStreamReader(fis,"UTF-8");   //使用系统默认的字符集
>
>             char[] c1 = new char[20];
>             int len;
>             while((len = isr.read(c1))!= -1){
>                 String str = new String(c1,0,len);
>                 System.out.print(str);
>             }
>         }
>
>     }

>      //需要用throw抛出异常,throws方便查看做法         
>         @Test                                                  
>         public void test02() throws IOException {                                                                                                             
>             //1.造文件和造流                                                            
>             File f1 = new File("hello.txt");
>             File f2 = new File("hello_gbk.txt");
>
>             FileInputStream fis = new FileInputStream(f1);
>             FileOutputStream fos = new FileOutputStream(f2);
>
>      InputStreamReader isr = new InputStreamReader(fis);
>      OutputStreamWriter osw = new OutputStreamWriter(fos);
>
>             //2.读写过程
>             char[] c1 = new char[20];
>             int len;
>             while((len=isr.read(c1))!= -1){
>                  osw.write(c1,0,len);
>             }
>          
>             //3.关闭资源
>             isr.close();
>             osw.close();
>
>         }

#### 标准的输入，输出流

1.System.in：标准的输入流，默认从键盘输出

2.System,out：标准的输出流，默认从控制台输出

- 可以通过System类的setIn(InputStream in) / setOut(OutputStream out) 方式重新指定输入和输出的流

- 练习

>     import java.io.BufferedReader;
>     import java.io.IOException;
>     import java.io.InputStreamReader;
>
>     public class OtherStreamTest {
>         /* 从键盘输入字符串，要求将读取到的整行字符串
>
>            直至当输入"e"或者"exit"时，退出程序 */
>         public static void main(String[] args) {
>             //方法一:使用Scanner实现，使用next()返回一个字符串
>             //方法二:使用System.out实现 System.out
>             // ---> 转换流---> BufferedReader的readline()
>         
>             BufferedReader br = null;
>             try {
>
>     InputStreamReader isr = new InputStreamReader(System.in);
>                 br = new BufferedReader(isr);
>                 while(true){
>                     System.out.println("请输入字符串");
>                     String data = br.readLine();
>             if(data.equalsIgnoreCase("e")||
>             data.equalsIgnoreCase("exit")){
>                         System.out.println("程序结束");
>                         String s = data.toUpperCase();
>                         System.out.println(s);
>                         break;
>                     }
>                 }
>             } catch (IOException e) {
>                 throw new RuntimeException(e);
>             } finally {
>                 if(br!=null){
>                     try {
>                         br.close();
>                     } catch (IOException e) {
>                         throw new RuntimeException(e);
>                     }
>                 }
>             }
>         }
>      }



### 17.多线程

#### 线程的创建与使用

1.多线程的创建

- 继承于Thread类

  - 创建一个继承于Thread类的子类

  - 重写Thread类中的run方法    将此线程执行的操作声明在run()方法中

  - 创建Thread类的子类的对象

  - 通过此对象调用start()    作用：启动当前线程，调用当前线程的run()

  例：遍历100以内的所有偶数

  >     class myThread extends Thread{
  >         @Override
  >         public void run() {
  >             for(int i=0;i<100;i++){
  >                 if(i%2==0){
  >                     System.out.println(i);
  >                 }
  >             }
  >         }
  >     }
  >
  >     public class Main {
  >         public static void main(String[] args) {
  >             myThread m1 = new myThread();
  >             m1.start();
  >             for(int i=0;i<100;i++){
  >                 if(i%2==0){
  >                     System.out.println(i+"***");
  >                 }
  >
  >     ​      }
  >
  >     }
  >
  >     注：main方法中主线程和调用的线程并发进行

  - 问题1：不能通过直接调用run()的方式启动线程

  - 问题2：再启动一个线程遍历100以内的偶数
    不可以让已经strat()的线程的对象去执行，会报异常
    需要重新创建一个线程的对象，去调用strat()

  - 练习
    创建两个分线程，分别遍历100以内的偶数和奇数

    >         class myThread extends Thread{
    >             @Override
    >              public void run() {
    >                  for(int i=0;i<100;i++){
    >                      if(i%2==0){
    >                          System.out.println(i);
    >                      }
    >                  }
    >              }
    >         }
    >
    >          public class Main {
    >              public static void main(String[] args) {
    >                  myThread m1 = new myThread();
    >                  m1.start();
    >                 //创建Thread类的匿名子类的方式
    >                 new Thread(){
    >                      @Override
    >                      public void run() {
    >                          for(int i=0;i<100;i++){
    >                              if(i%2!=0){
    >                                  System.out.println(+i);
    >                              }
    >                          }
    >                      }
    >                  }.start();
    >
    >         ​     }
    >
    >          }

- 线程的常用方法

  - start()：启动当前线程，调用当前线程的run()方法

  - run()：通常需要重写Thread类中的此方法，将创建
    的线程要执行的操作声明在此方法中

  - currentThread()：静态方法，返回执行当前代码的线程

  - getName()：获取当前线程的名字

  - setName()：设置当前线程的名字

    >     class MyThread extends Thread{
    >         @Override
    >         public void run() {
    >             System.out.println
    >             (Thread.currentThread().getName()+":"+6);
    >         }
    >         public MyThread(String name){
    >             super(name);
    >         }
    >     }
    >
    >     public class day01 {
    >         public static void main(String[] args) {
    >             //构造器给线程命名
    >            MyThread m1 = new MyThread("Thread1");
    >            //set方法给 分线程命名
    >            m1.setName("线程1");
    >            m1.start();
    >            //给主线程命名
    >             Thread.currentThread().setName("主线程");
    >             System.out.println
    >             (Thread.currentThread().getName()+":"+6);
    >         }
    >     }

  - yield()：释放当前cpu的执行权，可能下一次分配给别的线程执行
    调用：yield()

  - join()：在线程a中调用线程b的join()，此时线程a就进入阻塞状态
    知道线程b完全执行完以后，线程a才结束阻塞状态

  - stop()：已过时，当执行此方法时，强制结束当前线程

  - sleep(long milltime)：让当前线程"睡眠"指定的milltime毫秒
    在指定的milltime毫秒时间内，当前线程是阻塞状态

  - isAlive()：判断线程是否结束

    >     import static java.lang.Thread.sleep;
    >
    >     class MyThread extends Thread{
    >         @Override
    >         public void run() {
    >             for(int i=0;i<100;i++){
    >                 System.out.println(i);
    >                 if(i%20==0){
    >                     yield();
    >                 }
    >             }
    >         }
    >         public MyThread(String name){
    >             super(name);
    >         }
    >     }
    >
    >     public class day01 {
    >         public static void main(String[] args) {
    >             //构造器给线程命名
    >            MyThread m1 = new MyThread("Thread1");
    >            //set方法命名
    >             m1.setName("线程1");
    >            m1.start();
    >            //给主线程命名
    >             Thread.currentThread().setName("主线程");
    >             for(int i=0;i<100;i++) {
    >                 if(i%2==0) {
    >                     try {
    >                         sleep(10);
    >                     }catch(InterruptedException e){
    >                         e.printStackTrace();
    >                     }        
    >             System.out.println
    >     (Thread.currentThread().getName() + ":" + i);}
    >                 if(i ==6){
    >                     try{
    >                         m1.join();
    >                     }catch(InterruptedException e){
    >                         e.printStackTrace();
    >                     }
    >                 }
    >             }
    >             System.out.println(m1.isAlive());
    >         }
    >     }

- 线程的优先级
  MAX_PRIORITY：10
  MIN_PRIORITY：1
  NORM_PRIORITY：5

  - 如何获取和设置当前线程的优先级
    getPriority()：获取线程的优先级
    setPriority()：设置线程的优先级

    - 高优先级的线程要抢占低优先级线程cpu的执行权
      但是只是从概率上讲，高优先级的线程高概率下
      被执行，并不意味着只有当高优先级执行完以后，
      低优先级才执行

    >     class MyThread extends Thread{
    >         @Override
    >         public void run() {
    >             for(int i=0;i<100;i++){
    >                 System.out.println(getPriority()+":"+i);
    >             }
    >         }
    >         public MyThread(String name){
    >             super(name);
    >         }
    >     }
    >
    >     public class day01 {
    >         public static void main(String[] args) {
    >             //构造器给线程命名
    >             MyThread m1 = new MyThread("Thread1");
    >             //set方法命名
    >             m1.setName("线程1");
    >             //设置分线程的优先级
    >             m1.setPriority(Thread.MAX_PRIORITY);
    >             m1.start();
    >             //给主线程命名
    >             Thread.currentThread().setName("主线程");
    >             Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
    >             for (int i = 0; i < 100; i++) {
    >                 if (i % 2 == 0) {
    >                System.out.println
    >     (Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
    >                 }
    >
    >             }
    >                                                             }
    >
    >     }

- 创建多线程的方式而：实现Runnable接口

  - 创建一个实现Runnable接口的类

  - 实现类去实现Runnable中的抽象方法run()

  - 创建实现类的对象

  - 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象

  - 通过Thread类的对象调用start()

    >     class thread1 implements Runnable{
    >         @Override
    >         public void run() {
    >             for(int i=0;i<100;i++){
    >                 if(i%2==0){
    >                     System.out.println(i);
    >                     //这里不能直接调用getName，没有继承于Thread
    >                 }
    >             }
    >         }
    >     }
    >
    >     public class ThreadTest {
    >         public static void main(String[] args) {
    >             thread1 t1 = new thread1();
    >             Thread t2 = new Thread(t1);
    >             //->调用了Runnable类型的target的run()方法
    >             //将t1的地址赋值给t2，所以start调用的是t1的start方法
    >             t2.start();
    >
    >             //再创建一个线程，遍历100以内的偶数
    >             Thread t3 = new Thread(t1);
    >             t3.start();
    >         }
    >
    >     }

- 比较创建线程的两个方式

  - 开发中优先选择Runnable接口的方式

    - 实现的方式没有类的单继承性的局限性

    - 实现的方式更适合来处理多个线程有共享数据的情况

    >     class Window implements Runnable{
    >         private int ticket =100;
    >         @Override
    >         public void run() {
    >             while(true){
    >                 if(ticket>0){
    >                     System.out.println
    >     (Thread.currentThread().getName()+"卖票，票号为："+ticket);
    >                     ticket--;
    >                 }else{
    >                     break;
    >                 }
    >             }
    >         }
    >     }
    >
    >     public class WindowTest {
    >         public static void main(String[] args) {
    >            Window w1 = new Window();
    >            Thread t1 = new Thread(w1);
    >             Thread t2 = new Thread(w1);
    >             Thread t3 = new Thread(w1);
    >             t1.setName("窗口1");
    >             t2.setName("窗口2");
    >             t3.setName("窗口3");
    >             t1.start();
    >             t2.start();
    >             t3.start();
    >         }
    >     }

  - 联系：Thread本身也实现了Runnable接口，两种方式都需要重写run()

#### 线程的生命周期

- 新建：当一个Thread类或其子类的对象被声明并创建时，新生的线程对象

  - 处于新建状态   ------->调用start()------->就绪

- 就绪：处于新建状态的线程被start()后，将进入线程队列等待CPU时间片，
  此时它已具备了运行的条件，只是没分配到CPU资源 

  - 就绪------->获取CPU执行权------->运行

- 运行：当就绪的线程被调度并获得CPU资源时，便进入运行状态，run()方法
  定义了线程的操作和功能

  - 运行------->sleep(long time)，join()，wait()，suspend()------->阻塞

  - 运行------->失去CPU执行权，或yield()------->就绪

- 阻塞：在某种特殊情况下，被人为挂起或执行的输入输出操作时，让出CPU
  并临时终止自己的执行，进入阻塞状态
  - 阻塞------->sleep(long time)时间到，join()结束，获取同步锁，notify()
    resume()------->运行

- 死亡：线程完成了它的全部工作或线程被提前强制性地终止或出现异常导致
  结束
  - 运行------->执行完run()，调用线程的stop()，出现Error/Exception
    并未处理------->死亡

#### 线程的同步

一.  问题：举例：卖票过程中出现了重票，错票------->出现了线程的安全问题

二.  问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他

   线程参与进来，也操作车票

三.  如何解决：当一个线程在操作共享数据(票)，其他线程不能参与进来，直到

   当前线程操作完，其他线程才可以参与进来，即使此线程出现阻塞，也不能

   被改变

   在java中，我们通过同步机制，来解决线程的安全问题

##### 同步代码块

1.synchronized(同步监视器){

   需要被同步的代码

}

说明：

1.操作共享数据的代码，即为需要被同步的代码    不能包含代码多了，也不能少了

2.共享数据：多个线程共同操作的数据

3.同步监视器，俗称：锁，任何一个类的对象，都可以充当锁

要求：多个线程必须要公用同一把锁

###### 处理实现Runnable的线程安全问题

>     package com.atguigu.java;
>
>         class Window implements Runnable{
>             private int ticket =100;
>             Object o1 = new Object();
>             @Override
>             public void run() {
>                 while(true){
>                     synchronized (o1) //括号里可以为this {
>                         if (ticket > 0) {
>                             try{
>                                 Thread.sleep(100);
>                             }catch(InterruptedException e){
>                                 e.printStackTrace();
>                             }
>                             System.out.println
>
>       (Thread.currentThread().getName() + "卖票，票号为：" + ticket);
>                             ticket--;
>                         } else {
>                             break;
>                         }
>                     }
>                 }
>             }
>         }
>
>         public class WindowTest1 {
>             public static void main(String[] args) {
>                 Window w1 = new Window();
>                 Thread t1 = new Thread(w1);
>                 Thread t2 = new Thread(w1);
>                 Thread t3 = new Thread(w1);
>                 t1.setName("窗口1");
>                 t2.setName("窗口2");
>                 t3.setName("窗口3");
>                 t1.start();
>                 t2.start();
>                 t3.start();
>             }
>         }

###### 处理继承Thread类的线程安全问题

>     package com.atguigu.java;
>
>     class Window1 extends Thread{
>         private static int ticket =100;
>         private static Object o1 = new Object();
>         @Override
>         public void run() {
>             while(true){
>                 // synchronized (o1) {
>                 synchronized (Window1.class){  //类也是对象
>                     if (ticket > 0) {
>                         try {
>                             Thread.sleep(100);
>                         } catch (InterruptedException e) {
>                             e.printStackTrace();
>                         }
>                         System.out.println 
>        (Thread.currentThread().getName() + "卖，票号为：" + ticket);
>                         ticket--;
>                     } else {
>                         break;
>                     }
>                 }
>             }
>         }
>     }
>
>     public class WindowTest2 {
>         public static void main(String[] args) {
>             Window1 w1 = new Window1();
>             Window1 w2 = new Window1();
>             Window1 w3 = new Window1();
>             w1.setName("窗口1");
>             w2.setName("窗口2");
>             w3.setName("窗口3");
>             w1.start();
>             w2.start();
>             w3.start();
>         }
>     }

##### 同步方法

######  处理实现Runnable的线程安全问题

>     package com.atguigu.java;
>
>     class Window3 implements Runnable{
>         private int ticket =100;
>         @Override
>         public synchronized void run() {
>             while(true){
>                show();
>             }
>         }
>         private synchronized void show(){
>           //此时同步监视器为this
>             if (ticket > 0) {
>                 try{
>                     Thread.sleep(100);
>                 }catch(InterruptedException e){
>                     e.printStackTrace();
>                 }
>                 System.out.println
>                         (Thread.currentThread().getName() + "卖票，票号为：" + ticket);
>                 ticket--;
>             }
>         }
>     }
>
>     public class WindowTest3 {
>         public static void main(String[] args) {
>             Window3 w1 = new Window3();
>             Thread t1 = new Thread(w1);
>             Thread t2 = new Thread(w1);
>             Thread t3 = new Thread(w1);
>             t1.setName("窗口1");
>             t2.setName("窗口2");
>             t3.setName("窗口3");
>             t1.start();
>             t2.start();
>             t3.start();
>         }
>     }

###### 处理继承Thread类的线程安全问题

>     package com.atguigu.java;
>
>     class Window4 extends Thread{
>         private static int ticket =100;
>
>         @Override
>         public void run() {
>             while(true){
>                 show();
>             }
>         }
>         private static synchronized void show(){  //同步监视器为当前类本身
>             //private  synchronized void show(){ 同步监视器w1，w2，w3
>             if (ticket > 0) {
>                 try{
>                     Thread.sleep(100);
>                 }catch(InterruptedException e){
>                     e.printStackTrace();
>                 }
>                 System.out.println
>
>     (Thread.currentThread().getName()+"卖票，票号为"+ ticket);
>                 ticket--;
>             }
>         }
>     }
>
>     public class WindowTest4 {
>         public static void main(String[] args) {
>             Window4 w1 = new Window4();
>             Window4 w2 = new Window4();
>             Window4 w3 = new Window4();
>             w1.setName("窗口1");
>             w2.setName("窗口2");
>             w3.setName("窗口3");
>             w1.start();
>             w2.start();
>             w3.start();
>         }
>     }

五. 关于同步方法的总结

- 同步方法仍然设计到同步监视器，只是不需要我们显示的声明

- 非静态的同步方法，同步监视器是：this

- 静态的同步方法，同步监视器是：当前类本身

六. 同步的方式

* 弊端：操作同步代码时，只有一个线程参加，其他线程等待，相当于单线程，效率低

* 好处：解决了线程的安全问题

#### 锁

##### 线程的死锁问题

1.死锁的理解：不同的线程分别占用对方需要的同步资源不放弃

   都在等待对方放弃自己需要的同步资源，就形成了线程的死锁

2.说明

- 出现死锁后，不会出现异常，不会出现提示，只是所有的线程都
  处于阻塞状态，无法继续

- 我们使用同步时，要避免出现死锁

>     package com.atguigu.java;
>
>     public class ThreadTest {
>         public static void main(String[] args) {
>             StringBuffer s1 = new StringBuffer();
>             StringBuffer s2 = new StringBuffer();
>             new Thread(){
>                 @Override
>                 public void run() {
>                     synchronized (s1){
>                         s1.append("a");
>                         s2.append("1");
>                         try {
>                             Thread.sleep(100);
>                         } catch (InterruptedException e) {
>                             throw new RuntimeException(e);
>                         }
>                         synchronized (s2){
>                             s1.append("b");
>                             s2.append("2");
>                             System.out.println(s1);
>                             System.out.println(s2);
>                         }
>                     }
>                 }
>             }.start();
>             new Thread(new Runnable() {
>                 @Override
>                 public void run() {
>                     synchronized (s2){
>                         s1.append("c");
>                         s2.append("3");
>                         try {
>                             Thread.sleep(100);
>                         } catch (InterruptedException e) {
>                             throw new RuntimeException(e);
>                         }
>                         synchronized (s1){
>                             s1.append("d");
>                             s2.append("4");
>                             System.out.println(s1);
>                             System.out.println(s2);
>                         }
>                     }
>                 }
>             }).start();
>         }
>
>     }

##### Lock

1.解决线程安全问题的方式三：Lock锁 --- JKD5.0新增

2.使用

- 实例化ReentrantLock类

- 调用锁定方法lock()

- 调用解锁方法:unlock()

>     package com.atguigu.java;
>
>     import java.util.concurrent.locks.ReentrantLock;
>
>     class Window5 implements Runnable{
>         private int ticket = 100;
>         //1.实例化ReentrantLock
>         private ReentrantLock lock = new ReentrantLock();
>         @Override
>         public void run() {
>             while(true) {
>                 try {
>                     //2.调用锁定方法lock()
>                     lock.lock();
>                     if (ticket > 0) {
>                         try {
>                             Thread.sleep(100);
>                         } catch (InterruptedException e) {
>                             throw new RuntimeException(e);
>                         }              
>                 System.out.println
>      (Thread.currentThread().getName() + "票号为" + ticket);
>                         ticket--;
>                     } else {
>                         break;
>                     }
>                 }finally{
>                    //3.调用解锁方法:unlock()
>                     lock.unlock();
>                 }
>
>             }
>         }
>
>     }
>
>     public class LockTest {
>         public static void main(String[] args) {
>             Window5 w1 = new Window5();
>             Thread t1 = new Thread(w1);
>             Thread t2 = new Thread(w1);
>             Thread t3 = new Thread(w1);
>             t1.setName("窗口1");
>             t2.setName("窗口2");
>             t3.setName("窗口3");
>             t1.start();
>             t2.start();
>             t3.start();
>         }
>
>     }

3.Lock与synchronized的异同

相同点：二者都可以解决线程安全问题

不同点：

- synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器

- Lcok需要手动的启动同步Lock()，同时结束同步也需要手动实现unlcok()

#### 线程的通信

1.使用两个线程打印1-100。线程1，线程2交替打印

涉及到三个方法

- wait()：一但执行此方法，当前线程就进入阻塞状态，并释放同步监视器

- notify()：一但执行此方法，就会唤醒被wait()的一个线程。如果有多个线程
  被wait，就唤醒优先级高的那个

- notifyAll()：一但执行此方法，就会唤醒被wait()的所有线程

>     package com.atguigu.java1;
>
>     class Number implements Runnable{
>         private int number = 1;
>         @Override
>         public void run() {
>             while(true){
>                 synchronized (this) {
>                     //调用如下notify()唤醒另一个线程
>                     notify();
>                     if (number <= 100) {
>                         try {
>                             Thread.sleep(100);
>                         } catch (InterruptedException e) {
>                             throw new RuntimeException(e);
>                         }
>                      System.out.println
>         (Thread.currentThread().getName() + ":" + number);
>                         number++;
>                         try {
>                             //调用如下wait()方法的线程进入阻塞状态
>                             wait();
>                         } catch (InterruptedException e) {
>                             throw new RuntimeException(e);
>                         }
>                     } else {
>                         break;
>                     }
>                 }
>             }
>         }
>     }
>
>     public class Communication {
>         public static void main(String[] args) {
>             Number n1 = new Number();
>             Thread t1 = new Thread(n1);
>             Thread t2 = new Thread(n1);
>             t1.setName("线程1");
>             t2.setName("线程2");
>             t1.start();
>             t2.start();
>         }
>     }

2.说明

- wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中

- wait()，notify()，notifyAll()三个方法的调用者必须是同步代码块或同步方法中
  的同步监视器，否则会出现IllegalMonitorStateException异常

- wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中

##### sleep()和wait()的异同

- 相同点

  - 一但执行方法，都可以使得当前的线程进入阻塞状态

- 不同点

  - 两个方法声明的位置不一样

    - Thread类中声明sleep()

    - Object类中声明wait()

  - 调用的要求不同

    - sleep()可以在任何需要的场景下调用

    - wait()必须使用在同步代码块或同步方法中

  - 关于是否释放同步监视器(如果两个方法都使用在同步代码块或同步方法中)

    - sleep()不会释放锁(同步监视器)

    - wait()会释放锁



### 18.jdbc操作mysql数据库

https://blog.csdn.net/kkkyyy0817/article/details/136021335?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171791867716800180683581%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=171791867716800180683581&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~sobaiduend~default-2-136021335-null-null.nonecase&utm_term=jdbc%E6%93%8D%E4%BD%9Cmysql%E6%95%B0%E6%8D%AE%E5%BA%93&spm=1018.2226.3001.4450



### 19.基于套接字的网络通信程序的理解

#### IP与端口号

1.网络编程中的两个主要问题

- 如何准确地定位网络上一台或多台主机，定位主机上的特定应用

- 找到主机后如何可靠高效地进行数据传输

2.网络编程中的两个要素

- 对应问题1：提供对应的IP和端口号

- 对应问题2：提供网络通信协议：TCP/IP参考模型(应用层，传输层，网络层，
  物理+数据链路层)

3.通信要素1：IP和端口号

- IP：唯一的标识Internet上的计算机
  在Java中使用InetAddress类代表IP地址

- IP分类

  - IPv4和IPv6

  - 万维网和局域网

4.域名：例www.baidu.com

5.本地回路地址：127.0.0.1     对应者：localhost

6.如何实例化InetAddress

- getByName(String host)

- getLocalHost()

7.两个常用方法

- getHostName()

- getHostAddress()

>     import java.net.InetAddress;
>     import java.net.UnknownHostException;
>
>     public class InetAddressTest {
>         public static void main(String[] args) {
>             try {
>     InetAddress i1 = InetAddress.getByName("192.168.10.14");
>                 System.out.println(i1);
>     InetAddress i2 = InetAddress.getByName("www.atguigu.com");
>                 System.out.println(i2);
>     InetAddress i3 = InetAddress.getByName("127.0.0.1");
>                 System.out.println(i3);
>
>                 //获取本机地址的方法
>                 InetAddress i4 = InetAddress.getLocalHost();
>                 System.out.println(i4);
>         
>               //getHostName()
>
>        System.out.println(i2.getHostName()); //www.atguigu.com
>                 //getHostAddress()
>                 System.out.println(i2.getHostAddress()); 
>             } catch (UnknownHostException e) {
>                 throw new RuntimeException(e);
>             }
>         }
>     }

8.端口号：正在计算机进行的进程

- 要求：不同的进程有不同的端口号

- 范围：0-65535

9.端口号与IP地址的组合得出一个网络套接字：Socket

##### TCP网络编程

- 三次握手，四次挥手
- 客户端工作步骤
  - 客户端程序可以使用Socket类创建对象，创建的同时会自动向服务器方发起连 接。Socket的构造器是：
    - Socket(String host,int port)throws UnknownHostException,IOException：向服务器(域名是 host。端口号为port)发起TCP连接，若成功，则创建Socket对象，否则抛出异常。
    - Socket(InetAddress address,int port)throws IOException：根据InetAddress对象所表示的 IP地址以及端口号port发起连接。
  - 客户端建立socketAtClient对象的过程就是向服务器发出套接字连接请求
- 服务器工作步骤
  - 调用 ServerSocket(int port) ：创建一个服务器端套接字，并绑定到指定端口 上。用于监听客户端的请求。
  - 调用 accept()：监听连接请求，如果客户端请求连接，则接受连接，返回通信 套接字对象。
  - 调用 该Socket类对象的 getOutputStream() 和 getInputStream ()：获取输出 流和输入流，开始网络数据的发送和接收。
  - 关闭ServerSocket和Socket对象：客户端访问结束，关闭通信套接字。

>  package java1;
>
>  import org.testng.annotations.Test;
>
>  import java.io.ByteArrayOutputStream;
>  import java.io.IOException;
>  import java.io.InputStream;
>  import java.io.OutputStream;
>  import java.net.InetAddress;
>  import java.net.ServerSocket;
>  import java.net.Socket;
>
>  //实现TCP的网络通信协议
>  //例子1：客户端发送信息给服务端，服务端将数据显示在控制台上
>  public class TCPTest1 {
>   //客户端
>   @Test
>   public void client()  {
>       Socket s1 = null;
>       OutputStream os = null;
>       try {
>           //1.创建socket对象.指明服务器端的ip和端口号
>           InetAddress i1 = InetAddress.getByName("127.0.1");
>           s1 = new Socket(i1, 8899);
>           //2.获取一个输出流，用于输出数据
>           os = s1.getOutputStream();
>           //3.写出数据的操作
>           os.write("你好，我是客户端".getBytes());
>       }catch(IOException i1) {
>           i1.printStackTrace();
>       }
>       finally{
>           //4.资源关闭
>           if(os!=null) {
>               try {
>                   os.close();
>               } catch (IOException e) {
>                   throw new RuntimeException(e);
>               }
>           }if(s1!=null) {
>               try {
>                   s1.close();
>               } catch (IOException e) {
>                   throw new RuntimeException(e);
>               }
>           }
>       }
>   }











