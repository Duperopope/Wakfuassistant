/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bvI
 */
public class bvi_0 {
    private final bgt_0 juY;
    private eyp_1 juZ;
    private final ArrayList<bvj_0> jva = new ArrayList();

    public bvi_0(bgt_0 bgt_02) {
        this.juY = bgt_02;
    }

    public final eyp_1 dKL() {
        return this.juZ;
    }

    public long dnR() {
        if (this.juZ == null) {
            return 0L;
        }
        return this.juZ.Sn();
    }

    public boolean dKM() {
        if (this.juZ == null) {
            return false;
        }
        return this.juZ.fmo() == this.juY.Sn();
    }

    public boolean dfG() {
        return this.juZ != null;
    }

    public void mz(String string) {
        if (aPd.a(string, ejn_0.qzi)) {
            return;
        }
        aPd.f("group.party.inviting", string);
        oo_1 oo_12 = new oo_1();
        oo_12.F(Vf.bxK.bkm());
        try {
            long l = Long.parseLong(string);
            oo_12.cY(l);
        }
        catch (NumberFormatException numberFormatException) {
            oo_12.cX(string);
        }
        aue_0.cVJ().etu().d(oo_12);
    }

    public void kO(long l) {
        if (this.juZ == null) {
            return;
        }
        or_0 or_02 = new or_0();
        or_02.da(this.juZ.Sn());
        or_02.db(l);
        aue_0.cVJ().etu().d(or_02);
    }

    public void kP(long l) {
        if (this.juZ == null) {
            return;
        }
        os_0 os_02 = new os_0();
        os_02.da(this.juZ.Sn());
        os_02.db(l);
        aue_0.cVJ().etu().d(os_02);
    }

    public void c(eyp_1 eyp_12) {
        if (eyp_12 == this.juZ) {
            return;
        }
        if (eyp_12 != null) {
            this.d(eyp_12);
        } else {
            this.e(this.juZ);
        }
        this.juZ = eyp_12;
        aue_0.cVJ().cVK().djo();
    }

    public void a(bvj_0 bvj_02) {
        if (this.jva.contains(bvj_02)) {
            return;
        }
        this.jva.add(bvj_02);
    }

    public void b(bvj_0 bvj_02) {
        if (!this.jva.contains(bvj_02)) {
            return;
        }
        this.jva.remove(bvj_02);
    }

    public void d(eyp_1 eyp_12) {
        for (int i = this.jva.size() - 1; i >= 0; --i) {
            this.jva.get(i).a(eyp_12);
        }
    }

    public void e(eyp_1 eyp_12) {
        for (int i = this.jva.size() - 1; i >= 0; --i) {
            this.jva.get(i).b(eyp_12);
        }
    }
}

