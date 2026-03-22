/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avu
 */
public abstract class avu_1
extends avx_1 {
    @Override
    public boolean bMV() {
        if (!this.dhO.alcIsExtensionPresent(this.dhP, "ALC_SOFT_system_events")) {
            return false;
        }
        return this.dhS.alcEventIsSupportedSOFT(this.bMY(), this.bMZ()) == 6617;
    }

    public abstract int bMY();

    public abstract int bMZ();
}

