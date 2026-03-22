/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bSw
 */
public class bsw_2
implements ady_0<ads_0>,
afp<ads_0, bze_2> {
    protected static final Logger lgV = Logger.getLogger(bsw_2.class);
    public static final bsw_2 lgW = new bsw_2();

    public void aPg() {
        bzj_2.eqi().b(this);
    }

    public void a(ads_0 ads_02, bze_2 bze_22, bze_2 bze_23) {
        bgy bgy2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkZ() == null && ads_02 instanceof bdj_2 && (bgy2 = ((bdj_2)ads_02).dcP()) instanceof bhJ) {
            bgy2.djo();
        }
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
    }

    @Override
    public /* synthetic */ void b(afW afW2, vx_0 vx_02, vx_0 vx_03) {
        this.a((ads_0)afW2, (bze_2)vx_02, (bze_2)vx_03);
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

