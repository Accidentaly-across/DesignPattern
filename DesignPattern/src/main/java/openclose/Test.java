package openclose;

/**
 * @auther: liyf
 * @date: 2021/5/19
 * @description: 开闭原则测试
 * @versions:1.0
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCoures = new JavaDiscountCourse(99,"java架构课程",348d);
        JavaDiscountCourse javaCoures = (JavaDiscountCourse) iCoures;
        System.out.println(" 课程ID:"+javaCoures.getId()+" 课程名称:"+javaCoures.getName()+"课程原价"+javaCoures.getOrignPrice()+" 课程价格:"+javaCoures.getPrice());
    }
}
