/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ps
 */
class ps_1
extends fi_1 {
    final /* synthetic */ pr_1 SK;

    ps_1(pr_1 pr_12) {
        this.SK = pr_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.SK.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedDimensionalBagForClient");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedDimensionalBagForClient", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.SK.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDimensionalBagForClient");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedDimensionalBagForClient", exception);
        }
    }

    @Override
    public int zt() {
        return this.SK.DN();
    }
}

