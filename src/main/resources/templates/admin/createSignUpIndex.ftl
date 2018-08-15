<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>报名创建</title>
    <link rel="stylesheet" href="${request.contextPath}/static/css/bootstrap.css">
    <link rel="stylesheet" href="${request.contextPath}/static/css/blue.css">
</head>

<style>
    .mBlock {
        display: block;
    }
</style>
<body>
<div class="container-fluid" style="padding: 0px">
    <ul class="nav nav-pills nav-stacked navbar-fixed-top" style="width: 100px;margin-top: 20px">
        <li role="presentation" class="active"><a href="javascript:;">添加组件</a></li>
        <li role="presentation"><a href="#">文本框</a></li>
        <li role="presentation"><a href="#">单选框</a></li>
        <li role="presentation"><a href="#">多选框</a></li>
        <li role="presentation"><a href="#">文本域</a></li>
        <li role="presentation"><a href="#">下拉框</a></li>
    </ul>
    <div class="navbar-fixed-top" style="width: 15%; height: 600px;right:0;left:85%;background: url('${request.contextPath}/static/images/handbg.jpg');overflow: scroll;border: 5px solid #000;">
        <div>
            <img class="img-responsive" style="width: 100%;"
                 src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534316475935&di=d58beb9148d391bed5c1b89b50c64a4d&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0198ff55c4790b32f8755e66585796.jpg%402o.jpg"
                 alt="">
            <div>
                <h3 class="text-center">天马行空团队报名</h3>
                <div class="row" style="padding: 20px;margin: 0">
                    <form>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">姓名</label>
                                <input type="text" class="form-control" placeholder="请输入您的姓名">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">姓名</label>
                                <input type="text" class="form-control" placeholder="请输入您的姓名">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">兴趣爱好</label>
                                <label>
                                    <input class="icheckbox_square-blue" type="checkbox"> 篮球
                                </label>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">点击报名</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="container" style="background: url('${request.contextPath}/static/images/handbg.jpg');padding: 0">
        <div>
            <img class="img-responsive" style="width: 100%;"
                 src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534316475935&di=d58beb9148d391bed5c1b89b50c64a4d&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0198ff55c4790b32f8755e66585796.jpg%402o.jpg"
                 alt="">
            <div>
                <h3 class="text-center">天马行空团队报名</h3>
                <div class="row" style="padding: 20px;margin: 0">
                    <form>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">姓名</label>
                                <input type="text" class="form-control" placeholder="请输入您的姓名">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">姓名</label>
                                <input type="text" class="form-control" placeholder="请输入您的姓名">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="mBlock">兴趣爱好</label>
                                <label>
                                    <input class="icheckbox_square-blue" type="checkbox"> 篮球
                                </label>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">点击报名</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="${request.contextPath}/static/js/bootstrap.js"></script>
<script src="${request.contextPath}/static/js/icheck.min.js"></script>
<script>
    $(document).ready(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '10%' // optional
        });
    });
</script>
</html>