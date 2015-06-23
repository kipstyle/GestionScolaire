package entités;

public class User
{
    private int codeUser ;
    private String prenomUser;
    private String nomUser;
    private int telUser;
    private String loginUser;
    private String motdepasseUser;
    private String profilUser;

    
    //getteurs
    
    public int getCodeUser()
    {
        return codeUser;
    }

    public String getLoginUser()
    {
        return loginUser;
    }

    public String getMotdepasseUser()
    {
        return motdepasseUser;
    }

    public String getNomUser()
    {
        return nomUser;
    }

    public String getPrenomUser()
    {
        return prenomUser;
    }

    public String getProfilUser()
    {
        return profilUser;
    }

    public int getTelUser()
    {
        return telUser;
    }
    
    //Setteurs
    public void setCodeUser(int codeUser)
    {
        this.codeUser = codeUser;
    }

    public void setLoginUser(String loginUser)
    {
        this.loginUser = loginUser;
    }

    public void setMotdepasseUser(String motdepasseUser)
    {
        this.motdepasseUser = motdepasseUser;
    }

    public void setNomUser(String nomUser)
    {
        this.nomUser = nomUser;
    }

    public void setPrenomUser(String prenomUser)
    {
        this.prenomUser = prenomUser;
    }

    public void setProfilUser(String profilUser)
    {
        this.profilUser = profilUser;
    }

    public void setTelUser(int telUser)
    {
        this.telUser = telUser;
    }

    //Constructeur avec parametres
    public User(String prenomUser, String nomUser, int telUser, String loginUser, String motdepasseUser, String profilUser)
    {
        this.prenomUser = prenomUser;
        this.nomUser = nomUser;
        this.telUser = telUser;
        this.loginUser = loginUser;
        this.motdepasseUser = motdepasseUser;
        this.profilUser = profilUser;
    }

    //Constructeur sans param
    public User()
    {
    }
    
    
    
}

