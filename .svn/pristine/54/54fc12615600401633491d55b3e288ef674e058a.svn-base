<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="toolbars">
    <ul>
        <li class="call-cla">
            <i></i>
            <img class="toolbars-ico" src="${ctxStatic}/images/call-icon.png">
            <%--<a class="toolbars-ico" href="#"></a>--%>
            <a class="flex" href="#">客服热线</a>
        </li>
        <li class="qq-cla">
            <img class="toolbars-ico" src="${ctxStatic}/images/24-icon.png">
            <a class="flex" href="#">企业QQ</a>
        </li>
        <li class="email-cla">
            <img class="toolbars-ico" src="${ctxStatic}/images/email-icon.png">
            <a class="flex" href="#">企业邮箱</a>
        </li>
    </ul>
    <div class="toolbars-footer">
        <img class="toolbars-ico" src="${ctxStatic}/images/top-icon.png">
        <a class="flex" href="#">顶部</a>
    </div>
</div>

<style>
    /*
**右侧悬浮框
*/
    .toolbars *{
        margin: 0;
        padding: 0;
    }
    .toolbars a:hover{
        color:#aa9144!important;
    }
    /*右侧固定图标菜单栏*/
    .toolbars{
        position: fixed;
        top: 0;
        right: 0;
        height: 100%;
        width: 6px;
    }
    .toolbars ul{
        position:absolute;
        top: 50%;
        right: 0;
        transform: translate(0,-40%);
        z-index: 3;
    }
    .toolbars ul li{
        width: 34px;
        height: 35px;
        margin-bottom: 2px;
        background-color: #7A6E6E;
        position: relative;
    }
    .toolbars-ico{
        display: block;
        width: 34px;
        height: 35px;
    }
    .toolbars-footer{
        position: absolute;
        bottom: 0;
        right: 0;
        background-color: #7A6E6E;
        width: 34px;
        height: 35px;
        z-index: 3;
    }
    /*鼠标悬浮后伸出的部分*/
    .toolbars .flex{
        position: absolute;
        top: 0;
        right: 34px;
        width: 0;
        overflow: hidden;
        height: 35px;
        line-height: 35px;
        background-color: #aa9144;
        text-align: center;
        color: #fff;
        z-index: -1;
        transition: width .3s;
    }
    /*鼠标悬浮后的效果*/
    .toolbars ul li:hover{
        background-color: #aa9144;
    }
    .toolbars ul li:hover .flex{
        width: 70px;
        background-color: #aa9144;
    }
    .toolbars ul li:hover i{
        display: none;
    }
    .toolbars-footer:hover{
        background-color: #aa9144;
    }
</style>