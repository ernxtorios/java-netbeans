/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Beans.bnActivos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jolortegui
 */
public class clsEtiquetas extends clsConeccion {

    public ResultSet mostrarActivos(String desde, String hasta) {
        ResultSet rs = null;
        Connection cn = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = cn.prepareStatement("SELECT P.CODIGO_ACTIVO, U.UBICAC_FISICA, P.DESCRIPCION FROM dbo.SIG_PATRIMONIO P INNER JOIN "
                    + "dbo.SIG_UBICAC_FISICA U ON P.TIPO_UBICAC = U.TIPO_UBICAC AND P.COD_UBICAC = U.COD_UBICAC "
                    + "WHERE P.CODIGO_ACTIVO IS NOT NULL AND P.CODIGO_ACTIVO BETWEEN ? AND ?  ORDER BY U.UBICAC_FISICA ASC");
            pstmt.setString(1, desde);
            pstmt.setString(2, hasta);
            rs = pstmt.executeQuery();
        } catch (Exception e) {

        } finally {

        }
        return rs;
    }

    public ResultSet mostrarActivos2(Date fechaInicio, Date fechaFin) {
        ResultSet rs = null;
        Connection cn = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = cn.prepareStatement("SELECT P.CODIGO_ACTIVO, U.UBICAC_FISICA, P.DESCRIPCION FROM dbo.SIG_PATRIMONIO P INNER JOIN "
                    + "dbo.SIG_UBICAC_FISICA U ON P.TIPO_UBICAC = U.TIPO_UBICAC AND P.COD_UBICAC = U.COD_UBICAC "
                    + "WHERE P.CODIGO_ACTIVO IS NOT NULL AND P.FECHA_MOVIMTO BETWEEN ? AND ? ORDER BY U.UBICAC_FISICA ASC");
            pstmt.setDate(1, fechaInicio);
            pstmt.setDate(2, fechaFin);
            rs = pstmt.executeQuery();
        } catch (Exception e) {

        } finally {

        }
        return rs;
    }

    public ResultSet mostrarCentroCosto() {
        ResultSet rs = null;
        Connection cn = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = cn.prepareStatement("SELECT TIPO_UBICAC,COD_UBICAC,UBICAC_FISICA FROM dbo.SIG_UBICAC_FISICA ORDER BY UBICAC_FISICA ASC");
            rs = pstmt.executeQuery();
        } catch (Exception e) {

        } finally {

        }
        return rs;
    }

    public ResultSet mostrarActivosDependencia(String TIPO_UBICAC , String COD_UBICAC) {
        ResultSet rs = null;
        Connection cn = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = cn.prepareStatement("SELECT P.CODIGO_ACTIVO, U.UBICAC_FISICA, P.DESCRIPCION FROM dbo.SIG_PATRIMONIO P INNER JOIN "
                    + "dbo.SIG_UBICAC_FISICA U ON P.TIPO_UBICAC = U.TIPO_UBICAC AND P.COD_UBICAC = U.COD_UBICAC "
                    + "WHERE P.CODIGO_ACTIVO IS NOT NULL AND U.TIPO_UBICAC = ? AND U.COD_UBICAC = ? ORDER BY P.CODIGO_ACTIVO ASC");
            pstmt.setString(1, TIPO_UBICAC);
            pstmt.setString(2, COD_UBICAC);
            rs = pstmt.executeQuery();
        } catch (Exception e) {

        } finally {

        }
        return rs;
    }

    public List<bnActivos> cargarReporteActivos(String dsc, Date inicio, Date fin) throws SQLException {
        ResultSet rs = null;
        List<bnActivos> lista = new ArrayList<bnActivos>();
        Connection cn = getConnection();
        PreparedStatement pstmt = null;
        bnActivos activos = null;
        try {
            String cad = "select c.NOMBRE_DEPEND, u.UBICAC_FISICA, a.CODIGO_ACTIVO, a.DESCRIPCION, m.NOMBRE as MARCA, cc.MAYOR, cc.SUB_CTA, cc.NOMBRE as CUENTA, "
                    + "a.NRO_SERIE, a.MEDIDAS, e.VALOR as COLOR, a.ESTADO from SIG_PATRIMONIO a left join SIG_CENTRO_COSTO c on a.ANO_EJE = c.ANO_EJE and "
                    + "a.CENTRO_COSTO = c.CENTRO_COSTO left join SIG_PERSONAL p on ltrim(a.EMPLEADO_FINAL) = ltrim(p.empleado) left join SIG_UBICAC_FISICA u "
                    + "on a.COD_UBICAC = u.COD_UBICAC and a.TIPO_UBICAC = u.TIPO_UBICAC left join MARCA m on a.MARCA = m.MARCA and a.TIPO_MARCA = m.TIPO_MARCA left join "
                    + "SIG_ESPECIF_TECNICA_ACTIVO e on a.SECUENCIA = e.SECUENCIA left join PLAN_CTB_SUB_CTA cc on a.MAYOR = cc.MAYOR and a.SUB_CTA = cc.SUB_CTA and "
                    + "a.ANO_EJE = cc.ANO_EJE where a.ANO_EJE = 2014 and  and a.CODIGO_ACTIVO is not null and a.estado = 1 and (e.DESCRIPCION = 'Color' or e.DESCRIPCION is null) and a.fecha_movimto between ? and ?";
            pstmt.setDate(1, inicio);
            pstmt.setDate(2, fin);
            if (!dsc.equals("")) {
                cad = cad + " and (a.NOMBRE_DEPEND like '%?%' or a.UBICAC_FISICA like '%?%' or a.CODIGO_ACTIVO like '%?%' or a.DESCRIPCION like '%?%')";
                pstmt.setString(3, cad);
                pstmt.setString(4, cad);
                pstmt.setString(5, cad);
                pstmt.setString(6, cad);
            }
            pstmt = cn.prepareStatement(cad);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                activos = new bnActivos(rs.getString("NOMBRE_DEPEND"), rs.getString("UBICAC_FISICA"), rs.getString("CODIGO_ACTIVO"), rs.getString("DESCRIPCION"), rs.getString("MARCA"),
                        rs.getString("MAYOR"), rs.getString("SUB_CTA"), rs.getString("CUENTA"), rs.getString("NRO_SERIE"), rs.getString("MEDIDAS"), rs.getString("COLOR"), rs.getString("ESTADO"));
                lista.add(activos);
            }
//            pstmt.setDate(1, fechaInicio);
//            pstmt.setDate(2, fechaFin);
        } catch (Exception e) {

        } finally {
            cn.close();
        }
        return lista;
    }
}
