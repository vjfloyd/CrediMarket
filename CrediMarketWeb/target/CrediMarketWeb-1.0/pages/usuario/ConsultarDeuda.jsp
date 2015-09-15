<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title> Consultar Deudas </title>

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
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <center>
                                <strong>Consultar Deuda</strong>
                            </center>
                        </div>

                        <div class="panel-body">

                            <div class="row">
                                <div class="col-md-1">

                                </div>
                                <div class="col-md-7">
                                    <div class="page-header">
                                        <h3>Su Deuda al día de Hoy es  :  </h3> 
                                        <h2> </h2>               
                                    </div>
                                    Fechas de Vencimiento de Crédito
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-1">

                                </div>
                                <div class="col-md-7">
                                    <div class="panel panel-primary">

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
                                                <tr>
                                                    <td>1</td>
                                                    <td><a href="Profesores.jsp"> 10/102014</a></td>
                                                    <td>gregergeqrgreqge</td>   
                                                    <td>1321</td>     
                                                </tr>

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
                                            </tbody>
                                        </table>

                                    </div>  

                                </div>
                                <div class="col-md-1">

                                </div>


                            </div>

                        </div>


                        <hr/>

                        <strong> Atención :  En caso el cliente no haya pagado en la fecha acordada se le asignará una mora de S/. 5.00 

                        </strong>

                    </div>
                </div>


            </div>



        </div>   

    </div>


</body>
</html>


