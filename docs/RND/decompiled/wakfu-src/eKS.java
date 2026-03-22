/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class eKS
extends Enum<eKS>
implements aoq_1 {
    public static final /* enum */ eKS qEv = new eKS(0, "Recette secr\u00e8te");
    public static final /* enum */ eKS qEw = new eKS(1, "Execute les actions sur l'item produit");
    private final int qEx;
    private final String qEy;
    private static final /* synthetic */ eKS[] qEz;

    public static eKS[] values() {
        return (eKS[])qEz.clone();
    }

    public static eKS valueOf(String string) {
        return Enum.valueOf(eKS.class, string);
    }

    private eKS(int n2, String string2) {
        this.qEx = n2;
        this.qEy = string2;
    }

    @Nullable
    public static eKS QY(int n) {
        eKS[] eKSArray = eKS.values();
        for (int i = 0; i < eKSArray.length; ++i) {
            eKS eKS2 = eKSArray[i];
            if (eKS2.qEx != n) continue;
            return eKS2;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.qEx);
    }

    @Override
    public String aXB() {
        return this.qEy;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ eKS[] fzc() {
        return new eKS[]{qEv, qEw};
    }

    static {
        qEz = eKS.fzc();
    }
}

