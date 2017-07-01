package Model;

public class Fornecedor extends Pessoa {
    private String site;
    //public Fornecedor(String nome,String endereco,int cpf_cnpj,int codigo,int fone,int whatsapp,String site){
   //         super(nome, endereco, cpf_cnpj, codigo, fone, whatsapp);
   //         this.site=site;
   // }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
  
}
