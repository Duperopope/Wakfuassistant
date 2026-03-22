/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from afB
 */
public class afb_0
extends ZG {
    private static final Logger cqE = Logger.getLogger(afb_0.class);
    public static final String cqF = "AnimStatique";
    private final afd_0 cqG;
    private String cja = "AnimStatique";
    private String asr;

    private afb_0(long l, float f2, float f3, float f4, byte by, afc_0 afc_02) {
        super(l, f2, f3, f4);
        this.a(abi_1.wG(by));
        this.cqG = afc_02.bxR();
    }

    public void aPg() {
        this.cqG.b(this);
    }

    public void clear() {
        this.cqG.c(this);
    }

    public static afb_0 a(adh adh2, adi adi2) {
        afc_0 afc_02 = afe_0.bxS().se(adi2.bIi);
        int n = adh2.rM(adi2.bal);
        int n2 = adh2.rN(adi2.bam);
        afb_0 afb_02 = afb_0.a(adi2.o, adi2.ciZ, n, n2, adi2.ban, adi2.bVy, adi2.aXR, adi2.bay, afc_02, adi2.cja);
        afb_02.ar(adi2.asr);
        return afb_02;
    }

    public static afb_0 a(long l, int n, float f2, float f3, float f4, boolean bl, byte by, byte by2, afc_0 afc_02, String string) {
        afb_0 afb_02 = new afb_0(l, f2, f3, f4, by2, afc_02);
        String string2 = String.format(afe_0.bxS().bxT(), n);
        afb_02.dP(string2);
        afb_02.k(string2, true);
        afb_02.qR(afX.csp.byy());
        afb_02.eE(string);
        afb_02.bC(bl);
        afb_02.aq(by);
        return afb_02;
    }

    private void eE(String string) {
        this.cja = BH.aU(string) ? cqF : string;
    }

    public String bxP() {
        return this.cja;
    }

    public String aGg() {
        return this.asr;
    }

    public void ar(String string) {
        this.asr = string;
    }

    public afd_0 bxQ() {
        return this.cqG;
    }
}

