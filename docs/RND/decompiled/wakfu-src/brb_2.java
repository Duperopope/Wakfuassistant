/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bRB
 */
public class brb_2
extends fld_0 {
    public static final String laV = "efcc0a";
    private int laP;
    private int laW;

    public brb_2(fjo_0 fjo_02) {
        super(fjo_02);
        this.sDO = new brc_2(this);
    }

    @Override
    protected fkx ekW() {
        return new brw_2();
    }

    @Override
    public long mn(long l) {
        return 0L;
    }

    @Override
    public void d(long l, String string) {
        sDm.info((Object)"Demande d'enregistrement d'un candidat \u00e0 la nation !!!");
        fjc_0 fjc_02 = new fjc_0();
        fjc_02.Le(this.ems().Xt());
        fjc_02.db(l);
        fjc_02.sO(string);
        bru_1.ldo.a(fjc_02);
    }

    @Override
    public void a(long l, fkw fkw2) {
        throw new UnsupportedOperationException("[NATION] Impossible d'enregistrer des CandidateInfo d\u00e9j\u00e0 initialis\u00e9s \u00e0 partir d'ici");
    }

    @Override
    public void P(ArrayList<fkw> arrayList) {
        this.ekY();
        brx_1.elI().emk();
        for (int i = 0; i < arrayList.size(); ++i) {
            fkw fkw2 = arrayList.get(i);
            this.sDv.put(fkw2.Sn(), (Object)fkw2);
        }
        brx_1.elI().dhh();
    }

    @Override
    public void dV(int n, int n2) {
        this.laP = n;
        this.laW = n2;
    }

    @Override
    public void a(long l, byte by, long l2) {
        fji_0 fji_02 = new fji_0();
        fji_02.Le(this.ems().Xt());
        fji_02.db(l);
        fji_02.aj(by);
        fji_02.nJ(l2);
        bru_1.ldo.a(fji_02);
    }

    @Override
    public void a(fkL fkL2, fkL fkL3, fkO fkO2) {
        fjk_0 fjk_02 = new fjk_0();
        fjk_02.Le(this.ems().Xt());
        fjk_02.tZ(fkL2.Sn());
        fjk_02.ua(fkL3.Sn());
        fjk_02.a(fkO2);
        bru_1.ldo.a(fjk_02);
    }

    @Override
    public void b(ux_0 ux_02, ua_0 ua_02, boolean bl) {
        this.ab(ux_02);
        this.sDt.c(ua_02);
        this.sDq = bl;
    }

    @Override
    public boolean ekX() {
        this.sDv.clear();
        return true;
    }

    @Override
    public void E(long l, long l2) {
        fje_0 fje_02 = new fje_0();
        fje_02.Le(this.ems().Xt());
        fje_02.tY(l2);
        fje_02.tX(l);
        bru_1.ldo.a(fje_02);
    }

    @Override
    protected void ekY() {
        this.laW = 0;
        this.laP = 0;
        TLongObjectIterator<fkw> tLongObjectIterator = this.ems().gbz();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            fjm fjm2 = this.ems().tV(l);
            if (fjm2 == null) continue;
            ((bri_2)fjm2.ffF()).elh();
        }
        super.ekY();
    }

    @Override
    public int ekU() {
        return this.laP;
    }

    @Override
    public int ekZ() {
        return this.laW;
    }

    public void Jl(int n) {
        this.laW = n;
    }

    @Override
    public void D(long l, long l2) {
    }

    @Override
    public void mk(long l) {
    }

    @Override
    public void ml(long l) {
    }

    @Override
    public void mm(long l) {
    }

    @Override
    public void ekV() {
    }

    static /* synthetic */ boolean a(brb_2 brb_22, boolean bl) {
        brb_22.sDq = bl;
        return brb_22.sDq;
    }

    static /* synthetic */ uz_0 a(brb_2 brb_22) {
        return brb_22.sDt;
    }

    static /* synthetic */ uz_0 b(brb_2 brb_22) {
        return brb_22.sDu;
    }
}

