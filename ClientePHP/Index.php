<?php

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */

$cliente = new SoapClient('http://localhost:8080/SevicioWeb_SOAP/WSOperaciones?WSDL');

$resultado_pago = $cliente->ProcesarPago([
    "total" => 1000,
    "pago" => 5000
]) -> return;

if($resultado_pago>=0){
    echo "Pago realizado, su vuelto es $resultado_pago";
} else {
    echo 'dinero insuficiente';
}