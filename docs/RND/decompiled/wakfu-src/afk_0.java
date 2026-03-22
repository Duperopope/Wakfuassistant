/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from afK
 */
public abstract class afk_0
extends ZH
implements ng_1,
ZJ {
    public static final short crb = Short.MIN_VALUE;
    private static final String crc = "AnimTrans_";
    private static final String crd = "AnimStatique_";
    private static final String cre = "Func_";
    private static final String crf = "End";
    private ayv_2 bmq;
    protected ni_1 crg;
    private int crh;
    private int asz;
    protected short bmf = (short)Short.MIN_VALUE;
    private boolean cri;

    protected void a(ayv_2 ayv_22) {
        this.bmq = ayv_22;
    }

    @Override
    public long Sn() {
        return this.crg.Sn();
    }

    @Override
    public int aVB() {
        return this.crh;
    }

    @Override
    public void nT(int n) {
        this.crh = n;
    }

    public int bxZ() {
        return this.asz;
    }

    @Override
    public void nU(int n) {
        this.asz = n;
    }

    @Override
    public void nV(int n) {
        awx_2 awx_22 = new awx_2(n);
        this.bVO[0] = awx_22.aIW();
        this.bVO[1] = awx_22.aIV();
        this.bVO[2] = awx_22.aIU();
        this.bVQ = this.bVO[3] = awx_22.aIX();
        this.bVR = this.bVO[3];
    }

    @Override
    public byte aVC() {
        return (byte)this.aKu();
    }

    @Override
    public void B(byte by) {
        this.aq(by);
    }

    @Override
    public void aD(boolean bl) {
        afX afX2 = bl ? afX.csj : afX.csj;
        this.qR(afX2.byy());
    }

    @Override
    public void aVH() {
        this.crh = 0;
        this.asz = 0;
        this.crg = null;
        this.bmq = null;
        this.bmf = (short)Short.MIN_VALUE;
        this.bpI();
    }

    @Override
    public void aVI() {
        this.cri = true;
    }

    @Override
    public void aZp() {
        if (this.bmq != null) {
            try {
                this.bmq.returnObject(this);
            }
            catch (Exception exception) {
                bWl.error((Object)"Exception lev\u00e9e du retour d'un objet dans son pool : ", (Throwable)exception);
            }
        } else {
            bWl.error((Object)"L'objet ne peut retourner dans un pool, il n'a pas \u00e9t\u00e9 initialis\u00e9");
        }
    }

    @Override
    public ni_1 aVD() {
        return this.crg;
    }

    @Override
    public void a(@NotNull ni_1 ni_12) {
        this.crg = ni_12;
    }

    protected void a(byte by, boolean bl, RJ rJ, abi_1 abi_12) {
        String string;
        boolean bl2;
        boolean bl3 = this.bmf != by;
        boolean bl4 = bl2 = this.bmk != abi_12;
        if (!(bl3 || bl2 || rJ == RJ.bmt || (string = this.bkI()) == null || string.equals("AnimStatique"))) {
            return;
        }
        this.a(abi_12);
        string = !bl3 && bl2 || rJ == RJ.bmu ? crd : this.c(bl, bl3);
        if (string != null) {
            this.dT(string + by);
        }
        this.dV(crd + by);
        this.bpC();
    }

    private String c(boolean bl, boolean bl2) {
        if (this.bmf == Short.MIN_VALUE) {
            return crd;
        }
        if (!bl) {
            return crc;
        }
        if (!bl2) {
            return null;
        }
        return crc + this.bmf + "_";
    }

    @Override
    public void animationEnded(ZC zC) {
        this.crg.c(this);
    }

    public boolean bsr() {
        return this.cri;
    }

    public void bU(boolean bl) {
        this.cri = bl;
    }

    public abstract afr_1[] bya();
}

