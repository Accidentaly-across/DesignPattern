package creational.simplefactoty;

/**
 * @auther: liyf
 * @date: 2021/5/24
 * @description: 简单工厂实现类
 * @versions:1.0
 */
public class VidoFactory {
    //通过反射实现简单工厂，一定原则上满足开闭原则
    public Video getVideo (Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

//    public  Video getVideo(String type){
//
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }
}
