/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;

public class bNS
implements aeh_2,
bNO {
    public static final String kIX = "name";
    public static final String kIY = "isActivated";
    public static final String kIZ = "isEnabled";
    public static final String kJa = "isFavourite";
    public static final String kJb = "errorText";
    public static final String[] kJc = new String[]{"name"};
    public static final byte kJd = 1;
    private final long kJe;
    private final int kJf;
    private final boolean kJg;
    private boolean kJh;
    private final TByteHashSet kJi;
    private final fro_0 kJj;

    public bNS(fro_0 fro_02, long l, int n, boolean bl, TByteHashSet tByteHashSet) {
        this.kJj = fro_02;
        this.kJe = l;
        this.kJg = bl;
        this.kJf = n;
        this.kJi = tByteHashSet;
    }

    @Override
    public String[] bxk() {
        return kJc;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kIX)) {
            return this.getName();
        }
        if (string.equals(kIZ)) {
            return this.isEnabled();
        }
        if (string.equals(kJa)) {
            return this.kJh;
        }
        if (string.equals(kIY)) {
            return this.apo();
        }
        if (string.equals(kJb)) {
            if (this.kJg) {
                return null;
            }
            ahv_2 ahv_22 = new ahv_2();
            if (this.kJi.contains((byte)1)) {
                ahv_22.ceH();
                ahv_22.c(aum_0.cWf().c("booster.pack.required", new Object[0]));
            }
            return ahv_22.bXe() == 0 ? null : ahv_22.ceL();
        }
        return null;
    }

    @Override
    public long Sn() {
        return (long)this.kJj.gku() == this.kJe ? (long)this.kJj.gkt() : (long)this.kJj.gku();
    }

    public String getName() {
        return aum_0.cWf().a(36, (long)((int)this.Sn()), new Object[0]);
    }

    public String dah() {
        return aum_0.cWf().b(36, (long)((int)this.Sn()), new Object[0]);
    }

    public boolean isEnabled() {
        return this.kJg;
    }

    public boolean apo() {
        return true;
    }

    public boolean egx() {
        return this.kJh;
    }

    public void ii(boolean bl) {
        this.kJh = bl;
    }

    public int wp() {
        return this.kJf;
    }

    public int egy() {
        return this.kJj.gku();
    }
}

