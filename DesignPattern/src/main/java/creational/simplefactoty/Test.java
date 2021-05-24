package creational.simplefactoty;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 简单工厂测试类
 * @versions:1.0
 */
public class Test {
    public static void main(String[] args) {

//        Video video = new JavaVideo();  //不使用简单工厂实现
//        video.produce();

        //简单工厂实现
//        VidoFactory vidoFactory = new VidoFactory();
//        Video video = vidoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        //简单工厂反射实现
        VidoFactory vidoFactory = new VidoFactory();
        Video video = vidoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();

    }
}