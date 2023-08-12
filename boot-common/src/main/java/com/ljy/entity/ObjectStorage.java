package com.ljy.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class ObjectStorage {
    @TableId(type = IdType.ASSIGN_ID)
    String id;
    byte[] data;
    @Version
    int version;
    @TableLogic
    boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    Date createDate;
    @TableField(fill = FieldFill.UPDATE)
    Date updateDate;
}
