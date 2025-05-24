package com.atguigu.lease.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)   //  fill = FieldFill.INSERT 表示插入时填充字段
    @JsonIgnore
    private Date createTime;

    @Schema(description = "更新时间")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)  // fill = FieldFill.UPDATE 表示更新时填充字段
    @JsonIgnore
    private Date updateTime;

    @Schema(description = "逻辑删除")
    @TableLogic  // 加入该注解表示是逻辑删除字段
    @JsonIgnore // 接口返回的对象中不需要该字段，让其序列化时忽略该字段
    @TableField("is_deleted")
    private Byte isDeleted;

}