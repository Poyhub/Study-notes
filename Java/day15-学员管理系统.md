## day15-学员管理系统

### 今日内容

- 学员管理系统
  - 主界面
  - 添加学生信息功能
  - 查看学生信息功能
  - 修改学生信息功能
  - 删除学生信息功能

### 实操--1 学生管理系统项目演示

#### 目标

- 今天我们要来做一个综合案例,就是学生信息管理系统,接下来我们来演示一下有哪些功能

#### 路径

- 测试主界面
- 测试【1.添加学生信息】
- 测试【2.查看所有学生信息】
- 测试【3.修改学生信息】
- 测试【4.删除学员信息】

#### 讲解

##### 测试主界面

![1584463655768](img\1584463655768.png)

##### 测试【1.添加学生信息】

![1584464084134](img\1584464084134.png)

##### 测试【2.查看所有学生信息】

![1584463843361](img\1584463843361.png)

![1584464154413](img\1584464154413.png)

##### 测试【3.修改学生信息】

![1584464232862](img\1584464232862.png)



![1584464320071](img\1584464320071.png)

##### 测试【4.删除学生信息】

![1584464376096](img\1584464376096.png)

#### 小结

### 实操--2 学生管理系统之学生类

#### 需求

- 制作标准的学生类

#### 分析

- 学生类中的成员
  - 成员属性：
    - sid(学号)
    - name(姓名)
    - age(年龄)
    - address(居住地)
  - 构造方法：
    - 无参构造
    - 满参构造
  - set\get方法

#### 实现

```java
/*
    学生类
    Alt+Insert  根据自己的需要进行选择
 */
public class Student {
    //学号
    private int sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;

    public Student() {
    }

    public Student(int sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

```

#### 小结

- 略

### 实操--3 学生管理系统之主界面

#### 需求

- 完成主界面的编写

  ![1584459268650](img\1584459268650.png)

#### 分析

- 定义一个集合,用来存储学生信息
- 用输出语句完成主界面的编写
- 用Scanner实现键盘录入数据
- 用switch结构完成操作的选择
- 用循环完成再次回到主界面

#### 实现

```java
public class StudentManager {
    public static void main(String[] args) {
        // 定义一个集合,用来存储学生信息
        ArrayList<Student> list = new ArrayList<>();
        // - 用循环完成再次回到主界面
        while (true) {
            // - 用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 查看所有学生");
            System.out.println("3 修改学生");
            System.out.println("4 删除学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            // - 用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            // - 用switch结构完成操作的选择
            switch (op) {
                 case 1:
                    //System.out.println("添加学生");
                    addStudent(list);
                    break;
                case 2:
                    //System.out.println("查看所有学生");
                    findAllStudent(list);
                    break;
                case 3:
                    //System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case 4:
                    //System.out.println("删除学生");
                    removeStudent(list);
                    break;
                case 5:
                    System.out.println("退出,谢谢使用!");
                    // break;
                    System.exit(0);
               default:
                    System.out.println("您输入有误,请重新输入");
                    break;
            }
        }
    }
}
```

#### 小结

- 略

### 实操--4 学生管理系统之添加学生

#### 需求

- 添加学生信息

  ![1584464619706](img\1584464619706.png)

#### 分析

- 定义一个方法,用于添加学生信息
  - 明确方法名	addStudent
  - 明确返回值    没有返回值   返回值类型:void
  - 明确参数       有参数           参数类型:ArrayList<Student>
  - 明确方法体
    - 1.创建Scanner对象
    - 2.获取键盘录入的学生信息
    - 3.创建学生对象,把键盘录入的学生信息赋值给学生对象的成员变量
    - 4.把学生对象存储到集合中
    - 5.给出提示信息添加成功
- 调用方法

#### 实现

```java
 public static void addStudent(ArrayList<Student> list) {
        // 1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 2.获取键盘录入的学生信息
        System.out.println("请输入学生学号：");
        int sid = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生居住地：");
        String address = sc.next();
        // 3.创建学生对象,把键盘录入的学生信息赋值给学生对象的成员变量
        Student stu = new Student(sid,name,age,address);
        // 4.把学生对象存储到集合中
        list.add(stu);
        // 5. 给出提示信息添加成功
        System.out.println("添加学员信息成功");
    }
```

