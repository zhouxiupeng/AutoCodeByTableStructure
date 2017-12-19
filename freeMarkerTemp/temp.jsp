<%@ page contentType="text/html;charset=UTF-8" %> 
       
                                    <li>
                                        <a href="javascript:;" class="nav-two" >
                                            <i class="fa icon fa-trash-o">
                                                <b class="bg-info"></b>
                                            </i>
                                            <span class="pull-right">
                                                <i class="fa fa-angle-down text"></i>
                                                <i class="fa fa-angle-up text-active"></i>
                                            </span>
                                            <span>自动生成页面</span>
                                        </a>
                                        <ul class="nav lt nav-three">

											<#list myClassList as myClass>
												<li>
                                                     <a href="${myClass.meiYuanFuHao}{BASE_URL}/back/${myClass.name}/index" class="load-content" id="1">
                                                        <i class="fa fa-angle-right"></i>
                                                        <span><#if myClass.noteMain=="">${myClass.name}<#else>${myClass.noteMain}</#if></span>
                                                    </a>
                                                </li>
											</#list>
											
                                        </ul>
                                    </li>