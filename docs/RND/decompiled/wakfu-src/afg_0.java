/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afG
 */
public class afg_0
implements afa_0 {
    private Object cqO;
    private Object cqP;
    private final String cqQ;

    public afg_0(String string) {
        this.cqQ = string;
    }

    @Override
    public void run() {
        System.out.println(this.cqQ + ": user " + this.cqP.toString() + " is using a" + this.cqO.toString());
    }

    @Override
    public boolean bxO() {
        return true;
    }

    @Override
    public String getLabel() {
        return this.cqQ;
    }

    @Override
    public void A(Object object) {
        this.cqO = object;
    }

    @Override
    public void B(Object object) {
        this.cqP = object;
    }
}

