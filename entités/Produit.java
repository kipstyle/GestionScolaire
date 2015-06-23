package entités;

import entités.Categorie;

public class Produit
{
    private int codeProd;
    private String nomProd;
    private int qteProd;
    private int prixProd;
    private String codeCategorie;
    private Categorie cat;

    public Produit()
    {
    }

    public Produit( String nomProd, int qteProd, int prixProd)
    {
    	//this.codeProd = codeProd;
        this.nomProd = nomProd;
        this.qteProd = qteProd;
        this.prixProd = prixProd;
    }

    public Categorie getCat()
    {
        return cat;
    }
    
    public String getCategorie()
    {
        return codeCategorie;
    }

    public int getCodeProd()
    {
        return codeProd;
    }

    public String getNomProd()
    {
        return nomProd;
    }

    public int getPrixProd()
    {
        return prixProd;
    }

    public int getQteProd()
    {
        return qteProd;
    }

    public void setCodeProd(int codeProd)
    {
        this.codeProd = codeProd;
    }

    public void setNomProd(String nomProd)
    {
        this.nomProd = nomProd;
    }

    public void setPrixProd(int prixProd)
    {
        this.prixProd = prixProd;
    }

    public void setQteProd(int qteProd)
    {
        this.qteProd = qteProd;
    }

    public void setCategorie(String categorie)
    {
        this.codeCategorie = categorie;
    }

    public void setCat(Categorie cat)
    {
        this.cat = cat;
    }
    
}