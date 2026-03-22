/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.commons.pool.ObjectPool
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.commons.pool.ObjectPool;

public class bKR
extends bKV
implements eih_0 {
    private static final ObjectPool kqS = new ayv_2(new bKS());

    bKR() {
    }

    public static bKV a(int n, int n2, short s, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        bKR bKR2;
        try {
            bKR2 = (bKR)kqS.borrowObject();
        }
        catch (Exception exception) {
            bWl.error((Object)"Erreur lors de l'extraction d'une monsterResource du pool", (Throwable)exception);
            bKR2 = new bKR();
        }
        if (!bKR2.b(n, n2, s, n3, by, bl, bl2, l, n4)) {
            return null;
        }
        return bKR2;
    }

    @Override
    public void aZp() {
        if (kqS != null) {
            try {
                kqS.returnObject((Object)this);
            }
            catch (Exception exception) {
                bWl.error((Object)"Erreur lors du retour d'une resource au pool", (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    @Override
    public TIntHashSet ebX() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        tIntHashSet.addAll(((bKQ)this.kre).cuE());
        return tIntHashSet;
    }
}

