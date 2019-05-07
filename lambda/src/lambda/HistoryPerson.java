package lambda;

import java.util.ArrayList;
import java.util.List;

public class HistoryPerson {

  private Name name;
  private Life life;
  private Castle castle;

  public HistoryPerson() {

    this.name= new HistoryPerson.Name();
    this.life= new HistoryPerson.Life();
    this.castle= new HistoryPerson.Castle();
        
  }

  HistoryPerson createName(String kanji, String yomi) {
    this.name.create(kanji, yomi);
    return this;
  }
    
  HistoryPerson createLife(int bornYear, int  deadYear) {
    this.life.create(bornYear, deadYear);
    return this;
  }
    
  HistoryPerson createCastle(
    String name, double latitude, double longitude) {
    this.castle.create(name, latitude, longitude);
    return this;
  }

  class Name {    
    private String kanji="";
    private String yomi="";
        
    void create(String kanji, String yomi){
      this.kanji = kanji;
      this.yomi =yomi;
    }    
  }
    
  class Life {
    private int bornYear=0;
    private int deadYear=0;
        
    void create(int bornYear, int deadYear) {
      this.bornYear=bornYear;
      this.deadYear=deadYear;
    } 
  } 
    
  class Castle {
    private String name="";
    private double latitude=0;
    private double longitude=0;
        
    void create(String name, double latitude, 
      double longitude) {
        this.name= name;
        this.latitude = latitude;
        this.longitude=longitude;
    }
  }
  
  public String getName() {
    return this.name.kanji;
  }
    
  public String getYomi() {
    return this.name.yomi;
  }
    
  public int getBornYear() {
    return this.life.bornYear;
  }
    
  public int getDeadYear() {
    return this.life.deadYear;
  }

  public String getCastleName() {
    return this.castle.name;
  }
    
  public double getCastleLatitude() {
    return this.castle.latitude;
  }
    
  public double getCastleLongitude() {
    return this.castle.longitude;
  }
  
  public String describePerson() {
    return this.getName()+" "+
      this.getBornYear()+"-"+this.getDeadYear();
  }
  
  public String describeCastle() {
    return this.getName()+"‚ª‹é‚Æ‚µ‚½"+
      this.getCastleName();
  }
  
  public String describeAge(int year) {
    
    String description=this.getName()+"‚Í";

    if (year < this.getBornYear()) {
        description+="‚Ü‚¾¶‚Ü‚ê‚Ä‚¢‚Ü‚¹‚ñ‚Å‚µ‚½";
    } else if (year > this.getDeadYear()) {
        description+="‚à‚¤‚±‚Ì¢‚É‚¢‚Ü‚¹‚ñ‚Å‚µ‚½";
    } else {
        description += year-this.getBornYear()+"Î‚Å‚µ‚½";
    }
          
       return description;
  }

  public static List<HistoryPerson> listPeople() {
    
    List<HistoryPerson> people = new ArrayList<>();
        
    people.add(new HistoryPerson()
      .createName("•“cMŒº", "‚½‚¯‚¾‚µ‚ñ‚°‚ñ")
      .createLife(1521, 1573)
      .createCastle("çUçPƒ–èŠÙ", 
                35.414171, 138.343890)
    );
        
    people.add(new HistoryPerson()
      .createName("ã™ŒªM", "‚¤‚¦‚·‚¬‚¯‚ñ‚µ‚ñ")
      .createLife(1530, 1578)
      .createCastle("t“úRé", 37.084808, 138.121999)
    );
        
    people.add(new HistoryPerson()
      .createName("D“cM’·", "‚¨‚¾‚Ì‚Ô‚È‚ª")
      .createLife(1534, 1582)
      .createCastle("ˆÀ“yé", 35.092129, 136.082487)
    );
        
    people.add(new HistoryPerson()
      .createName("ˆÉ’B­@", "‚¾‚Ä‚Ü‚³‚Ş‚Ë")
      .createLife(1567, 1638)
      .createCastle("Â—té", 38.150892, 140.512216)
      );
        
    people.add(new HistoryPerson()
      .createName("–kğN", "‚Ù‚¤‚¶‚å‚¤‚¤‚¶‚â‚·")
      .createLife(1515, 1571)
      .createCastle("¬“cŒ´é", 35.150377, 139.091239)
      );
        
    people.add(new HistoryPerson()
      .createName("–Ñ—˜Œ³A", "‚à‚¤‚è‚à‚Æ‚È‚è")
      .createLife(1521, 1573)
      .createCastle("‹g“cŒSRé", 
           34.402747, 132.423452)
      );
    
      return people;
   }  
}

