/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eWV
 */
public class ewv_1 {
    private final fiH<ewp_1> rCK = new fiH();
    private final int rCL;
    private final short rCM;
    private final short rCN;

    public ewv_1(int n, short s, short s2) {
        this.rCL = n;
        this.rCM = s;
        this.rCN = s2;
    }

    public void c(ewp_1 ewp_12) {
        this.rCK.a(ewp_12);
    }

    public int coQ() {
        return this.rCL;
    }

    public short cnD() {
        return this.rCM;
    }

    public short cnE() {
        return this.rCN;
    }

    public Optional<ewp_1> t(Object object, Object object2, Object object3, Object object4) {
        return this.rCK.w(object, object2, object3, object4);
    }

    public String toString() {
        return "FightChallengeMonsterDefinition{m_dropTable=" + String.valueOf(this.rCK) + ", m_monsterId=" + this.rCL + ", m_randomRolls=" + this.rCM + ", m_forcedRolls=" + this.rCN + "}";
    }
}

