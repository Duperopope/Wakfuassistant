/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.util.Collection;

public class VT {
    private final int bKO;
    private final String bKP;
    private final THashSet<VS> bKQ;
    private final VR bKR;
    private final boolean bKS;

    public VT(int n, String string, VS vS, VR vR, boolean bl) {
        this.bKO = n;
        this.bKP = string;
        this.bKQ = new THashSet();
        this.bKQ.add((Object)vS);
        this.bKR = vR;
        this.bKS = bl;
    }

    public VT(int n, String string, Collection<VS> collection, VR vR, boolean bl) {
        this.bKO = n;
        this.bKP = string;
        this.bKQ = new THashSet();
        this.bKQ.addAll(collection);
        this.bKR = vR;
        this.bKS = bl;
    }

    public int d() {
        return this.bKO;
    }

    public String getText() {
        return this.bKP;
    }

    public boolean a(VS vS) {
        return this.bKQ.contains((Object)vS);
    }

    public VR bkW() {
        return this.bKR;
    }

    public boolean bkX() {
        return this.bKS;
    }
}

