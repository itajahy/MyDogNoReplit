class Cachorro{
  
private int porte;

public Cachorro(int porte){
  this.porte = porte;

}
public void latir(){

  if (porte <=5) 
  
        System.out.println("auin auin!\n");

  else if (porte >5 && porte <=10)
            
        System.out.println("AAAU! AAAU!\n");
  else
        System.out.println("ROOOUNG UOOOU! ROOOOUNG UOOOU! \n");
  }


}