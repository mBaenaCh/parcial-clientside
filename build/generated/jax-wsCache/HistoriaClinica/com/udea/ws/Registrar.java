
package com.udea.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para registrar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_paciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_medico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrar", propOrder = {
    "cedula",
    "nombrePaciente",
    "nombreMedico",
    "fecha"
})
public class Registrar {

    protected int cedula;
    @XmlElement(name = "nombre_paciente")
    protected String nombrePaciente;
    @XmlElement(name = "nombre_medico")
    protected String nombreMedico;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     */
    public void setCedula(int value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * Define el valor de la propiedad nombrePaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePaciente(String value) {
        this.nombrePaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMedico() {
        return nombreMedico;
    }

    /**
     * Define el valor de la propiedad nombreMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMedico(String value) {
        this.nombreMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

}
