package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式  Python video 类
 * @versions:1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python教学视频");
    }
}
