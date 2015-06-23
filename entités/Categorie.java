package entités;

import java.util.ArrayList;

import entités.Produit;

public class Categorie
{
    private String codecat;
    private String nomCat;
    
    private ArrayList<Produit> listeProduit;

    public Categorie()
    {
    }

    public Categorie(String codecat, String nomCat)
    {
        this.codecat = codecat;
        this.nomCat = nomCat;
    }
    
    
    public String getCodecat()
    {
        return codecat;
    }

    public String getNomCat()
    {
        return nomCat;
    }

    public ArrayList<Produit> getListeProduit()
    {
        return listeProduit;
    }

    public void setCodecat(String codecat)
    {
        this.codecat = codecat;
    }

    public void setNomCat(String nomCat)
    {
        this.nomCat = nomCat;
    }

    public void setListeProduit(ArrayList<Produit> listeProduit)
    {
        this.listeProduit = listeProduit;
    }
    
}

