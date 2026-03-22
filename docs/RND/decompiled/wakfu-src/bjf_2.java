/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bjF
 */
public class bjf_2 {
    protected azl_2<bjj_2> ipq;
    protected azl_2<bji_2> ipr;
    protected bjh_2[] ips;

    public void a(bjj_2[] bjj_2Array) {
        if (bjj_2Array == null || bjj_2Array.length == 0) {
            this.ipq = null;
            return;
        }
        this.ipq = new azl_2();
        for (bjj_2 bjj_22 : bjj_2Array) {
            this.a(bjj_22);
        }
    }

    public void a(bjj_2 bjj_22) {
        if (this.ipq == null) {
            this.ipq = new azl_2<bjj_2>(new bjj_2[]{bjj_22});
            return;
        }
        boolean[] blArray = new boolean[]{false};
        this.o(new bjg_2(this, bjj_22, blArray));
        if (!blArray[0]) {
            this.ipq.M(bjj_22);
        }
    }

    public void a(bji_2[] bji_2Array) {
        this.ipr = bji_2Array == null ? null : new azl_2<bji_2>(bji_2Array);
    }

    public void a(bji_2 bji_22) {
        if (this.ipr == null) {
            this.ipr = new azl_2<bji_2>(new bji_2[]{bji_22});
        } else {
            this.ipr.M(bji_22);
        }
    }

    public void a(bjh_2[] bjh_2Array) {
        this.ips = bjh_2Array;
    }

    public boolean drO() {
        return this.ipq != null && this.ipq.aVo() > 0;
    }

    public void o(TObjectProcedure<bjj_2> tObjectProcedure) {
        if (this.ipq == null) {
            return;
        }
        this.ipq.h(tObjectProcedure);
    }

    public void p(TObjectProcedure<bji_2> tObjectProcedure) {
        if (this.ipr == null) {
            return;
        }
        this.ipr.h(tObjectProcedure);
    }

    public bjh_2[] drP() {
        return this.ips;
    }
}

