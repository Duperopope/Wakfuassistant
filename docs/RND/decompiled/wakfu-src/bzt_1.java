/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;

/*
 * Renamed from bZt
 */
public final class bzt_1
implements ady_0<ads_0>,
afY {
    private static final Logger lCX = Logger.getLogger(bzt_1.class);
    public static final bzt_1 lCY = new bzt_1();
    private boolean lCZ = true;

    public void a(ads_0 ads_02, int n, int n2, short s) {
        DisplayedScreenElement displayedScreenElement = aag_0.a(aaa_0.brC(), n, n2, s);
        if (displayedScreenElement == null) {
            return;
        }
        boolean bl = aaE.brU().ri(displayedScreenElement.bqh());
        this.iO(bl);
    }

    @Override
    public void byA() {
        boolean bl = aaE.brU().brV();
        this.iO(bl);
    }

    private void iO(boolean bl) {
        if (bl != this.lCZ) {
            bzq_1.lCJ.iN(bl);
            this.lCZ = bl;
        }
    }

    public boolean epW() {
        return this.lCZ;
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

