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
 * Renamed from A
 */
public final class a_0
extends Enum<a_0>
implements AbstractMessageLite.InternalOneOfEnum,
Internal.EnumLite {
    public static final /* enum */ a_0 aG = new a_0(3);
    public static final /* enum */ a_0 aH = new a_0(4);
    public static final /* enum */ a_0 aI = new a_0(0);
    private final int aJ;
    private static final /* synthetic */ a_0[] aK;

    public static a_0[] values() {
        return (a_0[])aK.clone();
    }

    public static a_0 valueOf(String string) {
        return Enum.valueOf(a_0.class, string);
    }

    private a_0(int n2) {
        this.aJ = n2;
    }

    @Deprecated
    public static a_0 g(int n) {
        return a_0.h(n);
    }

    public static a_0 h(int n) {
        switch (n) {
            case 3: {
                return aG;
            }
            case 4: {
                return aH;
            }
            case 0: {
                return aI;
            }
        }
        return null;
    }

    public int getNumber() {
        return this.aJ;
    }

    private static /* synthetic */ a_0[] br() {
        return new a_0[]{aG, aH, aI};
    }

    static {
        aK = a_0.br();
    }
}

