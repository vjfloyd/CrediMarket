<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title> Administrar Créditos </title>
  
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
                            <strong> <center> Registrar Crédito</center> </strong>
                        </div>
                        <div class="panel-body">

                            <div class="row">

                                <div class="col-md-8">
                                    <form  action="<%= request.getContextPath()%>/CreditoController"  method="post"  class="form-horizontal" role="form">
                                        <div class="form-group form-group-lg">
                                            <label class="col-sm-6 control-label" for="formGroupInputLarge"> 
                                                Cliente( Dni ) :
                                            </label>
                                            <div class="col-sm-6">
                                                <input class="form-control" name="txtCliente" type="text" id="formGroupInputLarge" placeholder="Ingresar #DNI ">
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="col-sm-6 control-label" for="formGroupInputLarge"> 
                                                Monto Total :
                                            </label>
                                            <div class="col-sm-6">
                                                <input class="form-control" name="txtMonto" type="text" id="formGroupInputLarge" placeholder="(S./ Monto)">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group form-group-lg">
                                            <label class="col-sm-6 control-label" for="formGroupInputLarge">
                                                Tasa de Interes(Simple) :
                                            </label>
                                            <div class="col-sm-6">
                                                <input class="form-control" name="txtInteres" type="text" id="formGroupInputLarge" placeholder=" % Interes ">
                                            </div>
                                        </div>

                                        <div class="form-group form-group-lg">
                                            <label class="col-sm-6 control-label" for="formGroupInputLarge">
                                                Descripción : 
                                            </label>
                                            <div class="col-sm-6">
                                                <input class="form-control" name="txtDescripcion" type="text" id="formGroupInputLarge" placeholder=" ">
                                            </div>
                                        </div>
                                        <div class="form-group form-group-lg">
                                            <div class="col-sm-6"></div>
                                            <div class="col-sm-6">
                                                <button type="submit" name="txtAction" value="Registrar"  class="btn btn-primary"> Registrar </button>
                                            </div>  
                                        </div>

                                        <input type="hidden" name="action" value="REGISTRAR" />
                                    </form>

                                </div>
                            </div>
                        </div> 
                    </div>
                </div>


                </body>
                </html>


