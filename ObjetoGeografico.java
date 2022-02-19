public class ObjetoGeografico {
    
    public String nombre;
    public int id;
    public String municipio;
    public String tipoagua;
    public String tipocuerpo;
    public Double irca;
        
    public ObjetoGeografico (String nombre, int id, String municipio, String tipoagua, String tipocuerpo, Double irca){
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.tipoagua = tipoagua;
        this.tipocuerpo = tipocuerpo;
        this.irca = irca;
    }
    public ObjetoGeografico(){
    
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getTipoagua() {
        return tipoagua;
    }
    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }
    public String getTipocuerpo() {
        return tipocuerpo;
    }
    public void setTipocuerpo(String tipocuerpo) {
        this.tipocuerpo = tipocuerpo;
    }
    public Double getIrca() {
        return irca;
    }
    public void setIrca(Double irca) {
        this.irca = irca;
    }
    
}