/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bVa
 */
public final class bva_2 {
    private static Logger dJL = Logger.getLogger((String)"InteractiveDialogScripts");
    public static final bva_2 lrK = new bva_2();
    private static final String lrL = "interactiveDialogs/";
    private final TIntIntHashMap lrM = new TIntIntHashMap();
    private final bxv_1 lrN = new bxv_1(-1L);

    private bva_2() {
    }

    public void bLG() {
        ahk_1 ahk_12 = ahn_1.ccT().hL(this.lrN.ccq());
        if (ahk_12 != null) {
            ahk_12.dZ(true);
            ahk_12.br(0.0f, 0.2f);
        }
        this.lrN.hF(-1L);
    }

    public String nF(String string) {
        assert (afs_1.can().bYf() != null);
        return String.format("%s%s%s", lrL, string, afs_1.can().bLX());
    }

    public void nG(String string) {
        this.nH(string);
    }

    private void nH(String string) {
        String string2 = this.nF(string);
        boolean bl = fq_0.bC(afs_1.can().bYf() + string2);
        if (bl) {
            afs_1.can().a(string2, this.lrN);
        }
    }
}

