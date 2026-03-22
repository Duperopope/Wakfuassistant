/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eTd
 */
public class etd_0
extends aoh_1 {
    private final rh_0 rmC;
    private final ArrayList<int[]> rmD = new ArrayList();
    private final ArrayList<int[]> rmE = new ArrayList();

    public etd_0(rh_0 rh_02) {
        this.rmC = rh_02;
        int n = this.rmC.getWidth();
        int n2 = this.rmC.bgm();
        int n3 = n2 + n;
        int n4 = this.rmC.bgn();
        int n5 = n4 + this.rmC.getHeight();
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                if (!rh_02.R(i, j)) continue;
                this.rmD.add(aod_2.bQ(i - n2, j - n4));
                this.rmE.add(new int[]{i, j});
            }
        }
    }

    @Override
    public void p(int[] nArray) {
        throw new UnsupportedOperationException("Un BattlegroundBorderAreaOfEffect ne peut \u00eatre initialis\u00e9 avec un tableau d'entiers venant d'une base de donn\u00e9es, par exemple. Il est cr\u00e9\u00e9 dynamiquement par un combat");
    }

    @Override
    public aox_1 bEt() {
        return null;
    }

    @Override
    public boolean a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, int n5, int n6, short s3) {
        return this.rmC.R(n5, n6);
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return null;
    }

    @Override
    public List<int[]> bEm() {
        return this.rmD;
    }

    public Iterable<int[]> fIT() {
        return Collections.unmodifiableList(this.rmE);
    }

    @Override
    public String bEn() {
        return null;
    }

    @Override
    public String bEo() {
        return null;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        return null;
    }

    @Override
    public aoy_2 bEq() {
        return aoy_2.cLA;
    }
}

