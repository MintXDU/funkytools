package org.keviin.funkytools.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("repository")
public class Repository {
    @TableId // 主键
    private Long id;
    private String name;
    private String description;
    private String url;
    private int likes;
}
