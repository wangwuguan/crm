package com.tongdao.demo.validation.validator;

import com.tongdao.demo.validation.constraint.MyNameValid;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 19-8-19 上午11:22
 * @Description:
 */
public class MyNameValidator implements ConstraintValidator<MyNameValid, MultipartFile> {


    @Override
    public void initialize(MyNameValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
