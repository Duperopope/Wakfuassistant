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
 * Renamed from zL
 */
public final class zl_1
extends GeneratedMessageV3.Builder<zl_1>
implements zm_1 {
    private int an;
    private int HC = 1;
    private Internal.IntList aoT = zj_1.Ac();

    public static final Descriptors.Descriptor aAo() {
        return zc_2.aoA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zc_2.aoB.ensureFieldAccessorsInitialized(zj_1.class, zl_1.class);
    }

    zl_1() {
        this.D();
    }

    zl_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zj_1.oV()) {
            // empty if block
        }
    }

    public zl_1 aAp() {
        super.clear();
        this.HC = 1;
        this.an &= 0xFFFFFFFE;
        this.aoT = zj_1.amY();
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zc_2.aoA;
    }

    public zj_1 aAn() {
        return zj_1.aAm();
    }

    public zj_1 aAq() {
        zj_1 zj_12 = this.aAr();
        if (!zj_12.isInitialized()) {
            throw zl_1.newUninitializedMessageException((Message)zj_12);
        }
        return zj_12;
    }

    public zj_1 aAr() {
        zj_1 zj_12 = new zj_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        zj_12.HC = this.HC;
        if ((this.an & 2) != 0) {
            this.aoT.makeImmutable();
            this.an &= 0xFFFFFFFD;
        }
        zj_12.aoT = this.aoT;
        zj_12.an = n2;
        this.onBuilt();
        return zj_12;
    }

    public zl_1 aAs() {
        return (zl_1)super.clone();
    }

    public zl_1 ge(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zl_1)super.setField(fieldDescriptor, object);
    }

    public zl_1 cC(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zl_1)super.clearField(fieldDescriptor);
    }

    public zl_1 cC(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zl_1)super.clearOneof(oneofDescriptor);
    }

    public zl_1 cC(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zl_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zl_1 gf(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zl_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public zl_1 cC(Message message) {
        if (message instanceof zj_1) {
            return this.d((zj_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zl_1 d(zj_1 zj_12) {
        if (zj_12 == zj_1.aAm()) {
            return this;
        }
        if (zj_12.aeU()) {
            this.a(zj_12.aAg());
        }
        if (!zj_12.aoT.isEmpty()) {
            if (this.aoT.isEmpty()) {
                this.aoT = zj_12.aoT;
                this.an &= 0xFFFFFFFD;
            } else {
                this.aAu();
                this.aoT.addAll((Collection)zj_12.aoT);
            }
            this.onChanged();
        }
        this.gf(zj_1.c(zj_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.aeU();
    }

    public zl_1 jI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zj_1 zj_12 = null;
        try {
            zj_12 = (zj_1)zj_1.aoV.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zj_12 = (zj_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zj_12 != null) {
                this.d(zj_12);
            }
        }
        return this;
    }

    @Override
    public boolean aeU() {
        return (this.an & 1) != 0;
    }

    @Override
    public zd_2 aAg() {
        zd_2 zd_22 = zd_2.kR(this.HC);
        return zd_22 == null ? zd_2.aoC : zd_22;
    }

    public zl_1 a(zd_2 zd_22) {
        if (zd_22 == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.HC = zd_22.getNumber();
        this.onChanged();
        return this;
    }

    public zl_1 aAt() {
        this.an &= 0xFFFFFFFE;
        this.HC = 1;
        this.onChanged();
        return this;
    }

    private void aAu() {
        if ((this.an & 2) == 0) {
            this.aoT = zj_1.b(this.aoT);
            this.an |= 2;
        }
    }

    @Override
    public List<Integer> aAh() {
        return (this.an & 2) != 0 ? Collections.unmodifiableList(this.aoT) : this.aoT;
    }

    @Override
    public int aAi() {
        return this.aoT.size();
    }

    @Override
    public int kZ(int n) {
        return this.aoT.getInt(n);
    }

    public zl_1 k(int n, int n2) {
        this.aAu();
        this.aoT.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public zl_1 la(int n) {
        this.aAu();
        this.aoT.addInt(n);
        this.onChanged();
        return this;
    }

    public zl_1 ax(Iterable<? extends Integer> iterable) {
        this.aAu();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.aoT);
        this.onChanged();
        return this;
    }

    public zl_1 aAv() {
        this.aoT = zj_1.Ad();
        this.an &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final zl_1 ge(UnknownFieldSet unknownFieldSet) {
        return (zl_1)super.setUnknownFields(unknownFieldSet);
    }

    public final zl_1 gf(UnknownFieldSet unknownFieldSet) {
        return (zl_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gf(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ge(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gf(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cC(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cC(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cC(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ge(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aAp();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aAs();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gf(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cC(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aAp();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cC(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aAs();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gf(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ge(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gf(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cC(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cC(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cC(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ge(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aAs();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aAr();
    }

    public /* synthetic */ Message build() {
        return this.aAq();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cC(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aAp();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aAs();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aAr();
    }

    public /* synthetic */ MessageLite build() {
        return this.aAq();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aAp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAn();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aAs();
    }

    public /* synthetic */ Object clone() {
        return this.aAs();
    }
}

