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
 * Renamed from dB
 */
public final class db_1
extends GeneratedMessageV3.Builder<db_1>
implements dh_2 {
    private int an;
    private boolean kO;
    private MapField<Integer, dc_1> kQ;

    public static final Descriptors.Descriptor rx() {
        return df_2.jD;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.ro();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.rD();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jE.ensureFieldAccessorsInitialized(dz_2.class, db_1.class);
    }

    db_1() {
        this.D();
    }

    db_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dz_2.B()) {
            // empty if block
        }
    }

    public db_1 ry() {
        super.clear();
        this.kO = false;
        this.an &= 0xFFFFFFFE;
        this.rD().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jD;
    }

    public dz_2 rw() {
        return dz_2.rv();
    }

    public dz_2 rz() {
        dz_2 dz_22 = this.rA();
        if (!dz_22.isInitialized()) {
            throw db_1.newUninitializedMessageException((Message)dz_22);
        }
        return dz_22;
    }

    public dz_2 rA() {
        dz_2 dz_22 = new dz_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dz_22.kO = this.kO;
            n2 |= 1;
        }
        dz_22.kQ = this.ro();
        dz_22.kQ.makeImmutable();
        dz_22.an = n2;
        this.onBuilt();
        return dz_22;
    }

    public db_1 rB() {
        return (db_1)super.clone();
    }

    public db_1 aY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (db_1)super.setField(fieldDescriptor, object);
    }

    public db_1 Z(Descriptors.FieldDescriptor fieldDescriptor) {
        return (db_1)super.clearField(fieldDescriptor);
    }

    public db_1 Z(Descriptors.OneofDescriptor oneofDescriptor) {
        return (db_1)super.clearOneof(oneofDescriptor);
    }

    public db_1 Z(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (db_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public db_1 aZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (db_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public db_1 Z(Message message) {
        if (message instanceof dz_2) {
            return this.e((dz_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public db_1 e(dz_2 dz_22) {
        if (dz_22 == dz_2.rv()) {
            return this;
        }
        if (dz_22.rn()) {
            this.c(dz_22.getEnabled());
        }
        this.rD().mergeFrom(dz_22.ro());
        this.aZ(dz_2.d(dz_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.rn()) {
            return false;
        }
        for (dc_1 dc_12 : this.rr().values()) {
            if (dc_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public db_1 bZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dz_2 dz_22 = null;
        try {
            dz_22 = (dz_2)dz_2.kS.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dz_22 = (dz_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dz_22 != null) {
                this.e(dz_22);
            }
        }
        return this;
    }

    @Override
    public boolean rn() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    public db_1 c(boolean bl) {
        this.an |= 1;
        this.kO = bl;
        this.onChanged();
        return this;
    }

    public db_1 rC() {
        this.an &= 0xFFFFFFFE;
        this.kO = false;
        this.onChanged();
        return this;
    }

    private MapField<Integer, dc_1> ro() {
        if (this.kQ == null) {
            return MapField.emptyMapField(df_1.kZ);
        }
        return this.kQ;
    }

    private MapField<Integer, dc_1> rD() {
        this.onChanged();
        if (this.kQ == null) {
            this.kQ = MapField.newMapField(df_1.kZ);
        }
        if (!this.kQ.isMutable()) {
            this.kQ = this.kQ.copy();
        }
        return this.kQ;
    }

    @Override
    public int rp() {
        return this.ro().getMap().size();
    }

    @Override
    public boolean aI(int n) {
        return this.ro().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dc_1> rq() {
        return this.rr();
    }

    @Override
    public Map<Integer, dc_1> rr() {
        return this.ro().getMap();
    }

    @Override
    public dc_1 a(int n, dc_1 dc_12) {
        Map map = this.ro().getMap();
        return map.containsKey(n) ? (dc_1)map.get(n) : dc_12;
    }

    @Override
    public dc_1 aJ(int n) {
        Map map = this.ro().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dc_1)map.get(n);
    }

    public db_1 rE() {
        this.rD().getMutableMap().clear();
        return this;
    }

    public db_1 aK(int n) {
        this.rD().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dc_1> rF() {
        return this.rD().getMutableMap();
    }

    public db_1 b(int n, dc_1 dc_12) {
        if (dc_12 == null) {
            throw new NullPointerException("map value");
        }
        this.rD().getMutableMap().put(n, dc_12);
        return this;
    }

    public db_1 e(Map<Integer, dc_1> map) {
        this.rD().getMutableMap().putAll(map);
        return this;
    }

    public final db_1 aY(UnknownFieldSet unknownFieldSet) {
        return (db_1)super.setUnknownFields(unknownFieldSet);
    }

    public final db_1 aZ(UnknownFieldSet unknownFieldSet) {
        return (db_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Z(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Z(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Z(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ry();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.rB();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.Z(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ry();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Z(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.rB();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Z(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Z(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Z(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.rB();
    }

    public /* synthetic */ Message buildPartial() {
        return this.rA();
    }

    public /* synthetic */ Message build() {
        return this.rz();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.Z(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ry();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.rB();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.rA();
    }

    public /* synthetic */ MessageLite build() {
        return this.rz();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ry();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.rw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.rw();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.rB();
    }

    public /* synthetic */ Object clone() {
        return this.rB();
    }
}

