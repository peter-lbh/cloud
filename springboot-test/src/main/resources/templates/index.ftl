<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
</head>
<body>
    <form action="/caibaba/register" method="get">
        用户名：<input type="text" name="username" placeholder="请输入用户名"><br>
        密码：<input type="password" name="password" placeholder="请输入密码"><br>
        年龄：<input type="text" name="age" placeholder="请输入年龄"><br>
        爱好:<input type="checkbox" name="hobby" value="gx">搞笑
             <input type="checkbox" name="hobby" value="wzry">王者荣耀<br>

        部门:<select name="deptId.id">
                <#list dept as item>
                <option value="${item.id}">${item.deptName}</option>
                </#list>
            </select><br>
        提交:<input type="submit" value="提交">



    </form>
</body>
</html>