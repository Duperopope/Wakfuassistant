/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from aum
 */
public abstract class aum_1<T extends atq_1>
extends auo_1<T> {
    private static final Logger dea = Logger.getLogger(aum_1.class);
    public static final byte deb = 1;
    public static final byte dec = 2;
    public static final byte ded = 3;
    public static final byte dee = 4;
    public static final byte def = 5;
    public static final byte deg = 6;
    public static final byte deh = 7;
    public static final byte dei = 8;
    public static final byte dej = 9;
    public static final byte dek = 10;
    public static final byte del = 11;
    public static final byte dem = 12;
    public static final byte den = 13;
    public static final byte deo = 14;

    public static atq_1 r(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return aty_2.ddL.b(dataInput, f2);
            }
            case 2: {
                return atz_2.ddM.d(dataInput, f2);
            }
            case 3: {
                return aua_1.ddN.e(dataInput, f2);
            }
            case 4: {
                return aub_1.ddO.f(dataInput, f2);
            }
            case 5: {
                return aud_1.ddR.i(dataInput, f2);
            }
            case 6: {
                return aue_1.ddS.j(dataInput, f2);
            }
            case 7: {
                return auf_2.ddT.k(dataInput, f2);
            }
            case 8: {
                return auh_2.ddV.m(dataInput, f2);
            }
            case 9: {
                return aui_2.ddW.n(dataInput, f2);
            }
            case 10: {
                return aul_1.ddZ.q(dataInput, f2);
            }
            case 11: {
                return aug_2.ddU.l(dataInput, f2);
            }
            case 12: {
                return auc_1.ddP.g(dataInput, f2);
            }
            case 13: {
                return auj_2.ddX.o(dataInput, f2);
            }
            case 14: {
                return auk_1.ddY.p(dataInput, f2);
            }
        }
        dea.error((Object)("type d'affecteur inconnu " + by));
        return null;
    }
}

