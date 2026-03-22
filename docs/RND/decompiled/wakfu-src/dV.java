/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FileDescriptor
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class dV {
    static final Descriptors.Descriptor lX;
    static final GeneratedMessageV3.FieldAccessorTable lY;
    static final Descriptors.Descriptor lZ;
    private static final GeneratedMessageV3.FieldAccessorTable ma;
    static final Descriptors.Descriptor mb;
    static final GeneratedMessageV3.FieldAccessorTable mc;
    static final Descriptors.Descriptor md;
    static final GeneratedMessageV3.FieldAccessorTable me;
    private static Descriptors.FileDescriptor M;

    private dV() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        dV.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u000eaptitude.proto\"n\n\bSheetSet\u0012%\n\u0006sheets\u0018\u0002 \u0003(\u000b2\u0015.SheetSet.SheetsEntry\u001a5\n\u000bSheetsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\u0015\n\u0005value\u0018\u0002 \u0001(\u000b2\u0006.Sheet:\u00028\u0001J\u0004\b\u0001\u0010\u0002\"G\n\u0005Sheet\u0012\r\n\u0005level\u0018\u0003 \u0001(\u0005\u0012\u001d\n\u0005bonus\u0018\u0004 \u0003(\u000b2\u000e.LevelsByBonusJ\u0004\b\u0001\u0010\u0002J\u0004\b\u0002\u0010\u0003J\u0004\b\u0005\u0010\u0006\"/\n\rLevelsByBonus\u0012\u000f\n\u0007bonusId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005B6\n\"com.ankama.wakfu.protocol.aptitudeB\u0010ProtobufAptitude"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        lX = (Descriptors.Descriptor)dV.j().getMessageTypes().get(0);
        lY = new GeneratedMessageV3.FieldAccessorTable(lX, new String[]{"Sheets"});
        lZ = (Descriptors.Descriptor)lX.getNestedTypes().get(0);
        ma = new GeneratedMessageV3.FieldAccessorTable(lZ, new String[]{"Key", "Value"});
        mb = (Descriptors.Descriptor)dV.j().getMessageTypes().get(1);
        mc = new GeneratedMessageV3.FieldAccessorTable(mb, new String[]{"Level", "Bonus"});
        md = (Descriptors.Descriptor)dV.j().getMessageTypes().get(2);
        me = new GeneratedMessageV3.FieldAccessorTable(md, new String[]{"BonusId", "Level"});
    }
}

