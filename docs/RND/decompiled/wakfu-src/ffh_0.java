/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ffH
 */
public abstract class ffh_0
implements RT,
sg_0,
fgf_0,
gq_0<vy_2> {
    protected static final Logger sga = Logger.getLogger(ffh_0.class);
    protected ffV iWZ;
    protected long kVl;
    protected fnm jPp = fnm.sIx;

    @Override
    public ffV getItem() {
        return this.iWZ;
    }

    public void setItem(ffV ffV2) {
        this.iWZ = ffV2;
    }

    public long eAU() {
        return this.kVl;
    }

    public void lk(long l) {
        this.kVl = l;
    }

    public fnm dSx() {
        return this.jPp;
    }

    public void a(fnm fnm2) {
        if (fnm2 == null) {
            sga.error((Object)("set de packtype invalide sur merchantitem=" + String.valueOf(this)), (Throwable)new Exception());
            this.jPp = fnm.sIx;
            return;
        }
        this.jPp = fnm2;
    }

    @Override
    public void aZp() {
    }

    @Override
    public long LV() {
        if (this.iWZ == null) {
            return -1L;
        }
        return this.iWZ.LV();
    }

    @Override
    public int avr() {
        return this.iWZ.avr();
    }

    @Override
    public short bfd() {
        return this.iWZ.bfd();
    }

    @Override
    public void ak(short s) {
        this.iWZ.ak(s);
    }

    @Override
    public void al(short s) {
        this.iWZ.al(s);
    }

    @Override
    public boolean n(RT rT) {
        return this.iWZ.n(rT);
    }

    @Override
    public short bfe() {
        return this.iWZ.bfe();
    }

    @Override
    public RT bff() {
        return null;
    }

    @Override
    public RT bfg() {
        return null;
    }

    @Override
    public String beT() {
        return this.iWZ.beT() + "p" + this.jPp.sID + "k" + this.kVl;
    }

    public String fVE() {
        return "AbstractMerchantInventoryItem{m_item=" + (this.iWZ == null || this.iWZ.dOg() == null ? "null" : this.iWZ.dOg().getName()) + ", m_price=" + this.kVl + ", m_packType=" + String.valueOf((Object)this.jPp) + "}";
    }

    public String toString() {
        return this.beT();
    }
}

