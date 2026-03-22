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
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class nc
extends GeneratedMessageV3.Builder<nc>
implements nd {
    private int an;
    private mk Kp;
    private SingleFieldBuilderV3<mk, mm_0, mn> Kv;
    private List<mw_1> Ce = Collections.emptyList();
    private RepeatedFieldBuilderV3<mw_1, my_1, mZ> Ch;

    public static final Descriptors.Descriptor apg() {
        return mv_0.MG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mv_0.MH.ensureFieldAccessorsInitialized(na.class, nc.class);
    }

    nc() {
        this.D();
    }

    nc(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (na.aJ()) {
            this.akU();
            this.Vv();
        }
    }

    public nc aph() {
        super.clear();
        if (this.Kv == null) {
            this.Kp = null;
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.Ch.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mv_0.MG;
    }

    public na apf() {
        return na.ape();
    }

    public na api() {
        na na2 = this.apj();
        if (!na2.isInitialized()) {
            throw nc.newUninitializedMessageException((Message)na2);
        }
        return na2;
    }

    public na apj() {
        na na2 = new na(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            na2.Kp = this.Kv == null ? this.Kp : (mk)this.Kv.build();
            n2 |= 1;
        }
        if (this.Ch == null) {
            if ((this.an & 2) != 0) {
                this.Ce = Collections.unmodifiableList(this.Ce);
                this.an &= 0xFFFFFFFD;
            }
            na2.Ce = this.Ce;
        } else {
            na2.Ce = this.Ch.build();
        }
        na2.an = n2;
        this.onBuilt();
        return na2;
    }

    public nc apk() {
        return (nc)super.clone();
    }

    public nc fi(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nc)super.setField(fieldDescriptor, object);
    }

    public nc ce(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nc)super.clearField(fieldDescriptor);
    }

    public nc ce(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nc)super.clearOneof(oneofDescriptor);
    }

    public nc ce(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nc)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nc fj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nc)super.addRepeatedField(fieldDescriptor, object);
    }

    public nc ce(Message message) {
        if (message instanceof na) {
            return this.c((na)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nc c(na na2) {
        if (na2 == na.ape()) {
            return this;
        }
        if (na2.akD()) {
            this.m(na2.akE());
        }
        if (this.Ch == null) {
            if (!na2.Ce.isEmpty()) {
                if (this.Ce.isEmpty()) {
                    this.Ce = na2.Ce;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.Vr();
                    this.Ce.addAll(na2.Ce);
                }
                this.onChanged();
            }
        } else if (!na2.Ce.isEmpty()) {
            if (this.Ch.isEmpty()) {
                this.Ch.dispose();
                this.Ch = null;
                this.Ce = na2.Ce;
                this.an &= 0xFFFFFFFD;
                this.Ch = na.oB() ? this.Vv() : null;
            } else {
                this.Ch.addAllMessages(na2.Ce);
            }
        }
        this.fj(na.b(na2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.akD()) {
            return false;
        }
        if (!this.akE().isInitialized()) {
            return false;
        }
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.iL(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public nc io(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        na na2 = null;
        try {
            na2 = (na)na.MY.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            na2 = (na)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (na2 != null) {
                this.c(na2);
            }
        }
        return this;
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        if (this.Kv == null) {
            return this.Kp == null ? mk.ale() : this.Kp;
        }
        return (mk)this.Kv.getMessage();
    }

    public nc l(mk mk2) {
        if (this.Kv == null) {
            if (mk2 == null) {
                throw new NullPointerException();
            }
            this.Kp = mk2;
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public nc e(mm_0 mm_02) {
        if (this.Kv == null) {
            this.Kp = mm_02.ali();
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mm_02.ali());
        }
        this.an |= 1;
        return this;
    }

    public nc m(mk mk2) {
        if (this.Kv == null) {
            this.Kp = (this.an & 1) != 0 && this.Kp != null && this.Kp != mk.ale() ? mk.c(this.Kp).e(mk2).alj() : mk2;
            this.onChanged();
        } else {
            this.Kv.mergeFrom((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public nc apl() {
        if (this.Kv == null) {
            this.Kp = null;
            this.onChanged();
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public mm_0 akT() {
        this.an |= 1;
        this.onChanged();
        return (mm_0)this.akU().getBuilder();
    }

    @Override
    public mn akF() {
        if (this.Kv != null) {
            return (mn)this.Kv.getMessageOrBuilder();
        }
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    private SingleFieldBuilderV3<mk, mm_0, mn> akU() {
        if (this.Kv == null) {
            this.Kv = new SingleFieldBuilderV3((AbstractMessage)this.akE(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Kp = null;
        }
        return this.Kv;
    }

    private void Vr() {
        if ((this.an & 2) == 0) {
            this.Ce = new ArrayList<mw_1>(this.Ce);
            this.an |= 2;
        }
    }

    @Override
    public List<mw_1> Ve() {
        if (this.Ch == null) {
            return Collections.unmodifiableList(this.Ce);
        }
        return this.Ch.getMessageList();
    }

    @Override
    public int Vg() {
        if (this.Ch == null) {
            return this.Ce.size();
        }
        return this.Ch.getCount();
    }

    @Override
    public mw_1 iL(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (mw_1)this.Ch.getMessage(n);
    }

    public nc a(int n, mw_1 mw_12) {
        if (this.Ch == null) {
            if (mw_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.set(n, mw_12);
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)mw_12);
        }
        return this;
    }

    public nc a(int n, my_1 my_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.set(n, my_12.aoS());
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)my_12.aoS());
        }
        return this;
    }

    public nc d(mw_1 mw_12) {
        if (this.Ch == null) {
            if (mw_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(mw_12);
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)mw_12);
        }
        return this;
    }

    public nc b(int n, mw_1 mw_12) {
        if (this.Ch == null) {
            if (mw_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(n, mw_12);
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)mw_12);
        }
        return this;
    }

    public nc a(my_1 my_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(my_12.aoS());
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)my_12.aoS());
        }
        return this;
    }

    public nc b(int n, my_1 my_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(n, my_12.aoS());
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)my_12.aoS());
        }
        return this;
    }

    public nc aj(Iterable<? extends mw_1> iterable) {
        if (this.Ch == null) {
            this.Vr();
            AbstractMessageLite.Builder.addAll(iterable, this.Ce);
            this.onChanged();
        } else {
            this.Ch.addAllMessages(iterable);
        }
        return this;
    }

    public nc apm() {
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.Ch.clear();
        }
        return this;
    }

    public nc iN(int n) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.remove(n);
            this.onChanged();
        } else {
            this.Ch.remove(n);
        }
        return this;
    }

    public my_1 iO(int n) {
        return (my_1)this.Vv().getBuilder(n);
    }

    @Override
    public mZ iM(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (mZ)this.Ch.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mZ> Vf() {
        if (this.Ch != null) {
            return this.Ch.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ce);
    }

    public my_1 apn() {
        return (my_1)this.Vv().addBuilder((AbstractMessage)mw_1.aoO());
    }

    public my_1 iP(int n) {
        return (my_1)this.Vv().addBuilder(n, (AbstractMessage)mw_1.aoO());
    }

    public List<my_1> Vu() {
        return this.Vv().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mw_1, my_1, mZ> Vv() {
        if (this.Ch == null) {
            this.Ch = new RepeatedFieldBuilderV3(this.Ce, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ce = null;
        }
        return this.Ch;
    }

    public final nc fi(UnknownFieldSet unknownFieldSet) {
        return (nc)super.setUnknownFields(unknownFieldSet);
    }

    public final nc fj(UnknownFieldSet unknownFieldSet) {
        return (nc)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fi(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ce(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ce(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ce(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fi(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aph();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.apk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.io(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ce(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aph();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ce(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.apk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fi(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ce(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ce(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ce(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fi(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.io(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.apk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.apj();
    }

    public /* synthetic */ Message build() {
        return this.api();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ce(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aph();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.io(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.apk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.apj();
    }

    public /* synthetic */ MessageLite build() {
        return this.api();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aph();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.apf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.apf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.io(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.apk();
    }

    public /* synthetic */ Object clone() {
        return this.apk();
    }
}

