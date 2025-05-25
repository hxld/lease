package com.atguigu.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;


public enum ItemType implements BaseEnum {

    APARTMENT(1, "公寓"),

    ROOM(2, "房间");

    // 这是 MyBatis Plus 提供的注解，用于标记枚举类中表示数据库实际存储值的字段（或方法）。在这个文件中，code 字段被标记为 @EnumValue，表示该字段是枚举类与数据库交互时的持久化值
    @EnumValue
    // 这是 Jackson 提供的注解，用于指定在将枚举序列化为 JSON 格式时，输出的值对应哪个字段。在这个文件中，code 字段被标记为 @JsonValue，表示当枚举实例转换为 JSON 格式时，输出的是 code 的值。
    @JsonValue
    private Integer code;
    private String name;

    @Override
    public Integer getCode() {
        return this.code;
    }


    @Override
    public String getName() {
        return name;
    }

    ItemType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
