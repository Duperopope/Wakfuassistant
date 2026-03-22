/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pA
 */
class pa_1
extends fi_1 {
    final /* synthetic */ pz_1 SX;

    pa_1(pz_1 pz_12) {
        this.SX = pz_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.SX.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedDownscaleInfo");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedDownscaleInfo", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.SX.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDownscaleInfo");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDownscaleInfo", exception);
        }
    }

    @Override
    public int zt() {
        return this.SX.DN();
    }
}

