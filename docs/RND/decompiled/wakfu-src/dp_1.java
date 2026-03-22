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
 * Renamed from dp
 */
public final class dp_1
extends GeneratedMessageV3.Builder<dp_1>
implements ds_2 {
    private int an;
    private MapField<Integer, dm_1> kp;
    private MapField<Integer, Integer> kr;
    private boolean kt;
    private boolean kv;

    public static final Descriptors.Descriptor qv() {
        return df_2.jJ;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.qe();
            }
            case 2: {
                return this.qi();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.qA();
            }
            case 2: {
                return this.qD();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jK.ensureFieldAccessorsInitialized(dn_2.class, dp_1.class);
    }

    dp_1() {
        this.D();
    }

    dp_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dn_2.cQ()) {
            // empty if block
        }
    }

    public dp_1 qw() {
        super.clear();
        this.qA().clear();
        this.qD().clear();
        this.kt = false;
        this.an &= 0xFFFFFFFB;
        this.kv = false;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jJ;
    }

    public dn_2 qu() {
        return dn_2.qt();
    }

    public dn_2 qx() {
        dn_2 dn_22 = this.qy();
        if (!dn_22.isInitialized()) {
            throw dp_1.newUninitializedMessageException((Message)dn_22);
        }
        return dn_22;
    }

    public dn_2 qy() {
        dn_2 dn_22 = new dn_2(this);
        int n = this.an;
        int n2 = 0;
        dn_22.kp = this.qe();
        dn_22.kp.makeImmutable();
        dn_22.kr = this.qi();
        dn_22.kr.makeImmutable();
        if ((n & 4) != 0) {
            dn_22.kt = this.kt;
            n2 |= 1;
        }
        if ((n & 8) != 0) {
            dn_22.kv = this.kv;
            n2 |= 2;
        }
        dn_22.an = n2;
        this.onBuilt();
        return dn_22;
    }

    public dp_1 qz() {
        return (dp_1)super.clone();
    }

    public dp_1 aU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dp_1)super.setField(fieldDescriptor, object);
    }

    public dp_1 X(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dp_1)super.clearField(fieldDescriptor);
    }

    public dp_1 X(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dp_1)super.clearOneof(oneofDescriptor);
    }

    public dp_1 X(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dp_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dp_1 aV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dp_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dp_1 X(Message message) {
        if (message instanceof dn_2) {
            return this.c((dn_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dp_1 c(dn_2 dn_22) {
        if (dn_22 == dn_2.qt()) {
            return this;
        }
        this.qA().mergeFrom(dn_22.qe());
        this.qD().mergeFrom(dn_22.qi());
        if (dn_22.qm()) {
            this.a(dn_22.qn());
        }
        if (dn_22.qo()) {
            this.b(dn_22.qp());
        }
        this.aV(dn_2.b(dn_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.qm()) {
            return false;
        }
        for (dm_1 dm_12 : this.qh().values()) {
            if (dm_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public dp_1 bT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dn_2 dn_22 = null;
        try {
            dn_22 = (dn_2)dn_2.kx.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dn_22 = (dn_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dn_22 != null) {
                this.c(dn_22);
            }
        }
        return this;
    }

    private MapField<Integer, dm_1> qe() {
        if (this.kp == null) {
            return MapField.emptyMapField(dr_2.kz);
        }
        return this.kp;
    }

    private MapField<Integer, dm_1> qA() {
        this.onChanged();
        if (this.kp == null) {
            this.kp = MapField.newMapField(dr_2.kz);
        }
        if (!this.kp.isMutable()) {
            this.kp = this.kp.copy();
        }
        return this.kp;
    }

    @Override
    public int qf() {
        return this.qe().getMap().size();
    }

    @Override
    public boolean az(int n) {
        return this.qe().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dm_1> qg() {
        return this.qh();
    }

    @Override
    public Map<Integer, dm_1> qh() {
        return this.qe().getMap();
    }

    @Override
    public dm_1 a(int n, dm_1 dm_12) {
        Map map = this.qe().getMap();
        return map.containsKey(n) ? (dm_1)map.get(n) : dm_12;
    }

    @Override
    public dm_1 aA(int n) {
        Map map = this.qe().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dm_1)map.get(n);
    }

    public dp_1 qB() {
        this.qA().getMutableMap().clear();
        return this;
    }

    public dp_1 aD(int n) {
        this.qA().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dm_1> qC() {
        return this.qA().getMutableMap();
    }

    public dp_1 b(int n, dm_1 dm_12) {
        if (dm_12 == null) {
            throw new NullPointerException("map value");
        }
        this.qA().getMutableMap().put(n, dm_12);
        return this;
    }

    public dp_1 b(Map<Integer, dm_1> map) {
        this.qA().getMutableMap().putAll(map);
        return this;
    }

    private MapField<Integer, Integer> qi() {
        if (this.kr == null) {
            return MapField.emptyMapField(dq_2.ky);
        }
        return this.kr;
    }

    private MapField<Integer, Integer> qD() {
        this.onChanged();
        if (this.kr == null) {
            this.kr = MapField.newMapField(dq_2.ky);
        }
        if (!this.kr.isMutable()) {
            this.kr = this.kr.copy();
        }
        return this.kr;
    }

    @Override
    public int qj() {
        return this.qi().getMap().size();
    }

    @Override
    public boolean aB(int n) {
        return this.qi().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> qk() {
        return this.ql();
    }

    @Override
    public Map<Integer, Integer> ql() {
        return this.qi().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.qi().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int aC(int n) {
        Map map = this.qi().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public dp_1 qE() {
        this.qD().getMutableMap().clear();
        return this;
    }

    public dp_1 aE(int n) {
        this.qD().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, Integer> qF() {
        return this.qD().getMutableMap();
    }

    public dp_1 b(int n, int n2) {
        this.qD().getMutableMap().put(n, n2);
        return this;
    }

    public dp_1 c(Map<Integer, Integer> map) {
        this.qD().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean qm() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean qn() {
        return this.kt;
    }

    public dp_1 a(boolean bl) {
        this.an |= 4;
        this.kt = bl;
        this.onChanged();
        return this;
    }

    public dp_1 qG() {
        this.an &= 0xFFFFFFFB;
        this.kt = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean qo() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean qp() {
        return this.kv;
    }

    public dp_1 b(boolean bl) {
        this.an |= 8;
        this.kv = bl;
        this.onChanged();
        return this;
    }

    public dp_1 qH() {
        this.an &= 0xFFFFFFF7;
        this.kv = false;
        this.onChanged();
        return this;
    }

    public final dp_1 aU(UnknownFieldSet unknownFieldSet) {
        return (dp_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dp_1 aV(UnknownFieldSet unknownFieldSet) {
        return (dp_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.X(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.X(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.X(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.qw();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.qz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.X(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.qw();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.X(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.qz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.X(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.X(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.X(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.qz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.qy();
    }

    public /* synthetic */ Message build() {
        return this.qx();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.X(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.qw();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.qz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.qy();
    }

    public /* synthetic */ MessageLite build() {
        return this.qx();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.qw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.qu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.qu();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.qz();
    }

    public /* synthetic */ Object clone() {
        return this.qz();
    }
}

