/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
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
 * Renamed from fR
 */
public final class fr_1
extends GeneratedMessageV3.Builder<fr_1>
implements ft_1 {
    private int an;
    private int rc;
    private int re;
    private Object rg = "";
    private long ri;
    private MapField<Integer, fo_2> rk;
    private boolean rm;

    public static final Descriptors.Descriptor Cc() {
        return fo_1.qW;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 5: {
                return this.BR();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 5: {
                return this.Cl();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fo_1.qX.ensureFieldAccessorsInitialized(fp_1.class, fr_1.class);
    }

    fr_1() {
        this.D();
    }

    fr_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fp_1.oV()) {
            // empty if block
        }
    }

    public fr_1 Cd() {
        super.clear();
        this.rc = 0;
        this.an &= 0xFFFFFFFE;
        this.re = 0;
        this.an &= 0xFFFFFFFD;
        this.rg = "";
        this.an &= 0xFFFFFFFB;
        this.ri = 0L;
        this.an &= 0xFFFFFFF7;
        this.Cl().clear();
        this.rm = false;
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fo_1.qW;
    }

    public fp_1 Cb() {
        return fp_1.Ca();
    }

    public fp_1 Ce() {
        fp_1 fp_12 = this.Cf();
        if (!fp_12.isInitialized()) {
            throw fr_1.newUninitializedMessageException((Message)fp_12);
        }
        return fp_12;
    }

    public fp_1 Cf() {
        fp_1 fp_12 = new fp_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            fp_12.rc = this.rc;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            fp_12.re = this.re;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        fp_12.rg = this.rg;
        if ((n & 8) != 0) {
            fp_12.ri = this.ri;
            n2 |= 8;
        }
        fp_12.rk = this.BR();
        fp_12.rk.makeImmutable();
        if ((n & 0x20) != 0) {
            fp_12.rm = this.rm;
            n2 |= 0x10;
        }
        fp_12.an = n2;
        this.onBuilt();
        return fp_12;
    }

    public fr_1 Cg() {
        return (fr_1)super.clone();
    }

    public fr_1 bW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fr_1)super.setField(fieldDescriptor, object);
    }

    public fr_1 ay(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fr_1)super.clearField(fieldDescriptor);
    }

    public fr_1 ay(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fr_1)super.clearOneof(oneofDescriptor);
    }

    public fr_1 ay(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fr_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fr_1 bX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fr_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public fr_1 ay(Message message) {
        if (message instanceof fp_1) {
            return this.c((fp_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fr_1 c(fp_1 fp_12) {
        if (fp_12 == fp_1.Ca()) {
            return this;
        }
        if (fp_12.BI()) {
            this.cE(fp_12.BJ());
        }
        if (fp_12.BK()) {
            this.cF(fp_12.BL());
        }
        if (fp_12.BM()) {
            this.an |= 4;
            this.rg = fp_12.rg;
            this.onChanged();
        }
        if (fp_12.BP()) {
            this.N(fp_12.BQ());
        }
        this.Cl().mergeFrom(fp_12.BR());
        if (fp_12.BV()) {
            this.j(fp_12.BW());
        }
        this.bX(fp_1.b(fp_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.BI()) {
            return false;
        }
        if (!this.BK()) {
            return false;
        }
        if (!this.BM()) {
            return false;
        }
        if (!this.BP()) {
            return false;
        }
        if (!this.BV()) {
            return false;
        }
        for (fo_2 fo_22 : this.BU().values()) {
            if (fo_22.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fr_1 dw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fp_1 fp_12 = null;
        try {
            fp_12 = (fp_1)fp_1.ro.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fp_12 = (fp_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fp_12 != null) {
                this.c(fp_12);
            }
        }
        return this;
    }

    @Override
    public boolean BI() {
        return (this.an & 1) != 0;
    }

    @Override
    public int BJ() {
        return this.rc;
    }

    public fr_1 cE(int n) {
        this.an |= 1;
        this.rc = n;
        this.onChanged();
        return this;
    }

    public fr_1 Ch() {
        this.an &= 0xFFFFFFFE;
        this.rc = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean BK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int BL() {
        return this.re;
    }

    public fr_1 cF(int n) {
        this.an |= 2;
        this.re = n;
        this.onChanged();
        return this;
    }

    public fr_1 Ci() {
        this.an &= 0xFFFFFFFD;
        this.re = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean BM() {
        return (this.an & 4) != 0;
    }

    @Override
    public String BN() {
        Object object = this.rg;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.rg = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString BO() {
        Object object = this.rg;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.rg = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public fr_1 E(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.rg = string;
        this.onChanged();
        return this;
    }

    public fr_1 Cj() {
        this.an &= 0xFFFFFFFB;
        this.rg = fp_1.Ca().BN();
        this.onChanged();
        return this;
    }

    public fr_1 br(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.rg = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean BP() {
        return (this.an & 8) != 0;
    }

    @Override
    public long BQ() {
        return this.ri;
    }

    public fr_1 N(long l) {
        this.an |= 8;
        this.ri = l;
        this.onChanged();
        return this;
    }

    public fr_1 Ck() {
        this.an &= 0xFFFFFFF7;
        this.ri = 0L;
        this.onChanged();
        return this;
    }

    private MapField<Integer, fo_2> BR() {
        if (this.rk == null) {
            return MapField.emptyMapField(fs_2.rp);
        }
        return this.rk;
    }

    private MapField<Integer, fo_2> Cl() {
        this.onChanged();
        if (this.rk == null) {
            this.rk = MapField.newMapField(fs_2.rp);
        }
        if (!this.rk.isMutable()) {
            this.rk = this.rk.copy();
        }
        return this.rk;
    }

    @Override
    public int BS() {
        return this.BR().getMap().size();
    }

    @Override
    public boolean cC(int n) {
        return this.BR().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fo_2> BT() {
        return this.BU();
    }

    @Override
    public Map<Integer, fo_2> BU() {
        return this.BR().getMap();
    }

    @Override
    public fo_2 a(int n, fo_2 fo_22) {
        Map map = this.BR().getMap();
        return map.containsKey(n) ? (fo_2)map.get(n) : fo_22;
    }

    @Override
    public fo_2 cD(int n) {
        Map map = this.BR().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fo_2)map.get(n);
    }

    public fr_1 Cm() {
        this.Cl().getMutableMap().clear();
        return this;
    }

    public fr_1 cG(int n) {
        this.Cl().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, fo_2> Cn() {
        return this.Cl().getMutableMap();
    }

    public fr_1 b(int n, fo_2 fo_22) {
        if (fo_22 == null) {
            throw new NullPointerException("map value");
        }
        this.Cl().getMutableMap().put(n, fo_22);
        return this;
    }

    public fr_1 i(Map<Integer, fo_2> map) {
        this.Cl().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean BV() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean BW() {
        return this.rm;
    }

    public fr_1 j(boolean bl) {
        this.an |= 0x20;
        this.rm = bl;
        this.onChanged();
        return this;
    }

    public fr_1 Co() {
        this.an &= 0xFFFFFFDF;
        this.rm = false;
        this.onChanged();
        return this;
    }

    public final fr_1 bW(UnknownFieldSet unknownFieldSet) {
        return (fr_1)super.setUnknownFields(unknownFieldSet);
    }

    public final fr_1 bX(UnknownFieldSet unknownFieldSet) {
        return (fr_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ay(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ay(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ay(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Cd();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Cg();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ay(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Cd();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ay(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Cg();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ay(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ay(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ay(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Cg();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Cf();
    }

    public /* synthetic */ Message build() {
        return this.Ce();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ay(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Cd();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Cg();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Cf();
    }

    public /* synthetic */ MessageLite build() {
        return this.Ce();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Cd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Cb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Cb();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Cg();
    }

    public /* synthetic */ Object clone() {
        return this.Cg();
    }
}

