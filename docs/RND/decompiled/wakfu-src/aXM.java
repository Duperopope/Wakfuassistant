/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class aXM
implements aeh_2 {
    public static final String hxg = "heroesOrCompanionsEnabled";

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        ewr_0 ewr_02 = ewr_0.rJ(string);
        if (ewr_02 != null) {
            switch (ewr_02.feT()) {
                case oGz: {
                    return ewo_0.oBF.k(ewr_02);
                }
                case oGA: {
                    return ewo_0.oBF.i(ewr_02);
                }
                case oGB: {
                    return ewo_0.oBF.l(ewr_02);
                }
                case oGD: {
                    return ewo_0.oBF.o(ewr_02);
                }
                case oGC: {
                    return ewo_0.oBF.m(ewr_02);
                }
                case oGE: {
                    return ewo_0.oBF.n(ewr_02);
                }
                case oGF: {
                    return Float.valueOf(ewo_0.oBF.p(ewr_02));
                }
            }
            return null;
        }
        if (string.equals(hxg)) {
            return ewo_0.oBF.k(ewr_0.oDy) || ewo_0.oBF.k(ewr_0.oDg);
        }
        return null;
    }
}

