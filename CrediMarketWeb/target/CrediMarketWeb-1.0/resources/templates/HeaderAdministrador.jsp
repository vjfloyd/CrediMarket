<%-- 
    Document   : HeaderAdministrador
    Created on : Nov 23, 2014, 11:24:50 AM
    Author     : Vj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a class="navbar-brand" href="InicioRegistro.jsp">
                    <img src="../../resources/img/logo.png" width="32" height="32">
                   <a class="navbar-brand" href="#">CrediMarket</a>
            </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
   <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
         <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Configurar
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
               </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">Configurar Cuenta</a></li>
                <li><a href="#"> </a></li>
                <li><a href="#">Privacidad</a></li>
                <li class="divider"></li>
                <li><a href="#">Cerrar Sesion</a></li>
              </ul>
            </li>
          </ul>
        </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>