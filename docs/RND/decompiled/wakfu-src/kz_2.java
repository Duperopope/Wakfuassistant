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
 * Renamed from kz
 */
public final class kz_2
extends GeneratedMessageV3.Builder<kz_2>
implements ke_2 {
    private int an;
    private long DJ;
    private long ur;
    private Object ut = "";

    public static final Descriptors.Descriptor abP() {
        return kw_2.Fy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kw_2.Fz.ensureFieldAccessorsInitialized(kx_2.class, kz_2.class);
    }

    kz_2() {
        this.D();
    }

    kz_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kx_2.aJ()) {
            // empty if block
        }
    }

    public kz_2 abQ() {
        super.clear();
        this.DJ = 0L;
        this.an &= 0xFFFFFFFE;
        this.ur = 0L;
        this.an &= 0xFFFFFFFD;
        this.ut = "";
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kw_2.Fy;
    }

    public kx_2 abO() {
        return kx_2.abN();
    }

    public kx_2 abR() {
        kx_2 kx_22 = this.abS();
        if (!kx_22.isInitialized()) {
            throw kz_2.newUninitializedMessageException((Message)kx_22);
        }
        return kx_22;
    }

    public kx_2 abS() {
        kx_2 kx_22 = new kx_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kx_22.DJ = this.DJ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kx_22.ur = this.ur;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        kx_22.ut = this.ut;
        kx_22.an = n2;
        this.onBuilt();
        return kx_22;
    }

    public kz_2 abT() {
        return (kz_2)super.clone();
    }

    public kz_2 dY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kz_2)super.setField(fieldDescriptor, object);
    }

    public kz_2 bz(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kz_2)super.clearField(fieldDescriptor);
    }

    public kz_2 bz(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kz_2)super.clearOneof(oneofDescriptor);
    }

    public kz_2 bz(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kz_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kz_2 dZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kz_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public kz_2 bz(Message message) {
        if (message instanceof kx_2) {
            return this.c((kx_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kz_2 c(kx_2 kx_22) {
        if (kx_22 == kx_2.abN()) {
            return this;
        }
        if (kx_22.XZ()) {
            this.aS(kx_22.Ya());
        }
        if (kx_22.HO()) {
            this.aT(kx_22.HP());
        }
        if (kx_22.HQ()) {
            this.an |= 4;
            this.ut = kx_22.ut;
            this.onChanged();
        }
        this.dZ(kx_2.b(kx_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public kz_2 gz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kx_2 kx_22 = null;
        try {
            kx_22 = (kx_2)kx_2.FH.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kx_22 = (kx_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kx_22 != null) {
                this.c(kx_22);
            }
        }
        return this;
    }

    @Override
    public boolean XZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    public kz_2 aS(long l) {
        this.an |= 1;
        this.DJ = l;
        this.onChanged();
        return this;
    }

    public kz_2 abU() {
        this.an &= 0xFFFFFFFE;
        this.DJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean HO() {
        return (this.an & 2) != 0;
    }

    @Override
    public long HP() {
        return this.ur;
    }

    public kz_2 aT(long l) {
        this.an |= 2;
        this.ur = l;
        this.onChanged();
        return this;
    }

    public kz_2 abV() {
        this.an &= 0xFFFFFFFD;
        this.ur = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean HQ() {
        return (this.an & 4) != 0;
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

    public kz_2 P(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.ut = string;
        this.onChanged();
        return this;
    }

    public kz_2 abW() {
        this.an &= 0xFFFFFFFB;
        this.ut = kx_2.abN().HR();
        this.onChanged();
        return this;
    }

    public kz_2 cI(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.ut = byteString;
        this.onChanged();
        return this;
    }

    public final kz_2 dY(UnknownFieldSet unknownFieldSet) {
        return (kz_2)super.setUnknownFields(unknownFieldSet);
    }

    public final kz_2 dZ(UnknownFieldSet unknownFieldSet) {
        return (kz_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bz(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bz(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bz(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.abQ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.abT();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bz(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.abQ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bz(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.abT();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bz(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bz(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bz(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.abT();
    }

    public /* synthetic */ Message buildPartial() {
        return this.abS();
    }

    public /* synthetic */ Message build() {
        return this.abR();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bz(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.abQ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.abT();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.abS();
    }

    public /* synthetic */ MessageLite build() {
        return this.abR();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.abQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abO();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abO();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.abT();
    }

    public /* synthetic */ Object clone() {
        return this.abT();
    }
}

