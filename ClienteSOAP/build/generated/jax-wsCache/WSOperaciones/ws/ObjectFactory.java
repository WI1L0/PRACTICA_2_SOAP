
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Login_QNAME = new QName("http://WS/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://WS/", "LoginResponse");
    private final static QName _ProcesarPago_QNAME = new QName("http://WS/", "ProcesarPago");
    private final static QName _ProcesarPagoResponse_QNAME = new QName("http://WS/", "ProcesarPagoResponse");
    private final static QName _Hello_QNAME = new QName("http://WS/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://WS/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ProcesarPago }
     * 
     */
    public ProcesarPago createProcesarPago() {
        return new ProcesarPago();
    }

    /**
     * Create an instance of {@link ProcesarPagoResponse }
     * 
     */
    public ProcesarPagoResponse createProcesarPagoResponse() {
        return new ProcesarPagoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ProcesarPago")
    public JAXBElement<ProcesarPago> createProcesarPago(ProcesarPago value) {
        return new JAXBElement<ProcesarPago>(_ProcesarPago_QNAME, ProcesarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ProcesarPagoResponse")
    public JAXBElement<ProcesarPagoResponse> createProcesarPagoResponse(ProcesarPagoResponse value) {
        return new JAXBElement<ProcesarPagoResponse>(_ProcesarPagoResponse_QNAME, ProcesarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
