/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fiV
 */
public final class fiv_0 {
    private fiv_0() {
    }

    public static fix_0 a(ffV ffV2, mE mE2) {
        Short s;
        if (ffV2.avr() != mE2.AK()) {
            return fix_0.suq;
        }
        if (ffV2.fWm()) {
            return fix_0.sur;
        }
        if (mE2.amJ() && ((s = ffV2.fWb()) == null || s < mE2.amK())) {
            return fix_0.sus;
        }
        boolean bl = ffV2.dXg();
        List<Integer> list = mE2.amL();
        if (!list.isEmpty() && !list.equals(fiZ.sva)) {
            if (bl) {
                boolean bl2 = mE2.amN() && mE2.amO();
                List<Integer> list2 = fiZ.f(ffV2.eAZ());
                if (!fiZ.a(mE2.amL(), list2, bl2)) {
                    return fix_0.sut;
                }
            } else if (!list.equals(fiZ.suZ)) {
                return fix_0.sut;
            }
        }
        if (mE2.amP()) {
            if (!bl) {
                return fix_0.suu;
            }
            fhi_0 fhi_02 = ffV2.eAZ();
            if (fhi_02.ahy() != mE2.amQ()) {
                return fix_0.suu;
            }
        }
        if (mE2.amR()) {
            if (!bl) {
                return fix_0.suv;
            }
            fhi_0 fhi_03 = ffV2.eAZ();
            if (fhi_03.ahA() != mE2.amS()) {
                return fix_0.suv;
            }
        }
        return fix_0.sup;
    }
}

