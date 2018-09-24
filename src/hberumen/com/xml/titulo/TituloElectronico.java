//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.13 a las 03:30:46 PM CDT 
//


package hberumen.com.xml.titulo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirmaResponsables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FirmaResponsable" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="primerApellido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="curp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="idCargo" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="cargo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="abrTitulo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="sello" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="certificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="noCertificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Institucion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cveInstitucion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nombreInstitucion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Carrera">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cveCarrera" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nombreCarrera" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="fechaTerminacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="idAutorizacionReconocimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="autorizacionReconocimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="numeroRvoe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Profesionista">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="curp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="primerApellido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="correoElectronico" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Expedicion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="fechaExpedicion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="idModalidadTitulacion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="modalidadTitulacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fechaExamenProfesional" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="fechaExencionExamenProfesional" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="cumplioServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="idFundamentoLegalServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="fundamentoLegalServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="idEntidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Antecedente">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="institucionProcedencia" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="idTipoEstudioAntecedente" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="tipoEstudioAntecedente" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="idEntidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entidadFederativa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="fechaTerminacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="noCedula" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Autenticacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any namespace='any' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" fixed="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="folioControl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firmaResponsables",
    "institucion",
    "carrera",
    "profesionista",
    "expedicion",
    "antecedente",
    "autenticacion"
})
@XmlRootElement(name = "TituloElectronico")
public class TituloElectronico {

