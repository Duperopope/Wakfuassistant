/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKz
 */
public class bkz_2
implements aeh_2 {
    public static final String koQ = "altarWorld";
    public static final String koR = "altarTimer";
    public static final String koS = "altarPhase";
    private final String koT;
    private final fps_0 koU;
    private long koV;
    private fpR koW;

    public bkz_2(String string, fps_0 fps_02) {
        this.koT = string;
        this.koU = fps_02;
    }

    public void ebA() {
        this.koW = this.koU.dPE();
        fse_1.gFu().a((aef_2)this, koS);
        long l = 2L;
        switch (this.koW) {
            case sQS: 
            case sQT: {
                cyt_1.eXX().eXY().a(this);
                break;
            }
            case sQU: 
            case sQV: 
            case sQW: {
                this.koV = ue_0.bjV().bjc().l(this.koU.ght()).bjS();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                abg_2.bUP().a(() -> {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    long l = ue_0.bjV().bjc().l(this.koU.ght()).bjS();
                    if (l == this.koV) {
                        return;
                    }
                    this.koV = l;
                    fse_1.gFu().a((aef_2)this, koR);
                    if (this.koV > 0L) {
                        return;
                    }
                    this.koU.a(switch (this.koW) {
                        case fpR.sQU -> fpR.sQV;
                        case fpR.sQV -> fpR.sQW;
                        default -> fpR.sQT;
                    });
                    this.koU.ghu();
                    this.ebA();
                    atomicBoolean.set(true);
                }, 500L, GC.cw(1L + this.koV * 2L));
            }
        }
    }

    @Override
    public String[] bxk() {
        return new String[]{koQ, koR, koS};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (koQ.equals(string)) {
            return this.koT;
        }
        if (koR.equals(string)) {
            return aum_0.cWf().c("remainingDurationSeconds", this.koV);
        }
        if (koS.equals(string)) {
            return aum_0.cWf().c("pvp.extraction.state." + this.koW.name(), new Object[0]);
        }
        return null;
    }

    public long bhh() {
        return this.koU.bhh();
    }
}

