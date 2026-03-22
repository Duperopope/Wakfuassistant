/*
 * Decompiled with CFR 0.152.
 */
public abstract class bRf<T extends fbz_0>
implements aeh_2 {
    private static final String kZm = "name";
    private static final String kZn = "enabled";
    private static final String kZo = "kamasCost";
    private static final String kZp = "currentQuantity";
    private static final String kZq = "maxQuantity";
    private static final String kZr = "quantityText";
    protected static final String[] kZs = new String[]{"name", "kamasCost", "enabled", "quantityText"};
    protected fsH kZt;
    protected final T kZu;
    private boolean kZv;

    protected static String[] w(String ... stringArray) {
        String[] stringArray2 = new String[kZs.length + stringArray.length];
        System.arraycopy(kZs, 0, stringArray2, 0, kZs.length);
        System.arraycopy(stringArray, 0, stringArray2, kZs.length, stringArray.length);
        return stringArray2;
    }

    protected bRf(T t) {
        this.kZu = t;
    }

    public abstract bQV ekB();

    @Override
    public Object eu(String string) {
        if (string.equals(kZm)) {
            return this.getName();
        }
        if (string.equals(kZo)) {
            long l;
            Object object;
            Object object2;
            if (this.kZu instanceof fby_0) {
                object2 = (fby_0)this.kZu;
                object = fbo_0.e((fby_0)object2);
                l = fsl_0.a((fbk_0)object, bRb.kYS.ekv());
            } else {
                l = ((fbz_0)this.kZu).cmP();
            }
            object2 = aum_0.cWf().cQ(l);
            object = new ahv_2();
            if (!this.ekx()) {
                ((ahv_2)object).ih(awx_2.dnJ.bQk());
            }
            ((ahv_2)object).c((CharSequence)object2);
            return ((ahv_2)object).ceL();
        }
        if (string.equals(kZn)) {
            return this.ein();
        }
        if (string.equals(kZp)) {
            return this.eky();
        }
        if (string.equals(kZq)) {
            return ((fbz_0)this.kZu).fSt();
        }
        if (string.equals(kZr)) {
            if (((fbz_0)this.kZu).fSt() <= 0) {
                return null;
            }
            return this.eky() + "/" + ((fbz_0)this.kZu).fSt();
        }
        return null;
    }

    public abstract boolean ekx();

    public abstract int eky();

    public T ekD() {
        return this.kZu;
    }

    public String getName() {
        return bRa.a(this.ekD());
    }

    public void a(fsH fsH2) {
        this.kZt = fsH2;
    }

    public void it(boolean bl) {
        this.kZv = bl;
        fse_1.gFu().a((aef_2)this, kZn, kZq, kZr);
    }

    public boolean ein() {
        return this.kZv;
    }

    public abstract bRf ekz();
}

