package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式 Python工厂子类继承工厂
 * @versions:1.0
 */
public class PythonVideoFactory extends VidoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo(); //生产python
    }
}
