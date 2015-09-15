<%-- 
    Document   : RegistrarTienda
    Created on : Nov 24, 2014, 12:45:29 AM
    Author     : Vj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Log In</title>
        <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../resources/css/styles.css" rel="stylesheet">
        <script src="../../resources/js/jquery-1.11.1.min.js"></script>
        <script src="../../resources/js/bootstrap.min.js"></script>

    </head>

    <header>
        <%@include file="../../resources/templates/HeaderRegistro.jsp" %>
    </header>
    <body>
        <div class="bg"></div>
        <br/>
        <br/>
        <br/>

        <div class="container ">
            <div class="row clearfix alinear">


                <div class="col-xs-1 col-sm-2 col-md-4"></div>
                <div class="row clearfix alinear">

                    <form role="form"  action="<%= request.getContextPath()%>/AgregarUsuarioController" method="post" >

                        <div class="col-xs-1 col-sm-5 col-lg-8">
                        </div>
                        <div class="col-xs-10 col-sm-7 col-lg-4">

                            <div class="form-group">
                                <label for="InputName" class="text-blanco">Nombre de Establecimiento: </label>
                                <input type="text" class="form-control" name="txtTienda" id="InputName" placeholder="Ingrese usuario" required pattern="\w+">
                            </div>
                            <div class="form-group">
                                 <label for="InputName" class="text-blanco"> Usuario/Representante : </label>
                                <input title="La contraseña debe contener al menos 6 caracteres" 
                                       name="txtRepresentante"
                                       type="password"
                                       class="form-control"
                                       required pattern="[0-9A-Za-z]{6,12}"
                                       placeholder="Ingrese contraseña"
                                       onchange=" this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
                                               if (this.checkValidity())
                                                   form.txtClave2.pattern = this.value;">
                            </div>

                            <div class="form-group">
                                 <label for="InputName" class="text-blanco">Correo Electrónico </label>
                                <input title="Las contraseñas no coinciden" 
                                       type="password" 
                                       class="form-control"
                                       required pattern="[0-9A-Za-z]{6,12}" 
                                       name="txtCorreo"
                                       placeholder="Ingrese contraseña nuevamente"
                                       onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');">
                            </div>

                            <div class="form-group">
                                <label for="InputName" class="text-blanco">Usuario</label>
                                <input name="txtUsuario" title="Ingrese un correo válido" type="email" class="form-control" id="InputEmailFirst" name="txtEmail1" placeholder="Ingrese correo electrónico" required>
                            </div>

                            <div class="form-group">
                                  <label for="InputName" class="text-blanco">Contraseña </label>
                                  <input title="La contraseña debe contener al menos 6 caracteres" 
                                       type="password"
                                       class="form-control"
                                       required pattern="[0-9A-Za-z]{6,12}"
                                       name="txtClave"
                                       placeholder="Ingrese contraseña"
                                       onchange=" this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
                                               if (this.checkValidity())
                                                   form.txtClave2.pattern = this.value;">
                            </div>
                            <div class="form-group">
                                <label for="InputName" class="text-blanco">Contraseña </label>
                                 <input title="Las contraseñas no coinciden" 
                                       type="password" 
                                       class="form-control"
                                       required pattern="[0-9A-Za-z]{6,12}" 
                                       name="txtClave2"
                                       placeholder="Ingrese contraseña nuevamente"
                                       onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');">
                                
                            </div>

                            <div>
                                <input type="submit" name="txtAction" id="submit" value="Registrar" class="btn btn-info pull-right btn-lg btn-block" onsubmit="mostrar()"/>
                            </div>
                        </div>
                        <div class="col-xs-1"></div>
                    </form>
                </div>
                <div class="col-xs-1 col-sm-2 col-md-4"></div>
            </div>
        </div>
    </body>
</html>
