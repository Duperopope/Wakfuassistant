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
 * Renamed from Mh
 */
public final class mh_2
extends GeneratedMessageV3.Builder<mh_2>
implements mi_2 {
    private int an;
    private Object aRJ = "";
    private Object aRL = "";
    private int ni;

    public static final Descriptors.Descriptor aUf() {
        return ma_2.aRF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_2.aRG.ensureFieldAccessorsInitialized(mf_2.class, mh_2.class);
    }

    mh_2() {
        this.D();
    }

    mh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mf_2.fa()) {
            // empty if block
        }
    }

    public mh_2 aUg() {
        super.clear();
        this.aRJ = "";
        this.an &= 0xFFFFFFFE;
        this.aRL = "";
        this.an &= 0xFFFFFFFD;
        this.ni = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ma_2.aRF;
    }

    public mf_2 aUe() {
        return mf_2.aUd();
    }

    public mf_2 aUh() {
        mf_2 mf_22 = this.aUi();
        if (!mf_22.isInitialized()) {
            throw mh_2.newUninitializedMessageException((Message)mf_22);
        }
        return mf_22;
    }

    public mf_2 aUi() {
        mf_2 mf_22 = new mf_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        mf_22.aRJ = this.aRJ;
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        mf_22.aRL = this.aRL;
        if ((n & 4) != 0) {
            mf_22.ni = this.ni;
            n2 |= 4;
        }
        mf_22.an = n2;
        this.onBuilt();
        return mf_22;
    }

    public mh_2 aUj() {
        return (mh_2)super.clone();
    }

    public mh_2 gK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mh_2)super.setField(fieldDescriptor, object);
    }

    public mh_2 cS(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mh_2)super.clearField(fieldDescriptor);
    }

    public mh_2 cS(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mh_2)super.clearOneof(oneofDescriptor);
    }

    public mh_2 cS(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mh_2 gL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public mh_2 cS(Message message) {
        if (message instanceof mf_2) {
            return this.c((mf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mh_2 c(mf_2 mf_22) {
        if (mf_22 == mf_2.aUd()) {
            return this;
        }
        if (mf_22.aTG()) {
            this.an |= 1;
            this.aRJ = mf_22.aRJ;
            this.onChanged();
        }
        if (mf_22.aTJ()) {
            this.an |= 2;
            this.aRL = mf_22.aRL;
            this.onChanged();
        }
        if (mf_22.vX()) {
            this.nB(mf_22.vY());
        }
        this.gL(mf_2.b(mf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aTG()) {
            return false;
        }
        if (!this.aTJ()) {
            return false;
        }
        return this.vX();
    }

    public mh_2 kE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mf_2 mf_22 = null;
        try {
            mf_22 = (mf_2)mf_2.aRU.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mf_22 = (mf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mf_22 != null) {
                this.c(mf_22);
            }
        }
        return this;
    }

    @Override
    public boolean aTG() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aTH() {
        Object object = this.aRJ;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aRJ = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aTI() {
        Object object = this.aRJ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRJ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mh_2 cH(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.aRJ = string;
        this.onChanged();
        return this;
    }

    public mh_2 aUk() {
        this.an &= 0xFFFFFFFE;
        this.aRJ = mf_2.aUd().aTH();
        this.onChanged();
        return this;
    }

    public mh_2 eA(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.aRJ = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aTJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public String aTK() {
        Object object = this.aRL;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aRL = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aTL() {
        Object object = this.aRL;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRL = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mh_2 cI(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aRL = string;
        this.onChanged();
        return this;
    }

    public mh_2 aUl() {
        this.an &= 0xFFFFFFFD;
        this.aRL = mf_2.aUd().aTK();
        this.onChanged();
        return this;
    }

    public mh_2 eB(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.aRL = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean vX() {
        return (this.an & 4) != 0;
    }

    @Override
    public int vY() {
        return this.ni;
    }

    public mh_2 nB(int n) {
        this.an |= 4;
        this.ni = n;
        this.onChanged();
        return this;
    }

    public mh_2 aUm() {
        this.an &= 0xFFFFFFFB;
        this.ni = 0;
        this.onChanged();
        return this;
    }

    public final mh_2 gK(UnknownFieldSet unknownFieldSet) {
        return (mh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final mh_2 gL(UnknownFieldSet unknownFieldSet) {
        return (mh_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cS(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cS(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cS(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aUg();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aUj();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cS(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aUg();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cS(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aUj();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cS(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cS(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cS(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aUj();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aUi();
    }

    public /* synthetic */ Message build() {
        return this.aUh();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cS(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aUg();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aUj();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aUi();
    }

    public /* synthetic */ MessageLite build() {
        return this.aUh();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aUg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aUe();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aUe();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aUj();
    }

    public /* synthetic */ Object clone() {
        return this.aUj();
    }
}

