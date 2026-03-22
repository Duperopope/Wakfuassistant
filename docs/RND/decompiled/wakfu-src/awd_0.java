/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWd
 */
public class awd_0
extends aga_2 {
    private final bhx_0 huc;
    private final short hud;
    private final short hue;

    public awd_0(int n, int n2, int n3, int n4, long l, short s, short s2) {
        super(n, n2, n3);
        this.huc = (bhx_0)bgg_0.dlO().ju(l);
        this.hud = s;
        this.hue = s2;
        this.f(new bvr_2(this));
        this.xV(n4);
    }

    @Override
    public long cbk() {
        super.cbk();
        return -1L;
    }

    @Override
    protected void caV() {
        Short s;
        super.caV();
        if (this.huc != null && (s = Short.valueOf(this.huc.aWP())) != this.hud) {
            dJP.error((Object)("Oublie de script LUA d\u00e9finissant une \u00e9volution pour le breedId=" + s));
            this.huc.B(this.hud, this.hue);
        }
    }

    public long cXe() {
        return this.huc.Sn();
    }

    public short cXf() {
        return this.hud;
    }

    public short cXg() {
        return this.hue;
    }

    public bgy cXh() {
        return this.huc;
    }
}

