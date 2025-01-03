package cn.edu.nbpt.lilingyi.blogmanage.pojo.vo;

import cn.edu.nbpt.lilingyi.blogmanage.pojo.entity.Article;
import cn.edu.nbpt.lilingyi.blogmanage.pojo.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class ArticleCategoryVo extends Article {
    List<Category> categories;
}
