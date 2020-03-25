<!DOCTYPE html>
<!-- resources/templates/test2.ftl -->
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>金钱</td>
        <td>出生日期</td>
    </tr>
    <#if students??>
    <#list students as stu>
    <tr>
        <td>${stu_index}</td>
        <td <#if (stu.name == '刘备')>style="background-color: #108cee"</#if> >${stu.name}</td>
    <td <#if (stu.age < 20)>style="background-color: #108cee"</#if>>${stu.age}</td>
<td>${stu.money}</td>
<td>${stu.birthday?date},${stu.birthday?time},${stu.birthday?string("yyyy年MM月dd日")}</td>
</tr>
</#list>
</#if>
</table>
姓名：${stuMap['stu1'].name}
年龄: ${stuMap.stu1.age}
<#list stuMap?keys as k>
姓名: ${stuMap[k].name}
年龄: ${stuMap[k].age}
</#list>
${stuMap???c}//判断是否存在，和使用 ?c 输出字符串
${students???c}
${(mozq.bank.address)!'中国建设银行'}//默认值方式处理空值

${students?size}//集合大小
<#assign text="{'bank':'中国农业银行', 'address':'北大街'}">
<#assign data=text?eval>
开户行: ${data.bank} 地址: ${data.address}
${123456123?c}//不显示逗号分隔
${123456123}//默认显示逗号分隔
</body>
</html>