/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class XT {
    private final int bTi;
    private Yb[] bTj;
    private final ArrayList<yn_0> bTk = new ArrayList();

    public XT(int n) {
        this.bTi = n;
    }

    public final int bnZ() {
        return this.bTi;
    }

    public final void a(ByteBuffer byteBuffer, Yd yd) {
        int n;
        this.bTk.clear();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.bTj = new Yb[n2];
        for (n = 0; n < n2; ++n) {
            Yb yb;
            int n3 = byteBuffer.getShort() & 0xFFFF;
            this.bTj[n] = yb = yd.a(n3, byteBuffer);
            if (yb.bol() != Yc.bTH) continue;
            this.bTk.add((yn_0)yb);
        }
        this.bTk.trimToSize();
        for (n = 0; n < this.bTj.length; ++n) {
            Yb yb = this.bTj[n];
            int n4 = yb.bom();
            if (n4 == 0) continue;
            Yg[] ygArray = new Yg[n4];
            for (int i = 0; i < ygArray.length; ++i) {
                int n5 = byteBuffer.getShort() & 0xFFFF;
                ygArray[i] = (Yg)this.bTj[n5];
            }
            yb.a(ygArray);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        for (int i = 0; i < n; ++i) {
            int n6 = byteBuffer.getShort() & 0xFFFF;
            int n7 = byteBuffer.getShort() & 0xFFFF;
            yn_0 yn_02 = (yn_0)this.bTj[n6];
            yn_02.b((Yg)this.bTj[n7]);
        }
    }

    public final void qJ(int n) {
        int n2;
        for (n2 = 0; n2 < this.bTj.length; ++n2) {
            this.bTj[n2].qF(n);
        }
        for (n2 = 0; n2 < this.bTk.size(); ++n2) {
            this.bTk.get(n2).bot();
        }
    }

    ArrayList<yn_0> boa() {
        return this.bTk;
    }
}

