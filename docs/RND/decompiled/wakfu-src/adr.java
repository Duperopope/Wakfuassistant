/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class adr
implements ot_1 {
    public static byte cjt = (byte)-1;
    public int o;
    public int bap;
    public int baq;
    public short ban;
    public byte asf;
    public byte cju;
    public int cjv;
    public short cjw;
    public short cjx;
    public byte cjy;
    public int cjz;
    public short cjA;
    public ArrayList<ads> cjB;

    public adr() {
    }

    public adr(int n, int n2, int n3, short s, byte by, byte by2, int n4, short s2, short s3, byte by3, int n5, short s4) {
        this.o = n;
        this.bap = n2;
        this.baq = n3;
        this.ban = s;
        this.asf = by;
        this.cju = by2;
        this.cjv = n4;
        this.cjw = s2;
        this.cjx = s3;
        this.cjy = by3;
        this.cjz = n5;
        this.cjA = s4;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        this.o = apl_12.aIA();
        this.bap = apl_12.aIA();
        this.baq = apl_12.aIA();
        this.ban = apl_12.aIz();
        this.asf = apl_12.aIy();
        this.cju = apl_12.aIy();
        this.cjv = apl_12.aIA();
        this.cjw = apl_12.aIz();
        this.cjx = apl_12.aIz();
        this.cjy = apl_12.aIy();
        this.cjz = apl_12.aIA();
        this.cjA = apl_12.aIz();
        int n = apl_12.aIy();
        if (n > 0) {
            this.cjB = new ArrayList(2);
        }
        for (int i = 0; i < n; ++i) {
            ads ads2 = new ads();
            ads2.a(apl_12);
            this.cjB.add(ads2);
        }
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        fs_02.mz(this.o);
        fs_02.mz(this.bap);
        fs_02.mz(this.baq);
        fs_02.k(this.ban);
        fs_02.g(this.asf);
        fs_02.g(this.cju);
        fs_02.mz(this.cjv);
        fs_02.k(this.cjw);
        fs_02.k(this.cjx);
        fs_02.g(this.cjy);
        fs_02.mz(this.cjz);
        fs_02.k(this.cjA);
        int n = (byte)(this.cjB == null ? 0 : (byte)this.cjB.size());
        fs_02.g((byte)n);
        for (int i = 0; i < n; ++i) {
            this.cjB.get(i).b(fs_02);
        }
    }

    public void a(ads ads2) {
        if (this.cjB == null) {
            this.cjB = new ArrayList();
        }
        this.cjB.add(ads2);
    }

    public boolean buA() {
        return this.cjA > 0;
    }

    public String toString() {
        return "LandMarkDef{m_x=" + this.bap + ", m_y=" + this.baq + ", m_z=" + this.ban + ", m_type=" + this.asf + ", m_subType=" + this.cju + ", m_achievementGoalId=" + this.cjv + ", m_version=" + this.cjw + "." + this.cjx + ", m_linkedWorldId=" + this.cjA + "}";
    }
}

