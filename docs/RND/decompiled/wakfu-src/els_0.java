/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eLs
 */
public final class els_0
extends Enum<els_0>
implements aoq_1 {
    public static final /* enum */ els_0 qGk = new els_0(0, "Recette secr\u00e8te");
    public static final /* enum */ els_0 qGl = new els_0(1, "Execute les actions sur l'item produit");
    private final int qGm;
    private final String qGn;
    private static final /* synthetic */ els_0[] qGo;

    public static els_0[] values() {
        return (els_0[])qGo.clone();
    }

    public static els_0 valueOf(String string) {
        return Enum.valueOf(els_0.class, string);
    }

    private els_0(int n2, String string2) {
        this.qGm = n2;
        this.qGn = string2;
    }

    @Nullable
    public static els_0 Rk(int n) {
        els_0[] els_0Array = els_0.values();
        for (int i = 0; i < els_0Array.length; ++i) {
            els_0 els_02 = els_0Array[i];
            if (els_02.qGm != n) continue;
            return els_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.qGm);
    }

    @Override
    public String aXB() {
        return this.qGn;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ els_0[] fzG() {
        return new els_0[]{qGk, qGl};
    }

    static {
        qGo = els_0.fzG();
    }
}

