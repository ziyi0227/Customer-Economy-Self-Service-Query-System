<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>舟山工具</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 样式表 -->
    <link rel="stylesheet" type="text/css" href="styles.css">
    <!-- 脚本文件 -->
<%--    <script type="text/javascript" src="scripts.js"></script>--%>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
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
    </script>
</head>
<body>
<header>
    <!-- 标题 -->
    <h1>舟山工具</h1>
    <!-- 小导航栏 -->
    <nav1>
        <ul>
            <li><a href="#">客经自助查询</a></li>
        </ul>
    </nav1>
</header>
<main>
    <section>
        <!-- 号码查询表单 -->
        <form>
            <label for="number">号码：</label>
            <input type="text" name="number" id="number">
            <button type="submit">查询</button>
        </form>
        <table>
            <tbody>
            <tr>
                <td>融合主卡:</td>
                <td id="user-data-number">${user-data.number}</td>
            </tr>
            <tr>
                <td>得分:</td>
                <td id="user-data-scores">${user-data.scores}</td>
            </tr>
            <tr>
                <td>套餐上月使用流量[G]:</td>
                <td id="user-data-tcyl">${user-data.tcyl}</td>
            </tr>
            <tr>
                <td>套餐上月语音使用量[分钟]:</td>
                <td id="user-data-tcyy">${user-data.tcyy}</td>
            </tr>
            <tr>
                <td>绑定优惠类型:</td>
                <td id="user-data-bdyh">${user-data.bdyh}</td>
            </tr>
            <tr>
                <td>套餐内活跃C网数:</td>
                <td id="user-data-tcnh">${user-data.tcnh}</td>
            </tr>
            <tr>
                <td>是否有二宽:</td>
                <td id="user-data-sfyk">${user-data.sfyk}</td>
            </tr>
            <tr>
                <td>宽带上月活跃天数:</td>
                <td id="user-data-kdyt">${user-data.kdyt}</td>
            </tr>
            <tr>
                <td>是否有小合约:</td>
                <td id="user-data-sfxy">${user-data.sfxy}</td>
            </tr>
            <tr>
                <td>是否携转查询用户:</td>
                <td id="user-data-sfxz">${user-data.sfxz}</td>
            </tr>
            <tr>
                <td>是否羊号用户:</td>
                <td id="user-data-sfyh">${user-data.sfyh}</td>
            </tr>
            </tbody>
        </table>
    </section>
</main>
<br>
<br>
<br>
<br>
<footer>
    <!-- 底部大导航栏 -->
    <nav>
        <ul>
            <li><a href="#">舟山工具</a></li>
        </ul>
    </nav>
</footer>
</body>
</html>