<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Community a Corporate Multipurpose Flat Bootstrap responsive Website Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Community Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Fugaz+One' rel='stylesheet' type='text/css'>
<!-- Owl Stylesheets -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<!----drop down----->
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
<!----font-Awesome----->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<!--light-box-files -->
<script src="js/jquery.chocolat.js"></script>
<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8" />
<!--light-box-files -->
<script type="text/javascript" charset="utf-8">
$(function() {
	$('.gallery a').Chocolat();
});
</script>
</head>
<body>
<div class="header">
		<div class="container">
			<div class="col-sm-3 logo">
			  <h1><a href="index.jsp"><span class="highlight">Infinity</span>DTH</a></h1>
			</div>
		    <div class="col-sm-9 logo_right">
		       <div class="social">
				  <a href="" class="link facebook" target="_parent"><span class="fa fa-facebook"></span></a>
				  <a href="" class="link twitter" target="_parent"><span class="fa fa-twitter"></span></a>
				  <a href="" class="link google" target="_parent"><span class="fa fa-google-plus"></span></a>
				  <a href="" class="link google" target="_parent"><span class="fa fa-linkedin"></span></a>
				  <a href="" class="link google" target="_parent"><span class="fa fa-tumblr"></span></a>
               </div>
			<!-- script for menu -->
			<span class="menu"></span>
			<div class="top-menu">
				<ul>
					<li><a href="#" class="btn btn-default btn-default_2 pull-left" data-toggle="modal" data-target="#applyModal">Login</a></li>
			
				
				</ul>
			</div>
			<div class="clearfix"> </div>
			<!-- Modal -->
				<div class="modal fade" id="applyModal" tabindex="-1" role="dialog" aria-labelledby="applyModalLabel" aria-hidden="true">
				  	<div class="modal-dialog modal-dialog_2">
				    	<div class="modal-content">
					      	<div class="modal-header">
					        	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">�</span></button>
					        	<h4 class="modal-title" id="myModalLabel">
					        		<div class="head_4">
			                          <p>Login</p>
			                        </div>
			                    </h4>
					      	</div>
	                        <div class="modal-body">
                             <form class="register" action = "LoginController" method = "post">
                               <div class="section">
                                <label for="username" class="field prepend-icon">
                                    <input type="text" name="username" id="username" placeholder="Username">
                                    <label for="username" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                               </div>
                               <div class="section">
                                <label for="password" class="field prepend-icon">
                                    <input type="password" name="password" id="password" placeholder="Password">
                                    <label for="password" class="field-icon">
                                        <i class="fa fa-lock"></i>
                                    </label>
                                </label>
                             </div>
                             <div class="section">
                                <div class="submit"><input type="submit" onclick="myFunction()" value="Login"></div>
                             </div>
                             <ul class="new">
								<li class="new_left"><p><a href="#">Forgot Password ?</a></p></li>
								<li class="new_right"><p class="sign">New here ?&nbsp;&nbsp;<a href="#" data-toggle="modal" data-target="#applyModal_1">Sign Up</a></p></li>
								<div class="clearfix"></div>
						     </ul>
                           </form>
                        </div>
				    </div>
				 </div>
				</div>
				 <!-- Modal -->
				
			
			  <div class="clearfix"></div>
		 </div>
	   </div>
</div>
<nav class="navbar nav_bottom" role="navigation">
 <div class="container">
 <!-- Brand and toggle get grouped for better mobile display -->

   <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
        <ul class="nav navbar-nav nav_1">
            <li class="current_page"><a href="index.jsp">Home</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
    	    <li><a href="help.jsp">Help</a></li>
        </ul>
        <div class="help_line"><div id="txtblnk"><p>HELP LINE : (+91)-9999999999</p></div></div>
     </div><!-- /.navbar-collapse -->
   </div>
</nav>
<script type="text/javascript">
		$(function() {
		blinkeffect('#txtblnk');
		})
		function blinkeffect(selector) {
		$(selector).fadeOut('slow', function() {
		$(this).fadeIn('slow', function() {
		blinkeffect(this);
		});
		});
		}
