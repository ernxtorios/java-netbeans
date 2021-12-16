package Beans;

public class bnCentroCosto {
    String tipoUbicac;
    String codUbicac;
    String ubicacFISICA;

    public bnCentroCosto() {
    }

    public bnCentroCosto(String tipoUbicac, String codUbicac, String ubicacFISICA) {
        this.tipoUbicac = tipoUbicac;
        this.codUbicac = codUbicac;
        this.ubicacFISICA = ubicacFISICA;
    }

    public String getTipoUbicac() {
        return tipoUbicac;
    }

    public void setTipoUbicac(String tipoUbicac) {
        this.tipoUbicac = tipoUbicac;
    }

    public String getCodUbicac() {
        return codUbicac;
    }

    public void setCodUbicac(String codUbicac) {
        this.codUbicac = codUbicac;
    }

    public String getUbicacFISICA() {
        return ubicacFISICA;
    }

    public void setUbicacFISICA(String ubicacFISICA) {
        this.ubicacFISICA = ubicacFISICA;
    }  
}