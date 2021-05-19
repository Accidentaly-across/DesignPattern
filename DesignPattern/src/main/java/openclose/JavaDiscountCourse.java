package openclose;

/**
 * @auther: liyf
 * @date: 2021/5/19
 * @description:
 * @versions:1.0
 */
public class JavaDiscountCourse  extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //开闭原则
    public  Double getOrignPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
