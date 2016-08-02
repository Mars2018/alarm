<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%@include file="common-header.jsp"%>
</head>

<body>

<!-- Header -->
<%@include file="common-title.jsp"%>

<div class="container-fluid-full">
    <div class="row-fluid">

        <!-- Mainmenu -->
        <%@include file="common-mainmenu.jsp"%>

        <noscript>
            <div class="alert alert-block span10">
                <h4 class="alert-heading">Warning!</h4>
                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
            </div>
        </noscript>

        <!-- start: Content -->
        <div id="content" class="span10">


            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="index.html">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Dashboard</a></li>
            </ul>

            <div class="row-fluid">

                <div class="span3 statbox purple" onTablet="span6" onDesktop="span3">
                    <div class="boxchart">5,6,7,2,0,4,2,4,8,2,3,3,2</div>
                    <div class="number">854<i class="icon-arrow-up"></i></div>
                    <div class="title">visits</div>
                    <div class="footer">
                        <a href="#"> read full report</a>
                    </div>
                </div>
                <div class="span3 statbox green" onTablet="span6" onDesktop="span3">
                    <div class="boxchart">1,2,6,4,0,8,2,4,5,3,1,7,5</div>
                    <div class="number">123<i class="icon-arrow-up"></i></div>
                    <div class="title">sales</div>
                    <div class="footer">
                        <a href="#"> read full report</a>
                    </div>
                </div>
                <div class="span3 statbox blue noMargin" onTablet="span6" onDesktop="span3">
                    <div class="boxchart">5,6,7,2,0,-4,-2,4,8,2,3,3,2</div>
                    <div class="number">982<i class="icon-arrow-up"></i></div>
                    <div class="title">orders</div>
                    <div class="footer">
                        <a href="#"> read full report</a>
                    </div>
                </div>
                <div class="span3 statbox yellow" onTablet="span6" onDesktop="span3">
                    <div class="boxchart">7,2,2,2,1,-4,-2,4,8,,0,3,3,5</div>
                    <div class="number">678<i class="icon-arrow-down"></i></div>
                    <div class="title">visits</div>
                    <div class="footer">
                        <a href="#"> read full report</a>
                    </div>
                </div>

            </div>

            <div class="row-fluid">

                <div class="span8 widget blue" onTablet="span7" onDesktop="span8">

                    <div id="stats-chart2"  style="height:282px" ></div>

                </div>

                <div class="sparkLineStats span4 widget green" onTablet="span5" onDesktop="span4">

                    <ul class="unstyled">

                        <li><span class="sparkLineStats3"></span>
                            Pageviews:
                            <span class="number">781</span>
                        </li>
                        <li><span class="sparkLineStats4"></span>
                            Pages / Visit:
                            <span class="number">2,19</span>
                        </li>
                        <li><span class="sparkLineStats5"></span>
                            Avg. Visit Duration:
                            <span class="number">00:02:58</span>
                        </li>
                        <li><span class="sparkLineStats6"></span>
                            Bounce Rate: <span class="number">59,83%</span>
                        </li>
                        <li><span class="sparkLineStats7"></span>
                            % New Visits:
                            <span class="number">70,79%</span>
                        </li>
                        <li><span class="sparkLineStats8"></span>
                            % Returning Visitor:
                            <span class="number">29,21%</span>
                        </li>

                    </ul>

                    <div class="clearfix"></div>

                </div><!-- End .sparkStats -->

            </div>

            <div class="row-fluid hideInIE8 circleStats">

                <div class="span2" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox yellow">
                        <div class="header">Disk Space Usage</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="58" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">20000</span>
								<span class="unit">MB</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">50000</span>
								<span class="unit">MB</span>
							</span>
                        </div>
                    </div>
                </div>

                <div class="span2" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox green">
                        <div class="header">Bandwidth</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="78" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">5000</span>
								<span class="unit">GB</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">5000</span>
								<span class="unit">GB</span>
							</span>
                        </div>
                    </div>
                </div>

                <div class="span2" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox greenDark">
                        <div class="header">Memory</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="100" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                        </div>
                    </div>
                </div>

                <div class="span2 noMargin" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox pink">
                        <div class="header">CPU</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="83" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">64</span>
								<span class="unit">GHz</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">3.2</span>
								<span class="unit">GHz</span>
							</span>
                        </div>
                    </div>
                </div>

                <div class="span2" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox orange">
                        <div class="header">Memory</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="100" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                        </div>
                    </div>
                </div>

                <div class="span2" onTablet="span4" onDesktop="span2">
                    <div class="circleStatsItemBox greenLight">
                        <div class="header">Memory</div>
                        <span class="percent">percent</span>
                        <div class="circleStat">
                            <input type="text" value="100" class="whiteCircle" />
                        </div>
                        <div class="footer">
							<span class="count">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                            <span class="sep"> / </span>
							<span class="value">
								<span class="number">64</span>
								<span class="unit">GB</span>
							</span>
                        </div>
                    </div>
                </div>

            </div>

            <div class="row-fluid">

                <div class="widget blue span5" onTablet="span6" onDesktop="span5">

                    <h2><span class="glyphicons globe"><i></i></span> Demographics</h2>

                    <hr>

                    <div class="content">

                        <div class="verticalChart">

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>37%</span>
                                    </div>

                                </div>

                                <div class="title">US</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>16%</span>
                                    </div>

                                </div>

                                <div class="title">PL</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>12%</span>
                                    </div>

                                </div>

                                <div class="title">GB</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>9%</span>
                                    </div>

                                </div>

                                <div class="title">DE</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>7%</span>
                                    </div>

                                </div>

                                <div class="title">NL</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>6%</span>
                                    </div>

                                </div>

                                <div class="title">CA</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>5%</span>
                                    </div>

                                </div>

                                <div class="title">FI</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>4%</span>
                                    </div>

                                </div>

                                <div class="title">RU</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>3%</span>
                                    </div>

                                </div>

                                <div class="title">AU</div>

                            </div>

                            <div class="singleBar">

                                <div class="bar">

                                    <div class="value">
                                        <span>1%</span>
                                    </div>

                                </div>

                                <div class="title">N/A</div>

                            </div>

                            <div class="clearfix"></div>

                        </div>

                    </div>

                </div><!--/span-->

                <div class="widget span3 red" onTablet="span6" onDesktop="span3">

                    <h2><span class="glyphicons pie_chart"><i></i></span> Browsers</h2>

                    <hr>

                    <div class="content">

                        <div class="browserStat big">
                            <img src="img/browser-chrome-big.png" alt="Chrome">
                            <span>34%</span>
                        </div>
                        <div class="browserStat big">
                            <img src="img/browser-firefox-big.png" alt="Firefox">
                            <span>34%</span>
                        </div>
                        <div class="browserStat">
                            <img src="img/browser-ie.png" alt="Internet Explorer">
                            <span>34%</span>
                        </div>
                        <div class="browserStat">
                            <img src="img/browser-safari.png" alt="Safari">
                            <span>34%</span>
                        </div>
                        <div class="browserStat">
                            <img src="img/browser-opera.png" alt="Opera">
                            <span>34%</span>
                        </div>


                    </div>
                </div>

                <div class="widget yellow span4 noMargin" onTablet="span12" onDesktop="span4">
                    <h2><span class="glyphicons fire"><i></i></span> Server Load</h2>
                    <hr>
                    <div class="content">
                        <div id="serverLoad2" style="height:224px;"></div>
                    </div>
                </div>

            </div>


            <div class="row-fluid">

                <a class="quick-button metro yellow span2">
                    <i class="icon-group"></i>
                    <p>Users</p>
                    <span class="badge">237</span>
                </a>
                <a class="quick-button metro red span2">
                    <i class="icon-comments-alt"></i>
                    <p>Comments</p>
                    <span class="badge">46</span>
                </a>
                <a class="quick-button metro blue span2">
                    <i class="icon-shopping-cart"></i>
                    <p>Orders</p>
                    <span class="badge">13</span>
                </a>
                <a class="quick-button metro green span2">
                    <i class="icon-barcode"></i>
                    <p>Products</p>
                </a>
                <a class="quick-button metro pink span2">
                    <i class="icon-envelope"></i>
                    <p>Messages</p>
                    <span class="badge">88</span>
                </a>
                <a class="quick-button metro black span2">
                    <i class="icon-calendar"></i>
                    <p>Calendar</p>
                </a>

                <div class="clearfix"></div>

            </div><!--/row-->



        </div><!--/.fluid-container-->

        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->

<div class="modal hide fade" id="myModal">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">×</button>
        <h3>Settings</h3>
    </div>
    <div class="modal-body">
        <p>Here settings can be configured...</p>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn" data-dismiss="modal">Close</a>
        <a href="#" class="btn btn-primary">Save changes</a>
    </div>
</div>

<%@include file="common-footer.jsp"%>

</body>
</html>
