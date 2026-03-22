/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bgg
extends bfL {
    private static final Logger hZq = Logger.getLogger(bgg.class);
    private final bgh hZr;
    private boolean hZs = true;

    public bgg(bgh bgh2) {
        this.hZr = bgh2;
    }

    public int d() {
        return this.hZr.d();
    }

    @Override
    public String[] bxk() {
        return hVM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("item")) {
            return fgD.fXh().Vd(this.hZr.azv());
        }
        if (string.equals("quantity")) {
            return this.hZr.bfd();
        }
        if (string.equals("xp")) {
            if (this.hZr.agN() <= 0) {
                return null;
            }
            return ftE.ad(this.hZr.agN());
        }
        if (string.equals("boosterXp")) {
            if (this.hZr.agN() <= 0) {
                return null;
            }
            return ftE.ae(this.hZr.agN());
        }
        if (string.equals("kama")) {
            return aum_0.cWf().c("kama.gain", this.hZr.aGx());
        }
        if (string.equals("xpIconUrl")) {
            return this.dho();
        }
        if (string.equals("rankDescription")) {
            return aum_0.cWf().c("challenge.reward.rank." + this.hZr.aGu(), new Object[0]);
        }
        return null;
    }

    @Override
    protected fhc_0 dhn() {
        return fgD.fXh().Vd(this.hZr.azv());
    }

    @Override
    protected int oP() {
        return this.hZr.bfd();
    }

    @Override
    protected int agN() {
        return this.hZr.agN();
    }

    @Override
    protected int aGx() {
        return this.hZr.aGx();
    }

    @Override
    protected String dho() {
        try {
            return String.format(auc_0.cVq().bS("rewardTypeIconsPath"), bby_2.hCz.d());
        }
        catch (fu_0 fu_02) {
            hZq.warn((Object)fu_02.getMessage(), (Throwable)fu_02);
            return null;
        }
    }

    @Override
    protected String dhp() {
        return aum_0.cWf().c("challenge.reward.rank." + this.hZr.aGu(), new Object[0]);
    }

    public void fL(boolean bl) {
        this.hZs = bl;
    }

    public boolean isValid() {
        return this.hZs;
    }

    public boolean aGv() {
        return this.hZr.aGv();
    }
}

