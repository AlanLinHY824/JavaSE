package demo6;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        /*
            实现宠物吃东西，使用面向对象完成
            分析得到：
                宠物类：
                    方法：吃
                猫类：
                    重写方法：吃
                狗类：
                     重写方法：吃
                鸟类：
                    重写方法：吃
                 ...
                 当创建子类对象时，调用eat方法，执行的是子类重写后的eat方法，也就是父类的eat方法没有用到，但是不能删除，则可以将父类的eat方法编写为抽象的方法
                 抽象方法特点：
                    1、抽象方法使用abstract修饰
                    2、抽象方法必须没有方法体，没有大括号，直接以分号结束
                    3、有抽象方法的类必须是抽象类，但抽象类中不一定只有抽象方法
                    4、子类继承抽象类时，必须重写所有抽象方法，否则子类也需要定义为抽象类（大多数子类都需要重写父类的抽象方法）
                    5、抽象类不能实例化，也就是说抽象类是多态的一种形式
                    6、如果子类中用到父类的方法体（super.xx或不重写）最好不要写成抽象方法
         */

        Dog d=new Dog();
        d.eat();

        Cat c=new Cat();
        c.eat();

        Pet bird=new Bird();//多态
        bird.eat();//优先调用子类重写后的方法


    }
}