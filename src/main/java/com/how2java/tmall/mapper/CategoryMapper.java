package com.how2java.tmall.mapper;
 
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;
 
public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();
    public void add(Category c);

    public void delete(int id);

    Category get(int id);

    void update(Category c);
}