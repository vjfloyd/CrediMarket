<%@page import="java.util.List"%>
<%@page import="pe.com.credimarket.dao.entity.Credito"%>
<%@page import="pe.com.credimarket.web.util.WebUtil"%>
<%@page import="pe.com.credimarket.service.CreditoService"%>
<%
   
    CreditoService creditoService = (CreditoService)WebUtil.obtenerService("CREDITO");
   
    List<Credito> listaCredito = null;
   
    Credito credito = null;
    
    try{
        listaCredito = creditoService.listar();
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
        <title>Linea de Crédito</title>
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

</head>
<body class="backfondo">


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

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
                        <a href="ConsultarDeuda.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Consular Deuda</h4>
                        </a>
                        <a href="LineaCredito.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Linea de Crédito </h4>
                        </a>
                        <a href="SimuladorCredito.jsp" class="list-group-item fondoSide">             
                            <h4 class="list-group-item-heading "> Simulador de Crédito </h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading">  </h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading">  </h4>
                        </a>
                        <a href="#" class="list-group-item fondoSide ">             
                            <h4 class="list-group-item-heading">  </h4>
                        </a>
                    </div>
            </div>

            <div class="col-md-9">


                <div class="row">
                    <div class="panel panel-primary">

                        <div class="panel-heading"> <strong> <center>  LÍNEA DE CRÉDITO </center> </strong> </div>

                        <br/>
                        <form class="form-horizontal" role="form">

                            <div class="form-group form-group-lg">
                                <label class="col-sm-6 control-label" for="formGroupInputLarge"> Línea de crédito Total:</label>
                                <div class="col-sm-4">
                                    <input class="form-control" type="text" id="formGroupInputLarge" placeholder="crédito total">
                                </div>
                            </div>

                            <div class="form-group form-group-lg">
                                <label class="col-sm-6 control-label" for="formGroupInputLarge"> Línea de crédito utilizada:</label>
                                <div class="col-sm-4">
                                    <input class="form-control" type="text" id="formGroupInputLarge" placeholder="crédito utilizado ">
                                </div>
                            </div>

                            <div class="form-group form-group-lg">
                                <label class="col-sm-6 control-label" for="formGroupInputLarge">Línea de crédito disponible:</label>
                                <div class="col-sm-4">
                                    <input class="form-control" type="text" id="formGroupInputLarge" placeholder=" crédito disponible">
                                </div>
                            </div>

                            <div class="form-group form-group-lg">
                                <center>
                                    <label class="" for="formGroupInputLarge"> </label>  
                                </center>
                            </div>



                        </form>

                    </div>
                </div>

                <div class="row">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <center>
                                    Fecha de vencimiento de su crédito 
                                </center>
                            </div>
                        </div>



                        <div class="panel-body">
                            <table class="table table-hover table-striped">
                                <thead class="tabla-titulo">

                                <th>
                                    #
                                </th>                             
                                <th>
                                    Fecha
                                </th>


                                <th>
                                    Descripción
                                </th>
                                <th>
                                    Monto
                                </th>


                                </thead>

                                <tbody>
                                    <%
                                        for(Credito cre : listaCredito ){
                                    %>
                                    <tr>
                                        <td>1</td>
                                        <td><a href="Profesores.jsp"> 10/102014</a></td>
                                        <td> <%= cre.getDescripcion() %></td>   
                                        <td> <%= cre.getMonto() %></td>     
                                    </tr>
                                    <%
                                        }
                                    %>
                                    <!--
                                    <tr>
                                        <td>2</td>
                                        <td><a href="">10/102014</a></td>
                                        <td>qergrgrgergeqrgregregerg</td>                      
                                        <td>111</td>    
                                    </tr>

                                    <tr>
                                        <td>3</td>
                                        <td><a href="">10/102014</a></td>
                                        <td>qtgqetgqergregreg</td>
                                        <td>32</td>     
                                    </tr>

                                    <tr>
                                        <td>4</td>
                                        <td><a href="">10/102014</a></td>
                                        <td>Música</td>
                                        <td> 3213 </td>                          
                                    </tr> 
                                    -->
                                </tbody>
                            </table>


                        </div>


                    </div> 



                </div>






            </div>

        </div>




    </div>



</div>
</div>




</div> 

</div>


</body>
</html>


