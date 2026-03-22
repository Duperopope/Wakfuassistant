/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akl
 */
public class akl_2
extends afk_1 {
    private static final String cCo = "addTweenParticleSystem";
    private static final afe_1[] cCp = new afe_1[]{new afe_1("particleFileId", "Id du systeme", aff_2.dJy, false), new afe_1("startX", "Position de depart x", aff_2.dJy, false), new afe_1("startY", "Position de depart y", aff_2.dJy, false), new afe_1("startZ", "Position de depart z", aff_2.dJy, false), new afe_1("destX", "Position de destination x", aff_2.dJy, false), new afe_1("destY", "Position de destination y", aff_2.dJy, false), new afe_1("destZ", "Position de destination z", aff_2.dJy, false), new afe_1("angle", "Angle de la courbure que le syst?me suivra pour aller d'un point ? l'autre", aff_2.dJy, false), new afe_1("type", "Inutilis? (laisser ? 1)", aff_2.dJy, false), new afe_1("timeCoef", "Valeur permettant d'accelerer ou de ralentir le d?placement", aff_2.dJz, true), new afe_1("level", "Niveau du systeme", aff_2.dJy, true)};
    private static final afe_1[] cCq = new afe_1[]{new afe_1("systemId", "Id unique du systeme", aff_2.dJy, false), new afe_1("movementDuration", "Temps en ms que mettra le d?placement", aff_2.dJy, false)};

    public akl_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCo;
    }

    @Override
    public String getDescription() {
        return "Ajoute un syst?me de particules en le faisant se d?placer entre deux points du monde. Attention, plus l'angle est faible plus le chemin est court, et donc plus le syst?me aura tendance ? aller vite.";
    }

    @Override
    public afe_1[] bBg() {
        return cCp;
    }

    @Override
    public final afe_1[] bBh() {
        return cCq;
    }

    @Override
    public void ss(int n) {
        LuaObject luaObject = this.cai().caC().getLuaObject("fightId");
        int n2 = -1;
        if (luaObject.isNumber()) {
            n2 = (int)luaObject.getNumber();
            if (!agY.bzw().sm(n2)) {
                this.xC(0);
                this.xC(0);
                return;
            }
        }
        int n3 = this.xp(0);
        int n4 = this.xp(1);
        int n5 = this.xp(2);
        int n6 = this.xp(3);
        int n7 = this.xp(4);
        int n8 = this.xp(5);
        int n9 = this.xp(6);
        int n10 = this.xp(7);
        this.xp(8);
        float f2 = n >= 9 ? this.xr(9) : -1.0f;
        FreeParticleSystem freeParticleSystem = n >= 10 ? agY.bzw().bF(n3, this.xp(10)) : agY.bzw().sk(n3);
        freeParticleSystem.r(n4, n5, n6);
        ahi ahi2 = f2 < 0.0f ? new ahi(freeParticleSystem, n7, n8, n9, n10) : new ahi(freeParticleSystem, n7, n8, n9, n10, f2);
        int n11 = (int)ahi2.bzP();
        freeParticleSystem.pu(n2);
        agZ.bzy().b(freeParticleSystem);
        ahl.bzR().b(ahi2);
        this.xC(freeParticleSystem.bLJ());
        this.xC(n11);
    }
}

