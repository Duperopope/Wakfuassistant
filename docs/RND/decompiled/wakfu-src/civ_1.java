/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIv
 */
public class civ_1
extends ciy_1<fsG> {
    private static final Logger ndQ = Logger.getLogger(civ_1.class);
    private final short ndR;

    public civ_1(fsG fsG2, short s) {
        super(fsG2);
        this.ndR = s;
    }

    @Override
    public ciz_1 eLe() {
        return ciz_1.ndW;
    }

    @Override
    public void b(fst fst2) {
        fst2.aq(((fsG)this.ndV).glm(), ((fsG)this.ndV).gln(), ((fsG)this.ndV).fRN());
    }

    @Override
    public void c(cie_1 cie_12) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH(this.ndR);
        if (fcb_02 != null) {
            cie_12.b(fcb_02, ((fsG)this.ndV).glm(), ((fsG)this.ndV).gln());
            cie_12.deS();
        }
    }

    public short eLf() {
        return this.ndR;
    }

    @Override
    public void d(cie_1 cie_12) {
    }
}

