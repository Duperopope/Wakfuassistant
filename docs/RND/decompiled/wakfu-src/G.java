/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite$InternalOneOfEnum
 *  com.google.protobuf.Internal$EnumLite
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;

public final class G
extends Enum<G>
implements AbstractMessageLite.InternalOneOfEnum,
Internal.EnumLite {
    public static final /* enum */ G bk = new G(2);
    public static final /* enum */ G bl = new G(3);
    public static final /* enum */ G bm = new G(4);
    public static final /* enum */ G bn = new G(0);
    private final int bo;
    private static final /* synthetic */ G[] bp;

    public static G[] values() {
        return (G[])bp.clone();
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private G(int n2) {
        this.bo = n2;
    }

    @Deprecated
    public static G i(int n) {
        return G.j(n);
    }

    public static G j(int n) {
        switch (n) {
            case 2: {
                return bk;
            }
            case 3: {
                return bl;
            }
            case 4: {
                return bm;
            }
            case 0: {
                return bn;
            }
        }
        return null;
    }

    public int getNumber() {
        return this.bo;
    }

    private static /* synthetic */ G[] bU() {
        return new G[]{bk, bl, bm, bn};
    }

    static {
        bp = G.bU();
    }
}

