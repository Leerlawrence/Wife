class Wife {

private String name; //define our state about what bear should have - default for java is public - explicitly state public or private
private int age;
private double weight;
private double height;


  public Wife(String name, int age, double weight, double height){
    this.name = name;      //this.name relates to the string name at line 3.
    this.age= age;
    this.weight = weight;
    this.height = height;
  }


  public String getWifesName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public int getWifesAge() {
    return this.age;
  }

  public double getWifesWeight() {
    return this.weight;
  }

  public double getWifesHeight() {
    return this.height;
  }

  public Boolean readyToDiet() {
    return  bmi() >= 25;     //you can put true, false or the statement
  }

public double bmi(){
return weight/(height*height);

}

}

// Contructor function must have same name 