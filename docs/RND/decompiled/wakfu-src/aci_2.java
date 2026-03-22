/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCI
 */
public class aci_2
implements ace_2 {
    private final acp_1 dBP;
    protected final long dBQ;
    protected long dBB;

    public aci_2(acp_1 acp_12, long l, long l2) {
        this.dBP = acp_12;
        this.dBQ = l;
        this.dBB = l2;
    }

    @Override
    public acp_1 fZ(long l) {
        return this.dBP;
    }

    @Override
    public acp_1 a(long l, abi_1 abi_12, anp_2 anp_22) {
        return this.dBP;
    }

    @Override
    public void hs(long l) {
        this.dBB += l;
    }

    @Override
    public acp_1 bzK() {
        return this.dBP;
    }

    @Override
    public acp_1 bzM() {
        return this.dBP;
    }

    @Override
    public long bXF() {
        return this.dBB + this.dBQ;
    }

    @Override
    public long bXG() {
        return this.dBB;
    }

    @Override
    public boolean hr(long l) {
        return true;
    }
}

