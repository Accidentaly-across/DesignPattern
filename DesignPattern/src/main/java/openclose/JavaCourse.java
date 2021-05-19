package openclose;

/**
 * @auther: liyf
 * @date: 2021/5/18
 * @description: 开闭原则
 * @versions:1.0
 */
public class JavaCourse  implements ICourse{
    private  Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
