/*
 * required（必填项）
 * phone（手机号）
 * email（邮箱）
 * url（网址）
 * number（数字）
 * date（日期）
 * identity（身份证）
 * 自定义值
 */

layui.use(['form','layer','laydate'], function(){
    var form = layui.form,
        layer = layui.layer;

    //自定义验证规则
    form.verify({
        //名称验证
        myName: function(value, item){ //value：表单的值、item：表单的DOM对象
            if(value.trim().length < 2){
                return '名称至少2个字符';
            }
            if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                return '名称不能有特殊字符';
            }
        }
        //手机号自定义校验
        ,myPhone: [/^1[2-9][0-9]\d{4,8}$/, "请输入正确的手机号"]
        //邮箱自定义验证
        ,myEmail: [/^\s*$|^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/, "邮箱格式不正确"]
        //1到30正整数的正则表达式：^([12][0-9]|30|[1-9])$
        ,monthDay:[/^([12][0-9]|30|[1-9])$/,"请输入1-30的正整数"]

    });

});