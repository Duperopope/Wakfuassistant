/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite$InternalOneOfEnum
 *  com.google.protobuf.Internal$EnumLite
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;

/*
 * Renamed from ao
 */
public final class ao_1
extends Enum<ao_1>
implements AbstractMessageLite.InternalOneOfEnum,
Internal.EnumLite {
    public static final /* enum */ ao_1 dD = new ao_1(1);
    public static final /* enum */ ao_1 dE = new ao_1(2);
    public static final /* enum */ ao_1 dF = new ao_1(3);
    public static final /* enum */ ao_1 dG = new ao_1(0);
    private final int dH;
    private static final /* synthetic */ ao_1[] dI;

    public static ao_1[] values() {
        return (ao_1[])dI.clone();
    }

    public static ao_1 valueOf(String string) {
        return Enum.valueOf(ao_1.class, string);
    }

    private ao_1(int n2) {
        this.dH = n2;
    }

    @Deprecated
    public static ao_1 u(int n) {
        return ao_1.v(n);
    }

    public static ao_1 v(int n) {
        switch (n) {
            case 1: {
                return dD;
            }
            case 2: {
                return dE;
            }
            case 3: {
                return dF;
            }
            case 0: {
                return dG;
            }
        }
        return null;
    }

    public int getNumber() {
        return this.dH;
    }

    private static /* synthetic */ ao_1[] eB() {
        return new ao_1[]{dD, dE, dF, dG};
    }

    static {
        dI = ao_1.eB();
    }
}

