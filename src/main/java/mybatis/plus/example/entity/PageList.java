package mybatis.plus.example.entity;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

import java.util.List;

@Data
public class PageList<T> {
//    查询条数
    private Integer total;
//    当前查询大小
    private Integer size;
//    查询页数
    private Integer pages;
//    当前第几条开始
    private Integer pageStart;
//    当前第几条结束
    private Integer pageStop;
//    物品
    private List<T> items;
//    当前页数
    private Integer current;
}
