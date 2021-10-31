package telusko.nro26.dao;

import telusko.nro26.modelo.Alien;

public class AlienDao {

   public Alien getAlien(int add)
   {
      Alien a=new Alien();
      a.setAdd(101);
      a.setAname("Jose");
      a.setTech("Java");
      
      return a;
   }
   
}
