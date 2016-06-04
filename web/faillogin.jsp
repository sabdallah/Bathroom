<%-- 
    Document   : faillogin
    Created on : Jun 3, 2016, 10:42:53 AM
    Author     : sam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LooReviews | Login</title>
        <meta charset="utf-8">
        
        <meta name="robots" content="noindex, nofollow">
        <meta name="googlebot" content="noindex">
        <meta http-equiv="X-UA-Compatible" content="IE=9,chrome=1">
        <meta name="viewport" content="initial-scale = 1.0,maximum-scale = 1.0">
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <meta name="description" content="Site desciption goes here">
        <meta name="keywords" content="Site keywords go here">
        <meta name="author" content="Jonathan Prusik">
        <meta name="twitter:card" content="summary">
        <meta name="twitter:site" content="@jprusik">
        <meta name="twitter:creator" content="@jprusik">
        <meta name="twitter:title" content="Title for Twitter card">
        <meta name="twitter:description" content="Description for Twitter card">
        <meta name="twitter:image:src" content="/static/favicon-large.png">
        <meta name="twitter:domain" content="Domain for Twitter card">
        <link rel="icon" type="image/x-icon" href="http://looreviews.com/static/favicon.ico">
        <!-- Bootstrap -->
        <link href="http://looreviews.com/static/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <link rel="stylesheet" href="http://looreviews.com/static/css/font-awesome.min.css">
        <!-- Font Awesome by Dave Gandy - http://fortawesome.github.com/Font-Awesome -->
        <script src="http://looreviews.com/static/js/jquery-2.1.0.min.js"></script>
        <script src="http://looreviews.com/static/js/jquery-ui/jquery-ui.min.js"></script>
        <script src="http://looreviews.com/static/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="http://looreviews.com/static/css/global.css">
        <script src="http://looreviews.com/static/js/global.js"></script>
        
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

        <style>

            .navbar-brand{
                padding:0;
            }
        </style>
        
<style type="text/css">
    .jumbotron{
        /* placeholder image */ /*background-image:url('http://c1.tacdn.com/img2/popups/homepage_chania_1482x500.jpg');*/
        /*background-image:url('http://bandacpa.com/wp-content/uploads/2015/01/Awesome-Modern-Bathroom-Ideas-With-Large-Windows-And-Wall-Mirror-Also-Glass-Door-Shower-Room-Design.jpg');*/
        background-image:url('http://looreviews.com/static/img/placeholder-background.jpg');
        background-size:cover;
        background-position: center;
        background-color:#EEEEEE;
    }
    div.auto_complete_results{
        width: 70%;
        max-width: 407px;
        font-family:Helvetica, Arial, sans-serif;
        font-size: 12px;
        position: absolute;
        background: #FFFFFF;
        z-index: 50;
        border-color:#87CEEB;
        border-style:solid;
        border-width:0 1px 1px 1px;
        border-radius:0 0 4px 4px;
        box-shadow: 1px 0 3px #D3D3D3;
        list-style: none;
        margin: 0;
        padding: 0;
    }
    div.auto_complete_results a{
        padding:0.5em;
        text-decoration: none;
        width:100%;
    }
    div.auto_complete_results li{
        cursor:pointer;
    }
    div.auto_complete_results li a{
        color:#3d3d3d;
    }
    div.auto_complete_results li:hover{
        background:slategrey;
    }
    div.auto_complete_results li:hover a{
        color:#FFFFFF;
        text-decoration: underline;
    }
    .list-group-item{
        border-color:#FFFFFF;
    }
    .hotel-group-item.first{
        border-top-color:#DDDDDD;
    }
    .list-group-item:first-child {
        border-top-left-radius:0;
        border-top-right-radius:0;
    }
    .list-group-item span.search-content{
        width: 80%;
        display: inline-block;
        text-align: left;
    }
    .list-group-item span.search-label{
        font-size: 10px;
        color: #31b0d5;
        float: right;
        display: inline-block;
        text-align: right;
        width: 20%;
    }
    .list-group-item span.search-label i{
        font-size:13px;
        width:10px;
        text-align:left;
        margin-left:5px;
    }

    /* Homepage well styling */
    .well{
        background-color:#FFFFFF;
        border:1px solid #ADD8E6;
    }

    @media only screen and (max-width:460px){
        .list-group-item span.search-label span.text{
            display:none;
        }
    }
</style>
<script src="http://looreviews.com/static/js/jquery.typeahead.min.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">
                        
                        <!-- <svg width="172" height="40" style="padding-left:15px;max-height:40px;width:auto;margin:5px 1em 5px 0;">
                            <image xlink:href="/static/img/logo-wtag.svg" src="/static/img/logo.png" width="172" height="40" />
                        </svg> -->
                        <a href="index.html">
                        <img style="padding-left:15px;max-height:40px;width:auto;margin:5px 1em 5px 0;" src="http://looreviews.com/static/img/logo.png" alt=""LooReviews Home"  />
                        </a>
                    </a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    
                    <ul class="nav navbar-nav navbar-right">
                    
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-user fa-fw"></i> Log in with <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="login.html"><i style="color:#3b5998;width:20px;" class="fa fa-thumbgs-o-up"></i> LooReviews</a></li>
                                <li><a href="/login/fb/"><i style="color:#3b5998;width:20px;" class="fa fa-facebook"></i> Facebook</a></li>
                                <li><a href="/login/tw/"><i style="color:#2290bf;width:20px;" class="fa fa-twitter"></i> Twitter</a></li>
                                <li><a href="/login/li/"><i style="color:#4875B4;width:20px;" class="fa fa-linkedin"></i> LinkedIn</a></li>
                            </ul>
                        </li>
                        
<li>
    <a href="register.html"><i style="color:#3b5998;width:20px;" class="fa fa-user-plus"></i> Register</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="clear" style="height:70px;"></div>
        <div class="modal fade" id="bootstrap-lightscreen" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-body">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

         
        

<div class="container">
            <div class="col-md-12">
                <form name="Login" action="LoginServlet" method="post">  

                    <div class="form-group">
                        <label for="exampleInputUsernameOrEmail">Username or Email</label>
                        <input type="text" name="usernameOrEmail" class="form-control" id="exampleInputUsernameOrEmail" placeholder="Enter username or email">
        
                    <div class="form-group">
                        <label for="exampleInputPassword">Password</label>
                        <input type="password" name="password" class="form-control" placeholder="Enter password">
                    </div>
                    <p>ERROR: <jsp:getProperty name="error" property="string" /></p>

                    <br>

                    <input type="submit" class="btn btn-block btn-lg btn-primary" value="Login" name="Login Button"/>  
                </form>
            </div>
        </div>
        

        <footer class="footer">
            <div class="container">
                <ul class="text-muted list-inline">
                    <li>&copy; 2014 LooReviews</li>
                    <li><a href="about.html">About</a></li>
                    <li><a href="blog.html">Blog</a></li>
                    <li><a href="termsAndConditions.html">Terms and conditions</a></li>
                </ul>
                
                 
            </div>
        </footer>
    </body>
</html>
