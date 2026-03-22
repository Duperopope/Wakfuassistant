/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sc
 */
class sc_2
extends fi_1 {
    final /* synthetic */ sb_2 XT;

    sc_2(sb_2 sb_22) {
        this.XT = sb_22;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.XT.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedSex");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedSex", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.XT.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedSex");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedSex", exception);
        }
    }

    @Override
    public int zt() {
        return this.XT.DN();
    }
}

