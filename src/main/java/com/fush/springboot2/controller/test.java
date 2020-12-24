/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: test
 * Author:   FUSH
 * Date:     2020/12/24 09:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.fush.springboot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author FUSH
 * @create 2020/12/24
 * @since 1.0.0
 */
@RestController
public class test {

    @RequestMapping("/gan")
    public String helloWord(){
        return "淦！";
    }


}