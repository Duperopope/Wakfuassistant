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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from ho
 */
public final class ho_1
extends GeneratedMessageV3.Builder<ho_1>
implements hp_1 {
    private int an;
    private int oq;
    private boolean un;
    private Object bs = "";
    private int lM;
    private long ur;
    private Object ut = "";

    public static final Descriptors.Descriptor HY() {
        return hh_1.tY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tZ.ensureFieldAccessorsInitialized(hm_1.class, ho_1.class);
    }

    ho_1() {
        this.D();
    }

    ho_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hm_1.bg()) {
            // empty if block
        }
    }

    public ho_1 HZ() {
        super.clear();
        this.oq = 0;
        this.an &= 0xFFFFFFFE;
        this.un = false;
        this.an &= 0xFFFFFFFD;
        this.bs = "";
        this.an &= 0xFFFFFFFB;
        this.lM = 0;
        this.an &= 0xFFFFFFF7;
        this.ur = 0L;
        this.an &= 0xFFFFFFEF;
        this.ut = "";
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hh_1.tY;
    }

    public hm_1 HX() {
        return hm_1.HW();
    }

    public hm_1 Ia() {
        hm_1 hm_12 = this.Ib();
        if (!hm_12.isInitialized()) {
            throw ho_1.newUninitializedMessageException((Message)hm_12);
        }
        return hm_12;
    }

    public hm_1 Ib() {
        hm_1 hm_12 = new hm_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            hm_12.oq = this.oq;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            hm_12.un = this.un;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        hm_12.bs = this.bs;
        if ((n & 8) != 0) {
            hm_12.lM = this.lM;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            hm_12.ur = this.ur;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            n2 |= 0x20;
        }
        hm_12.ut = this.ut;
        hm_12.an = n2;
        this.onBuilt();
        return hm_12;
    }

    public ho_1 Ic() {
        return (ho_1)super.clone();
    }

    public ho_1 cA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ho_1)super.setField(fieldDescriptor, object);
    }

    public ho_1 aN(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ho_1)super.clearField(fieldDescriptor);
    }

    public ho_1 aN(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ho_1)super.clearOneof(oneofDescriptor);
    }

    public ho_1 aN(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ho_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ho_1 cB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ho_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ho_1 aN(Message message) {
        if (message instanceof hm_1) {
            return this.c((hm_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ho_1 c(hm_1 hm_12) {
        if (hm_12 == hm_1.HW()) {
            return this;
        }
        if (hm_12.xS()) {
            this.du(hm_12.xT());
        }
        if (hm_12.HM()) {
            this.q(hm_12.HN());
        }
        if (hm_12.wq()) {
            this.an |= 4;
            this.bs = hm_12.bs;
            this.onChanged();
        }
        if (hm_12.sX()) {
            this.dv(hm_12.sY());
        }
        if (hm_12.HO()) {
            this.Y(hm_12.HP());
        }
        if (hm_12.HQ()) {
            this.an |= 0x20;
            this.ut = hm_12.ut;
            this.onChanged();
        }
        this.cB(hm_1.b(hm_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.xS();
    }

    public ho_1 ep(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hm_1 hm_12 = null;
        try {
            hm_12 = (hm_1)hm_1.uv.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hm_12 = (hm_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hm_12 != null) {
                this.c(hm_12);
            }
        }
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 1) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public ho_1 du(int n) {
        this.an |= 1;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public ho_1 Id() {
        this.an &= 0xFFFFFFFE;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean HM() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean HN() {
        return this.un;
    }

    public ho_1 q(boolean bl) {
        this.an |= 2;
        this.un = bl;
        this.onChanged();
        return this;
    }

    public ho_1 Ie() {
        this.an &= 0xFFFFFFFD;
        this.un = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ho_1 F(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public ho_1 If() {
        this.an &= 0xFFFFFFFB;
        this.bs = hm_1.HW().getName();
        this.onChanged();
        return this;
    }

    public ho_1 bH(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sX() {
        return (this.an & 8) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    public ho_1 dv(int n) {
        this.an |= 8;
        this.lM = n;
        this.onChanged();
        return this;
    }

    public ho_1 Ig() {
        this.an &= 0xFFFFFFF7;
        this.lM = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean HO() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long HP() {
        return this.ur;
    }

    public ho_1 Y(long l) {
        this.an |= 0x10;
        this.ur = l;
        this.onChanged();
        return this;
    }

    public ho_1 Ih() {
        this.an &= 0xFFFFFFEF;
        this.ur = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean HQ() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String HR() {
        Object object = this.ut;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ut = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString HS() {
        Object object = this.ut;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ut = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ho_1 G(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.ut = string;
        this.onChanged();
        return this;
    }

    public ho_1 Ii() {
        this.an &= 0xFFFFFFDF;
        this.ut = hm_1.HW().HR();
        this.onChanged();
        return this;
    }

    public ho_1 bI(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.ut = byteString;
        this.onChanged();
        return this;
    }

    public final ho_1 cA(UnknownFieldSet unknownFieldSet) {
        return (ho_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ho_1 cB(UnknownFieldSet unknownFieldSet) {
        return (ho_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aN(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aN(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aN(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.HZ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Ic();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ep(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aN(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.HZ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aN(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Ic();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aN(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aN(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aN(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ep(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Ic();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Ib();
    }

    public /* synthetic */ Message build() {
        return this.Ia();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aN(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.HZ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ep(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Ic();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Ib();
    }

    public /* synthetic */ MessageLite build() {
        return this.Ia();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.HZ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.HX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.HX();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ep(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Ic();
    }

    public /* synthetic */ Object clone() {
        return this.Ic();
    }
}

