/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from dv
 */
public final class dv_2
extends GeneratedMessageV3.Builder<dv_2>
implements dx_2 {
    private int an;
    private MapField<Integer, dg_1> kC;
    private dz_2 kE;
    private SingleFieldBuilderV3<dz_2, db_1, dh_2> kJ;
    private dn_2 kG;
    private SingleFieldBuilderV3<dn_2, dp_1, ds_2> kK;

    public static final Descriptors.Descriptor qY() {
        return df_2.jt;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.qJ();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.rd();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.ju.ensureFieldAccessorsInitialized(dt_2.class, dv_2.class);
    }

    dv_2() {
        this.D();
    }

    dv_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dt_2.aJ()) {
            this.ri();
            this.rl();
        }
    }

    public dv_2 qZ() {
        super.clear();
        this.rd().clear();
        if (this.kJ == null) {
            this.kE = null;
        } else {
            this.kJ.clear();
        }
        this.an &= 0xFFFFFFFD;
        if (this.kK == null) {
            this.kG = null;
        } else {
            this.kK.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jt;
    }

    public dt_2 qX() {
        return dt_2.qW();
    }

    public dt_2 ra() {
        dt_2 dt_22 = this.rb();
        if (!dt_22.isInitialized()) {
            throw dv_2.newUninitializedMessageException((Message)dt_22);
        }
        return dt_22;
    }

    public dt_2 rb() {
        dt_2 dt_22 = new dt_2(this);
        int n = this.an;
        int n2 = 0;
        dt_22.kC = this.qJ();
        dt_22.kC.makeImmutable();
        if ((n & 2) != 0) {
            dt_22.kE = this.kJ == null ? this.kE : (dz_2)this.kJ.build();
            n2 |= 1;
        }
        if ((n & 4) != 0) {
            dt_22.kG = this.kK == null ? this.kG : (dn_2)this.kK.build();
            n2 |= 2;
        }
        dt_22.an = n2;
        this.onBuilt();
        return dt_22;
    }

    public dv_2 rc() {
        return (dv_2)super.clone();
    }

    public dv_2 aW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dv_2)super.setField(fieldDescriptor, object);
    }

    public dv_2 Y(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dv_2)super.clearField(fieldDescriptor);
    }

    public dv_2 Y(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dv_2)super.clearOneof(oneofDescriptor);
    }

    public dv_2 Y(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dv_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dv_2 aX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dv_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public dv_2 Y(Message message) {
        if (message instanceof dt_2) {
            return this.c((dt_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dv_2 c(dt_2 dt_22) {
        if (dt_22 == dt_2.qW()) {
            return this;
        }
        this.rd().mergeFrom(dt_22.qJ());
        if (dt_22.qN()) {
            this.b(dt_22.qO());
        }
        if (dt_22.qQ()) {
            this.e(dt_22.qR());
        }
        this.aX(dt_2.b(dt_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (dg_1 dg_12 : this.qM().values()) {
            if (dg_12.isInitialized()) continue;
            return false;
        }
        if (this.qN() && !this.qO().isInitialized()) {
            return false;
        }
        return !this.qQ() || this.qR().isInitialized();
    }

    public dv_2 bW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dt_2 dt_22 = null;
        try {
            dt_22 = (dt_2)dt_2.kI.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dt_22 = (dt_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dt_22 != null) {
                this.c(dt_22);
            }
        }
        return this;
    }

    private MapField<Integer, dg_1> qJ() {
        if (this.kC == null) {
            return MapField.emptyMapField(dw_2.kL);
        }
        return this.kC;
    }

    private MapField<Integer, dg_1> rd() {
        this.onChanged();
        if (this.kC == null) {
            this.kC = MapField.newMapField(dw_2.kL);
        }
        if (!this.kC.isMutable()) {
            this.kC = this.kC.copy();
        }
        return this.kC;
    }

    @Override
    public int qK() {
        return this.qJ().getMap().size();
    }

    @Override
    public boolean aF(int n) {
        return this.qJ().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dg_1> qL() {
        return this.qM();
    }

    @Override
    public Map<Integer, dg_1> qM() {
        return this.qJ().getMap();
    }

    @Override
    public dg_1 a(int n, dg_1 dg_12) {
        Map map = this.qJ().getMap();
        return map.containsKey(n) ? (dg_1)map.get(n) : dg_12;
    }

    @Override
    public dg_1 aG(int n) {
        Map map = this.qJ().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dg_1)map.get(n);
    }

    public dv_2 re() {
        this.rd().getMutableMap().clear();
        return this;
    }

    public dv_2 aH(int n) {
        this.rd().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dg_1> rf() {
        return this.rd().getMutableMap();
    }

    public dv_2 b(int n, dg_1 dg_12) {
        if (dg_12 == null) {
            throw new NullPointerException("map value");
        }
        this.rd().getMutableMap().put(n, dg_12);
        return this;
    }

    public dv_2 d(Map<Integer, dg_1> map) {
        this.rd().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean qN() {
        return (this.an & 2) != 0;
    }

    @Override
    public dz_2 qO() {
        if (this.kJ == null) {
            return this.kE == null ? dz_2.rv() : this.kE;
        }
        return (dz_2)this.kJ.getMessage();
    }

    public dv_2 a(dz_2 dz_22) {
        if (this.kJ == null) {
            if (dz_22 == null) {
                throw new NullPointerException();
            }
            this.kE = dz_22;
            this.onChanged();
        } else {
            this.kJ.setMessage((AbstractMessage)dz_22);
        }
        this.an |= 2;
        return this;
    }

    public dv_2 a(db_1 db_12) {
        if (this.kJ == null) {
            this.kE = db_12.rz();
            this.onChanged();
        } else {
            this.kJ.setMessage((AbstractMessage)db_12.rz());
        }
        this.an |= 2;
        return this;
    }

    public dv_2 b(dz_2 dz_22) {
        if (this.kJ == null) {
            this.kE = (this.an & 2) != 0 && this.kE != null && this.kE != dz_2.rv() ? dz_2.c(this.kE).e(dz_22).rA() : dz_22;
            this.onChanged();
        } else {
            this.kJ.mergeFrom((AbstractMessage)dz_22);
        }
        this.an |= 2;
        return this;
    }

    public dv_2 rg() {
        if (this.kJ == null) {
            this.kE = null;
            this.onChanged();
        } else {
            this.kJ.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public db_1 rh() {
        this.an |= 2;
        this.onChanged();
        return (db_1)this.ri().getBuilder();
    }

    @Override
    public dh_2 qP() {
        if (this.kJ != null) {
            return (dh_2)this.kJ.getMessageOrBuilder();
        }
        return this.kE == null ? dz_2.rv() : this.kE;
    }

    private SingleFieldBuilderV3<dz_2, db_1, dh_2> ri() {
        if (this.kJ == null) {
            this.kJ = new SingleFieldBuilderV3((AbstractMessage)this.qO(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.kE = null;
        }
        return this.kJ;
    }

    @Override
    public boolean qQ() {
        return (this.an & 4) != 0;
    }

    @Override
    public dn_2 qR() {
        if (this.kK == null) {
            return this.kG == null ? dn_2.qt() : this.kG;
        }
        return (dn_2)this.kK.getMessage();
    }

    public dv_2 d(dn_2 dn_22) {
        if (this.kK == null) {
            if (dn_22 == null) {
                throw new NullPointerException();
            }
            this.kG = dn_22;
            this.onChanged();
        } else {
            this.kK.setMessage((AbstractMessage)dn_22);
        }
        this.an |= 4;
        return this;
    }

    public dv_2 a(dp_1 dp_12) {
        if (this.kK == null) {
            this.kG = dp_12.qx();
            this.onChanged();
        } else {
            this.kK.setMessage((AbstractMessage)dp_12.qx());
        }
        this.an |= 4;
        return this;
    }

    public dv_2 e(dn_2 dn_22) {
        if (this.kK == null) {
            this.kG = (this.an & 4) != 0 && this.kG != null && this.kG != dn_2.qt() ? dn_2.a(this.kG).c(dn_22).qy() : dn_22;
            this.onChanged();
        } else {
            this.kK.mergeFrom((AbstractMessage)dn_22);
        }
        this.an |= 4;
        return this;
    }

    public dv_2 rj() {
        if (this.kK == null) {
            this.kG = null;
            this.onChanged();
        } else {
            this.kK.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public dp_1 rk() {
        this.an |= 4;
        this.onChanged();
        return (dp_1)this.rl().getBuilder();
    }

    @Override
    public ds_2 qS() {
        if (this.kK != null) {
            return (ds_2)this.kK.getMessageOrBuilder();
        }
        return this.kG == null ? dn_2.qt() : this.kG;
    }

    private SingleFieldBuilderV3<dn_2, dp_1, ds_2> rl() {
        if (this.kK == null) {
            this.kK = new SingleFieldBuilderV3((AbstractMessage)this.qR(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.kG = null;
        }
        return this.kK;
    }

    public final dv_2 aW(UnknownFieldSet unknownFieldSet) {
        return (dv_2)super.setUnknownFields(unknownFieldSet);
    }

    public final dv_2 aX(UnknownFieldSet unknownFieldSet) {
        return (dv_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Y(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Y(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Y(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.qZ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.rc();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.Y(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.qZ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Y(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.rc();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Y(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Y(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Y(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.rc();
    }

    public /* synthetic */ Message buildPartial() {
        return this.rb();
    }

    public /* synthetic */ Message build() {
        return this.ra();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.Y(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.qZ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.rc();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.rb();
    }

    public /* synthetic */ MessageLite build() {
        return this.ra();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.qZ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.qX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.qX();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.rc();
    }

    public /* synthetic */ Object clone() {
        return this.rc();
    }
}

