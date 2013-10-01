
package de.rwth.idsg.sensor.change;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Sep 18 17:45:53 CEST 2013
 * Generated source version: 2.3.1
 * 
 */

public final class ChangeService_ChangeServiceSOAP12_Client {

    private static final QName SERVICE_NAME = new QName("urn://de/rwth/idsg/sensor/change", "ChangeService");

    private ChangeService_ChangeServiceSOAP12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ChangeService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ChangeService_Service ss = new ChangeService_Service(wsdlURL, SERVICE_NAME);
        ChangeService port = ss.getChangeServiceSOAP12();  
        
        {
        System.out.println("Invoking changeConfiguration...");
        de.rwth.idsg.sensor.change.ChangeConfigurationRequest _changeConfiguration_parameters = null;
        java.lang.String _changeConfiguration_chargeBoxIdentity = "";
        de.rwth.idsg.sensor.change.ChangeConfigurationResponse _changeConfiguration__return = port.changeConfiguration(_changeConfiguration_parameters, _changeConfiguration_chargeBoxIdentity);
        System.out.println("changeConfiguration.result=" + _changeConfiguration__return);


        }
        {
        System.out.println("Invoking changeStatus...");
        de.rwth.idsg.sensor.change.ChangeStatusRequest _changeStatus_parameters = null;
        java.lang.String _changeStatus_chargeBoxIdentity = "";
        de.rwth.idsg.sensor.change.ChangeStatusResponse _changeStatus__return = port.changeStatus(_changeStatus_parameters, _changeStatus_chargeBoxIdentity);
        System.out.println("changeStatus.result=" + _changeStatus__return);


        }

        System.exit(0);
    }

}