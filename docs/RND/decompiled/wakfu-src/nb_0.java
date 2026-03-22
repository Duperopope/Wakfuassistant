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
 * Renamed from nB
 */
public final class nb_0
extends GeneratedMessageV3.Builder<nb_0>
implements nc_0 {
    private int an;
    private long AH;
    private Object bs = "";
    private int ws;

    public static final Descriptors.Descriptor aqD() {
        return nq.Nv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Nw.ensureFieldAccessorsInitialized(nz.class, nb_0.class);
    }

    nb_0() {
        this.D();
    }

    nb_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (nz.bg()) {
            // empty if block
        }
    }

    public nb_0 aqE() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.ws = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nq.Nv;
    }

    public nz aqC() {
        return nz.aqB();
    }

    public nz aqF() {
        nz nz2 = this.aqG();
        if (!nz2.isInitialized()) {
            throw nb_0.newUninitializedMessageException((Message)nz2);
        }
        return nz2;
    }

    public nz aqG() {
        nz nz2 = new nz(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            nz2.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        nz2.bs = this.bs;
        if ((n & 4) != 0) {
            nz2.ws = this.ws;
            n2 |= 4;
        }
        nz2.an = n2;
        this.onBuilt();
        return nz2;
    }

    public nb_0 aqH() {
        return (nb_0)super.clone();
    }

    public nb_0 fo(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nb_0)super.setField(fieldDescriptor, object);
    }

    public nb_0 ch(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nb_0)super.clearField(fieldDescriptor);
    }

    public nb_0 ch(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nb_0)super.clearOneof(oneofDescriptor);
    }

    public nb_0 ch(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nb_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nb_0 fp(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nb_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public nb_0 ch(Message message) {
        if (message instanceof nz) {
            return this.d((nz)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nb_0 d(nz nz2) {
        if (nz2 == nz.aqB()) {
            return this;
        }
        if (nz2.oN()) {
            this.bE(nz2.Sn());
        }
        if (nz2.wq()) {
            this.an |= 2;
            this.bs = nz2.bs;
            this.onChanged();
        }
        if (nz2.Ly()) {
            this.jm(nz2.Lz());
        }
        this.fp(nz.c(nz2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        return this.Ly();
    }

    public nb_0 ix(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nz nz2 = null;
        try {
            nz2 = (nz)nz.NY.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nz2 = (nz)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nz2 != null) {
                this.d(nz2);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public nb_0 bE(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public nb_0 aqI() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
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

    public nb_0 aa(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public nb_0 aqJ() {
        this.an &= 0xFFFFFFFD;
        this.bs = nz.aqB().getName();
        this.onChanged();
        return this;
    }

    public nb_0 dB(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ly() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public nb_0 jm(int n) {
        this.an |= 4;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public nb_0 aqK() {
        this.an &= 0xFFFFFFFB;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    public final nb_0 fo(UnknownFieldSet unknownFieldSet) {
        return (nb_0)super.setUnknownFields(unknownFieldSet);
    }

    public final nb_0 fp(UnknownFieldSet unknownFieldSet) {
        return (nb_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fp(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fo(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fp(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ch(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ch(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ch(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fo(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aqE();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aqH();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fp(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ix(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ch(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aqE();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ch(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aqH();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fp(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fo(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fp(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ch(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ch(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ch(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fo(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ix(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aqH();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aqG();
    }

    public /* synthetic */ Message build() {
        return this.aqF();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ch(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aqE();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ix(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aqH();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aqG();
    }

    public /* synthetic */ MessageLite build() {
        return this.aqF();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aqE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aqC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aqC();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ix(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aqH();
    }

    public /* synthetic */ Object clone() {
        return this.aqH();
    }
}

