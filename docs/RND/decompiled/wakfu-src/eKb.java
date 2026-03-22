/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eKb {
    public static final eKb qBe = new eKb();
    private short mmX = (short)-1;
    private final List<eKc> qBf = new ArrayList<eKc>();

    private eKb() {
    }

    public void dJ(short s) {
        this.mmX = s;
        this.fxG();
    }

    public boolean dK(short s) {
        return this.mmX == s;
    }

    public short eFY() {
        return this.mmX;
    }

    public boolean fxF() {
        return this.mmX > 0;
    }

    public void a(eKc eKc2) {
        if (!this.qBf.contains(eKc2)) {
            this.qBf.add(eKc2);
        }
    }

    public void b(eKc eKc2) {
        this.qBf.remove(eKc2);
    }

    private void fxG() {
        if (this.qBf.isEmpty()) {
            return;
        }
        ArrayList<eKc> arrayList = new ArrayList<eKc>(this.qBf);
        for (eKc eKc2 : arrayList) {
            eKc2.dtM();
        }
    }

    public String toString() {
        return "FreeCompanionManager{m_freeCompanionBreedId=" + this.mmX + "}";
    }
}

