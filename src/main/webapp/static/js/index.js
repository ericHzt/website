/**
 * Created by zhangyi on 2019-03-14.
 */
$(function () {
    //清空原有的菜单，重加载
    $("#menuTag").empty();
    var obj_span_href = new Array(
        '<li><a href="javascript:void(0);" class="active" data-page="index.jsp" title="首页" onClick="gotoPage(this)"><h3>首页</h3></a></li>  '
        ,'<li><a href="javascript:void(0);" data-page="aboutUs.jsp" title="关于我们" onClick="gotoPage(this)"><h3>关于我们</h3></a></li>   '
        ,'<li><a href="javascript:void(0);" data-page="hhService.jsp" title="猎头服务" onClick="gotoPage(this)"><h3>猎头服务</h3></a></li>' +
        ',<li><a href="javascript:void(0);" data-page="hhPose.jsp" title="猎头职位" onClick="gotoPage(this)"><h3>猎头职位</h3></a></li>'+
        ',<li><a href="javascript:void(0);" data-page="successCase.jsp" title="成功案例" onClick="gotoPage(this)"><h3>成功案例</h3></a></li> ');
    var contL = $('#menuTag');
    contL.append(obj_span_href);

    cont = $('.header-page');
    contR = $('#menuTag', cont);
    $('a.active', contR).removeClass('active');
    var pageUrl = window.location.pathname.split("/");
    $('a[data-page="'+pageUrl[pageUrl.length-1]+'"]', contR).addClass('active');
    $('a[data-page="'+pageUrl[pageUrl.length-1]+'"]', contR).css("border-bottom","3px solid #aa9144");

    //全局监听a click事件
    // var cont = $('.header-page');
    // var contR = $('#menuTag', cont);
    // var _loading, page;
    // contR.on('click', 'a', function(){
    //     if(_loading)
    //         return;
    //
    //     _loading = true;
    //     page = $(this).data('page');
    //
    //     if(!page)
    //         return;
    //
    //     $('a.active', contR).removeClass('active');
    //     $(this).addClass('active');
    //
    //     // $('.load-page', cont).empty().load(page, function(){
    //     //     $(".load-page .header").remove();//去掉重复加载
    //     //     _loading = false;
    //     // })
    //     window.location.replace(page);
    // });
    // $('a.active').click();
});

var cont;
var contR;
var _loading, page;

function gotoPage(e){
    // if(_loading)
    //         return;

        page = $(e).data('page');

        if(!page)
            return;

        $('a.active', contR).removeClass('active');
        $(e).addClass('active');

        // $('.load-page', cont).empty().load(page, function(){
        //     $(".load-page .header").remove();//去掉重复加载
        //     _loading = false;
        // })
        window.location.replace(page);
}