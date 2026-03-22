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

/*
 * Renamed from mT
 */
public final class mt_0
extends GeneratedMessageV3.Builder<mt_0>
implements mu_1 {
    private int an;
    private mk Kp;
    private SingleFieldBuilderV3<mk, mm_0, mn> Kv;
    private List<mn_0> MC = Collections.emptyList();
    private RepeatedFieldBuilderV3<mn_0, mP, mQ> MF;

    public static final Descriptors.Descriptor aov() {
        return mM.Mj;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mM.Mk.ensureFieldAccessorsInitialized(mR.class, mt_0.class);
    }

    mt_0() {
        this.D();
    }

    mt_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mR.aJ()) {
            this.akU();
            this.aoF();
        }
    }

    public mt_0 aow() {
        super.clear();
        if (this.Kv == null) {
            this.Kp = null;
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.MF == null) {
            this.MC = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.MF.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mM.Mj;
    }

    public mR aou() {
        return mR.aot();
    }

    public mR aox() {
        mR mR2 = this.aoy();
        if (!mR2.isInitialized()) {
            throw mt_0.newUninitializedMessageException((Message)mR2);
        }
        return mR2;
    }

    public mR aoy() {
        mR mR2 = new mR(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mR2.Kp = this.Kv == null ? this.Kp : (mk)this.Kv.build();
            n2 |= 1;
        }
        if (this.MF == null) {
            if ((this.an & 2) != 0) {
                this.MC = Collections.unmodifiableList(this.MC);
                this.an &= 0xFFFFFFFD;
            }
            mR2.MC = this.MC;
        } else {
            mR2.MC = this.MF.build();
        }
        mR2.an = n2;
        this.onBuilt();
        return mR2;
    }

    public mt_0 aoz() {
        return (mt_0)super.clone();
    }

    public mt_0 fe(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mt_0)super.setField(fieldDescriptor, object);
    }

    public mt_0 cc(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mt_0)super.clearField(fieldDescriptor);
    }

    public mt_0 cc(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mt_0)super.clearOneof(oneofDescriptor);
    }

    public mt_0 cc(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mt_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mt_0 ff(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mt_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mt_0 cc(Message message) {
        if (message instanceof mR) {
            return this.c((mR)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mt_0 c(mR mR2) {
        if (mR2 == mR.aot()) {
            return this;
        }
        if (mR2.akD()) {
            this.k(mR2.akE());
        }
        if (this.MF == null) {
            if (!mR2.MC.isEmpty()) {
                if (this.MC.isEmpty()) {
                    this.MC = mR2.MC;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.aoB();
                    this.MC.addAll(mR2.MC);
                }
                this.onChanged();
            }
        } else if (!mR2.MC.isEmpty()) {
            if (this.MF.isEmpty()) {
                this.MF.dispose();
                this.MF = null;
                this.MC = mR2.MC;
                this.an &= 0xFFFFFFFD;
                this.MF = mR.oB() ? this.aoF() : null;
            } else {
                this.MF.addAllMessages(mR2.MC);
            }
        }
        this.ff(mR.b(mR2));
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
        for (int i = 0; i < this.aop(); ++i) {
            if (this.iF(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public mt_0 ii(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mR mR2 = null;
        try {
            mR2 = (mR)mR.ME.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mR2 = (mR)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mR2 != null) {
                this.c(mR2);
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

    public mt_0 j(mk mk2) {
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

    public mt_0 d(mm_0 mm_02) {
        if (this.Kv == null) {
            this.Kp = mm_02.ali();
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mm_02.ali());
        }
        this.an |= 1;
        return this;
    }

    public mt_0 k(mk mk2) {
        if (this.Kv == null) {
            this.Kp = (this.an & 1) != 0 && this.Kp != null && this.Kp != mk.ale() ? mk.c(this.Kp).e(mk2).alj() : mk2;
            this.onChanged();
        } else {
            this.Kv.mergeFrom((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mt_0 aoA() {
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

    private void aoB() {
        if ((this.an & 2) == 0) {
            this.MC = new ArrayList<mn_0>(this.MC);
            this.an |= 2;
        }
    }

    @Override
    public List<mn_0> aon() {
        if (this.MF == null) {
            return Collections.unmodifiableList(this.MC);
        }
        return this.MF.getMessageList();
    }

    @Override
    public int aop() {
        if (this.MF == null) {
            return this.MC.size();
        }
        return this.MF.getCount();
    }

    @Override
    public mn_0 iF(int n) {
        if (this.MF == null) {
            return this.MC.get(n);
        }
        return (mn_0)this.MF.getMessage(n);
    }

    public mt_0 a(int n, mn_0 mn_02) {
        if (this.MF == null) {
            if (mn_02 == null) {
                throw new NullPointerException();
            }
            this.aoB();
            this.MC.set(n, mn_02);
            this.onChanged();
        } else {
            this.MF.setMessage(n, (AbstractMessage)mn_02);
        }
        return this;
    }

    public mt_0 a(int n, mP mP2) {
        if (this.MF == null) {
            this.aoB();
            this.MC.set(n, mP2.aod());
            this.onChanged();
        } else {
            this.MF.setMessage(n, (AbstractMessage)mP2.aod());
        }
        return this;
    }

    public mt_0 d(mn_0 mn_02) {
        if (this.MF == null) {
            if (mn_02 == null) {
                throw new NullPointerException();
            }
            this.aoB();
            this.MC.add(mn_02);
            this.onChanged();
        } else {
            this.MF.addMessage((AbstractMessage)mn_02);
        }
        return this;
    }

    public mt_0 b(int n, mn_0 mn_02) {
        if (this.MF == null) {
            if (mn_02 == null) {
                throw new NullPointerException();
            }
            this.aoB();
            this.MC.add(n, mn_02);
            this.onChanged();
        } else {
            this.MF.addMessage(n, (AbstractMessage)mn_02);
        }
        return this;
    }

    public mt_0 a(mP mP2) {
        if (this.MF == null) {
            this.aoB();
            this.MC.add(mP2.aod());
            this.onChanged();
        } else {
            this.MF.addMessage((AbstractMessage)mP2.aod());
        }
        return this;
    }

    public mt_0 b(int n, mP mP2) {
        if (this.MF == null) {
            this.aoB();
            this.MC.add(n, mP2.aod());
            this.onChanged();
        } else {
            this.MF.addMessage(n, (AbstractMessage)mP2.aod());
        }
        return this;
    }

    public mt_0 ai(Iterable<? extends mn_0> iterable) {
        if (this.MF == null) {
            this.aoB();
            AbstractMessageLite.Builder.addAll(iterable, this.MC);
            this.onChanged();
        } else {
            this.MF.addAllMessages(iterable);
        }
        return this;
    }

    public mt_0 aoC() {
        if (this.MF == null) {
            this.MC = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.MF.clear();
        }
        return this;
    }

    public mt_0 iH(int n) {
        if (this.MF == null) {
            this.aoB();
            this.MC.remove(n);
            this.onChanged();
        } else {
            this.MF.remove(n);
        }
        return this;
    }

    public mP iI(int n) {
        return (mP)this.aoF().getBuilder(n);
    }

    @Override
    public mQ iG(int n) {
        if (this.MF == null) {
            return this.MC.get(n);
        }
        return (mQ)this.MF.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mQ> aoo() {
        if (this.MF != null) {
            return this.MF.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.MC);
    }

    public mP aoD() {
        return (mP)this.aoF().addBuilder((AbstractMessage)mn_0.anZ());
    }

    public mP iJ(int n) {
        return (mP)this.aoF().addBuilder(n, (AbstractMessage)mn_0.anZ());
    }

    public List<mP> aoE() {
        return this.aoF().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mn_0, mP, mQ> aoF() {
        if (this.MF == null) {
            this.MF = new RepeatedFieldBuilderV3(this.MC, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.MC = null;
        }
        return this.MF;
    }

    public final mt_0 fe(UnknownFieldSet unknownFieldSet) {
        return (mt_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mt_0 ff(UnknownFieldSet unknownFieldSet) {
        return (mt_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ff(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fe(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ff(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cc(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cc(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cc(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fe(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aow();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aoz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ff(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ii(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cc(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aow();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cc(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aoz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ff(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fe(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ff(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cc(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cc(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cc(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fe(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ii(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aoz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aoy();
    }

    public /* synthetic */ Message build() {
        return this.aox();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cc(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aow();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ii(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aoz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aoy();
    }

    public /* synthetic */ MessageLite build() {
        return this.aox();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aow();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aou();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aou();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ii(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aoz();
    }

    public /* synthetic */ Object clone() {
        return this.aoz();
    }
}

