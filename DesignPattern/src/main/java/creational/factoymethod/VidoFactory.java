package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式 创建者只负责生产，不负责具体生产类型，子类负责具体生产类型
 * @versions:1.0
 */
public abstract class VidoFactory {

    public abstract Video getVideo ();

}
