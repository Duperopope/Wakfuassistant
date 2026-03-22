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

public final class mB
extends GeneratedMessageV3.Builder<mB>
implements mc_0 {
    private int an;
    private mk Kp;
    private SingleFieldBuilderV3<mk, mm_0, mn> Kv;
    private List<mt_1> Lr = Collections.emptyList();
    private RepeatedFieldBuilderV3<mt_1, mv_1, mw_0> Lv;
    private long Ks;

    public static final Descriptors.Descriptor amn() {
        return ms.KM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ms.KN.ensureFieldAccessorsInitialized(mz_0.class, mB.class);
    }

    mB() {
        this.D();
    }

    mB(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mz_0.aJ()) {
            this.akU();
            this.amx();
        }
    }

    public mB amo() {
        super.clear();
        if (this.Kv == null) {
            this.Kp = null;
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.Lv == null) {
            this.Lr = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.Lv.clear();
        }
        this.Ks = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ms.KM;
    }

    public mz_0 amm() {
        return mz_0.aml();
    }

    public mz_0 amp() {
        mz_0 mz_02 = this.amq();
        if (!mz_02.isInitialized()) {
            throw mB.newUninitializedMessageException((Message)mz_02);
        }
        return mz_02;
    }

    public mz_0 amq() {
        mz_0 mz_02 = new mz_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mz_02.Kp = this.Kv == null ? this.Kp : (mk)this.Kv.build();
            n2 |= 1;
        }
        if (this.Lv == null) {
            if ((this.an & 2) != 0) {
                this.Lr = Collections.unmodifiableList(this.Lr);
                this.an &= 0xFFFFFFFD;
            }
            mz_02.Lr = this.Lr;
        } else {
            mz_02.Lr = this.Lv.build();
        }
        if ((n & 4) != 0) {
            mz_02.Ks = this.Ks;
            n2 |= 2;
        }
        mz_02.an = n2;
        this.onBuilt();
        return mz_02;
    }

    public mB amr() {
        return (mB)super.clone();
    }

    public mB eW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mB)super.setField(fieldDescriptor, object);
    }

    public mB bY(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mB)super.clearField(fieldDescriptor);
    }

    public mB bY(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mB)super.clearOneof(oneofDescriptor);
    }

    public mB bY(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mB)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mB eX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mB)super.addRepeatedField(fieldDescriptor, object);
    }

    public mB bY(Message message) {
        if (message instanceof mz_0) {
            return this.c((mz_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mB c(mz_0 mz_02) {
        if (mz_02 == mz_0.aml()) {
            return this;
        }
        if (mz_02.akD()) {
            this.g(mz_02.akE());
        }
        if (this.Lv == null) {
            if (!mz_02.Lr.isEmpty()) {
                if (this.Lr.isEmpty()) {
                    this.Lr = mz_02.Lr;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.amt();
                    this.Lr.addAll(mz_02.Lr);
                }
                this.onChanged();
            }
        } else if (!mz_02.Lr.isEmpty()) {
            if (this.Lv.isEmpty()) {
                this.Lv.dispose();
                this.Lv = null;
                this.Lr = mz_02.Lr;
                this.an &= 0xFFFFFFFD;
                this.Lv = mz_0.oB() ? this.amx() : null;
            } else {
                this.Lv.addAllMessages(mz_02.Lr);
            }
        }
        if (mz_02.akG()) {
            this.bm(mz_02.akH());
        }
        this.eX(mz_0.b(mz_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.akD()) {
            return false;
        }
        if (!this.akG()) {
            return false;
        }
        if (!this.akE().isInitialized()) {
            return false;
        }
        for (int i = 0; i < this.amh(); ++i) {
            if (this.ik(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public mB hW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mz_0 mz_02 = null;
        try {
            mz_02 = (mz_0)mz_0.Lu.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mz_02 = (mz_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mz_02 != null) {
                this.c(mz_02);
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

    public mB f(mk mk2) {
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

    public mB b(mm_0 mm_02) {
        if (this.Kv == null) {
            this.Kp = mm_02.ali();
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mm_02.ali());
        }
        this.an |= 1;
        return this;
    }

    public mB g(mk mk2) {
        if (this.Kv == null) {
            this.Kp = (this.an & 1) != 0 && this.Kp != null && this.Kp != mk.ale() ? mk.c(this.Kp).e(mk2).alj() : mk2;
            this.onChanged();
        } else {
            this.Kv.mergeFrom((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mB ams() {
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

    private void amt() {
        if ((this.an & 2) == 0) {
            this.Lr = new ArrayList<mt_1>(this.Lr);
            this.an |= 2;
        }
    }

    @Override
    public List<mt_1> amf() {
        if (this.Lv == null) {
            return Collections.unmodifiableList(this.Lr);
        }
        return this.Lv.getMessageList();
    }

    @Override
    public int amh() {
        if (this.Lv == null) {
            return this.Lr.size();
        }
        return this.Lv.getCount();
    }

    @Override
    public mt_1 ik(int n) {
        if (this.Lv == null) {
            return this.Lr.get(n);
        }
        return (mt_1)this.Lv.getMessage(n);
    }

    public mB a(int n, mt_1 mt_12) {
        if (this.Lv == null) {
            if (mt_12 == null) {
                throw new NullPointerException();
            }
            this.amt();
            this.Lr.set(n, mt_12);
            this.onChanged();
        } else {
            this.Lv.setMessage(n, (AbstractMessage)mt_12);
        }
        return this;
    }

    public mB a(int n, mv_1 mv_12) {
        if (this.Lv == null) {
            this.amt();
            this.Lr.set(n, mv_12.alS());
            this.onChanged();
        } else {
            this.Lv.setMessage(n, (AbstractMessage)mv_12.alS());
        }
        return this;
    }

    public mB d(mt_1 mt_12) {
        if (this.Lv == null) {
            if (mt_12 == null) {
                throw new NullPointerException();
            }
            this.amt();
            this.Lr.add(mt_12);
            this.onChanged();
        } else {
            this.Lv.addMessage((AbstractMessage)mt_12);
        }
        return this;
    }

    public mB b(int n, mt_1 mt_12) {
        if (this.Lv == null) {
            if (mt_12 == null) {
                throw new NullPointerException();
            }
            this.amt();
            this.Lr.add(n, mt_12);
            this.onChanged();
        } else {
            this.Lv.addMessage(n, (AbstractMessage)mt_12);
        }
        return this;
    }

    public mB a(mv_1 mv_12) {
        if (this.Lv == null) {
            this.amt();
            this.Lr.add(mv_12.alS());
            this.onChanged();
        } else {
            this.Lv.addMessage((AbstractMessage)mv_12.alS());
        }
        return this;
    }

    public mB b(int n, mv_1 mv_12) {
        if (this.Lv == null) {
            this.amt();
            this.Lr.add(n, mv_12.alS());
            this.onChanged();
        } else {
            this.Lv.addMessage(n, (AbstractMessage)mv_12.alS());
        }
        return this;
    }

    public mB af(Iterable<? extends mt_1> iterable) {
        if (this.Lv == null) {
            this.amt();
            AbstractMessageLite.Builder.addAll(iterable, this.Lr);
            this.onChanged();
        } else {
            this.Lv.addAllMessages(iterable);
        }
        return this;
    }

    public mB amu() {
        if (this.Lv == null) {
            this.Lr = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.Lv.clear();
        }
        return this;
    }

    public mB im(int n) {
        if (this.Lv == null) {
            this.amt();
            this.Lr.remove(n);
            this.onChanged();
        } else {
            this.Lv.remove(n);
        }
        return this;
    }

    public mv_1 in(int n) {
        return (mv_1)this.amx().getBuilder(n);
    }

    @Override
    public mw_0 il(int n) {
        if (this.Lv == null) {
            return this.Lr.get(n);
        }
        return (mw_0)this.Lv.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mw_0> amg() {
        if (this.Lv != null) {
            return this.Lv.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Lr);
    }

    public mv_1 amv() {
        return (mv_1)this.amx().addBuilder((AbstractMessage)mt_1.alO());
    }

    public mv_1 io(int n) {
        return (mv_1)this.amx().addBuilder(n, (AbstractMessage)mt_1.alO());
    }

    public List<mv_1> amw() {
        return this.amx().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mt_1, mv_1, mw_0> amx() {
        if (this.Lv == null) {
            this.Lv = new RepeatedFieldBuilderV3(this.Lr, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Lr = null;
        }
        return this.Lv;
    }

    @Override
    public boolean akG() {
        return (this.an & 4) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public mB bm(long l) {
        this.an |= 4;
        this.Ks = l;
        this.onChanged();
        return this;
    }

    public mB amy() {
        this.an &= 0xFFFFFFFB;
        this.Ks = 0L;
        this.onChanged();
        return this;
    }

    public final mB eW(UnknownFieldSet unknownFieldSet) {
        return (mB)super.setUnknownFields(unknownFieldSet);
    }

    public final mB eX(UnknownFieldSet unknownFieldSet) {
        return (mB)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bY(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bY(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bY(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.amo();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.amr();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bY(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.amo();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bY(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.amr();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bY(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bY(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bY(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.amr();
    }

    public /* synthetic */ Message buildPartial() {
        return this.amq();
    }

    public /* synthetic */ Message build() {
        return this.amp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bY(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.amo();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.amr();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.amq();
    }

    public /* synthetic */ MessageLite build() {
        return this.amp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.amo();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.amm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.amm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hW(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.amr();
    }

    public /* synthetic */ Object clone() {
        return this.amr();
    }
}

