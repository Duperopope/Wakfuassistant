/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fqr
 */
public abstract class fqr_0
implements RT,
ayz_2,
gq_0<yi_2> {
    protected static final Logger sSX = Logger.getLogger(fqr_0.class);
    protected fqu_0 sSY;
    protected ObjectPool bip;
    protected int sSZ;
    protected long sTa;
    protected int sTb;

    protected fqr_0() {
    }

    public fqu_0 gih() {
        return this.sSY;
    }

    protected void a(int n, long l, int n2) {
        this.sSZ = n;
        this.sTa = l;
        this.sTb = n2;
    }

    @Override
    public void aZp() {
        if (this.bip != null) {
            try {
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                sSX.error((Object)("Exception dans le release de " + this.getClass().toString() + ". Normalement impossible"));
            }
            this.bip = null;
        } else {
            this.aVH();
        }
    }

    @Override
    public long LV() {
        return this.sTa;
    }

    @Override
    public int avr() {
        return this.sSZ;
    }

    public int gii() {
        return this.sTb;
    }

    public void HX(int n) {
        this.sTb = n;
    }

    public void b(fqu_0 fqu_02, long l, int n, int n2) {
        this.sSY = fqu_02;
        this.sTa = fqu_02 != fqu_0.sTr ? l : (long)n;
        this.sSZ = n;
        this.sTb = n2;
    }

    public boolean c(yi_2 yi_22) {
        yi_22.Us = this.sSY.aJr();
        yi_22.alv = this.sTa;
        yi_22.alw = this.sSZ;
        yi_22.alx = this.sTb;
        return true;
    }

    @Override
    public boolean a(yi_2 yi_22) {
        this.sSY = fqu_0.ho(yi_22.Us);
        this.sTa = yi_22.alv;
        this.sSZ = yi_22.alw;
        this.sTb = yi_22.alx;
        return this.sSY != null;
    }

    @Override
    public short bfd() {
        return 1;
    }

    @Override
    public void ak(short s) {
    }

    @Override
    public void al(short s) {
    }

    @Override
    public boolean n(RT rT) {
        return false;
    }

    @Override
    public short bfe() {
        return 1;
    }

    @Override
    public void aVI() {
        this.sSZ = 0;
        this.sTa = 0L;
        this.sTb = 0;
    }

    @Override
    public void aVH() {
        this.sSY = null;
    }

    @Override
    public boolean bfh() {
        return true;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[m_targetReferenceId=" + this.sSZ + "]";
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((yi_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.c((yi_2)object);
    }
}