</script>
<div class="container">
  <table class="table table-hover" border ="1">
    <thead>
      <tr>
        <th>Location</th>
        <th>Details</th>
      </tr>
    </thead>
    <tbody>
      <tr>
      
        <td>Kolkata</td>
        <td>Phone No- 8908080980 <br> fax-162730 <br> Email Id-kolkata@infinity.com <br> Address-TATA Consultancy Services, Plot No. 96 , TCS Innovation Labs - Kolkata</td>
      </tr>
      <tr>
       <tr>
        <td>Delhi</td>
        <td>Phone No- 8906741980 <br> fax-562730 <br> Email Id-delhi@infinity.com <br> Address-TATA Consultancy Services, Plot No.71 </td>
      </tr>
      <tr>
      </tr>
      <tr>
      <tr>
        <td>Mumbai</td>
        <td>Phone No- 8907650997 <br> fax-512510 <br> Email Id-mumbai@infinity.com <br> Address-TATA Consultancy Services, Plot No.104,mumbai </td>
      </tr>
       
      
      <tr>
      <tr>
        <td>Bangalore</td>
        <td>Phone No- 8999066100<br> fax-345010 <br> Email Id-bangalore@infinity.com <br> Address-TATA Consultancy Services, Plot No.104,bangalore </td>
      </tr>
       
     
      <tr>
        <td>Ahmedabad</td>
        <td>Phone No-9989066180 <br> fax-785010 <br> Email Id-ahmedabad@infinity.com <br> Address-TATA Consultancy Services, Plot No.104,Ahmedabad </td>
      </tr>
       
     
    </tbody>
  </table>
</div>




<!-----------------footer--------------------------------------------->

<div class="box_2">
  <div class="container">
	  <div class="course_demo">
        <ul id="flexiselDemo3">	
		  <li><img src="images/sony.jpg" class="img-responsive" alt=""/></li>
		  <li><img src="images/star.jpg" class="img-responsive" alt=""/></li> 
		  <li><img src="images/cartoon.png" class="img-responsive" alt=""/></li> 
		  <li><img src="images/zee.jpg" class="img-responsive" alt=""/></li> 
		 </ul>
		<script type="text/javascript">
			$(window).load(function() {
				$("#flexiselDemo3").flexisel({
					visibleItems: 4,
					animationSpeed: 1000,
					autoPlay: true,
					autoPlaySpeed: 3000,    		
					pauseOnHover: true,
					enableResponsiveBreakpoints: true,
			    	responsiveBreakpoints: { 
			    		portrait: { 
			    			changePoint:480,
			    			visibleItems: 1
			    		}, 
			    		landscape: { 
			    			changePoint:640,
			    			visibleItems: 2
			    		},
			    		tablet: { 
			    			changePoint:768,
			    			visibleItems: 2
			    		}
			    	}
			    });
			    
			});
		</script>
		<script type="text/javascript" src="js/jquery.flexisel.js"></script>
   </div>
  </div>
</div>


<div class="footer_widget">
	<div class="container">
		<div class="col-md-4">
			<aside id="text-1" class="widget widget_text">
				<h3 class="widget-title"><span>SERVICES WE OFFER</span></h3>
				<div class="textwidget"><p>Some of the services that user can avail are </p>
				   <p><em style="color: #fff;">Video On Demand,<br> Movie On Demand,<br> Personalised channel packages,<br>Mutiple SetTopBox purchases</em></p>
				</div> 
			</aside>
		</div>
		<div class="col-md-4">
			<aside id="text-2" class="widget widget_text">
				<h3 class="widget-title"><span>MORE ABOUT US</span></h3>
				<div class="textwidget">
					<p>Infinity DTH Services gives freedom to its customers to select channels of their choice, customize 
