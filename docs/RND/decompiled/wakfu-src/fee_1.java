/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 */
import com.jogamp.opengl.GL;

/*
 * Renamed from fEe
 */
class fee_1
implements fhw_1 {
    final /* synthetic */ fed_1 ujj;

    fee_1(fed_1 fed_12) {
        this.ujj = fed_12;
    }

    @Override
    public void a(art_1 art_12, fmt_1 fmt_12) {
        if (!this.ujj.isInitialized()) {
            return;
        }
        this.ujj.getVideoTextureProducer().n((GL)art_12.bIq());
    }
}

