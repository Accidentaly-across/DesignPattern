package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式 ：Java工厂 子类继承工厂
 * @versions:1.0
 */
public class JavaVideoFactory  extends  VidoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo(); //生产Java
    }
}