#### 小结

- 略

### 实操--5 学生管理系统之学生编号重复问题

#### 需求

- 目前程序中是可以添加重复的学号,而实际开发中学生学号是不可重复的,所以需解决添加学生学号重复问题

  ![1584464913783](img/1584464913783.png)

#### 分析

- 定义一个方法,对学号是否被使用进行判断
  - 明确方法名	isUsed
  - 明确返回值    有返回值   返回值类型: boolean
  - 明确参数        有参数       参数类型: ArrayList<Student> list,int sid
  - 明确方法体
    - 1.定义一个boolean类型的变量,初始化值为false
    - 2.循环遍历集合中的元素
    - 3.在循环中,获取集合元素,并判断集合中元素的学号与传入的学号是否相同
    - 如果相同,就修改这个boolean类型的变量值为true,并使用break结束循环
    - 4.循环结束后,返回boolean变量
- 在添加元素的方法中调用该方法进行判断

#### 实现

```java
public static boolean isUsed(ArrayList<Student> list,int sid){
    // - 1.定义一个boolean类型的变量,初始化值为false
    boolean flag = false;
    // - 2.循环遍历集合中的元素
    for (int i = 0; i < list.size(); i++) {
        // - 3.在循环中,获取集合元素,并判断集合中元素的学号与传入的学号是否相同
        Student stu = list.get(i);
        if (stu.getSid() == sid) {
            // - 如果相同,就修改这个boolean类型的变量值为true,并使用break结束循环
            flag = true;
        }
    }
    // - 4.循环结束后,返回boolean变量
    return flag;
}

 public static void addStudent(ArrayList<Student> list) {
        // 1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 2.获取键盘录入的学生信息

        int sid ;

        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextInt();

            boolean flag = isUsed(list, sid);
            if (flag){
                System.out.println("您输入的学号已存在,请重新输入!");
            }else{
                break;// 结束循环
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生居住地：");
        String address = sc.next();
        // 3.创建学生对象,把键盘录入的学生信息赋值给学生对象的成员变量
        Student stu = new Student(sid, name, age, address);
        // 4.把学生对象存储到集合中
        list.add(stu);
        // 5. 给出提示信息添加成功
        System.out.println("添加学员信息成功");
    }

```

#### 小结

- 略

### 实操--6 学生管理系统之查看所有学生

#### 需求

- 查看所有学生信息

  ![1584464661564](img\1584464661564.png)

#### 分析

- 定义一个方法,用于查看学生信息
  - 明确方法名	findAllStudent
  - 明确返回值     没有返回值    返回值类型:void
  - 明确参数        有参数   参数类型:ArrayList<Student>
  - 明确方法体
    - 显示表头信息
    - 循环遍历集合中所有元素,按照指定格式打印出来,年龄补充"岁"
    - 在循环中,获取集合中的元素,按照打印元素的属性信息
- 调用方法

#### 实现

```java
public static void findAllStudent(ArrayList<Student> list){
        // 显示表头信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        // 循环遍历集合中所有元素,按照指定格式打印出来,年龄补充"岁"
        for (int i = 0; i < list.size(); i++) {
            // 获取集合中的元素
            Student stu = list.get(i);
            // 打印元素的属性信息
            System.out.println(stu.getSid()+"\t\t"+stu.getName()+"\t\t"+stu.getAge()+"岁\t\t"+stu.getAddress());
        }

    }
```

#### 小结

- 略

### 实操--7 学生管理系统之查看所有学生升级版

#### 需求

- 问题:如果一开始系统中没有学生信息,就直接查看学生信息,那么就不应该显示表头信息,而是应该提示一下:请添加信息,再查询

  ![1584464705006](img\1584464705006.png)

#### 分析

- 在findAllStudent方法中,判断集合中是否有数据,如果没有数据就显示一个提示信息,如果有就查询,按照指定格式打印

#### 实现

