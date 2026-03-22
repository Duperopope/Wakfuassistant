/*
 * Decompiled with CFR 0.152.
 */
public abstract class bTo
implements aeh_2 {
    public static final String lnt = "name";
    public static final String lnu = "endangeredStatus";
    public static final String lnv = "endangeredStatus";
    public static final String lnw = "isProtected";
    public static final String lnx = "isExtinct";
    public static final String lny = "canBeReintroduced";
    public static final String lnz = "protectionPrice";
    public static final String lnA = "protectionPriceValue";
    public static final String lnB = "reintroductionPrice";
    public static final String lnC = "reintroductionPriceValue";
    public static final String lnD = "iconUrl";
    public static final String lnE = "getSeedsText";
    protected final int lnF;
    protected final int lnG;
    protected final int lnH;
    protected final int lnI;

    protected bTo(int n, int n2, int n3, int n4) {
        this.lnF = n;
        this.lnG = n2;
        this.lnH = n3;
        this.lnI = n4;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lnt)) {
            return this.getName();
        }
        if (string.equals(lnw)) {
            return this.enq();
        }
        if (string.equals(lnx)) {
            return this.ent();
        }
        if (string.equals(lnz)) {
            return this.lnH + "\u00a7";
        }
        if (string.equals(lnB)) {
            return this.lnI + "\u00a7";
        }
        if (string.equals(lnA)) {
            return this.lnH;
        }
        if (string.equals(lnC)) {
            return this.lnI;
        }
        if (string.equals(lnD)) {
            return this.byf();
        }
        if (string.equals(lny)) {
            return this.enr();
        }
        if (string.equals(lnE)) {
            return aum_0.cWf().c("craft.getSeeds", this.enu());
        }
        if (string.equals("endangeredStatus")) {
            if (this.ent()) {
                return aum_0.cWf().c("protector.ecosystem.extinct.species", new Object[0]);
            }
            if (this.ens()) {
                return aum_0.cWf().c("protector.ecosystem.endangered.species", new Object[0]);
            }
            return aum_0.cWf().c("protector.ecosystem.well.representated.species", new Object[0]);
        }
        if (string.equals("endangeredStatus")) {
            if (this.ent()) {
                return awx_2.dnJ.bQk();
            }
            if (this.ens()) {
                return awx_2.dnY.bQk();
            }
            return awx_2.dnG.bQk();
        }
        return null;
    }

    public int cqy() {
        return this.lnF;
    }

    public int env() {
        return this.lnH;
    }

    public int enw() {
        return this.lnI;
    }

    protected abstract boolean enr();

    protected abstract String byf();

    protected abstract String getName();

    protected abstract boolean enq();

    protected abstract boolean ens();

    protected abstract boolean ent();

    public abstract boolean egX();

    public abstract String enu();

    public void enx() {
        fse_1.gFu().a((aef_2)this, lnw);
    }

    public void eny() {
        fse_1.gFu().a((aef_2)this, lnx, "endangeredStatus", "endangeredStatus", lnD);
    }
}

