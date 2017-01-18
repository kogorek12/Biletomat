package biletomatikasownik;

import java.util.Date;

public class BiletNaKarcie {
    private RodzajZnizki znizka;
    private BiletKartaTyp typ;
    private Date dataOd;
    private Date dataDo;

    public BiletNaKarcie(RodzajZnizki znizka, BiletKartaTyp typ, Date dataOd) {
        this.znizka = znizka;
        this.typ = typ;
        this.dataOd = dataOd;
        if(this.typ.equals(BiletKartaTyp.Miesieczny))
        this.dataDo = new Date(dataOd.getTime()+Long.parseLong("2592000000"));
        if(this.typ.equals(BiletKartaTyp.TrzyMiesieczny))
        this.dataDo = new Date(dataOd.getTime()+Long.parseLong("7776000000"));
        if(this.typ.equals(BiletKartaTyp.Tygodniowy))
        this.dataDo = new Date(dataOd.getTime()+Long.parseLong("604800000"));
    }

    public RodzajZnizki getZnizka() {
        return znizka;
    }

    public BiletKartaTyp getTyp() {
        return typ;
    }

    public Date getDataOd() {
        return dataOd;
    }

    public Date getDataDo() {
        return dataDo;
    }
    
    
    
    
    
    
}
