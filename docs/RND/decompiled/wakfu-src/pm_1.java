/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pM
 */
class pm_1
extends fi_1 {
    final /* synthetic */ pl_1 Ty;

    pm_1(pl_1 pl_12) {
        this.Ty = pl_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.Ty.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedFight");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedFight", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.Ty.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedFight");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedFight", exception);
        }
    }

    @Override
    public int zt() {
        return this.Ty.DN();
    }
}

