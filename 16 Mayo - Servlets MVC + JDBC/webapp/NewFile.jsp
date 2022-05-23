<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<html>
    <h0ead>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="Styles/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="Styles/bootstrap-4.1.0.min.js" type="text/javascript"></script>
        <link href="Styles/bootstrap-4.1.0.min.css" rel="stylesheet" type="text/css"/>
        <link href="Styles/MainStyle.css" rel="stylesheet" type="text/css"/>
        <title></title>
    </head>
    <body>
        <?php
        session_start();
        ?>
        <div class="container register">
            <div class="row">
                <div class="col-md-12">
                    <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Login Form 1</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Login Form 2</a>
                        </li>
                    </ul>
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active text-align form-new" id="home" role="tabpanel" aria-labelledby="home-tab">
                            <h3 class="register-heading">Login Form 1</h3>
                            <div class="row register-form">
                                <div class="col-md-12">
                                    <form method="post">
                                        <div class="form-group">
                                            <input type="text" name="LGform1_user" class="form-control" placeholder="Your Email *" value="" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="LGform1_pwd" class="form-control" placeholder="Your Password *" value="" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" name="LGform1" class="btnContactSubmit" value="Login" />
                                            <a href="ForgetPassword.php" class="btnForgetPwd" value="Login">Forget Password?</a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane fade show text-align form-new" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                            <h3  class="register-heading">Login Form 2</h3>
                            <div class="row register-form">
                                <div class="col-md-12">
                                    <form method="post">
                                        <div class="form-group">
                                            <input type="text" name="LGform2_user" class="form-control" placeholder="Your Email *" value="" required="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="LGform2_pwd" class="form-control" placeholder="Your Password *" value="" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" name="LGform2" class="btnContactSubmit" value="Login" />
                                            <a href="ForgetPassword.php" class="btnForgetPwd" value="Login">Forget Password?</a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>