their own entertainment packages and pay just for the same. As a plethora of channel packs are accessible, the customers have the free hand to build their 
package to suit their taste and budget. Upping the entertainment quotient, Infinity DTH also provides its customers with features like radio channels, electronic 
program guide, parental lock, capacity for more than 500+ channels and movies on demand.</p></div>
		    </aside>
		</div>
		<div class="col-md-4">
			<aside>
				<h3 class="widget-title"><span>MANAGEMENT</span></h3>
				<ul class="gallery">
					<li><a href="images/ps.jpg" class="img-responsive" title="Prateek" >
						<img src="images/ps.jpg" class="img-responsive" alt="name">
					   </a>
					</li>
					<li><a href="images/sh.JPG" class="img-responsive" title="Shreyansha" >
						<img src="images/sh.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
					<li><a href="images/pranali.JPG" class="img-responsive" title="Pranali" >
						<img src="images/pranali.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
					<li class="last">
						<a href="images/go.JPG" class="img-responsive" title="Gourav" >
						<img src="images/go.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
					<li>
						<a href="images/vivek.JPG" class="img-responsive" title="Vivek" >
						<img src="images/vivek.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
					<li>
					   <a href="images/kalyan.JPG" class="img-responsive" title="Kalyan">
						<img src="images/kalyan.JPG" class="img-responsive" alt="name">
					   </a>
				    </li>
					<li>
						<a href="images/vp.JPG" class="img-responsive" title="Vipin">
						<img src="images/vp.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
					<li>
						<a href="images/as.JPG" class="img-responsive" title="Ashish" >
						<img src="images/as.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
				    <li>
						<a href="images/bishal.JPG" class="img-responsive" title="Bishal" >
						<img src="images/bishal.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
				  <li>
						<a href="images/su.JPG" class="img-responsive" title="Sukrithi" >
						<img src="images/su.JPG" class="img-responsive" alt="name">
					   </a>
					</li>
				    <li>
						<a href="images/nitish.jpg" class="img-responsive" title="Nitish" >
						<img src="images/nitish.jpg" class="img-responsive" alt="name">
					   </a>
				    </li>
				    <li class="last">
						<a href="images/Sandeep.JPG" class="img-responsive" title="Sandeep">
						<img src="images/Sandeep.JPG" class="img-responsive" alt="name">
					   </a>
				    </li>
				
				</ul>
			</aside>
		</div>
	</div>
</div>
<div class="footer_middle">
	<div class="container">
        <div class="col-sm-7">
          <div class="footer-icons"> 
          	<a href="#" class="social-icon"><i class="fa fa-twitter has-circle"></i></a> 
          	<a href="#" class="social-icon"><i class="fa fa-facebook has-circle"></i></a> 
          	<a href="#" class="social-icon"><i class="fa fa-google-plus has-circle"></i></a> 
          	<a href="#" class="social-icon"><i class="fa fa-linkedin has-circle"></i></a> 
          	<div class="clearfix"> </div>
          </div>
        </div>
      
    </div>
</div>		
<div class="footer_bottom">
	<div class="container">
		<div class="copy">
            <p>Copyright � 2016 Group 1 and Group 6 . All Rights Reserved | Design by Group1 and Group 6</p>
         </div>
	</div>
	
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;">Top </span></a>
      <script type="text/javascript" src="js/move-top.js"></script>
      <script type="text/javascript" src="js/easing.js"></script>
      <script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
	  			containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
	 		};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	  </script>
</div>	
<!----language selector----->
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link href="css/jquery.uls.css" rel="stylesheet"/>
<link href="css/jquery.uls.grid.css" rel="stylesheet"/>
<link href="css/jquery.uls.lcd.css" rel="stylesheet"/>
<!-- Source -->
<script src="js/jquery.uls.data.js"></script>
<script src="js/jquery.uls.data.utils.js"></script>
<script src="js/jquery.uls.lcd.js"></script>
<script src="js/jquery.uls.languagefilter.js"></script>
<script src="js/jquery.uls.regionfilter.js"></script>
<script src="js/jquery.uls.core.js"></script>
<script>
	$( document ).ready( function() {
		$( '.uls-trigger' ).uls( {
			onSelect : function( language ) {
				var languageName = $.uls.data.getAutonym( language );
				$( '.uls-trigger' ).text( languageName );
			},
			quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
		} );
	} );
</script>		
<!-- FlexSlider -->
<link href="css/flexslider.css" rel='stylesheet' type='text/css' />
<script defer src="js/jquery.flexslider.js"></script>
	  <script type="text/javascript">
		$(function(){
		  SyntaxHighlighter.all();
		});
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	  </script>
<!-- FlexSlider -->		
</body>
</html>
