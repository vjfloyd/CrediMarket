<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Log In</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/css/styles.css" rel="stylesheet">
        <script src="resources/js/jquery-1.11.1.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>

    </head>
    <header>
        <%@include file="resources/templates/HeaderRegistro.jsp" %>
    </header>
    <body>
        <div class="bg"></div>
        <br/>
        <br/>
        <br/>

        <div class="container ">
            <div class="row clearfix alinear">


                <div class="col-xs-1 col-sm-2 col-md-4">
                </div>
                <div class="col-xs-10 col-sm-8 col-md-4">
                    <form  action="IniciarSesionServlet"  method="post">
                        
                        <div class="form-group">
                            <label for="InputName" class="text-blanco">Usuario</label>
                            <input type="text" class="form-control" name="txtUsuario" id="InputName" placeholder="Ingrese Usuario" required>
                        </div>
                        <div class="form-group">
                            <label for="InputClave" class="text-blanco">Contraseña</label>
                            <input type="password" class="form-control" name="txtClave" id="InputClave"  placeholder="Ingrese Contraseña" required>
                        </div>
                        <input type="submit" name="btnIniciar" id="submit" value="Iniciar Sesion" class="btn btn-info pull-right btn-130">
                        
                    </form>
                </div>
                <div class="col-xs-1 col-sm-2 col-md-4">
                </div>
            </div>
        </div>
    </body>
</html>