package telusko.nro26.modelo;

public class Alien {
   
      private int add;
      private String aname;
      private String tech;

   public int getAdd() {
      return add;
   }

   public void setAdd(int add) {
      this.add = add;
   }

   public String getAname() {
      return aname;
   }

   public void setAname(String aname) {
      this.aname = aname;
   }

   public String getTech() {
      return tech;
   }

   public void setTech(String tech) {
      this.tech = tech;
   }

   @Override
   public String toString() {
      return "Alien{" + "add=" + add + ", aname=" + aname + ", tech=" + tech + '}';
   }

   
}
