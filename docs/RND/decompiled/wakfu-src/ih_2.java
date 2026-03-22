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
 * Renamed from ih
 */
public final class ih_2 {
    static final Descriptors.Descriptor wv;
    static final GeneratedMessageV3.FieldAccessorTable ww;
    static final Descriptors.Descriptor wx;
    static final GeneratedMessageV3.FieldAccessorTable wy;
    static final Descriptors.Descriptor wz;
    static final GeneratedMessageV3.FieldAccessorTable wA;
    static final Descriptors.Descriptor wB;
    static final GeneratedMessageV3.FieldAccessorTable wC;
    static final Descriptors.Descriptor wD;
    static final GeneratedMessageV3.FieldAccessorTable wE;
    static final Descriptors.Descriptor wF;
    static final GeneratedMessageV3.FieldAccessorTable wG;
    static final Descriptors.Descriptor wH;
    static final GeneratedMessageV3.FieldAccessorTable wI;
    static final Descriptors.Descriptor wJ;
    static final GeneratedMessageV3.FieldAccessorTable wK;
    static final Descriptors.Descriptor wL;
    static final GeneratedMessageV3.FieldAccessorTable wM;
    private static Descriptors.FileDescriptor M;

    private ih_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ih_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013fight/effects.proto\u001a\u0012fight/spells.proto\"\u0091\u0003\n\u0012ProtoRunningEffect\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007baseUid\u0018\u0002 \u0002(\u0003\u0012\u0017\n\u000fgenericEffectId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005value\u0018\u0004 \u0002(\u0005\u0012\u0019\n\ntargetCell\u0018\u0005 \u0001(\u000b2\u0005.Cell\u0012\u0010\n\bcasterId\u0018\u0006 \u0001(\u0003\u0012\u0010\n\btargetId\u0018\u0007 \u0001(\u0003\u0012)\n\u000fadditionalDatas\u0018\b \u0001(\u000b2\u0010.AdditionalDatas\u0012\u001b\n\u0013effectContainerType\u0018\t \u0001(\u0005\u0012\u0019\n\u0011effectContainerId\u0018\n \u0001(\u0003\u0012+\n\u0010gameSpecificData\u0018\u000b \u0001(\u000b2\u0011.GameSpecificData\u0012/\n\u0012specificTargetData\u0018\f \u0001(\u000b2\u0013.SpecificTargetData\u00120\n\u0012executionParameter\u0018\r \u0001(\u000b2\u0014.ExecutionParameters\"'\n\u0004Cell\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0003 \u0002(\u0005\"\u0098\u0001\n\u0010GameSpecificData\u0012!\n\u0019notifyUnapplicationForced\u0018\u0001 \u0002(\b\u0012\u0017\n\u000fexecutionStatus\u0018\u0002 \u0002(\u0005\u0012\u001d\n\tfightTime\u0018\u0003 \u0002(\u000b2\n.FightTime\u0012\u0017\n\u000fremainingTimeMs\u0018\u0004 \u0002(\u0003\u0012\u0010\n\bexecuted\u0018\u0005 \u0002(\b\"F\n\tFightTime\u0012\u0011\n\tfighterId\u0018\u0001 \u0002(\u0003\u0012\u0011\n\ttableTurn\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000batEndOfTurn\u0018\u0003 \u0002(\b\"\u007f\n\u0012SpecificTargetData\u0012\u0014\n\fbaseUniqueId\u0018\u0001 \u0001(\u0003\u0012\u0019\n\u0011currentHourAreaId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nsystemHour\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bnewTargetId\u0018\u0004 \u0001(\u0003\u0012\u000f\n\u0007breedId\u0018\u0005 \u0001(\u0005\"\u00b3\u0005\n\u000fAdditionalDatas\u0012\u000f\n\u0007rawData\u0018\u0001 \u0001(\f\u0012\r\n\u0005value\u0018\n \u0001(\u0005\u0012\u000f\n\u0007stateId\u0018\u000b \u0001(\u0005\u0012\u0010\n\bcharacId\u0018\f \u0001(\u0005\u0012\u0010\n\buniqueId\u0018\r \u0001(\u0003\u0012\r\n\u0005level\u0018\u000e \u0001(\u0005\u0012\u001a\n\ntargetCell\u0018\u000f \u0001(\u000b2\u0006.Point\u0012\u0017\n\u000ftargetDirection\u0018\u0010 \u0001(\u0005\u0012\u0017\n\u000fwhatYouWantBool\u0018\u0011 \u0001(\b\u0012\u001c\n\u0014whatYouWantOtherBool\u0018\u0012 \u0001(\b\u0012\u0016\n\u000ewhatYouWantInt\u0018\u0013 \u0001(\u0005\u0012\u001b\n\u0013whatYouWantOtherInt\u0018\u0014 \u0001(\u0005\u0012\u0017\n\u000fwhatYouWantLong\u0018\u0015 \u0001(\u0003\u0012\u001c\n\u0014whatYouWantOtherLong\u0018\u0016 \u0001(\u0003\u0012\u001f\n\u000fwhatYouWantCell\u0018\u0017 \u0001(\u000b2\u0006.Point\u0012\u0018\n\u0010whatYouWantFloat\u0018\u0018 \u0001(\u0002\u0012\u0013\n\u000boriginValue\u0018\u0019 \u0001(\u0005\u0012\u0015\n\rapplyOnCaster\u0018\u001e \u0001(\b\u0012\u0017\n\u000faddCurrentValue\u0018\u001f \u0001(\b\u0012\u001c\n\u0014subtractCurrentValue\u0018  \u0001(\b\u0012\u0010\n\bexecuted\u0018! \u0001(\b\u0012\"\n\u001amodifyValueOnUnapplication\u0018\" \u0001(\b\u0012 \n\u0018modifyValueOnApplication\u0018# \u0001(\b\u0012\u001b\n\u0013isBuffInsteadOfGain\u0018& \u0001(\b\u0012\u0011\n\tstartDate\u00182 \u0001(\u0003\u0012\u0013\n\u0004path\u0018F \u0001(\u000b2\u0005.Path\u0012)\n\u000fspellsInventory\u0018G \u0001(\u000b2\u0010.SpellsInventory\"(\n\u0005Point\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0003 \u0002(\u0005\"\u001e\n\u0004Path\u0012\u0016\n\u0006points\u0018\u0001 \u0003(\u000b2\u0006.Point\"\u0085\u0003\n\u0013ExecutionParameters\u0012,\n\u001ddisableProbabilityComputation\u0018\u0001 \u0002(\b:\u0005false\u0012$\n\u0015disableCriterionCheck\u0018\u0002 \u0002(\b:\u0005false\u0012\u0017\n\u000bforcedLevel\u0018\u0004 \u0002(\u0005:\u0002-1\u0012$\n\u0016resetLimitedApplyCount\u0018\u0005 \u0002(\b:\u0004true\u0012\u0016\n\u000bforcedValue\u0018\u0006 \u0002(\u0005:\u00010\u0012\u001a\n\u000bdoNotNotify\u0018\u0007 \u0002(\b:\u0005false\u0012\u0019\n\nisDisabled\u0018\b \u0002(\b:\u0005false\u0012K\n\u000fforcedValueType\u0018\t \u0002(\u000e2,.ExecutionParameters.ExecutionForceValueType:\u0004NONE\"9\n\u0017ExecutionForceValueType\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0007\n\u0003SET\u0010\u0001\u0012\u000b\n\u0007PERCENT\u0010\u0002J\u0004\b\u0003\u0010\u0004B:\n'com.ankama.wakfu.protocol.fight.effectsB\u000fProtobufEffects"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{zg_2.j()});
        wv = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(0);
        ww = new GeneratedMessageV3.FieldAccessorTable(wv, new String[]{"UniqueId", "BaseUid", "GenericEffectId", "Value", "TargetCell", "CasterId", "TargetId", "AdditionalDatas", "EffectContainerType", "EffectContainerId", "GameSpecificData", "SpecificTargetData", "ExecutionParameter"});
        wx = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(1);
        wy = new GeneratedMessageV3.FieldAccessorTable(wx, new String[]{"X", "Y", "Z"});
        wz = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(2);
        wA = new GeneratedMessageV3.FieldAccessorTable(wz, new String[]{"NotifyUnapplicationForced", "ExecutionStatus", "FightTime", "RemainingTimeMs", "Executed"});
        wB = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(3);
        wC = new GeneratedMessageV3.FieldAccessorTable(wB, new String[]{"FighterId", "TableTurn", "AtEndOfTurn"});
        wD = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(4);
        wE = new GeneratedMessageV3.FieldAccessorTable(wD, new String[]{"BaseUniqueId", "CurrentHourAreaId", "SystemHour", "NewTargetId", "BreedId"});
        wF = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(5);
        wG = new GeneratedMessageV3.FieldAccessorTable(wF, new String[]{"RawData", "Value", "StateId", "CharacId", "UniqueId", "Level", "TargetCell", "TargetDirection", "WhatYouWantBool", "WhatYouWantOtherBool", "WhatYouWantInt", "WhatYouWantOtherInt", "WhatYouWantLong", "WhatYouWantOtherLong", "WhatYouWantCell", "WhatYouWantFloat", "OriginValue", "ApplyOnCaster", "AddCurrentValue", "SubtractCurrentValue", "Executed", "ModifyValueOnUnapplication", "ModifyValueOnApplication", "IsBuffInsteadOfGain", "StartDate", "Path", "SpellsInventory"});
        wH = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(6);
        wI = new GeneratedMessageV3.FieldAccessorTable(wH, new String[]{"X", "Y", "Z"});
        wJ = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(7);
        wK = new GeneratedMessageV3.FieldAccessorTable(wJ, new String[]{"Points"});
        wL = (Descriptors.Descriptor)ih_2.j().getMessageTypes().get(8);
        wM = new GeneratedMessageV3.FieldAccessorTable(wL, new String[]{"DisableProbabilityComputation", "DisableCriterionCheck", "ForcedLevel", "ResetLimitedApplyCount", "ForcedValue", "DoNotNotify", "IsDisabled", "ForcedValueType"});
        zg_2.j();
    }
}

