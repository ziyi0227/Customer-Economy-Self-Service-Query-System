$(function() {
    // 为查询按钮绑定点击事件
    $('button[type="submit"]').click(function(event) {
        event.preventDefault(); // 阻止表单默认提交
        var number = $('#number').val(); // 获取用户输入的号码
        $.post('/SimpleH5_war_exploded/DataQueryServlet', {number: number}, function(data) {
            // 请求成功后更新表格内容
            $('#user-data-number').text(data.number);
            $('#user-data-scores').text(data.scores);
            $('#user-data-tcyl').text(data.tcyl);
            $('#user-data-tcyy').text(data.tcyy);
            $('#user-data-bdyh').text(data.bdyh);
            $('#user-data-tcnh').text(data.tcnh);
            $('#user-data-sfyk').text(data.sfyk);
            $('#user-data-kdyt').text(data.kdyt);
            $('#user-data-sfxy').text(data.sfxy);
            $('#user-data-sfxz').text(data.sfxz);
            $('#user-data-sfyh').text(data.sfyh);
        });
    });
});