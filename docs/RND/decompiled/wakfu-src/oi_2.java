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
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from oi
 */
public final class oi_2
extends GeneratedMessageV3.Builder<oi_2>
implements oj_2 {
    private int an;
    private Internal.IntList Qq = og_2.Ab();
    private int Qs;

    public static final Descriptors.Descriptor auO() {
        return nx_2.PC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PD.ensureFieldAccessorsInitialized(og_2.class, oi_2.class);
    }

    oi_2() {
        this.D();
    }

    oi_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (og_2.aJ()) {
            // empty if block
        }
    }

    public oi_2 auP() {
        super.clear();
        this.Qq = og_2.auN();
        this.an &= 0xFFFFFFFE;
        this.Qs = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nx_2.PC;
    }

    public og_2 auM() {
        return og_2.auL();
    }

    public og_2 auQ() {
        og_2 og_22 = this.auR();
        if (!og_22.isInitialized()) {
            throw oi_2.newUninitializedMessageException((Message)og_22);
        }
        return og_22;
    }

    public og_2 auR() {
        og_2 og_22 = new og_2(this);
        int n = this.an;
        int n2 = 0;
        if ((this.an & 1) != 0) {
            this.Qq.makeImmutable();
            this.an &= 0xFFFFFFFE;
        }
        og_22.Qq = this.Qq;
        if ((n & 2) != 0) {
            og_22.Qs = this.Qs;
            n2 |= 1;
        }
        og_22.an = n2;
        this.onBuilt();
        return og_22;
    }

    public oi_2 auS() {
        return (oi_2)super.clone();
    }

    public oi_2 fC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oi_2)super.setField(fieldDescriptor, object);
    }

    public oi_2 co(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oi_2)super.clearField(fieldDescriptor);
    }

    public oi_2 co(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oi_2)super.clearOneof(oneofDescriptor);
    }

    public oi_2 co(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oi_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oi_2 fD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oi_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public oi_2 co(Message message) {
        if (message instanceof og_2) {
            return this.g((og_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oi_2 g(og_2 og_22) {
        if (og_22 == og_2.auL()) {
            return this;
        }
        if (!og_22.Qq.isEmpty()) {
            if (this.Qq.isEmpty()) {
                this.Qq = og_22.Qq;
                this.an &= 0xFFFFFFFE;
            } else {
                this.auT();
                this.Qq.addAll((Collection)og_22.Qq);
            }
            this.onChanged();
        }
        if (og_22.auG()) {
            this.jO(og_22.auH());
        }
        this.fD(og_2.f(og_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.auG();
    }

    public oi_2 iS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        og_2 og_22 = null;
        try {
            og_22 = (og_2)og_2.Qu.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            og_22 = (og_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (og_22 != null) {
                this.g(og_22);
            }
        }
        return this;
    }

    private void auT() {
        if ((this.an & 1) == 0) {
            this.Qq = og_2.d(this.Qq);
            this.an |= 1;
        }
    }

    @Override
    public List<Integer> auE() {
        return (this.an & 1) != 0 ? Collections.unmodifiableList(this.Qq) : this.Qq;
    }

    @Override
    public int auF() {
        return this.Qq.size();
    }

    @Override
    public int jM(int n) {
        return this.Qq.getInt(n);
    }

    public oi_2 i(int n, int n2) {
        this.auT();
        this.Qq.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public oi_2 jN(int n) {
        this.auT();
        this.Qq.addInt(n);
        this.onChanged();
        return this;
    }

    public oi_2 ao(Iterable<? extends Integer> iterable) {
        this.auT();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.Qq);
        this.onChanged();
        return this;
    }

    public oi_2 auU() {
        this.Qq = og_2.vL();
        this.an &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    @Override
    public boolean auG() {
        return (this.an & 2) != 0;
    }

    @Override
    public int auH() {
        return this.Qs;
    }

    public oi_2 jO(int n) {
        this.an |= 2;
        this.Qs = n;
        this.onChanged();
        return this;
    }

    public oi_2 auV() {
        this.an &= 0xFFFFFFFD;
        this.Qs = 0;
        this.onChanged();
        return this;
    }

    public final oi_2 fC(UnknownFieldSet unknownFieldSet) {
        return (oi_2)super.setUnknownFields(unknownFieldSet);
    }

    public final oi_2 fD(UnknownFieldSet unknownFieldSet) {
        return (oi_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.co(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.co(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.co(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.auP();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.auS();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.co(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.auP();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.co(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.auS();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.co(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.co(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.co(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.auS();
    }

    public /* synthetic */ Message buildPartial() {
        return this.auR();
    }

    public /* synthetic */ Message build() {
        return this.auQ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.co(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.auP();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.auS();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.auR();
    }

    public /* synthetic */ MessageLite build() {
        return this.auQ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.auP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.auM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.auM();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iS(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.auS();
    }

    public /* synthetic */ Object clone() {
        return this.auS();
    }
}

