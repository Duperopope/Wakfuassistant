/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aTX {
    public static final int gvS = 10;
    private short gvT;
    private int beb;
    private int bap;
    private int baq;
    private final ArrayList<bKV> gvU = new ArrayList();

    public boolean f(bKV bKV2) {
        if (this.beb == 0) {
            return true;
        }
        int n = bKV2.bcC();
        int n2 = bKV2.bcD();
        for (int i = this.gvU.size() - 1; i >= 0; --i) {
            bKV bKV3 = this.gvU.get(i);
            float f2 = aco_1.bn(n - bKV3.bcC(), n2 - bKV3.bcD());
            if (!(f2 <= 10.0f)) continue;
            return true;
        }
        return false;
    }

    public void g(bKV bKV2) {
        ++this.beb;
        this.gvU.add(bKV2);
        int n = bKV2.bcC();
        int n2 = bKV2.bcD();
        if (this.beb == 1) {
            this.bap = n;
            this.baq = n2;
            this.gvT = bKV2.eco().ghz();
            return;
        }
        int n3 = n - this.bap;
        int n4 = n - this.baq;
        this.bap += n3 / this.beb;
        this.baq += n4 / this.beb;
    }

    public int cUa() {
        return this.gvT;
    }

    public int aXY() {
        return this.beb;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public ArrayList<bKV> cUb() {
        return this.gvU;
    }
}

