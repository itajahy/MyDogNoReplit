class Cachorro{
  
private int porte;

public Cachorro(int porte){
  this.porte = porte;

}
public void latir(int freq){

  for(int i = 0; i<freq; i++)

  if (porte <=5) 
  
        System.out.println("auin\n");

  else if (porte >5 && porte <=10)
            
        System.out.println("AAAU!\n");
  else
        System.out.println("ROOOUNG UOOOU!\n");
  }


}