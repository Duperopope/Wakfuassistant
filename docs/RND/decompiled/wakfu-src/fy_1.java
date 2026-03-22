/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from fy
 */
public final class fy_1
extends GeneratedMessageV3.Builder<fy_1>
implements fa_2 {
    private int an;
    private MapField<Integer, fs_1> qv;

    public static final Descriptors.Descriptor AA() {
        return fl_1.pe;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Ar();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.AF();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pf.ensureFieldAccessorsInitialized(fw_1.class, fy_1.class);
    }

    fy_1() {
        this.D();
    }

    fy_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fw_1.aJ()) {
            // empty if block
        }
    }

    public fy_1 AB() {
        super.clear();
        this.AF().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.pe;
    }

    public fw_1 Az() {
        return fw_1.Ay();
    }

    public fw_1 AC() {
        fw_1 fw_12 = this.AD();
        if (!fw_12.isInitialized()) {
            throw fy_1.newUninitializedMessageException((Message)fw_12);
        }
        return fw_12;
    }

    public fw_1 AD() {
        fw_1 fw_12 = new fw_1(this);
        int n = this.an;
        fw_12.qv = this.Ar();
        fw_12.qv.makeImmutable();
        this.onBuilt();
        return fw_12;
    }

    public fy_1 AE() {
        return (fy_1)super.clone();
    }

    public fy_1 bO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fy_1)super.setField(fieldDescriptor, object);
    }

    public fy_1 au(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fy_1)super.clearField(fieldDescriptor);
    }

    public fy_1 au(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fy_1)super.clearOneof(oneofDescriptor);
    }

    public fy_1 au(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fy_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fy_1 bP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fy_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public fy_1 au(Message message) {
        if (message instanceof fw_1) {
            return this.c((fw_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fy_1 c(fw_1 fw_12) {
        if (fw_12 == fw_1.Ay()) {
            return this;
        }
        this.AF().mergeFrom(fw_12.Ar());
        this.bP(fw_1.b(fw_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (fs_1 fs_12 : this.Au().values()) {
            if (fs_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fy_1 dk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fw_1 fw_12 = null;
        try {
            fw_12 = (fw_1)fw_1.qx.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fw_12 = (fw_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fw_12 != null) {
                this.c(fw_12);
            }
        }
        return this;
    }

    private MapField<Integer, fs_1> Ar() {
        if (this.qv == null) {
            return MapField.emptyMapField(fz_1.qy);
        }
        return this.qv;
    }

    private MapField<Integer, fs_1> AF() {
        this.onChanged();
        if (this.qv == null) {
            this.qv = MapField.newMapField(fz_1.qy);
        }
        if (!this.qv.isMutable()) {
            this.qv = this.qv.copy();
        }
        return this.qv;
    }

    @Override
    public int As() {
        return this.Ar().getMap().size();
    }

    @Override
    public boolean cs(int n) {
        return this.Ar().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fs_1> At() {
        return this.Au();
    }

    @Override
    public Map<Integer, fs_1> Au() {
        return this.Ar().getMap();
    }

    @Override
    public fs_1 a(int n, fs_1 fs_12) {
        Map map = this.Ar().getMap();
        return map.containsKey(n) ? (fs_1)map.get(n) : fs_12;
    }

    @Override
    public fs_1 ct(int n) {
        Map map = this.Ar().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fs_1)map.get(n);
    }

    public fy_1 AG() {
        this.AF().getMutableMap().clear();
        return this;
    }

    public fy_1 cu(int n) {
        this.AF().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, fs_1> AH() {
        return this.AF().getMutableMap();
    }

    public fy_1 b(int n, fs_1 fs_12) {
        if (fs_12 == null) {
            throw new NullPointerException("map value");
        }
        this.AF().getMutableMap().put(n, fs_12);
        return this;
    }

    public fy_1 g(Map<Integer, fs_1> map) {
        this.AF().getMutableMap().putAll(map);
        return this;
    }

    public final fy_1 bO(UnknownFieldSet unknownFieldSet) {
        return (fy_1)super.setUnknownFields(unknownFieldSet);
    }

    public final fy_1 bP(UnknownFieldSet unknownFieldSet) {
        return (fy_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.au(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.au(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.au(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.AB();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.AE();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.au(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.AB();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.au(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.AE();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.au(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.au(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.au(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.AE();
    }

    public /* synthetic */ Message buildPartial() {
        return this.AD();
    }

    public /* synthetic */ Message build() {
        return this.AC();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.au(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.AB();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.AE();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.AD();
    }

    public /* synthetic */ MessageLite build() {
        return this.AC();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.AB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Az();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Az();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.AE();
    }

    public /* synthetic */ Object clone() {
        return this.AE();
    }
}

