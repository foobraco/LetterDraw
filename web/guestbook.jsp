<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>


<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="Draw images with letters! And then you can download them!." />
        <meta name="keywords" content="html5,canvas,developer,javascript,processing,processingjs,letters,draw,image,bryan,alvarado,bryan alvarado" />
        <meta name="author" content="Bryan Alvarado" />
        <title>Letter Draw</title>
        <script src="base64.js"></script>
        <script src="canvas2image.js"></script>
        <script src="pfunctions.js"></script>
        <link href="http://fonts.googleapis.com/css?family=Amaranth:regular,400italic,700,700italic" rel="stylesheet" type="text/css">
        <style>
            * {
                font-family: 'Amaranth', serif;
            }
        </style>
        <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" media="screen" />
        <script type="text/javascript">
            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-20203105-4']);
            _gaq.push(['_trackPageview']);

            (function() {
                var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
            })();
        </script>
    </head>

    <body>
        <header>
            <h1>LetterDraw</h1>
            <span class="header-instruction">Expand for more info.</span>

            <!-- The extra content that can be expanded -->
            <div class="extra">

                <!-- About the game in general -->
                <section id="about">
                    <h3>About</h3>
                    <p>
	    				LetterDraw lets you draw anything you want, and with letters!!.<br>
	    				After you finish your masterpiece you can download it too!<br>
	    				Enjoy!
                    </p>
                    <p class="credits">
	    				Created by <a href="http://about.me/bryan.">Bryan Alvarado</a> | <a href="http://twitter.com/foobraco">@foobraco</a>
                    </p>
                </section>

                <!-- Different methods for sharing the game -->
                <section id="share">
                    <h3>Share</h3>
                    <div id="retweet-button">
                        <a href="http://twitter.com/share" class="twitter-share-button" data-url="http://letterdraw.appspot.com" data-text="Draw and download images made with letters by @foobraco" data-count="vertical" data-related="foobraco">Tweet</a>
                        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
                    </div>

                </section>

                <!-- Requirements -->
                <section id="requirements">
                    <h3>Requirements</h3>
                    <p>
	    				LetterDraw has been tested and confirmed to work<br>
	    				in Chrome, Safari and Firefox 4.
                    </p>
                </section>

            </div>
            <form>

                <input type="button" onclick="saveImage('mycanvas');" value="Download">
                <input type="button" onclick="eraseImage('mycanvas');" value="Reset">

                Choose your text: <input type="text" id="texto">
                <input type="button" onclick="changetext('mycanvas','texto');" value="Change">
            </form>
        </header>
        <script type="text/javascript"><!--
            google_ad_client = "ca-pub-9937813903719414";
            /* LetterDraw Adds */
            google_ad_slot = "5349433930";
            google_ad_width = 728;
            google_ad_height = 90;
            //-->
        </script>
        <script type="text/javascript"
                src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
        </script>
        </br>
        <script src="processing-1.1.0.js"></script>
        <canvas id="mycanvas" data-processing-sources="prueba.pjs" style="text-align: right"></canvas>

    

    </br></br>

</body>
</html>
