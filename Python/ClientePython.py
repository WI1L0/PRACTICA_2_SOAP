from zeep import Client

cliente = Client('http://localhost:8080/SevicioWeb_SOAP/WSOperaciones?WSDL')

if cliente.service.Login("William","12345"):
    print("Credenciales correctas")
else:
    print("Credenciales incorrectas")

if cliente.service.ProcesarPago(5000, 100)>=0:
    print("Pago realizado")
else:
    print("Dinero insuficiente")