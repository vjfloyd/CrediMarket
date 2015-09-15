DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_usuario`(
		_DApodo varchar(45),
		_DClave varchar(45),
		_DCorreo varchar(45),
		_DNombre varchar(45),
		_DApellidoPat varchar(45),
		_DApellidoMat varchar(45),
		_DDomicilio varchar(45),
		_DTelefono varchar(45),
		_TipoUsuario_idTipoUsuario int ,
		_Tienda_idTienda int)
BEGIN
	INSERT INTO usuario
	(DApodo,DClave, DCorreo, DNombre, DApellidoPat, DApellidoMat, DDomicilio,DTelefono ,FActivo, TipoUsuario_idTipoUsuario , Tienda)
	VALUES
	(_DApodo, _DClave, _DCorreo, _DNombre, _DApellidoPat, _DApellidoMat, _DDomicilio, _DTelefono, 1, _TipoUsuario_idTipoUsuario, _Tienda_idTienda) ;
END ;;
DELIMITER ;;

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_tienda`(
		_DTienda varchar(45),
		_DRepresentante varchar(45),
		_DCorreo varchar(45),
		_DUsuario varchar(45),
		_Clave int 
)
BEGIN
	INSERT INTO usuario
	(  DTienda, DRepresentante, DCorreo, DUsuario, DClave  )
	VALUES
	(  _DTienda, _DRepresentante, _DCorreo, _DUsuario, _DClave  )
	
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_credito`(
		_DidCredito varchar(45),
		_FPrestamo varchar(45),
		_Usuario_idUsuario int			
)
BEGIN 
	 INSERT INTO credito
	 ( DidCredito , FPrestamo, Usuario_idUsuario)
	 VALUES
	 ( _idCredito, _FPrestamo, _Usuario_idUsuario);
END	 

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_credito`(
		_idCredito int,
		_QMonto double,
		_NInteres double,
		_DDescripcion varchar(90),
        _Usuario_idUsuario int,
	    _BCancelado boolean
)
BEGIN 
	 INSERT INTO credito
	 ( idCredito , QMonto , NInteres , DDescripcion, Usuario_idUsuario, BCancelado)
	 VALUES
	 ( _idCredito, _QMonto, _NInteres, _DDescripcion, _Usuario_idUsuario, _BCancelado);
END
		
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_beneficiado`(
		_DNomBen varchar(45),
		_DApPatBen varchar(45),
		_DApMatBen varchar(45),
		_Usuario_idUsuario int
)
BEGIN 
	 INSERT INTO beneficiado
	 ( DNomBen, DApPatBen, DApMatBen, Usuario_idUsuario, FActivo)
	 VALUES
	 ( _DNomBen, _DApPatBen, _DApMatBen, _Usuario_idUsuario, 1);
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_insertar_detallecredito`(
		_idDetalleCredito varchar(45),
		_QMonto varchar(45),
		_NTasaInteres int,
		_FEntregaCredito DATETIME,
		_BCancelado boolean,
		_Credito_idCredito int,
		_Credito_Usuario_idUsuario int
)
BEGIN 
	 INSERT INTO credito
	 ( idDetalleCredito , QMonto, NTasaInteres, FEntregaCredito, BCancelado, Credito_idCredito, Credito_Usuario_idUsuario)
	 VALUES
	 (_idDetalleCredito , _QMonto, _NTasaInteres, _FEntregaCredito, _BCancelado, _Credito_idCredito, _Credito_Usuario_idUsuario)
END	



 
 
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_listar_beneficiados`( _idUsuario int)
BEGIN
	SELECT 
		B.idBeneficiado as id,
		B.DNomBen as nombre,
		B.DApPatBen as apPat,
		B.DApMatBen as apMat
	FROM Beneficiado B, Usuario U
	WHERE   B.Usuario_idUsuario = _idUsuario
    AND 	B.Usuario_idUsuario = U.idUsuario
	AND B.FActivo = 1;
END
 

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_listar_creditos`()
BEGIN
	SELECT 
		C.idCredito as id,
		C.QMonto as monto,
		C.NInteres as interes,
		C.DDescripcion as descripcion,
		C.BCancelado as cancelado
	FROM Credito C, Usuario U
	WHERE   C.Usuario_idUsuario = U.idUsuario
END

 
 
 
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_listar_usuarios`( )
BEGIN
	SELECT 
		U.idUsuario as id,
		U.DApodo as apodo,
		U.DClave as clave,
		U.DCorreo as correo,
		U.DNombre as nombre,
		U.DApellidoPat as apPat,
		U.DApellidoMat as apMat,
        U.DTelefono as telefono,
		U.TipoUsuario_idTipoUsuario as idtipousuario
			
	FROM Usuario U, TipoUsuario TU
	WHERE U.TipoUsuario_idTipoUsuario = TU.idTipoUsuario
	AND U.FActivo = 1;
END
 
CREATE DEFINER=`root@localhost` PROCEDURE `usp_eliminar_usuario`(id int)
BEGIN
		UPDATE usuario u 
		SET u.FActivo = 0
		where u.idUsuario = id;
END
 
CREATE DEFINER=`root@localhost` PROCEDURE `usp_eliminar_beneficiado`(id int)
BEGIN	
		UPDATE usuario u 
		SET 
END
 
 
 





https://www.youtube.com/watch?v=iutPdvTLZW8&hd=1

http://java.dzone.com/articles/lightweight-web-application
http://blog.mybatis.org/p/products.html


http://www.mercadolibre.com.pe/jm/profile?id=74038335&oper=S