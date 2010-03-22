
package servicos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "checkHttpPost", targetNamespace = "http://ws.cdyne.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CheckHttpPost {


    /**
     * This method checks a body of text for spelling errors.
     * 
     * @param bodyText
     * @return
     *     returns servicos.DocumentSummary
     */
    @WebMethod(operationName = "CheckTextBodyV2")
    @WebResult(name = "DocumentSummary", targetNamespace = "http://ws.cdyne.com/", partName = "Body")
    public DocumentSummary checkTextBodyV2(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "BodyText")
        String bodyText);

    /**
     * Depreciated.  Do not use.
     * 
     * @param bodyText
     * @param licenseKey
     * @return
     *     returns servicos.DocumentSummary
     */
    @WebMethod(operationName = "CheckTextBody")
    @WebResult(name = "DocumentSummary", targetNamespace = "http://ws.cdyne.com/", partName = "Body")
    public DocumentSummary checkTextBody(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "BodyText")
        String bodyText,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "LicenseKey")
        String licenseKey);

}
