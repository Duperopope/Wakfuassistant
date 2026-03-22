/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from alr
 */
public class alr_2
implements alj_2 {
    private static final Logger cFp = Logger.getLogger(alr_2.class);
    private String cFq;

    public alr_2(apl_1 apl_12) {
        this.a(apl_12);
    }

    public alr_2(String string) {
        this.cFq = string;
    }

    @Override
    public void a(arj_2 arj_22, int n) {
        if (!arj_22.bpD()) {
            return;
        }
        Byte by = arj_22.bHZ();
        Integer n2 = arj_22.bIa();
        if (by == null || n2 == null) {
            cFp.error((Object)("PlayMountSoundData call while AnimatedObject has no mount info " + String.valueOf(arj_22)));
            return;
        }
        aiv_2 aiv_22 = aiv_2.bBr();
        aix_2 aix_22 = aiv_22.a(by, (int)n2, this.cFq);
        if (aix_22 == null) {
            cFp.error((Object)("Unable to apply PlayMountSoundData for type " + by + " skin " + n2 + " and type " + this.cFq));
            return;
        }
        aiv_2.bBr().a(aix_22.aYj(), aix_22.bBt(), aix_22.bBN(), 1, -1L, -1L, arj_22.bqo(), n, (agn_1)((Object)arj_22), aix_22.bBw());
    }

    @Override
    public int aeV() {
        return 7;
    }

    @Override
    public void a(apl_1 apl_12) {
        int n = apl_12.aIA();
        this.cFq = BH.dc(apl_12.mv(n));
    }

    @Override
    public void b(fs_0 fs_02) {
        byte[] byArray = BH.aP(this.cFq);
        fs_02.mz(byArray.length);
        fs_02.di(byArray);
    }

    public void eW(String string) {
        this.cFq = string;
    }
}