    @XmlElement(name = "FirmaResponsables", required = true)
    protected TituloElectronico.FirmaResponsables firmaResponsables;
    @XmlElement(name = "Institucion", required = true)
    protected TituloElectronico.Institucion institucion;
    @XmlElement(name = "Carrera", required = true)
    protected TituloElectronico.Carrera carrera;
    @XmlElement(name = "Profesionista", required = true)
    protected TituloElectronico.Profesionista profesionista;
    @XmlElement(name = "Expedicion", required = true)
    protected TituloElectronico.Expedicion expedicion;
    @XmlElement(name = "Antecedente", required = true)
    protected TituloElectronico.Antecedente antecedente;
    @XmlElement(name = "Autenticacion")
    protected TituloElectronico.Autenticacion autenticacion;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "folioControl", required = true)
    protected String folioControl;

    /**
     * Obtiene el valor de la propiedad firmaResponsables.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.FirmaResponsables }
     *     
     */
    public TituloElectronico.FirmaResponsables getFirmaResponsables() {
        return firmaResponsables;
    }

    /**
     * Define el valor de la propiedad firmaResponsables.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.FirmaResponsables }
     *     
     */
    public void setFirmaResponsables(TituloElectronico.FirmaResponsables value) {
        this.firmaResponsables = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Institucion }
     *     
     */
    public TituloElectronico.Institucion getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Institucion }
     *     
     */
    public void setInstitucion(TituloElectronico.Institucion value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad carrera.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Carrera }
     *     
     */
    public TituloElectronico.Carrera getCarrera() {
        return carrera;
    }

    /**
     * Define el valor de la propiedad carrera.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Carrera }
     *     
     */
    public void setCarrera(TituloElectronico.Carrera value) {
        this.carrera = value;
    }

    /**
     * Obtiene el valor de la propiedad profesionista.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Profesionista }
     *     
     */
    public TituloElectronico.Profesionista getProfesionista() {
        return profesionista;
    }

    /**
     * Define el valor de la propiedad profesionista.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Profesionista }
     *     
     */
    public void setProfesionista(TituloElectronico.Profesionista value) {
        this.profesionista = value;
    }

    /**
     * Obtiene el valor de la propiedad expedicion.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Expedicion }
     *     
     */
    public TituloElectronico.Expedicion getExpedicion() {
        return expedicion;
    }

    /**
     * Define el valor de la propiedad expedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Expedicion }
     *     
     */
    public void setExpedicion(TituloElectronico.Expedicion value) {
        this.expedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad antecedente.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Antecedente }
     *     
     */
    public TituloElectronico.Antecedente getAntecedente() {
        return antecedente;
    }

    /**
     * Define el valor de la propiedad antecedente.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Antecedente }
     *     
     */
    public void setAntecedente(TituloElectronico.Antecedente value) {
        this.antecedente = value;
    }

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link TituloElectronico.Autenticacion }
     *     
     */
    public TituloElectronico.Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloElectronico.Autenticacion }
     *     
     */
    public void setAutenticacion(TituloElectronico.Autenticacion value) {
        this.autenticacion = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad folioControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioControl() {
        return folioControl;
    }

    /**
     * Define el valor de la propiedad folioControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioControl(String value) {
        this.folioControl = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="institucionProcedencia" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="idTipoEstudioAntecedente" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="tipoEstudioAntecedente" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="idEntidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entidadFederativa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="fechaTerminacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="noCedula" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Antecedente {

        @XmlAttribute(name = "institucionProcedencia", required = true)
        protected String institucionProcedencia;
        @XmlAttribute(name = "idTipoEstudioAntecedente", required = true)
        protected Integer idTipoEstudioAntecedente;
        @XmlAttribute(name = "tipoEstudioAntecedente", required = true)
        protected String tipoEstudioAntecedente;
        @XmlAttribute(name = "idEntidadFederativa", required = true)
        protected String idEntidadFederativa;
        @XmlAttribute(name = "entidadFederativa")
        protected String entidadFederativa;
        @XmlAttribute(name = "fechaInicio")
        @XmlSchemaType(name = "date")
        protected String fechaInicio;
        @XmlAttribute(name = "fechaTerminacion", required = true)
        @XmlSchemaType(name = "date")
        protected String fechaTerminacion;
        @XmlAttribute(name = "noCedula")
        protected String noCedula;

        /**
         * Obtiene el valor de la propiedad institucionProcedencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstitucionProcedencia() {
            return institucionProcedencia;
        }

        /**
         * Define el valor de la propiedad institucionProcedencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstitucionProcedencia(String value) {
            this.institucionProcedencia = value;
        }

        /**
         * Obtiene el valor de la propiedad idTipoEstudioAntecedente.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public Integer getIdTipoEstudioAntecedente() {
            return idTipoEstudioAntecedente;
        }

        /**
         * Define el valor de la propiedad idTipoEstudioAntecedente.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdTipoEstudioAntecedente(Integer value) {
            this.idTipoEstudioAntecedente = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoEstudioAntecedente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoEstudioAntecedente() {
            return tipoEstudioAntecedente;
        }

        /**
         * Define el valor de la propiedad tipoEstudioAntecedente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoEstudioAntecedente(String value) {
            this.tipoEstudioAntecedente = value;
        }

        /**
         * Obtiene el valor de la propiedad idEntidadFederativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdEntidadFederativa() {
            return idEntidadFederativa;
        }

        /**
         * Define el valor de la propiedad idEntidadFederativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdEntidadFederativa(String value) {
            this.idEntidadFederativa = value;
        }

        /**
         * Obtiene el valor de la propiedad entidadFederativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntidadFederativa() {
            return entidadFederativa;
        }

        /**
         * Define el valor de la propiedad entidadFederativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntidadFederativa(String value) {
            this.entidadFederativa = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaInicio.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaInicio() {
            return fechaInicio;
        }

        /**
         * Define el valor de la propiedad fechaInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaInicio(String value) {
            this.fechaInicio = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaTerminacion.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaTerminacion() {
            return fechaTerminacion;
        }

        /**
         * Define el valor de la propiedad fechaTerminacion.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaTerminacion(String value) {
            this.fechaTerminacion = value;
        }

        /**
         * Obtiene el valor de la propiedad noCedula.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoCedula() {
            return noCedula;
        }

        /**
         * Define el valor de la propiedad noCedula.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoCedula(String value) {
            this.noCedula = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any namespace='any' minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Autenticacion {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Obtiene el valor de la propiedad any.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Define el valor de la propiedad any.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="cveCarrera" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="nombreCarrera" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="fechaTerminacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="idAutorizacionReconocimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="autorizacionReconocimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="numeroRvoe" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Carrera {

        @XmlAttribute(name = "cveCarrera", required = true)
        protected String cveCarrera;
        @XmlAttribute(name = "nombreCarrera", required = true)
        protected String nombreCarrera;
        @XmlAttribute(name = "fechaInicio")
        //@XmlSchemaType(name = "date")
        protected String fechaInicio;
        @XmlAttribute(name = "fechaTerminacion", required = true)
        //@XmlSchemaType(name = "date")
        protected String fechaTerminacion;
        @XmlAttribute(name = "idAutorizacionReconocimiento", required = true)
        protected Integer idAutorizacionReconocimiento;
        @XmlAttribute(name = "autorizacionReconocimiento", required = true)
        protected String autorizacionReconocimiento;
        @XmlAttribute(name = "numeroRvoe")
        protected String numeroRvoe;

        /**
         * Obtiene el valor de la propiedad cveCarrera.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCveCarrera() {
            return cveCarrera;
        }

        /**
         * Define el valor de la propiedad cveCarrera.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCveCarrera(String value) {
            this.cveCarrera = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreCarrera.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreCarrera() {
            return nombreCarrera;
        }

        /**
         * Define el valor de la propiedad nombreCarrera.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreCarrera(String value) {
            this.nombreCarrera = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaInicio.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaInicio() {
            return fechaInicio;
        }

        /**
         * Define el valor de la propiedad fechaInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaInicio(String value) {
            this.fechaInicio = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaTerminacion.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaTerminacion() {
            return fechaTerminacion;
        }

        /**
         * Define el valor de la propiedad fechaTerminacion.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaTerminacion(String value) {
            this.fechaTerminacion = value;
        }

        /**
         * Obtiene el valor de la propiedad idAutorizacionReconocimiento.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public Integer getIdAutorizacionReconocimiento() {
            return idAutorizacionReconocimiento;
        }

        /**
         * Define el valor de la propiedad idAutorizacionReconocimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdAutorizacionReconocimiento(Integer value) {
            this.idAutorizacionReconocimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad autorizacionReconocimiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutorizacionReconocimiento() {
            return autorizacionReconocimiento;
        }

        /**
         * Define el valor de la propiedad autorizacionReconocimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutorizacionReconocimiento(String value) {
            this.autorizacionReconocimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroRvoe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroRvoe() {
            return numeroRvoe;
        }

        /**
         * Define el valor de la propiedad numeroRvoe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroRvoe(String value) {
            this.numeroRvoe = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="fechaExpedicion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="idModalidadTitulacion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="modalidadTitulacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fechaExamenProfesional" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="fechaExencionExamenProfesional" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="cumplioServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="idFundamentoLegalServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="fundamentoLegalServicioSocial" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="idEntidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entidadFederativa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Expedicion {

        @XmlAttribute(name = "fechaExpedicion", required = true)
        //@XmlSchemaType(name = "date")
        protected String fechaExpedicion;
        @XmlAttribute(name = "idModalidadTitulacion", required = true)
        protected Integer idModalidadTitulacion;
        @XmlAttribute(name = "modalidadTitulacion", required = true)
        protected String modalidadTitulacion;
        @XmlAttribute(name = "fechaExamenProfesional")
        //@XmlSchemaType(name = "date")
        protected String fechaExamenProfesional;
        @XmlAttribute(name = "fechaExencionExamenProfesional")
        //@XmlSchemaType(name = "date")
        protected String fechaExencionExamenProfesional;
        @XmlAttribute(name = "cumplioServicioSocial", required = true)
        protected Integer cumplioServicioSocial;
        @XmlAttribute(name = "idFundamentoLegalServicioSocial", required = true)
        protected Integer idFundamentoLegalServicioSocial;
        @XmlAttribute(name = "fundamentoLegalServicioSocial", required = true)
        protected String fundamentoLegalServicioSocial;
        @XmlAttribute(name = "idEntidadFederativa", required = true)
        protected String idEntidadFederativa;
        @XmlAttribute(name = "entidadFederativa", required = true)
        protected String entidadFederativa;

        /**
         * Obtiene el valor de la propiedad fechaExpedicion.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaExpedicion() {
            return fechaExpedicion;
        }

        /**
         * Define el valor de la propiedad fechaExpedicion.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaExpedicion(String value) {
            this.fechaExpedicion = value;
        }

        /**
         * Obtiene el valor de la propiedad idModalidadTitulacion.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public Integer getIdModalidadTitulacion() {
            return idModalidadTitulacion;
        }

        /**
         * Define el valor de la propiedad idModalidadTitulacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdModalidadTitulacion(Integer value) {
            this.idModalidadTitulacion = value;
        }

        /**
         * Obtiene el valor de la propiedad modalidadTitulacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModalidadTitulacion() {
            return modalidadTitulacion;
        }

        /**
         * Define el valor de la propiedad modalidadTitulacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModalidadTitulacion(String value) {
            this.modalidadTitulacion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaExamenProfesional.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaExamenProfesional() {
            return fechaExamenProfesional;
        }

        /**
         * Define el valor de la propiedad fechaExamenProfesional.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaExamenProfesional(String value) {
            this.fechaExamenProfesional = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaExencionExamenProfesional.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getFechaExencionExamenProfesional() {
            return fechaExencionExamenProfesional;
        }

        /**
         * Define el valor de la propiedad fechaExencionExamenProfesional.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaExencionExamenProfesional(String value) {
            this.fechaExencionExamenProfesional = value;
        }

        /**
         * Obtiene el valor de la propiedad cumplioServicioSocial.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public Integer getCumplioServicioSocial() {
            return cumplioServicioSocial;
        }

        /**
         * Define el valor de la propiedad cumplioServicioSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCumplioServicioSocial(Integer value) {
            this.cumplioServicioSocial = value;
        }

        /**
         * Obtiene el valor de la propiedad idFundamentoLegalServicioSocial.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public Integer getIdFundamentoLegalServicioSocial() {
            return idFundamentoLegalServicioSocial;
        }

        /**
         * Define el valor de la propiedad idFundamentoLegalServicioSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdFundamentoLegalServicioSocial(Integer value) {
            this.idFundamentoLegalServicioSocial = value;
        }

        /**
         * Obtiene el valor de la propiedad fundamentoLegalServicioSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundamentoLegalServicioSocial() {
            return fundamentoLegalServicioSocial;
        }

        /**
         * Define el valor de la propiedad fundamentoLegalServicioSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFundamentoLegalServicioSocial(String value) {
            this.fundamentoLegalServicioSocial = value;
        }

        /**
         * Obtiene el valor de la propiedad idEntidadFederativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdEntidadFederativa() {
            return idEntidadFederativa;
        }

        /**
         * Define el valor de la propiedad idEntidadFederativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdEntidadFederativa(String value) {
            this.idEntidadFederativa = value;
        }

        /**
         * Obtiene el valor de la propiedad entidadFederativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntidadFederativa() {
            return entidadFederativa;
        }

        /**
         * Define el valor de la propiedad entidadFederativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntidadFederativa(String value) {
            this.entidadFederativa = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FirmaResponsable" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="primerApellido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="curp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="idCargo" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="cargo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="abrTitulo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="sello" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="certificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="noCertificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firmaResponsable"
    })
    public static class FirmaResponsables {

        @XmlElement(name = "FirmaResponsable", required = true)
        protected List<TituloElectronico.FirmaResponsables.FirmaResponsable> firmaResponsable;

        /**
         * Gets the value of the firmaResponsable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firmaResponsable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFirmaResponsable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TituloElectronico.FirmaResponsables.FirmaResponsable }
         * 
         * 
         */
        public List<TituloElectronico.FirmaResponsables.FirmaResponsable> getFirmaResponsable() {
            if (firmaResponsable == null) {
                firmaResponsable = new ArrayList<TituloElectronico.FirmaResponsables.FirmaResponsable>();
            }
            return this.firmaResponsable;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="primerApellido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="curp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="idCargo" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="cargo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="abrTitulo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="sello" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="certificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="noCertificadoResponsable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FirmaResponsable {

            @XmlAttribute(name = "nombre", required = true)
            protected String nombre;
            @XmlAttribute(name = "primerApellido", required = true)
            protected String primerApellido;
            @XmlAttribute(name = "segundoApellido")
            protected String segundoApellido;
            @XmlAttribute(name = "curp", required = true)
            protected String curp;
            @XmlAttribute(name = "idCargo", required = true)
            protected Integer idCargo;
            @XmlAttribute(name = "cargo", required = true)
            protected String cargo;
            @XmlAttribute(name = "abrTitulo")
            protected String abrTitulo;
            @XmlAttribute(name = "sello", required = true)
            protected String sello;
            @XmlAttribute(name = "certificadoResponsable", required = true)
            protected String certificadoResponsable;
            @XmlAttribute(name = "noCertificadoResponsable", required = true)
            protected String noCertificadoResponsable;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad primerApellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimerApellido() {
                return primerApellido;
            }

            /**
             * Define el valor de la propiedad primerApellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimerApellido(String value) {
                this.primerApellido = value;
            }

            /**
             * Obtiene el valor de la propiedad segundoApellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegundoApellido() {
                return segundoApellido;
            }

            /**
             * Define el valor de la propiedad segundoApellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegundoApellido(String value) {
                this.segundoApellido = value;
            }

            /**
             * Obtiene el valor de la propiedad curp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurp() {
                return curp;
            }

            /**
             * Define el valor de la propiedad curp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurp(String value) {
                this.curp = value;
            }

            /**
             * Obtiene el valor de la propiedad idCargo.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public Integer getIdCargo() {
                return idCargo;
            }

            /**
             * Define el valor de la propiedad idCargo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdCargo(Integer value) {
                this.idCargo = value;
            }

            /**
             * Obtiene el valor de la propiedad cargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCargo() {
                return cargo;
            }

            /**
             * Define el valor de la propiedad cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCargo(String value) {
                this.cargo = value;
            }

            /**
             * Obtiene el valor de la propiedad abrTitulo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbrTitulo() {
                return abrTitulo;
            }

            /**
             * Define el valor de la propiedad abrTitulo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbrTitulo(String value) {
                this.abrTitulo = value;
            }

            /**
             * Obtiene el valor de la propiedad sello.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSello() {
                return sello;
            }

            /**
             * Define el valor de la propiedad sello.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSello(String value) {
                this.sello = value;
            }

            /**
             * Obtiene el valor de la propiedad certificadoResponsable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificadoResponsable() {
                return certificadoResponsable;
            }

            /**
             * Define el valor de la propiedad certificadoResponsable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificadoResponsable(String value) {
                this.certificadoResponsable = value;
            }

            /**
             * Obtiene el valor de la propiedad noCertificadoResponsable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoCertificadoResponsable() {
                return noCertificadoResponsable;
            }

            /**
             * Define el valor de la propiedad noCertificadoResponsable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoCertificadoResponsable(String value) {
                this.noCertificadoResponsable = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="cveInstitucion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="nombreInstitucion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Institucion {

        @XmlAttribute(name = "cveInstitucion", required = true)
        protected String cveInstitucion;
        @XmlAttribute(name = "nombreInstitucion", required = true)
        protected String nombreInstitucion;

        /**
         * Obtiene el valor de la propiedad cveInstitucion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCveInstitucion() {
            return cveInstitucion;
        }

        /**
         * Define el valor de la propiedad cveInstitucion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCveInstitucion(String value) {
            this.cveInstitucion = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreInstitucion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreInstitucion() {
            return nombreInstitucion;
        }

        /**
         * Define el valor de la propiedad nombreInstitucion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreInstitucion(String value) {
            this.nombreInstitucion = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="curp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="primerApellido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="correoElectronico" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Profesionista {

        @XmlAttribute(name = "curp", required = true)
        protected String curp;
        @XmlAttribute(name = "nombre", required = true)
        protected String nombre;
        @XmlAttribute(name = "primerApellido", required = true)
        protected String primerApellido;
        @XmlAttribute(name = "segundoApellido")
        protected String segundoApellido;
        @XmlAttribute(name = "correoElectronico", required = true)
        protected String correoElectronico;

        /**
         * Obtiene el valor de la propiedad curp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurp() {
            return curp;
        }

        /**
         * Define el valor de la propiedad curp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurp(String value) {
            this.curp = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad primerApellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimerApellido() {
            return primerApellido;
        }

        /**
         * Define el valor de la propiedad primerApellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimerApellido(String value) {
            this.primerApellido = value;
        }

        /**
         * Obtiene el valor de la propiedad segundoApellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegundoApellido() {
            return segundoApellido;
        }

        /**
         * Define el valor de la propiedad segundoApellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegundoApellido(String value) {
            this.segundoApellido = value;
        }

        /**
         * Obtiene el valor de la propiedad correoElectronico.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorreoElectronico() {
            return correoElectronico;
        }

        /**
         * Define el valor de la propiedad correoElectronico.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorreoElectronico(String value) {
            this.correoElectronico = value;
        }

    }

}
