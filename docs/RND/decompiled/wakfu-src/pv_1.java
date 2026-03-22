/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pv
 */
class pv_1
extends fi_1 {
    final /* synthetic */ pu_1 SP;

    pv_1(pu_1 pu_12) {
        this.SP = pu_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.SP.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedDimensionalBagForSave");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedDimensionalBagForSave", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.SP.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDimensionalBagForSave");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDimensionalBagForSave", exception);
        }
    }

    @Override
    public int zt() {
        return this.SP.DN();
    }
}

