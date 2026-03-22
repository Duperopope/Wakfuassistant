/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bQA {
    private final int kVN;
    private final ArrayList<bQC> kVO;

    public bQA(int n) {
        this.kVN = n;
        this.kVO = new ArrayList();
    }

    public void a(bQC bQC2) {
        this.kVO.add(bQC2);
    }

    public ArrayList<bQC> bsL() {
        return this.kVO;
    }

    public int coF() {
        return this.kVN;
    }
}

