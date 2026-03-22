/*
 * Decompiled with CFR 0.152.
 */
public class foB
implements foA {
    private final int sLS;
    private final int sLT;
    private final String sLU;
    private final int sLV;

    public static foB G(int n, int n2, int n3, int n4) {
        return new foB(n, n2, n3, n4);
    }

    private foB(int n, int n2, int n3, int n4) {
        this.sLS = n;
        this.sLT = n2;
        this.sLU = String.valueOf(n3);
        this.sLV = n4;
    }

    @Override
    public int d() {
        return this.sLS;
    }

    @Override
    public int AK() {
        return this.sLT;
    }

    @Override
    public String aXE() {
        return this.sLU;
    }

    @Override
    public int ctm() {
        return this.sLV;
    }

    public String toString() {
        return "PetSkinDefinitionImpl{m_id=" + this.sLS + ", m_itemRefId=" + this.sLT + ", m_gfxId='" + this.sLU + "', m_petBaseItemId=" + this.sLV + "}";
    }
}