```java
 public static void findAllStudent(ArrayList<Student> list){
        // 判断集合中是否有数据,如果没有数据就显示一个提示信息,如果有就查询,按照指定格式打印
        if (list.size() == 0){
            System.out.println("无信息,请添加信息之后,再查询!");
            return;
        }
        // 显示表头信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        // 循环遍历集合中所有元素,按照指定格式打印出来,年龄补充"岁"
        for (int i = 0; i < list.size(); i++) {
            // 获取集合中的元素
            Student stu = list.get(i);
            // 打印元素的属性信息
            System.out.println(stu.getSid()+"\t\t"+stu.getName()+"\t\t"+stu.getAge()+"岁\t\t"+stu.getAddress());
        }

    }
```

#### 小结

- 略

### 实操--8 学生管理系统之修改学生

#### 需求

- 修改学员信息

  ![1584464320071](img\1584464320071.png)

  ![1584464232862](img\1584464232862.png)

#### 分析

- 定义一个方法,用于删除学员信息
  - 明确方法名	updateStudent
  - 明确返回值     没有返回值    返回值类型:void
  - 明确参数        有参数   参数类型:ArrayList<Student>
  - 明确方法体
    - 1.创建Scanner对象
    - 2.键盘录入需要修改学员的学号
    - 3.遍历集合中每一个元素
    - 4.在循环中,获取集合元素
    - 5.在循环中,判断获取的集合元素学号是否等于要修改学员的学号
    - 6.如果相等,键盘录入要修改的学生信息,并修改学员的信息,并提示修改成功,使用return结束方法
    - 7..循环结束后,提示因学号不存在,故修改元素失败!

#### 实现

```java
public static void updateStudent(ArrayList<Student> list) {
        // 1.创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 2.键盘录入需要修改学员的学号
        System.out.println("请输入要修改学员的学号:");
        int id = sc.nextInt();

        // 3.遍历集合中每一个元素
        for (int i = 0; i < list.size(); i++) {
            // 4.在循环中,获取集合元素
            Student stu = list.get(i);
            // 5 .在循环中,判断获取的集合元素学号是否等于要修改学员的学号,如果相等,就修改,并提示修改成功
            if (stu.getSid() == id) {

                //键盘录入要修改的学生信息
                System.out.println("请输入学生新姓名：");
                String name = sc.next();
                System.out.println("请输入学生新年龄：");
                String age = sc.next();
                System.out.println("请输入学生新居住地：");
                String address = sc.next();

                // 修改学生对象的值
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);

                System.out.println("修改元素成功");
                return;
            }
        }
        System.out.println("因学号不存在,故修改元素失败!");
    }
```

#### 小结

### 实操--9 学生管理系统之删除学生

#### 需求

- 删除学生信息

  ![1584464376096](img\1584464376096.png)

#### 分析

- 定义一个方法,用于删除学员信息
  - 明确方法名	removeStudent
  - 明确返回值     没有返回值    返回值类型:void
  - 明确参数        有参数   参数类型:ArrayList<Student>
  - 明确方法体
    - 1.创建Scanner对象
    - 2.键盘录入需要删除学员的学号
    - 3.遍历集合中每一个元素
    - 4.在循环中,获取集合元素
    - 5.在循环中,判断获取的集合元素学号是否等于要删除学员的学号,如果相等,就删除,并提示删除成功,使用return结束方法
    - 6.循环结束后,提示因学号不存在,故删除元素失败!
- 调用方法

#### 实现

```java
public static void removeStudent(ArrayList<Student> list) {
    // 1.创建Scanner对象
    Scanner sc = new Scanner(System.in);

    // 2.键盘录入需要删除学员的学号
    System.out.println("请输入要删除学员的学号:");
    int id = sc.nextInt();

    // 3.遍历集合中每一个元素
    for (int i = 0; i < list.size(); i++) {
        // 4.在循环中,获取集合元素
        Student stu = list.get(i);
        // 5 .在循环中,判断获取的集合元素学号是否等于要删除学员的学号,如果相等,就删除,并提示删除成功
        if (stu.getSid() == id) {
            list.remove(i);
            System.out.println("删除元素成功");
            return;
        }
    }
    System.out.println("因学号不存在,故删除元素失败!");
}
```

#### 小结

- 略

