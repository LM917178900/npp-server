package com.leinovo.npp.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("xxx_test")
public class Xxx {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;
    private String type;
    private String header;
    private String body;


}
