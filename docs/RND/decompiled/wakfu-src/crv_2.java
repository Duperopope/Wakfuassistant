/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRV
 */
public class crv_2
implements WP {
    private int bVF;
    private int bVG;
    private int bVH;
    private WO nEa;
    private boolean nEb;

    crv_2() {
    }

    @Override
    public void qu(int n) {
        this.bVF = n;
    }

    @Override
    public void qv(int n) {
        this.bVG = n;
    }

    public boolean brO() {
        return this.nEb;
    }

    public void jX(boolean bl) {
        this.nEb = bl;
    }

    @Override
    public void qw(int n) {
        this.bVH = n;
    }

    @Override
    public int getScreenX() {
        return this.bVF;
    }

    @Override
    public int getScreenY() {
        return this.bVG;
    }

    @Override
    public int bng() {
        return this.bVH;
    }

    @Override
    public void a(WR wR) {
    }

    @Override
    public void b(WR wR) {
    }

    @Override
    public boolean bnh() {
        return false;
    }

    @Override
    public float getWorldX() {
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        return 0.0f;
    }

    @Override
    public int bcC() {
        return 0;
    }

    @Override
    public int bcD() {
        return 0;
    }

    @Override
    public short bcE() {
        return 0;
    }

    @Override
    public int bnd() {
        return this.nEa.bnd();
    }

    @Override
    public String bne() {
        return this.nEa.bne();
    }

    @Override
    public axb_2 bnf() {
        return this.nEa.bnf();
    }

    @Override
    public void a(boolean bl, WU wU) {
    }

    @Override
    public void a(WT wT) {
    }

    @Override
    public void b(WT wT) {
    }

    public void a(WO wO) {
        this.nEa = wO;
    }

    public WO eNt() {
        return this.nEa;
    }

    public String toString() {
        return "OverHeadContainer{m_screenX=" + this.bVF + ", m_screenY=" + this.bVG + ", m_screenHeight=" + this.bVH + ", m_overHead=" + String.valueOf(this.nEa) + ", m_isDisplayed=" + this.nEb + "}";
    }
}

