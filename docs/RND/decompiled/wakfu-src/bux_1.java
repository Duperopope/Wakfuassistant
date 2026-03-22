/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bUX
 */
public class bux_1
extends agj_2 {
    protected static final Logger lrz = Logger.getLogger(bux_1.class);
    private final Integer lrA;
    private final Integer lrB;
    private final int lrC;
    private final buy_2 lrD;

    public bux_1() {
        this.lrA = 0;
        this.lrB = 0;
        this.lrC = 0;
        this.lrD = buy_2.lrE;
    }

    public bux_1(buy_2 buy_22, int n, int n2, int n3) {
        this.lrD = buy_22;
        this.lrA = n;
        this.lrB = n2;
        this.lrC = n3;
    }

    @Override
    public short aIi() {
        return 4;
    }

    @Override
    public afp_2 cbr() {
        afp_2 afp_22 = new afp_2("event");
        afp_22.g("action", this.lrD.eor());
        afp_22.g("referenceId", this.lrA);
        afp_22.g("quantity", this.lrB);
        afp_22.g("price", this.lrC);
        return afp_22;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof bux_1;
    }
}

