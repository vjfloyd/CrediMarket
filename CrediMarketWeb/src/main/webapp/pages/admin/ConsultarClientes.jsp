<%@page import="java.util.List"%>
<%@page import="pe.com.credimarket.dao.entity.Usuario"%>
<%@page import="pe.com.credimarket.web.util.WebUtil"%>
<%@page import="pe.com.credimarket.service.UsuarioService"%>
<%
   
    UsuarioService usuarioService = (UsuarioService)WebUtil.obtenerService("USUARIO");
   
    List<Usuario> listaUser = null;
    Usuario usuario = null;
    
    try{
        listaUser = usuarioService.listar();
    }catch(Exception ex){
       // mensaje = WebUtil.controlarError(ex);
    }
            

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>ConsultarClientes</title>

        <!-- Bootstrap -->
        <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../resources/css/styles.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <header>
        <%@include file="../../resources/templates/HeaderUsuario.jsp" %>
    </header>
    <body class="backfondo">


        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../../resources/js/bootstrap.min.js"></script>
        <div class="container">
            <div class="row">
                <div class="col-md-3 fondoSide">
                    <div class="list-group ">
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                        <a href="Index.jsp" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading "> Historia </h4>
                        </a>
                        <a href="AdministrarCreditos.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Administrar Crédito </h4>
                        </a>
                        <a href="ConsultarClientes.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Consultar Clientes </h4>
                        </a>
                        <a href="RegistrarCliente.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Registrar Cliente </h4>
                        </a>
                        <a href="Cronograma.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Cronograma </h4> 
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading"></h4>
                        </a>
                    </div>
                </div>
                <div class="col-md-9">

                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <strong> <center> Relación de  Clientes </center> </strong>
                        </div>
                        <div class="panel-body">

                            <div class="row">
                                        <form action="EliminarUsuarioController" method="post">
                                                <table class="table table-hover table-striped table-responsive">
                                                    <thead class="tabla-titulo">
                                                    <th>
                                                        DNI
                                                    </th>
                                                    <th>
                                                        Apodo
                                                    </th>
                                                    <th>
                                                        Nombre
                                                    </th>
                                                    <th>
                                                        Ap. Paterno
                                                    </th>
                                                    <th>
                                                        Correo
                                                    </th>
                                                    <th>
                                                        Domicilio
                                                    </th>
                                                    <th>
                                                        Teléfono 
                                                    </th>
                                                    </thead>

                                                    <tbody>
                                                        <%
                                                            for (Usuario u : listaUser) {
                                                        %>
                                                        <tr>
                                                            <td> <%=  u.getIdUsuario() %></td>
                                                            <td> <%=  u.getApodo()  %></td>
                                                            <td> <%=  u.getNombre() %></td>
                                                            <td> <%=  u.getApellidoPat() %></td>
                                                            <td> <%=  u.getCorreo() %></td>
                                                            <td> <%=  u.getDomicilio() %></td>
                                                            <td> <%=  u.getTelefono() %></td>
                                                            
                                                            <td>
                                                                <button type="submit" name="txtCodigo" value="<%= u.getIdUsuario()%>" class="btn btn-primary btn-xs">Eliminar</button>
                                                            </td>
                                                        </tr>
                                                        <%
                                                            }
                                                        %>
                                                    </tbody>
                                                </table>
                                            </form>
                                
                            </div>
                        </div> 
                    </div>
                </div>
               
            </div>
        </div>


    </body>
</html>


