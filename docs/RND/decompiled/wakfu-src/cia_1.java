/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIA
 */
public class cia_1
extends ciy_1<fsb_0> {
    private static final Logger ned = Logger.getLogger(cia_1.class);
    private final short nee;
    private final short nef;

    public cia_1(fsb_0 fsb_02, short s, short s2) {
        super(fsb_02);
        this.nee = s;
        this.nef = s2;
    }

    @Override
    public ciz_1 eLe() {
        return ciz_1.ndY;
    }

    @Override
    public void b(fst fst2) {
        fst2.j(((fsb_0)this.ndV).glj());
    }

    @Override
    public void c(cie_1 cie_12) {
        cie_12.b(this.ndV);
        fam_0 fam_02 = ((fsb_0)this.ndV).glj();
        cie_12.h(new caj_2(fam_02.ZC(), fam_02.fRb(), fam_02.azv(), this.nee, this.nef));
    }

    @Override
    public void d(cie_1 cie_12) {
        fam_0 fam_02 = ((fsb_0)this.ndV).glj();
        cie_12.h(new caj_2(fam_02.ZC(), fam_02.fRb(), fam_02.azv(), fam_02.fRc(), fam_02.fRd()));
    }
}

