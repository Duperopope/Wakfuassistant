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

/*
 * Renamed from df
 */
public final class df_2 {
    static final Descriptors.Descriptor jt;
    static final GeneratedMessageV3.FieldAccessorTable ju;
    static final Descriptors.Descriptor jv;
    private static final GeneratedMessageV3.FieldAccessorTable jw;
    static final Descriptors.Descriptor jx;
    static final GeneratedMessageV3.FieldAccessorTable jy;
    static final Descriptors.Descriptor jz;
    static final GeneratedMessageV3.FieldAccessorTable jA;
    static final Descriptors.Descriptor jB;
    static final GeneratedMessageV3.FieldAccessorTable jC;
    static final Descriptors.Descriptor jD;
    static final GeneratedMessageV3.FieldAccessorTable jE;
    static final Descriptors.Descriptor jF;
    private static final GeneratedMessageV3.FieldAccessorTable jG;
    static final Descriptors.Descriptor jH;
    static final GeneratedMessageV3.FieldAccessorTable jI;
    static final Descriptors.Descriptor jJ;
    static final GeneratedMessageV3.FieldAccessorTable jK;
    static final Descriptors.Descriptor jL;
    private static final GeneratedMessageV3.FieldAccessorTable jM;
    static final Descriptors.Descriptor jN;
    private static final GeneratedMessageV3.FieldAccessorTable jO;
    static final Descriptors.Descriptor jP;
    static final GeneratedMessageV3.FieldAccessorTable jQ;
    private static Descriptors.FileDescriptor M;

    private df_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        df_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n accountData/craftInventory.proto\"\u00cc\u0001\n\u0013ProtoCraftInventory\u00120\n\u0006crafts\u0018\u0001 \u0003(\u000b2 .ProtoCraftInventory.CraftsEntry\u0012(\n\fcraftService\u0018\u0002 \u0001(\u000b2\u0012.ProtoCraftService\u0012\u001d\n\u0004fees\u0018\u0003 \u0001(\u000b2\u000f.ProtoCraftFees\u001a:\n\u000bCraftsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\u001a\n\u0005value\u0018\u0002 \u0001(\u000b2\u000b.ProtoCraft:\u00028\u0001\"d\n\nProtoCraft\u0012\n\n\u0002xp\u0018\u0001 \u0002(\u0003\u0012$\n\bcounters\u0018\u0002 \u0002(\u000b2\u0012.ProtoCraftCounter\u0012$\n\u000elearnedRecipes\u0018\u0003 \u0003(\u000b2\f.ProtoRecipe\"y\n\u0011ProtoCraftCounter\u0012\u0013\n\u000bseedCounter\u0018\u0001 \u0001(\u0005\u0012\u001a\n\u0012endResourceCounter\u0018\u0002 \u0001(\u0005\u0012\u001c\n\u0014grossResourceCounter\u0018\u0003 \u0001(\u0005\u0012\u0015\n\rrecipeCounter\u0018\u0004 \u0001(\u0005\"\u001f\n\u000bProtoRecipe\u0012\u0010\n\brecipeId\u0018\u0001 \u0002(\u0005\"\u00f8\u0001\n\u0011ProtoCraftService\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012@\n\u000fcraftDirectives\u0018\u0002 \u0003(\u000b2'.ProtoCraftService.CraftDirectivesEntry\u001aZ\n\u0014CraftDirectivesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00121\n\u0005value\u0018\u0002 \u0001(\u000b2\".ProtoCraftService.CraftDirectives:\u00028\u0001\u001a4\n\u000fCraftDirectives\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012\u0010\n\bminLevel\u0018\u0002 \u0001(\u0005\"\u00b0\u0002\n\u000eProtoCraftFees\u0012/\n\bstepFees\u0018\u0001 \u0003(\u000b2\u001d.ProtoCraftFees.StepFeesEntry\u00129\n\rexceptionFees\u0018\u0002 \u0003(\u000b2\".ProtoCraftFees.ExceptionFeesEntry\u0012\u0016\n\u000eisFreeForGuild\u0018\u0003 \u0002(\b\u0012\u001f\n\u0010stepsFallthrough\u0018\u0004 \u0001(\b:\u0005false\u001aC\n\rStepFeesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012!\n\u0005value\u0018\u0002 \u0001(\u000b2\u0012.ProtoStepCraftFee:\u00028\u0001\u001a4\n\u0012ExceptionFeesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0005:\u00028\u0001\"I\n\u0011ProtoStepCraftFee\u0012\u0019\n\u0011equipmentCraftFee\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011componentCraftFee\u0018\u0002 \u0002(\u0005B?\n%com.ankama.wakfu.protocol.accountDataB\u0016ProtobufCraftInventory"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0]);
        jt = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(0);
        ju = new GeneratedMessageV3.FieldAccessorTable(jt, new String[]{"Crafts", "CraftService", "Fees"});
        jv = (Descriptors.Descriptor)jt.getNestedTypes().get(0);
        jw = new GeneratedMessageV3.FieldAccessorTable(jv, new String[]{"Key", "Value"});
        jx = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(1);
        jy = new GeneratedMessageV3.FieldAccessorTable(jx, new String[]{"Xp", "Counters", "LearnedRecipes"});
        jz = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(2);
        jA = new GeneratedMessageV3.FieldAccessorTable(jz, new String[]{"SeedCounter", "EndResourceCounter", "GrossResourceCounter", "RecipeCounter"});
        jB = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(3);
        jC = new GeneratedMessageV3.FieldAccessorTable(jB, new String[]{"RecipeId"});
        jD = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(4);
        jE = new GeneratedMessageV3.FieldAccessorTable(jD, new String[]{"Enabled", "CraftDirectives"});
        jF = (Descriptors.Descriptor)jD.getNestedTypes().get(0);
        jG = new GeneratedMessageV3.FieldAccessorTable(jF, new String[]{"Key", "Value"});
        jH = (Descriptors.Descriptor)jD.getNestedTypes().get(1);
        jI = new GeneratedMessageV3.FieldAccessorTable(jH, new String[]{"Enabled", "MinLevel"});
        jJ = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(5);
        jK = new GeneratedMessageV3.FieldAccessorTable(jJ, new String[]{"StepFees", "ExceptionFees", "IsFreeForGuild", "StepsFallthrough"});
        jL = (Descriptors.Descriptor)jJ.getNestedTypes().get(0);
        jM = new GeneratedMessageV3.FieldAccessorTable(jL, new String[]{"Key", "Value"});
        jN = (Descriptors.Descriptor)jJ.getNestedTypes().get(1);
        jO = new GeneratedMessageV3.FieldAccessorTable(jN, new String[]{"Key", "Value"});
        jP = (Descriptors.Descriptor)df_2.j().getMessageTypes().get(6);
        jQ = new GeneratedMessageV3.FieldAccessorTable(jP, new String[]{"EquipmentCraftFee", "ComponentCraftFee"});
    }
}

