package com.pangpang;

import lombok.Getter;
import lombok.Setter;

import java.text.MessageFormat;

/**
 * Created by leewake on 2017/9/20 0020.
 *
 * @Data：注解在类上；提供类所有属性的 getting 和 setting 方法，
 * 此外还提供了equals、canEqual、hashCode、toString 方法
 *
 * @Setter：注解在属性上；为属性提供 setting 方法
 * @Getter：注解在属性上；为属性提供 getting 方法
 * @Log4j ：注解在类上；为类提供一个 属性名为log 的 log4j 日志对象
 * @NoArgsConstructor：注解在类上；为类提供一个无参的构造方法
 * @AllArgsConstructor：注解在类上；为类提供一个全参的构造方法
 *
 */

//@Component 加上这个，
// 在HelloAutoConfiguration中的@ConditionalOnMissingBean(Hello.class)这个注解不会起作用，相应的sys也不会输出
//@Data
public class Hello {

    @Setter
    @Getter
    public String message;

    /*public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/

        public String sayHello() {
            /**
             * 两种格式化字符串的方式
             */
            //return MessageFormat.format("Hello {0}!", message);
        return String.format("Hello %s!", message);
    }
}
