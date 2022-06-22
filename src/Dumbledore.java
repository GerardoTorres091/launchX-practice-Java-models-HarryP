public class Dumbledore {
    private int id;
    private String name;
    private String species;
    private String gender;
    private String eyeColor;
    private String skinColor;
    private String patrons;
    private String house;

    /* Constructor parametrized */
    public Dumbledore(int id, String name, String species, String gender, String eyeColor, String skinColor, String patrons, String house){
        this.id = id;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.patrons = patrons;
        this.house = house;
    }

    /* Create getters */
    public int getId(){  return id;  }
    public String getName(){  return name;  }
    public String getSpecies(){  return species;  }
    public String getGender(){  return gender; }
    public String getEyeColor(){  return eyeColor;  }
    public String getSkinColor(){  return skinColor; }
    public String getPatrons(){  return patrons;  }
    public String getHouse(){  return house;  }

    /* Create setters
    * As a good practice, it is validated that the data is correct, the case of being correct returns true,
    * otherwise it returns false*/

    //valid that id is greater than 0, therefore it is a number
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else{
            return false;
        }
    }

    //it only validates that it is not empty
    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setSpecies(String species){
        if(!species.isEmpty()){
            this.species = species;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setEyeColor(String eyeColor){
        if(!eyeColor.isEmpty()){
            this.eyeColor = eyeColor;
            return true;
        } else
            return false;
    }

    public boolean setSkinColor(String skinColor){
        if(!eyeColor.isEmpty()){
            this.eyeColor = eyeColor;
            return true;
        } else
            return false;
    }

    public boolean setPatrons(String patrons){
        if(!patrons.isEmpty()){
            this.patrons = patrons;
            return true;
        } else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }

    /*Show data*/
    public String showMessage(){
        return
                "id: "+id+
                        " name: "+name+
                        "\nspecies: "+species+
                        "\ngender: "+gender+
                        "\neye color: "+eyeColor+
                        "\nskin color: "+skinColor+
                        "\npatronus: "+patrons+
                        "\nhouse: "+house+"\n"+
                        "-----------------------\n";
    }
}
