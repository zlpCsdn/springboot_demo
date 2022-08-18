package com.itcodai.course01.controller;

import com.itcodai.course01.entity.ChineseSearch;
import com.itcodai.course01.entity.UnInterception;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhou.liping4
 * @version 1.0
 * @description:  中文分词查询
 * @date 2022/8/18 10:43
 */
@Controller
@RequestMapping("/lucene")
public class SearchIndexController {

    @GetMapping("/test")
    @UnInterception
    public String test(Model model) {
        // 索引所在的目录
        String indexDir = "D:\\lucene2";
        // 要查询的字符
//        String q = "南京文明";
        String q = "南京文明";
        try {
            List<String> list = ChineseSearch.search(indexDir, q);
            model.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "result";
    }
}
