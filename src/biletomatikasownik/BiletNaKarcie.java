package biletomatikasownik;

import java.util.Date;

public class BiletNaKarcie {
    private RodzajZnizki znizka;
    private BiletKartaTyp typ;
    private Date dataOd;
    private Date dataDo;

    public BiletNaKarcie(RodzajZnizki znizka, BiletKartaTyp typ, Date dataOd, Date dataDo) {
        this.znizka = znizka;
        this.typ = typ;
        this.dataOd = dataOd;
        this.dataDo = dataDo;
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
