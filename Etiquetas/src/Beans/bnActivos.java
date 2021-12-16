/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

/**
 *
 * @author jolortegui
 */
public class bnActivos {
    String NOMBRE_DEPEND;
    String UBICAC_FISICA;
    String CODIGO_ACTIVO;
    String DESCRIPCION;
    String MARCA;
    String MAYOR;
    String SUB_CTA;
    String CUENTA;
    String NRO_SERIE;
    String MEDIDAS;
    String COLOR;
    String ESTADO;

    public bnActivos() {
    }

    public bnActivos(String NOMBRE_DEPEND, String UBICAC_FISICA, String CODIGO_ACTIVO, String DESCRIPCION, String MARCA, String MAYOR, String SUB_CTA, String CUENTA, String NRO_SERIE, String MEDIDAS, String COLOR, String ESTADO) {
        this.NOMBRE_DEPEND = NOMBRE_DEPEND;
        this.UBICAC_FISICA = UBICAC_FISICA;
        this.CODIGO_ACTIVO = CODIGO_ACTIVO;
        this.DESCRIPCION = DESCRIPCION;
        this.MARCA = MARCA;
        this.MAYOR = MAYOR;
        this.SUB_CTA = SUB_CTA;
        this.CUENTA = CUENTA;
        this.NRO_SERIE = NRO_SERIE;
        this.MEDIDAS = MEDIDAS;
        this.COLOR = COLOR;
        this.ESTADO = ESTADO;
    }

    public String getNOMBRE_DEPEND() {
        return NOMBRE_DEPEND;
    }

    public void setNOMBRE_DEPEND(String NOMBRE_DEPEND) {
        this.NOMBRE_DEPEND = NOMBRE_DEPEND;
    }

    public String getUBICAC_FISICA() {
        return UBICAC_FISICA;
    }

    public void setUBICAC_FISICA(String UBICAC_FISICA) {
        this.UBICAC_FISICA = UBICAC_FISICA;
    }

    public String getCODIGO_ACTIVO() {
        return CODIGO_ACTIVO;
    }

    public void setCODIGO_ACTIVO(String CODIGO_ACTIVO) {
        this.CODIGO_ACTIVO = CODIGO_ACTIVO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getMAYOR() {
        return MAYOR;
    }

    public void setMAYOR(String MAYOR) {
        this.MAYOR = MAYOR;
    }

    public String getSUB_CTA() {
        return SUB_CTA;
    }

    public void setSUB_CTA(String SUB_CTA) {
        this.SUB_CTA = SUB_CTA;
    }

    public String getCUENTA() {
        return CUENTA;
    }

    public void setCUENTA(String CUENTA) {
        this.CUENTA = CUENTA;
    }

    public String getNRO_SERIE() {
        return NRO_SERIE;
    }

    public void setNRO_SERIE(String NRO_SERIE) {
        this.NRO_SERIE = NRO_SERIE;
    }

    public String getMEDIDAS() {
        return MEDIDAS;
    }

    public void setMEDIDAS(String MEDIDAS) {
        this.MEDIDAS = MEDIDAS;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
    
}