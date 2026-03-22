/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmq
 */
public abstract class bmq_1
implements aeh_2 {
    public static final String iAJ = "type";
    public static final String iAK = "name";
    public static final String iAL = "iconUrl";
    public static final String iAM = "duration";
    public static final String iAN = "sourceName";
    public static final String iAO = "sourceId";
    public static final String iAP = "actionDescription";
    public static final String iAQ = "level";
    public static final String iAR = "levelText";
    public static final String iAS = "multiple";
    public static final String iAT = "canUseAsIngredient";
    public static final String iAU = "craftXp";
    public static final String iAV = "baseCraftXp";
    public static final String iAW = "rarity";
    private final ejj_0 iAX;
    private final int iAY;
    private final int iAZ;
    private final int iBa;
    private int iBb;
    private final int iBc;
    private final boolean iBd;
    private final boolean iBe;
    private final boolean iBf;
    private final int iBg;
    private final float iBh;
    private final fgj iBi;

    protected bmq_1(int n, int n2, int n3, int n4, boolean bl, ejj_0 ejj_02, boolean bl2, int n5, float f2) {
        this.iAY = n;
        this.iBa = n2;
        this.iBb = n3;
        Object r = fgD.fXh().Vd(this.iAY);
        this.iAZ = r == null ? 0 : ((fhc_0)r).aVt();
        this.iBc = n4;
        this.iBd = bl;
        this.iAX = ejj_02;
        this.iBe = eKQ.qEb.M(this.iAY);
        this.iBf = bl2;
        this.iBg = n5;
        this.iBh = f2;
        this.iBi = r == null ? fgj.siA : ((fhc_0)r).dwg();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iAK)) {
            return this.getName();
        }
        if (string.equals(iAL)) {
            return auc_0.cVq().a("itemsIconsPath", "defaultIconPath", this.iAZ);
        }
        if (string.equals(iAN)) {
            return this.czo();
        }
        if (string.equals(iAO)) {
            return this.ccu();
        }
        if (string.equals(iAP)) {
            return this.dvY();
        }
        if (string.equals(iAM)) {
            long l = this.iBc;
            float f2 = (float)l * 0.5f;
            float f3 = (float)l / 60.0f;
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            eki_0 eki_02 = bgt_02.dpK();
            short s = eki_02.PG(this.iBg);
            long l2 = l - (long)((float)(s - this.iBb) * f3);
            float f4 = Math.max(f2, (float)l2);
            float f5 = 0.01f * (float)bgt_02.dmn().a(eje_0.qyw, this.iBg, 3);
            float f6 = 1.0f / (1.0f + f5);
            return String.format("%.1f s", Float.valueOf((float)Math.round(f4 * f6) / 1000.0f));
        }
        if (string.equals(iAJ)) {
            return this.dwe().iBl;
        }
        if (string.equals(iAS)) {
            return this.iBd;
        }
        if (string.equals(iAQ)) {
            return this.iBb;
        }
        if (string.equals(iAT)) {
            return this.iBe;
        }
        if (string.equals(iAR)) {
            return aum_0.cWf().c("levelShort.custom", this.iBb);
        }
        if (string.equals(iAU)) {
            bgt_0 bgt_03 = aue_0.cVJ().cVK();
            return bgt_03.dnZ().Ei(this.iBg).a(this, 3);
        }
        if (string.equals(iAV)) {
            bgt_0 bgt_04 = aue_0.cVJ().cVK();
            return bgt_04.dnZ().Ei(this.iBg).a(this);
        }
        if (string.equals(iAW)) {
            return this.iBi;
        }
        Object r = fgD.fXh().Vd(this.iAY);
        return r == null ? null : new beg_1((fhc_0)r).eu(string);
    }

    public String dvY() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iBa);
        String string = aum_0.cWf().c("desc.mru." + fqy_02.giw(), new Object[0]);
        String string2 = this.czo();
        return aum_0.cWf().c("harvest.action", string, string2);
    }

    public String dvZ() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iBa);
        String string = aum_0.cWf().d("desc.mru." + fqy_02.giw(), new Object[0]);
        String string2 = this.dwd();
        return aum_0.cWf().d("harvest.action", string, string2);
    }

    public String getName() {
        return bgv_2.Dm(this.iAY);
    }

    public String dwa() {
        return bgv_2.Dn(this.iAY) + " " + this.dvZ();
    }

    public int dwb() {
        return this.iBb;
    }

    public float cmu() {
        return this.iBh;
    }

    public int azv() {
        return this.iAY;
    }

    public ejj_0 dwc() {
        return this.iAX;
    }

    public void Ed(int n) {
        this.iBb = n;
    }

    public abstract String czo();

    public abstract String dwd();

    public abstract int ccu();

    public abstract void Ee(int var1);

    public abstract bmr_2 dwe();

    public boolean dwf() {
        return this.iBf;
    }

    public int cms() {
        return this.iBg;
    }

    public fgj dwg() {
        return this.iBi;
    }
}

