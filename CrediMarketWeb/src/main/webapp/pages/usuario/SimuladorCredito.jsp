
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Simulador Crédito</title>

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

        <div class="container ">
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

                <div class="col-md-9 ">

                      <div class="panel panel-primary">
                            <div class="panel-heading">
                              <strong> <center>Simulador de Crédito</center> </strong>
                            </div>
                            <div class="panel-body">
                                  <div class="row">
                                       <div class="col-md-8">
                                          <ul>
                                              <li>
                                                  <strong>La fórmula para calcular el monto final a pagar es: </strong> 
                                              </li>
                                              <li>
                                                  <img src="../../resources/img/formula.png" width="240" height="45"/>
                                              </li>

                                          </ul>

                                            
                                              <h4>Donde:</h4>
                                               <ul>
                                                 <li> S = Valor Futuro </li>
                                                 <li> C = Valor Present </li>
                                                 <li> i = Tasa de Interés </li>
                                                 <li> t = tiempo transcurrido </li>
                                               </ul> 
                                      </div> 

                              </div>  
                                 
                              <div class="row">
                              
                                <div class="col-md-8">
                                    <form action="SimuladorCredito_1.jsp" method="get"  class="form-horizontal" role="form">
                                                    <div class="form-group form-group-lg">
                                                      <label class="col-sm-6 control-label" for="formGroupInputLarge"> 
                                                         Monto total :
                                                      </label>
                                                      <div class="col-sm-6">
                                                        <input  name="txtMonto"  class="form-control" type="text" id="formGroupInputLarge" placeholder="(S/.)Ingresar Monto ">
                                                      </div>
                                                    </div>

                                                    <div class="form-group form-group-lg">
                                                      <label class="col-sm-6 control-label" for="formGroupInputLarge"> 
                                                          Tasa Simple :
                                                      </label>
                                                      <div class="col-sm-6">
                                                        <input name="txtInteres" class="form-control" type="text" id="formGroupInputLarge" placeholder="(I%)Tasa Simple Anual (TSA)">
                                                      </div>
                                                    </div>

                                                    <div class="form-group form-group-lg">
                                                      <label class="col-sm-6 control-label" for="formGroupInputLarge">
                                                      Fecha de la Cobranza
                                                      </label>
                                                      <div class="col-sm-6">
                                                        <input  name="txtTiempo" class="form-control" type="text" id="formGroupInputLarge" placeholder="Plazo de la cobranza(Dias)">
                                                      </div>
                                                    </div>
                                                    <div class="form-group form-group-lg">
                                                          <div class="col-sm-6"></div>
                                                          <div class="col-sm-6">
                                                              <button type="submit" class="btn btn-primary">Calcular</button>
                                                          </div>  
                                                    </div>
                                                    <div class="form-group form-group-lg">
                                                      <label class="col-sm-6 control-label" for="formGroupInputLarge">
                                                        Interes generado
                                                      </label>
                                                      <div class="col-sm-6">
                                                        <input class="form-control" type="text" id="formGroupInputLarge" placeholder=" ">
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
                </div> 
              </div>
          </div>
            </div>
        </div>


    </body>
</html>


