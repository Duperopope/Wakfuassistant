/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bkm
 */
public final class bkm_1
extends bkb_0 {
    private static final Logger iqB = Logger.getLogger(bkm_1.class);
    private static final Runnable iqC = new bkn_1();
    private final TLongShortHashMap iqD;
    private final long iqE;
    private final bCA iqF;
    public static final short iqG = 1;
    public static final short iqH = 2;

    public bkm_1(TLongShortHashMap tLongShortHashMap, long l, bCA bCA2) {
        this.iqD = tLongShortHashMap;
        this.iqE = l;
        this.iqF = bCA2;
    }

    @Override
    public boolean dsn() {
        if (this.iqd.doP() || this.iqd.djT()) {
            iqB.warn((Object)("Le joueur " + String.valueOf(this.iqd) + " est mort ou en combat et ne peut utiliser de machine de craft"));
            return false;
        }
        return true;
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        abg_2.bUP().h(iqC);
        return this.dsd();
    }

    @Override
    public void bIH() {
        this.gp(true);
        ciY ciY2 = new ciY(this.iqF.Sn());
        aue_0.cVJ().etu().d(ciY2);
        abg_2.bUP().a(iqC, this.iqE, 1);
    }

    @Override
    public boolean dsd() {
        this.gp(false);
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)2);
        cmo_02.cD((short)27);
        aue_0.cVJ().etu().d(cmo_02);
        return true;
    }

    public void gp(boolean bl) {
        if (this.iqF != null) {
            this.iqF.ac(bl ? (short)2 : 1);
            this.iqF.aVQ();
        }
    }

    @Override
    public short dsm() {
        return 27;
    }
}

