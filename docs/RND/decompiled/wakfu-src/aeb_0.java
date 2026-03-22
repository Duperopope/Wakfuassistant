/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aeb
 */
public final class aeb_0 {
    private static final aeb_0 cmG = new aeb_0();
    private final HashMap<aea_0, aec_0> cmH = new HashMap();

    public static aeb_0 bwg() {
        return cmG;
    }

    private aeb_0() {
        this.a(aea_0.cmn, aem_0::bwq);
        this.a(aea_0.cmo, aef_0::bwm);
        this.a(aea_0.cmp, aeg_0::bwn);
        this.a(aea_0.cmr, ael_0::bwp);
        this.a(aea_0.cmB, aee_0::bwl);
        this.a(aea_0.cms, aej_0::new);
        this.a(aea_0.cmt, adz_0::new);
        this.a(aea_0.cmu, aek_0::new);
        this.a(aea_0.cmq, aeh_0::new);
    }

    public void a(aea_0 aea_02, aec_0 aec_02) {
        this.cmH.put(aea_02, aec_02);
    }

    public aed_0 a(aea_0 aea_02) {
        aec_0 aec_02 = this.cmH.get((Object)aea_02);
        if (aec_02 == null) {
            return null;
        }
        return aec_02.create();
    }
}

