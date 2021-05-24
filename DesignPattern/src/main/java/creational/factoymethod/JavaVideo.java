package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式  Java video 类
 * @versions:1.0
 */
public class JavaVideo  extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java教学视频");
    }
}
