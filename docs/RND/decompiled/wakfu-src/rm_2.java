/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rm
 */
class rm_2
extends fi_1 {
    final /* synthetic */ rl_2 Wz;

    rm_2(rl_2 rl_22) {
        this.Wz = rl_22;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.Wz.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedPet");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedPet", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.Wz.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedPet");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedPet", exception);
        }
    }

    @Override
    public int zt() {
        return this.Wz.DN();
    }
}

