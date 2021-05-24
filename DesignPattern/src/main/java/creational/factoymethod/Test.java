package creational.factoymethod;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 工厂模式测试类
 * @versions:1.0
 */
public class Test {
    public static void main(String[] args) {
    VidoFactory vidoFactory = new JavaVideoFactory(); // 如想切换Python课程 new PythonVideoFactory 即可
    Video video = vidoFactory.getVideo();
    video.produce();

    }
}