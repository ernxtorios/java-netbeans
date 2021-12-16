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
public class bnEtiquetas {
    String CODIGO_ACTIVO;
    String CODIGO;
    String DESCRIPCION;
    String UBICACION;    
    
    public bnEtiquetas() {
        
    }

    public bnEtiquetas(String CODIGO_ACTIVO, String CODIGO, String DESCRIPCION, String UBICACION) {
        this.CODIGO_ACTIVO = CODIGO_ACTIVO;
        this.CODIGO = CODIGO;
        this.DESCRIPCION = DESCRIPCION;
        this.UBICACION = UBICACION;
    }   
   
    public String getCODIGO_ACTIVO() {
        return CODIGO_ACTIVO;
    }

    public void setCODIGO_ACTIVO(String CODIGO_ACTIVO) {
        this.CODIGO_ACTIVO = CODIGO_ACTIVO;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getUBICACION() {
        return UBICACION;
    }

    public void setUBICACION(String UBICACION) {
        this.UBICACION = UBICACION;
    }    
}