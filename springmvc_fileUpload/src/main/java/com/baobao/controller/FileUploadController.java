package com.baobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @author baobao
 * @create 2019-11-27 23:13
 * @description
 */
@Controller

public class FileUploadController {
    @RequestMapping("/fileUpload")
    public String testFileUpload (MultipartFile file, HttpServletRequest request) throws Exception{
        String originalFilename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        String fileName = uuid + originalFilename;
        String contextPath = request.getContextPath();
        String uploadPath = contextPath + "/uploads";
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()){
            uploadDir.mkdirs();
        }
        file.transferTo(new File(uploadDir,fileName));
        return "success";
    }
}
